/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001.gui;

import com.eviro.assessment.grad001.Account;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author VERALISTO
 */
public class JabulaniMarvellLekhase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Account> map = new HashMap<Integer, Account>();
        try {
            Account acc1 = new Account("101", "1", 2000, 0);
            Account acc2 = new Account("102", "2", 5000, 0);
            Account acc3 = new Account("103", "3", 1000, 10000);
            Account acc4 = new Account("104", "4", -5000, 20000);

            map.put(1, acc1);
            map.put(2, acc2);
            map.put(3, acc3);
            map.put(3, acc4);
            
            for(Map.Entry<Integer, Account> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Account ac=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(ac.toString());   
	    }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        EnviroBankApp bank = new EnviroBankApp();
        bank.setTitle("Enviro Bank App");
        bank.setVisible(true);
    }

}
