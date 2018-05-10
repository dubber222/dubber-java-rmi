package com.dubber.vip.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by dubber on 2018/5/10.
 */
public interface IRemoteMI extends Remote {
    public String sayHello(String msg) throws RemoteException;
}
