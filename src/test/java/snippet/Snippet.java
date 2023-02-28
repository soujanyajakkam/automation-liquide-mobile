package snippet;

public class Snippet {
	public String FromMessages() {
		
			/*
			 * String currentAct = ((AndroidDriver) driver).getCurrentPackage();
			 * System.out.println(currentAct); Thread.sleep(10000); ((StartsActivity)
			 * driver).startActivity(new Activity("com.google.android.apps.messaging",
			 * "com.google.android.apps.messaging.home.HomeActivity"));
			 * switchContextMobileView(); driver.findElement( By.xpath(
			 * "//android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[1]"
			 * )) .click(); WebElement element = driver.findElement(By.id(
			 * "com.google.android.apps.messaging:id/suggestion_button_label")); String OTP
			 * = element.getText().replaceAll("[^0-9]", "");
			 * logger.info("######################" + OTP);
			 */
			String OTP="123456";
			  char[] ch = OTP.toCharArray();
			  
			  for (int i = 0; i < OTP.length(); i++) {
			  
			  if (OTP.charAt(i) >= '0' && OTP.charAt(i) <= '9') {
			  
			  System.out.println("index position from "+ i +" : " +OTP.charAt(i)); 
			  
			  } 
			  }
			return OTP;}}


