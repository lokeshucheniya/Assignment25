package in.co.capgemini;

public class Test {
	
	public static void main(String args[]) {
		
		MessageRenderer renderer;
		try {
			renderer = MessageFactory.getMessageRenderer();
			renderer.render();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
