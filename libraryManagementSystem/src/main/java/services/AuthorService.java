package services;

import models.Author;
import java.util.ArrayList;
import java.util.List;

public class AuthorService {
    private List<Author> authors = new ArrayList<>();
    private int nextId = 1;
    
    public void addAuthor(String name, String biography, String nationality) {
        Author author = new Author(nextId++, name, biography, nationality);
        authors.add(author);
        System.out.println("✅ Author added: " + author.getName());
    }

    public Author getAuthorById(int id) {
        for (Author a : authors) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public boolean updateAuthor(int id, String name, String biography, String nationality) {
        Author author = getAuthorById(id);
        if (author != null) {
            author.setName(name);
            author.setBiography(biography);
            author.setNationality(nationality);
            System.out.println("✏️ Author updated: " + author.getName());
            return true;
        }
        return false;
    }

    public boolean deleteAuthor(int id) {
        Author author = getAuthorById(id);
        if (author != null) {
            authors.remove(author);
            System.out.println("🗑️ Author removed: " + author.getName());
            return true;
        }
        return false;
    }
    public void listAuthors() {
        if (authors.isEmpty()) {
            System.out.println("No authors found.");
        } else {
            for (Author a : authors) {
                System.out.println(a);
            }
        }
    }
}

