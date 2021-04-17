/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author JMLekhase
 */
public class EnviroBankFiles {

    public static ArrayList<Account> readFile(String fileName) {

        ArrayList<Account> AccArray = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] acc = line.split(",");
                String technicalID = acc[0];
                String accountNum = acc[1];
                double balance = Double.parseDouble(acc[2]);
                double overdraft = Double.parseDouble(acc[3]);
                Account acco = new Account(technicalID, accountNum, balance,overdraft);
                AccArray.add(acco);

            }
            br.close();

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }
        return AccArray;
    }

    public static void writeFile(ArrayList<Account> AccArray, String filename) {
       
                for (Account account : AccArray) {
            try {
                FileWriter fw = new FileWriter(filename);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(account.toString() + "," + account.getAccountNum() + "," + account.getBalance() + "," +account.getOverdraft()+"\n");
                bw.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }

}
