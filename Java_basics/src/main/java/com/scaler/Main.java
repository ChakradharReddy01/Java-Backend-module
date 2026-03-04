package com.scaler;

import com.scaler.greet.Greetings;
import com.scaler.http.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Greetings great=new Greetings();
        System.out.println(great.greet());
        Client client = new Client();
        String response = client.get("https://example.com");
        System.out.println(response);
    }
}