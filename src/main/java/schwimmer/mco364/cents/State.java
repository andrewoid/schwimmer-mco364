package schwimmer.mco364.cents;

import java.util.Arrays;

public class State {
	
	private static final LongLong WIN = new LongLong();
	
	static {
		for ( int i=1; i<101; i++ ) {
			WIN.set(i);
		}
	}

	LongLong coins;
	LongLong coverage;
	int numCoins;
	int coinIndex;
	
	public State() {
		coins = new LongLong();
		coverage = new LongLong();
	}
	
	public State( int ... set ) {
		this();
		Arrays.sort(set);
		numCoins = set.length;
		for ( int c : set ) {
			coins.set(c);
			coverage.orShiftLeft(coins, c);
		}
	}
	
	public State(State state) {
		this();
		copy(state);
	}
	
	private void copy(State state) {
		coins.copy(state.coins);
		coverage.copy(state.coverage);
		numCoins = state.numCoins;
		coinIndex = state.coinIndex;
	}
	
	public boolean hasCoverage() {
		return coverage.get(coinIndex);
	}

	public void increaseCoinIndex() {
		coinIndex++;
	}
	
	public void addCoin() {
		numCoins++;
		coins.set(coinIndex);
		coverage.orShiftLeft(coins, coinIndex);
	}

	public LongLong getCoins() {
		return coins;
	}

	public LongLong getCoverage() {
		return coverage;
	}

	public int getNumCoins() {
		return numCoins;
	}

	public int getCoinIndex() {
		return coinIndex;
	}
	
	public boolean isWin() {
		return (coverage.low & WIN.low) == WIN.low &&
				(coverage.high & WIN.high) == WIN.high;
	}
	
	public String toString() {
		return coins.toString();
	}
	
}
