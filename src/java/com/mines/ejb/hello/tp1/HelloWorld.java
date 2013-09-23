package com.mines.ejb.hello.tp1;


import java.rmi.RemoteException;
import javax.ejb.EJBObject;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xtalandier
 */
public interface HelloWorld extends EJBObject {
	public String sayHelloWorld() throws RemoteException;
}
