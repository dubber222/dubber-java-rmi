package com.dubber.vip.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by dubber on 2018/5/10.
 */
public class RemoteServer {
    public static void main(String[] args) {
        try {
            RemoteSayHello sayHello = new RemoteSayHello();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/sayHello",sayHello);
            System.out.println("Server start success");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
