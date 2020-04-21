package Common.SOAP;

import DB.Item;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;


@SuppressWarnings("NonAsciiCharacters")
@WebService
public interface SkeletonSOAP {

    @WebMethod
    void createUser(int uid) throws RemoteException;

    @WebMethod
    void deleteUser(int uid) throws RemoteException;

    @WebMethod
    void deleteUsers() throws RemoteException;

    @WebMethod
    void updateUser(int uid, int newuid, int fid) throws RemoteException;

    @WebMethod
    int[] getUser(int uid) throws RemoteException;

    @WebMethod
    ArrayList<int[]> getUsers() throws RemoteException;

    @WebMethod
    void createItem(int id, String name, int typeID) throws RemoteException;

    @WebMethod
    void deleteItem(int itemid) throws RemoteException;

    @WebMethod
    void deleteItems() throws RemoteException;

    @WebMethod
    void updateItem(int itemid, String itemName, int typeid, int newitemid) throws RemoteException;

    @WebMethod
    String[] getItem(int itemID) throws RemoteException;

    @WebMethod
    ArrayList<String[]> getItems() throws RemoteException;

    @WebMethod
    void createType(int typeID, String name, int keep) throws RemoteException;

    @WebMethod
    void deleteType(int typeID) throws RemoteException;

    @WebMethod
    void deleteTypes() throws RemoteException;

    @WebMethod
    void updateType(int typeID, String typeName, int keep, int newTypeID) throws RemoteException;

    @WebMethod
    String[] getType(int typeID) throws RemoteException;

    @WebMethod
    ArrayList<String[]> getTypes() throws RemoteException;

    @WebMethod
    ArrayList<Item> getFridgeContents(int fid) throws RemoteException, SQLException;
}

