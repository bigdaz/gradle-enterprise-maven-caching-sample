package com.example;

import com.util.Util;
import com.example.avro.User;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(Util.getOutput() );
    }

    public static User getAvroUser() {
        return new User("Andrew", 7, "red");
    }
}
