package benchmarks.REVE.whileif.Eq;
public class newV {
	int f(int t, int c) {
		int x = 0;
		while(0 < c) {
		  if(0 < t) {
			x ++;
		    c = c-1;
		  }
		}
		return x;
	}
}