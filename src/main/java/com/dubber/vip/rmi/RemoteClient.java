package com.dubber.vip.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by dubber on 2018/5/10.
 */
public class RemoteClient {

    public static void main(String[] args) {
        try {
            IRemoteMI hello = (IRemoteMI)Naming.lookup("rmi://localhost:8888/sayHello");
            System.out.println(hello.sayHello("hi, papa"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
