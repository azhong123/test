package test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class QuickStartServer {
	
	private static final String DEFAULT_WEB_PATH = "src/main/webapp";
	
	private static final String CONTEXT_PATH = "/demo";
	
	public static void main(String[] args) {
		
		Server server = new Server(8080);
		try {
			server.setStopAtShutdown(true);
			WebAppContext wac = new WebAppContext(DEFAULT_WEB_PATH,CONTEXT_PATH);
			server.setHandler(wac);
			server.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
