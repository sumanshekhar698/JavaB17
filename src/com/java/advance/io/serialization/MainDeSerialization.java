package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.java.advance.io.FilePathsConstants;

public class MainDeSerialization {

	public static void main(String[] args) {

		File file = new File(FilePathsConstants.SERIALIZE_FILE_PATH);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {
				Student st1 = (Student) ois.readObject();
				System.out.println(st1);
				
				Student st2 = (Student) ois.readObject();
				System.out.println(st2);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
