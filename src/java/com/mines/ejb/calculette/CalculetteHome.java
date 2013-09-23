/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mines.ejb.calculette;


import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 *
 * @author xtalandier
 */
public interface CalculetteHome extends EJBHome {
	ICalculette create() throws RemoteException, CreateException;
	ICalculette create(float number0) throws RemoteException, CreateException;
}
