
public class Variable implements Function {

	//Char representing the variable
	private char var;

	public Variable (char variableName){
		var = variableName;
	}//Variable constructor
	
	/* Presumably, this program will support multiple
	 * variables. A good support for that would be a
	 * dictionary, mapping a value to a variable char.
	 */
	public double value (double x){
		if (var == 'x')
			return x;

		return 0;
	}//value method

}//Variable class
