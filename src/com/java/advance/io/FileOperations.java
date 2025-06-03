package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {

		File file = new File(FilePathsConstants.README_FILE_PATH);

		if (file.exists()) {
			System.out.println("is Directory: " + file.isDirectory());
			System.out.println("is File: " + file.isFile());
			
			System.out.println("R W E");
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			
			System.out.println("Delete ? "+file.delete());


		} else {
			boolean newFile = false;
			try {
				newFile = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Create new file ? "+newFile);

		}

	}

}
