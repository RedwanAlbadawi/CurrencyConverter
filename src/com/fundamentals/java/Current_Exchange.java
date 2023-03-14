package com.fundamentals.java;

import java.util.HashMap;
import java.util.Scanner;

public class Current_Exchange {

    public Void CurrencyConverter (){

        HashMap<Integer,String> currencyCodes = new HashMap <Integer, String>();

        //Adding currency Codes

        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "CAD");
        currencyCodes.put(3, "SAR");
        currencyCodes.put(4, "EUR");
        currencyCodes.put(5, "JPY");
        currencyCodes.put(6, "CNY");
        currencyCodes.put(7, "MXN");

        String fromCode, toCode;
        Float amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter ");

        System.out.println("Please chose form the following currency options that you want from convert to.");

        System.out.println("1:USD \t 2:CAD \t 3:SAR \t 4:EUR \t 5:JPY \t 6: CNY \t 7:MXN");

        fromCode = currencyCodes.get(sc.nextInt());

        System.out.println("Please chose form the following currency options that you want to convert to.");

        System.out.println("1:USD \t 2:CAD \t 3:SAR \t 4:EUR \t 5:JPY \t 6: CNY \t 7:MXN");

        toCode = currencyCodes.get(sc.nextInt());

        System.out.println("What's the the amount you wish to convert?");

        amount = sc.nextFloat();

        //sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("thank you for using the Currency Converter");

        return null;

    }
}
