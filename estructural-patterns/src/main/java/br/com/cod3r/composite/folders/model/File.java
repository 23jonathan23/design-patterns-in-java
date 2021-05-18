package br.com.cod3r.composite.folders.model;

public class File implements FileSystemItem {
	private String _name;

    public File(String name) {
        _name = name;
    }

    public void print(String structure) {
        System.out.println(structure + _name);
    }
}