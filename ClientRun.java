/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import view.Home;

/**
 *
 * @author Hong Cuong Nguyen - https://gantet.tk/
 * 
 */
public class ClientRun {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Home view = new Home();
        view.setVisible(true);
    }
}
