package benchmarks.CLEVER.LoopUnreach10.Eq;
public class newV {
	private int foo(int a, int b) {
		int c=0;
		if (a<0) {
			for (int i=1;i<=a;++i)
				c+=b;
		}
		return c;
	}
	public int main(int x) {
		if (x>=9 && x<12)
			return foo(x,10);
		return 0;
	}
}