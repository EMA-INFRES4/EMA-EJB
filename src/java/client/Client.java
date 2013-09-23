package client;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mines.ejb.hello.tp1.HelloWorld;
import com.mines.ejb.hello.tp1.HelloWorldHome;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author xtalandier
 */
public class Client {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Context initialContext = null;
		try {
			initialContext = new InitialContext();
		} catch (NamingException ex) {
		}
		HelloWorldHome home = null;
		try {
			home = (HelloWorldHome) initialContext.lookup("java:global/EJB/HelloWorld!com.mines.ejb.hello.tp1.HelloWorldHome");
		} catch (NamingException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		HelloWorld myHelloWorld = null;
		try {
			myHelloWorld = home.create();
			System.out.println(myHelloWorld.sayHelloWorld());
		} catch (RemoteException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		} catch (CreateException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
