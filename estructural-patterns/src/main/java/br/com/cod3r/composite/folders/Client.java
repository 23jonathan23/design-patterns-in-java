package br.com.cod3r.composite.folders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.Folder;
import br.com.cod3r.composite.folders.model.FileSystemItem;

public class Client {

	public static FileSystemItem createCompositeFromFile(java.io.File file) {
		if(!file.isDirectory()) return new File(file.getName());
		
		List<FileSystemItem> childs = new ArrayList<>();

		java.io.File[] files = file.listFiles();

		for(java.io.File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}

		return new Folder(file.getName(), childs);
	}

	public static void main(String[] args) {
		FileSystemItem file1 = new File("file1.txt");
		FileSystemItem file2 = new File("file2.txt");
		FileSystemItem file3 = new File("file3.txt");
		FileSystemItem file4 = new File("file4.txt");
		FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Folder("folder", Arrays.asList(file3, file4, sf2));

		folder.print("");

		System.out.println("------------");

		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir + java.io.File.separator + "estructural-patterns\\src"));
		fromDisk.print(">");
	}
}
