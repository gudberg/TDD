package is.ru.stringCalculator;

public class Calculator {
	public static void main(String [] args) {
		return;
	}
	public static int add(String text){
		if(text.equals(""))
		{
			return 0;
		}
		else{
			if(text.contains(",")) {
				String separateNumber [] = text.split(",");
				return Integer.parseInt(separateNumber[0]) + Integer.parseInt(separateNumber[1]);
			}
			return 1;
		}
				
	}
}
