
public class Constant extends Function {

	//The constant number wrapped by this class
	private double value;

	public Constant (double number){
		value = number;
		initCall();
	}
	
	private void initCall(){
		previousCall = new Call();
		previousCall.setY(0,value);

		//We can't initialize ys, because the width might vary
	}

	public double value(double x){
		//A constant does not depend on the independent variable
		return value;
	}
	
	//The other values method is perfectly fine

}//Constant class
