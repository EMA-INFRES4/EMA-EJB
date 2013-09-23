/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mines.ejb.calculette;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

/**
 *
 * @author xtalandier
 */
public interface ICalculette extends EJBObject {
	public float add(float number1, float number2) throws RemoteException;
	public float less(float number1, float number2) throws RemoteException;
	public float time(float number1, float number2) throws RemoteException;
	public float divide(float number1, float number2) throws RemoteException;
	public float mPlus() throws RemoteException;
	public float mLess() throws RemoteException;
}
