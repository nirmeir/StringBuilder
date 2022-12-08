package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class My_stringTest {
    My_string usb = new My_string();
    String sentence = "to be or not to be";


    @org.junit.jupiter.api.Test
    void append() {
        usb.append(sentence);
        assertEquals(usb.toString(),sentence);

        sentence += "to eat or not to be";
        usb.append("to eat or not to be");
        assertEquals(usb.toString(),sentence);
    }

    @org.junit.jupiter.api.Test
    void reverse() {
        usb.append(sentence);
        usb.reverse();
        assertEquals(usb.toString(),"eb ot ton ro eb ot");
    }

    @org.junit.jupiter.api.Test
    void undo() {
        usb.append(sentence);
        usb.append(sentence);
        usb.undo();
        assertEquals(usb.toString(),sentence);
        usb.reverse();
        assertEquals(usb.toString(),"eb ot ton ro eb ot");
        usb.undo();
        assertEquals(usb.toString(),sentence);
        usb.append(" aaaa");
        usb.append("just test");
        usb.undo();
        assertEquals(usb.toString(),sentence+" aaaa");
    }

    @org.junit.jupiter.api.Test
    void delete() {
        usb.append(sentence);
        usb.delete(0,5);
        assertEquals(usb.toString()," or not to be");
        usb.delete(8,11);
        assertEquals(usb.toString()," or not be");
        usb.delete(100,10);
    }

    @org.junit.jupiter.api.Test
    void insert() {
        usb.append(sentence);
        usb.insert(0,"my test is:");
        assertEquals(usb.toString(),"my test is:"+sentence);
        usb.insert(3,"best ");
        assertEquals(usb.toString(),"my best test is:"+sentence);
    }

    @org.junit.jupiter.api.Test
    void replace() {
        usb.append(sentence);
        usb.replace(0,2,"for");
        usb.replace(0,3,"to");
        usb.undo();
        usb.undo();
        assertEquals(usb.toString(),sentence);


    }

}