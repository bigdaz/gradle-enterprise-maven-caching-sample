package com.example;

import com.util.Util;
import com.example.avro.User;
import com.example.protbuf.PersonProto.Person;

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

    public static Person getProtobufPerson() {
        Person.Builder person = Person.newBuilder();
        person.setId(1);
        person.setName("Perry");
        return person.build();
    }
}
