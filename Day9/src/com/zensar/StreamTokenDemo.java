package com.zensar;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StringReader sr = new StringReader("Hi! this is 1 Java Virtual Guru from Syskan. \n Second line");
			StreamTokenizer st = new StreamTokenizer(sr);
			System.out.println(st);
//			st.resetSyntax();
//			st.wordChars('A', 'Z');
//			st.wordChars('a', 'z');
//			st.wordChars(48, 60);
			int type;
			while ((type = st.nextToken()) != StreamTokenizer.TT_EOF) {
				if (type == StreamTokenizer.TT_WORD)
					System.out.println(st.sval);
			}
		} catch (IOException e) {
			System.err.println("Error :" + e);
		}

	}

}
