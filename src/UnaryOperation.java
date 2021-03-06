
public class UnaryOperation extends Function {

	enum Operation {
		kLog, kSin, kCos, kTan, kCsc, kSec, kCot
	}

	private Operation operation;
	private Function base;

	public UnaryOperation (Operation function, Function f){
		previousCall = new Call();

		this.operation = function;
		this.base = f;

	}//UnaryOperation constructor

	public double value (double x){

		if (previousCall.isDuplicate(x)) return previousCall.getY();

		double input = base.value(x);
		double output = 0;

		switch (operation){
		case kLog:
			output = Math.log(input);
			break;
		case kSin:
			output = Math.sin(input);
			break;
		case kCos:
			output = Math.cos(input);
			break;
		case kTan:
			output = Math.tan(input);
			break;

		case kCsc:
			output = 1 / Math.sin(input);
			break;
		case kSec:
			output = 1 / Math.cos(input);
			break;
		case kCot:
			output = 1 / Math.tan(input);
			break;

		default:
			System.out.println("Unknown operator: "+operation);
			System.exit(1);
			break;
		}

		previousCall.setY(x, output);
		return output;
	}//value method

}//UnaryOperation method
