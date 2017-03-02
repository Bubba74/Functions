
public abstract class Function {
	
	public Call previousCall;

	public abstract double value (double x);
	public double[] value (double start, double end, double step){
		if (previousCall.isDuplicate(start, end, step)) return previousCall.getYs();
		//else

		int w = (int)((end-start)/step);

		double[] values = new double[w];
		
		for (int i=0;i<w;i++)
			values[i] = value(start+step*i);

		previousCall.setYs(start, end, step, values);
		return values;
	}


}//Function class
