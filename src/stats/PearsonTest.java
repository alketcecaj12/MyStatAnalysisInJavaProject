package stats;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

public class PearsonTest {
	public static void main(String[] args){
		double[] x = {98, 61, 25, 42, 57, 59};
		double[] y = {99, 65, 26, 46, 87, 21};
		PearsonTest test = new PearsonTest();
		test.calculatePearson(x, y);
	}
	public void calculatePearson(double[] x, double[] y){
		PearsonsCorrelation pCorrelation = new PearsonsCorrelation();
		double cor = pCorrelation.correlation(x, y);//take out false too
		System.out.println(cor);
	}
}
