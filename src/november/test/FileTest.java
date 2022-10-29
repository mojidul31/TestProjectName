package november.test;

import java.io.File;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.stream.Stream;

public class FileTest {	
	
	public static void main(String[] args) {
		//https://stackoverflow.com/questions/1844688/how-to-read-all-files-in-a-folder-from-java
		//one way to find all files
//		try (Stream<Path> paths = Files.walk(Paths.get("E:/Exam/Chaldal/data"))) {
//		    paths
//		        .filter(Files::isRegularFile)
//		        .forEach(System.out::println);
//		}catch(Exception e) {
//			System.out.print(e.getMessage());
//		}
		
		final File folder = new File("E:/Exam/Chaldal/data");
		//final File folder = new File("E:/Exam");
		listFilesForFolder(folder);
	}
	
	//another solution
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}

}


