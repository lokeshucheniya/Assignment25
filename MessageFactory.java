package in.co.capgemini;

import java.util.ResourceBundle;

public class MessageFactory {
	
	public static MessageRenderer getMessageRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		ResourceBundle bundle = ResourceBundle.getBundle("context");
		
		String providerstr = bundle.getString("provider");
		MessageProvider provider = (MessageProvider)Class.forName(providerstr).newInstance();
		
		String rendererstr = bundle.getString("renderer");
		MessageRenderer renderer = (MessageRenderer)Class.forName(rendererstr).newInstance();
		
		renderer.setMessageProvider(provider);
		
		return renderer;
		
	}
}
