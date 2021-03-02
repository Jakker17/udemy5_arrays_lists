package com.company;

import com.company.BankingApp.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //SortedArray.printArray(SortedArray.sortIntegers(SortedArray.getIntegers(5)));
        //System.out.println(MinimumElement.findMin(MinimumElement.readElements(MinimumElement.readInteger())));
        //int[] array = {3,5,6,7,8};
        //MinimumElement.reverse(array);



 /*       String sentence= "Cwm fjord bank glyphs vext quiz";


        for(int i=0;i<alphabet.length;i++){
            if(sentence.toLowerCase().contains(String.valueOf(alphabet[i]))) System.out.println("true");
            else System.out.println("false");
        }



        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] help = new String[]{ "arp", "live", "strong" };

        int index=-1;
        for (int j=0;j<help[0].length();j++) {
            char character =help[0].charAt(j);
            for (int i = 0; i < alphabet.length; i++) {
                if (character==alphabet[i])index =i+1;
            }
            System.out.println(index);
        }
*/



        //System.out.println(Arrays.toString(inArray(new String[]{ " ", "mice", "bull" },new String[] { "lively", "mice", "harp", "shar-p", "armstrong", "tarped ", "bullied" })));

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);



    }

    public static int getIndex(char c){
        int index =-1;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            if (c==alphabet[i])index =i+1;
        }
return index;
    }

    public static String[] inArray(String[] array1, String[] array2){
        if (array1.length==0)return null;

        boolean tmp=false;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<String> tmp2 = new ArrayList<>();
        for (int i=0;i<array1.length;i++){
         for (int j=0;j<array2.length;j++){
             if (array1[i].equals(" ")) break;

             if (array2[j].toLowerCase().contains(array1[i].toLowerCase()))
             {
                 tmp2.add(array1[i]);
                    break;
             }
         }
        }
        String[] r = tmp2.toArray(new String[0]);
        Arrays.sort(r);
        return r;
    }
}
