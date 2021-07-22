package com.timbuchalka;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{

	    ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

	    bos.write('a');
	    bos.write('b');
	    bos.write('c');
	    bos.write('d');

	    byte b[] = bos.toByteArray();

	    bos.writeTo(new FileOutputStream("Test.txt"));

	    bos.close();
    }
}
