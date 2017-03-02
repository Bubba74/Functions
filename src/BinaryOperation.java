
public class BinaryOperation implements Function {

	enum Operation {
		kAdd, kSubtract, kMultiply, kDivide, kPower
	}

	private Operation operation;
	private Function left;
	private Function right;


	public BinaryOperation (Operation function, Function f1, Function f2){
		this.operation = function;
		this.left  = f1;
		this.right = f2;
	}//UnaryOperation constructor

	public double value (double x){

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
			output = Math.power(firstValue, secondValue);
			break;

		default:
			System.out.println("Unknown operator: "+operation);
			System.exit(1);
			break;
		}

		return output;
	}//value method

}//BinaryOperation method
