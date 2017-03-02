
public class FunctionCall {

	private double x;
	private double y;

	private double xStart;
	private double xEnd;
	private double xStep;
	private double[] ys;

	public FunctionCall (){
		x = 0;
		y = 0;

		xStart = 0;
		xEnd = 0;
		xStep = 0;
		ys = {};
	}

	public boolean isDuplicate (double newX){
		if (x == newX) return true;
		return false;
	}
	public boolean isDuplicate (double newXStart, double newXEnd, double newXStep){
		if (xStart == newXStart && xEnd == newXEnd && xStep == newXStep)
			return true;
		return false;
	}

	public void setY (double newX, double newY){
		x = newX;
		y = newY;
	}
	public double getY (){
		return y;
	}

	public void setYs (double newXStart, double newXEnd, double newXStep, double[] newYs){
		xStart = newXStart;
		xEnd = newXEnd;
		xStep = newXStep;
		ys = newYs;
	}
	double getYs (){
		return ys;
	}

}//FunctionCall class
