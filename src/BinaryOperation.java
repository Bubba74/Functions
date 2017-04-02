
public class BinaryOperation extends Function {

	enum Operation {
		kAdd, kSubtract, kMultiply, kDivide, kPower
	}

	private Operation operation;
	private Function left;
	private Function right;


	public BinaryOperation (Operation function, Function f1, Function f2){
		previousCall = new Call();

		this.operation = function;
		this.left  = f1;
		this.right = f2;
	}//UnaryOperation constructor

	public double value (double x){

		if (previousCall.isDuplicate(x)) return previousCall.getY();

		double firstValue  = left.value(x);
		double secondValue = right.value(x);

		double output = 0;

		switch (operation){
		case kAdd:
			output = firstValue + secondValue;
			break;
		case kSubtract:
			output = firstValue - secondValue;
			break;
		case kMultiply:
			output = firstValue * secondValue;
			break;
		case kDivide:
			output = firstValue / secondValue;
			break;
		case kPower:
			output = Math.pow(firstValue, secondValue);
			break;

		default:
			System.out.println("Unknown operator: "+operation);
			System.exit(1);
			break;
		}

		previousCall.setY(x,output);
		return output;
	}//value method
	
}//BinaryOperation class
