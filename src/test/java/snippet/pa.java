package snippet;

public class pa {

	private static final String String = null;

	public static void main(String[] args) {
		
		FromMessages() ;
}
	
	
	static void FromMessages() {
		
		String OTP="123456";
		int p1,p2,p3,p4,p5,p6;
		  char[] ch = OTP.toCharArray();
		  
		  for (int i = 0; i < OTP.length(); i++) {
		  
		  if (OTP.charAt(i) >= '0' && OTP.charAt(i) <= '9') {
		  
		// System.out.println("index position from "+ i +" : " +OTP.charAt(i)); 
		 
		  } 
		  }
		  System.out.println("index position from 1p"+" " + OTP.charAt(0)); 
		  System.out.println("index position from 2p"+" "   + OTP.charAt(1)); 
		  System.out.println("index position from 3p" +" "  + OTP.charAt(2));
		  System.out.println("index position from 4p" +" " + OTP.charAt(3)); 
		  System.out.println("index position from 5p" +" " + OTP.charAt(4));   
		  System.out.println("index position from 6p" +" " + OTP.charAt(5)); 
}
}