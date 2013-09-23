/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.mines.ejb.calculette.*;
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
public class CalculetteClient {
		public static void main(String[] args) {
		Context initialContext = null;
		try {
			initialContext = new InitialContext();
		} catch (NamingException ex) {
		}
		CalculetteHome home = null;
		try {
			home = (CalculetteHome) initialContext.lookup("java:global/EJB/Calculette!com.mines.ejb.calculette.CalculetteHome");
		} catch (NamingException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		ICalculette calc = null;
		try {
			calc = home.create();
			System.out.println("1 + 3 = " + calc.add(1 , 3));
			System.out.println("M+ = " + calc.mPlus());// <- 4
			System.out.println("4 - 5 = " + calc.less(4 , 5)); // <- -1
			System.out.println("M + -1" + calc.mPlus()); // <- 3
			//System.out.println(myHelloWorld.sayHelloWorld());
		} catch (RemoteException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		} catch (CreateException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
