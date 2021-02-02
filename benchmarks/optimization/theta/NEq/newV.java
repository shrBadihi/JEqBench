package benchmarks.optimization.theta.NEq;
public class newV{
    public final static double theta(double x1, double x2) {
        if(x1 > 0.0) {
          return Math.atan(x2 / x1) / (2 * Math.PI);
        } else if (x1 < 0.0) {
          return (Math.atan(x2 / x1) / (2 * Math.PI));
        }
        return 0.0;
      }
}