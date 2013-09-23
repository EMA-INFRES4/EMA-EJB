/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mines.ejb.calculette;

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 *
 * @author xtalandier
 */
public class CalculetteBean implements SessionBean {
	public float memoire = 0;
	public float lastResult = 0;
	
	public float add(float number1, float number2){
		lastResult = number1 + number2;
		return lastResult;
	}
	public float less(float number1, float number2){
		lastResult = number1 - number2;
		return lastResult;
	}
	public float time(float number1, float number2){
		lastResult = number1 * number2;
		return lastResult;
	}
	public float divide(float number1, float number2){
		lastResult = number1 / number2;
		return lastResult;
	}
	public float mPlus(){
		memoire += lastResult;
		return memoire;
	}
	public float mLess(){
		memoire -= lastResult;
		return memoire;
	}

	public void ejbCreate(){
		memoire = 0;
	}

	public void ejbCreate(float n0){
		memoire = n0;
	}
	
	@Override
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {}
	
}
