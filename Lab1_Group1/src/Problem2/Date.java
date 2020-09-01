package Problem2;
public class Date implements Comparable{
	int month; // Month number in range 1 to 12.
	int day; // Day number in range 1 to 31.
	int year; // Year number.

	Date(int m, int d, int y) { // Convenience constructor.
		this.month = m;
		this.day = d;
		this.year = y;

	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Date other = (Date) arg0;	
		if (this.year > other.year) {
			return 1;
		} else if (this.year < other.year) {
			return -1;
		} else {
			if (this.month > other.month) {
				return 1;
			} else if (this.month < other.month) {
				return -1;
			} else {
				if (this.day > other.day) {
					return 1;
				} else if (this.day < other.day) {
					return -1;
				} else {
					return 0;
				}
			}

		}

	}

	@Override
	public String toString() {
		return "" + this.month + "/" + this.day + "/" + this.day;
	}
}

