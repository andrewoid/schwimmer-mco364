package schwimmer.mco364.cents;

public class LongLong {
	
	private static final long MASKS[] = new long[64];
	 
	static {
		for ( int i=0; i<MASKS.length; i++ ) {
			MASKS[i] = 1L << i;
		}
	}
	
	long high;
	long low;
	
	public LongLong() {
		
	}
	
	public LongLong( int ... set ) {
		for ( int i : set ) {
			set(i);
		}
	}
	
	public void set(int i) {
		if ( i >= 64 ) {
			high |= MASKS[i-64];
		}
		else {
			low |= MASKS[i];
		}
	}
	
	public boolean get(int i) {
		if ( i >= 64 ) {
			return (high & MASKS[i-64]) != 0;
		}
		else {
			return (low & MASKS[i]) != 0;
		}
	}
	
	public void mask( long high, long low ) {
		this.high &= high;
		this.low &= low;
	}
	
	public void orShiftLeft( LongLong other, int n ) {
		high |= (other.high << n);
		high |= (other.low >>> (64-n));
		low |= (other.low << n);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for ( int i=1; i<101; i++ ) {
			if ( get(i) ) {
				builder.append(i);
				builder.append(", ");
			}
		}
		builder.append("]");
		
		return builder.toString();
		//return Long.toHexString(high) + " " + Long.toHexString(low);
	}

	public void copy(LongLong other) {
		high = other.high;
		low = other.low;
	}
	
}
