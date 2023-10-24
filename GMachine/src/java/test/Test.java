/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;

import idao.IDao;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;

import util.HibernateUtil;

/**
 *
 * @author samia
 */
public class Test {
    public static void main(String[] args) {
    
            IDao<Machine> dao = new MachineService();
           
           
            dao.create(new Machine("m1" , "HP" , 4000 ));
            dao.create(new Machine("m2" , "Dell" , 2802 ));
            dao.create(new Machine("m3" , "Lenovo" , 3000 ));
            dao.create(new Machine("m4" , "Mac" , 250000 ));
           
            
            
           for (Machine m :dao.findAll())
             System.out.println(m); 
                
        
    }
}
