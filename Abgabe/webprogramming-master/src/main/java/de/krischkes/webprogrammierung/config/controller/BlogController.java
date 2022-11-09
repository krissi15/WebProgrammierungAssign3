package de.krischkes.webprogrammierung.config.controller;

import de.krischkes.webprogrammierung.config.Blog;
import de.krischkes.webprogrammierung.config.controller.request.BlogCreationRequest;
import de.krischkes.webprogrammierung.config.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    private final BlogService blogService;

    @PostMapping(value = "/blog", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Blog createBlog(@RequestBody BlogCreationRequest blogCreationRequest) {
        return blogService.createBlog(blogCreationRequest.getTitle(), blogCreationRequest.getText(), blogCreationRequest.getAuthor(), blogCreationRequest.getCreateDate());
    }

    @GetMapping(value = "/alleblogs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Blog> gebeAlleBlog() {
        return blogService.gebeBlogs();
    }
}
