package Common.RMI;

import java.sql.SQLException;
import java.util.ArrayList;

@SuppressWarnings("NonAsciiCharacters")
public interface SkeletonRMI extends java.rmi.Remote {

    ArrayList<String[]> getTables() throws java.rmi.RemoteException;

    String adminLogin(String username, String password) throws java.rmi.RemoteException;


    boolean createUser(String userName) throws java.rmi.RemoteException;

    ArrayList<String[]> getUser(String userName) throws java.rmi.RemoteException;

    ArrayList<String[]> getUsers() throws java.rmi.RemoteException;

    ArrayList<String[]> getCompleteUser(String username) throws java.rmi.RemoteException, SQLException;

    boolean updateUser(String newUserName, int fid, String userName) throws java.rmi.RemoteException;

    boolean deleteUser(String userName) throws java.rmi.RemoteException;


    boolean createItem(String name, int typeid) throws java.rmi.RemoteException;

    ArrayList<String[]> getItem(int itemid) throws java.rmi.RemoteException;

    ArrayList<String[]> getItems() throws java.rmi.RemoteException;

    boolean updateItem(int itemid, String itemName, int typeid, int newItemid)throws java.rmi.RemoteException;

    boolean deleteItem(int itemid) throws java.rmi.RemoteException;


    boolean createType(String name, int keep) throws java.rmi.RemoteException;

    ArrayList<String[]> getType(int typeid) throws java.rmi.RemoteException;

    ArrayList<String[]> getTypes() throws java.rmi.RemoteException;

    boolean updateType(int typeid, String typeName, int keep, int newTypeid) throws java.rmi.RemoteException;

    boolean deleteType(int typeid) throws java.rmi.RemoteException;


    boolean createFridgeRow(int fid, int itemid, String expiration, int amount) throws java.rmi.RemoteException;

    ArrayList<String[]> getFridgeItem(int fid, int itemid) throws  java.rmi.RemoteException;

    ArrayList<String[]> getFridge(int fid) throws java.rmi.RemoteException;

    ArrayList<String[]> getAllFridgeRows() throws  java.rmi.RemoteException;

    ArrayList<String[]> getFridgeContents(int fid) throws java.rmi.RemoteException, SQLException;

    boolean updateFridgeRow(int fid, int itemid, int newFid, int newItemid, String newExpiration, int newAmount ) throws java.rmi.RemoteException;

    boolean deleteFridgeRow(int fid, int itemid) throws java.rmi.RemoteException;

}
