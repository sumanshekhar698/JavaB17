package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePathsConstants;

public class MainSerialization {

	public static void main(String[] args) {

		Student st1 = new Student("tony", 32);
		System.out.println(st1);
		

		Student st2 = new Student("bunty", 38);
		System.out.println(st2);

		File file = new File(FilePathsConstants.SERIALIZE_FILE_PATH);

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				oos.writeObject(st1);
				oos.writeObject(st2);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
