package server;

import model.Contact;
import rmiinterface.RMIInterface;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface {
    protected ServerOperation() throws RemoteException {
        super();
    }

    @Override
    public String helloTo(String name) throws RemoteException {
        System.err.print(name + " is trying to contact!");
        return "Server says hello to " + name;
    }

    @Override
    public Contact getContac() throws RemoteException {
        return new Contact(" Axel ", "es 7671206424 ");
    }

    public static void main (String[] args){

            try {

                Naming.rebind(  "//localhost/MyServer", new ServerOperation());
                List<String> test = new ArrayList<>();
                System.err.println("Server ready");

            } catch (Exception e) {

                System.err.print("Server exception: " + e.toString());
                e.printStackTrace();
            }
        }
    }