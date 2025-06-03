package com.java.advance.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {

		File file = new File(FilePathsConstants.README_FILE_PATH);

		if (file.exists()) {
			String msg = "Java i easy only if you work\n HARD";

			try (FileOutputStream fos = new FileOutputStream(file);) {
				
				fos.write(msg.getBytes());
				

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
