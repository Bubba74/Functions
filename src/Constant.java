
public class Constant implements Function {

	//The constant number wrapped by this class
	private double value;
	

	public Constant (double number){
		value = number;
	}

	public double value(double x){
		//A constant does not depend on the independent variable
		return value;
	}

}//Constant class
