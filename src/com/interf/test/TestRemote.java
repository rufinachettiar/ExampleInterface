package com.interf.test;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TestRemote extends Remote {
	
	public int register(String type, String name) throws RemoteException, NotBoundException;
	public String report_state(int id, String state) throws RemoteException;

}