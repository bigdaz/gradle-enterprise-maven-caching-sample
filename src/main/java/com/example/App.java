package com.example;

import com.example.protbuf.PersonProto.Person;
import com.util.Util;

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

    public static Person getPerson() {
        Person.Builder person = Person.newBuilder();
        person.setId(1);
        person.setName("Perry");
        return person.build();
    }
}
