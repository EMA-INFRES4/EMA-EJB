package com.mines.ejb.hello.tp1;


import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xtalandier
 */
public class HelloWorldBean implements SessionBean {
	public String sayHelloWorld(){
		return "Bonjour :)";
	}

	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {}
	@Override
	public void ejbRemove() throws EJBException, RemoteException {}
	@Override
	public void ejbActivate() throws EJBException, RemoteException {}
	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
	}
	
}
