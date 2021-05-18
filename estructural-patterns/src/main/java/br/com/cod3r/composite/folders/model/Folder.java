package br.com.cod3r.composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem {
    private String _name;
    private List<FileSystemItem> _children;
    
    public Folder(String name, List<FileSystemItem> children) {
        _name = name;
        _children = children;
    }

    public void print(String structure) {
        System.out.println(structure + _name);
        
        for(FileSystemItem child : _children) {
            child.print(structure + "| ");
        }
    }
}
