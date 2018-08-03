package in.co.capgemini;

public class PDFMessageRenderer implements MessageRenderer {
	
	private MessageProvider provider;
	
	@Override
	public void render() {
		System.out.println(provider.getMessage() + " on PDF :-D ");
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}

}
