package com.code;

import java.io.File;

public class Main {

	public static void main(String... strings) {

		File[] files = new File("/home/hector/Desktop/user-photos").listFiles();

//		File[] files = new File("src/user-photos").listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
//				System.out.println(file);

//			File[] childFile = new File("src/user-photos/" + file.getName()).listFiles();
				File[] childFile = new File("/home/hector/Desktop/user-photos/" + file.getName()).listFiles();
//			System.out.println(childFile);
				for (File f : childFile) {
//					System.out.println(f);
					if (f.isFile()) {
//						System.out.println(f.getName());
						String newName = f.getName();
//						System.out.println(newName.replace(" ", "_"));
						newName = newName.replace(" ", "_");
//						File rename = new File("src/user-photos/" + file.getName() + "/" + newName);
						File rename = new File("/home/hector/Desktop/user-photos/"+ file.getName()+"/"+newName);
						System.out.println(rename);
						f.renameTo(rename);
						System.out.println("done!");
					}
				}
			}
		}
	}

}
