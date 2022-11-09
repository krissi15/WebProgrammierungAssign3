package de.krischkes.webprogrammierung.config.service;

import de.krischkes.webprogrammierung.config.Blog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    private List<Blog> alleBlogs;
    private Integer blogAnzahl;

    public BlogService() {
        this.alleBlogs = new ArrayList<>();
        this.blogAnzahl = 0;
        addThreeBlogsToArrayList();
    }

    public Boolean addThreeBlogsToArrayList () {
        for (Integer i = 0; i<3; i++) {
            Blog a = new Blog(blogAnzahl++,"Reise nach Mannheim", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.", "TestAuthor", LocalDate.now());
            alleBlogs.add(a);
        }
        return true;
    }

    public Blog createBlog(String title, String text, String author, LocalDate createDate) {
        Blog blog = new Blog(blogAnzahl++, title, text, author, createDate);
        //blog.updateDateFromBlog();
        alleBlogs.add(blog);
        return blog;
    }

    public List<Blog> gebeBlogs() {
        return alleBlogs;
    }
}
