package com.mines.ejb.hello.tp1;


import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xtalandier
 */
public interface HelloWorldHome extends EJBHome {
	HelloWorld create() throws RemoteException, CreateException;
}
