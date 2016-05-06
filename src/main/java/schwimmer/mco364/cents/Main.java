package schwimmer.mco364.cents;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<State> stack = new Stack<State>();
		State winningState = null;
		
		stack.add(new State());
		while ( !stack.isEmpty() ) {
			State state = stack.pop();
			
			if ( state.getNumCoins() >= 18 || state.getCoinIndex() > 101 ) {
				// discard it
				continue;
			}
			
			if ( state.isWin() ) {
				winningState = state;
				break;
			}
			
			state.increaseCoinIndex();
			
			if ( state.hasCoverage() ) {
				stack.push(state);
			}
			
			State s = new State(state);
			s.addCoin();
			stack.push(s);
			
		}
		
		System.out.println(winningState);
		
	}

}
