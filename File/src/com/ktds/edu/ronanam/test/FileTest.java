package com.ktds.edu.ronanam.test;

import java.io.File;


//경로 표현 방식
//1.\ -> \\ (Windows)
//2.\ -> / (리눅스, MAC)
//하지만 Java는 OS에 대해 자유로워서 둘 다 OK

public class FileTest {
	public static void main(String[] args) {
		String folderPath = "D:\\Lanuages";
		File languagesFolder = new File(folderPath);

		// languagesFolder.isDirectory()
		if (languagesFolder.isFile()) {
			System.out.println(languagesFolder.getAbsolutePath() + "는 파일입니다.");
		} else {
			System.out.println(languagesFolder.getAbsolutePath() + "는 폴더입니다.");
		}
		
		/**
		 * getPath(): 상대경로 / getAbsolute(): 절대경로
		 */
		String s = "..\\";
		File f = new File(s);
		if(f.isDirectory()){System.out.printf("%s\n%s",f.getAbsolutePath(),f.getPath());}
		
		/**
		 * 파일개체를 참조해서 그 하위 폴더(개체)로 들어가는 방법
		 * System.out.println(File.separator);  -> \
		 */
		File javaFolder = new File(languagesFolder.getAbsolutePath() + File.separator + "Java");
		if(javaFolder.isDirectory()){
			System.out.println(javaFolder.getAbsolutePath()+"는 폴더(디렉토리)입니다.");
		}else{
			System.out.println(javaFolder.getAbsolutePath()+"는 파일 입니다.");
		}
		
		/**
		 * 폴더 안에 무엇이 있는지?
		 */
		for (String contest : javaFolder.list()) {
			System.out.println(contest);
		}
	}
}
