package benchmarks.CLEVER.LoopUnreach20.Eq;
public class oldV {
	private int foo(int a, int b) {
		int c=0;
		if (a<0) {
			for (int i=1;i<=b;++i)
				c+=a;
		}
		return c;
	}
	public int main(int x) {
		if (x>=18 && x<22)
			return foo(x,20);
		return 0;
	}
}