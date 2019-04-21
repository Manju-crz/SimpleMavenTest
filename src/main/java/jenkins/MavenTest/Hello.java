package jenkins.MavenTest;

public class Hello {
	
	
	public void helloMsg() {
		System.out.println("Hello, Welcome to jenkins execution..");
	}
	
	public void helloMsg(int n) throws InterruptedException {
		
		for(int i=0; i<n ; i++) {
			System.out.println("I'm logging for you for better testing - " + i);
			Thread.sleep(1000);
		}
	}
	
	public void helloMsg(String str) {
		System.out.println("Hello, Welcome to .. " + str);
	}
	
}
