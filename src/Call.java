
public class Call{

	private boolean yInitialized;
	private double x;
	private double y;

	private boolean ysInitialized;
	private double xStart;
	private double xEnd;
	private double xStep;
	private double[] ys;

	public Call (){
		yInitialized = false;
		ysInitialized = false;

		x = 0;
		y = 0;

		xStart = 0;
		xEnd = 0;
		xStep = 0;
		ys = new double[1];
	}

	public boolean isDuplicate (double newX){
		if (!yInitialized) return false;
		if (x == newX) return true;
		return false;
	}
	public boolean isDuplicate (double newXStart, double newXEnd, double newXStep){
		if (!ysInitialized) return false;
		if (xStart == newXStart && xEnd == newXEnd && xStep == newXStep)
			return true;
		return false;
	}

	public void setY (double newX, double newY){
		yInitialized = true;
		x = newX;
		y = newY;
	}
	public double getY (){
		if (!yInitialized) {
			System.out.println("Call.getY() called before setY()");
			System.exit(1);
		}
		return y;
	}

	public void setYs (double newXStart, double newXEnd, double newXStep, double[] newYs){
		ysInitialized = true;
		xStart = newXStart;
		xEnd = newXEnd;
		xStep = newXStep;
		ys = newYs;
	}
	double[] getYs (){
		if (!ysInitialized) {
			System.out.println("Call.getYs() called before setYs()");
			System.exit(1);
		}
		return ys;
	}

}//FunctionCall class
