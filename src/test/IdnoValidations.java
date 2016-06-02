package test;

public class IdnoValidations {

	public String formatIdnos(String number){
		String num = "";
		if(number.length()<8){
			int len = number.length();
			if(len==5){
				number = "000".concat(number).concat("'");
			}else if(len==6){
				number = "00".concat(number).concat("'");
			}else if(len==7){
				number = "0".concat(number).concat("'");
			}
		}else if(number.length()>8 && !number.contains("-")){
			number = number.concat("'");
		}
		System.out.println("Formatted standard number is : "+ number);
		return num;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdnoValidations idnoTest = new IdnoValidations();
		idnoTest.formatIdnos("345556");
		
	}

}
