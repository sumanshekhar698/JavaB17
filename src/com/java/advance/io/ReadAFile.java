package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {

		File file = new File(FilePathsConstants.README_FILE_PATH);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file);) {

				int ch;

				while ((ch = fis.read()) != -1) {
					System.out.print((char)ch);
				}

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
