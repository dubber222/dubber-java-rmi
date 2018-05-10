package com.dubber.vip.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by dubber on 2018/5/10.
 */
public class RemoteSayHello extends UnicastRemoteObject implements IRemoteMI {

    protected RemoteSayHello() throws RemoteException {
    }

    @Override
    public String sayHello(String msg) throws RemoteException {
        return "Hello  小安仔！" + msg;
    }
}
