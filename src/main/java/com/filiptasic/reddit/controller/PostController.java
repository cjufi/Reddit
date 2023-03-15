package com.filiptasic.reddit.controller;

import com.filiptasic.reddit.model.Post;
import com.filiptasic.reddit.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    private PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Long id){
        return new ResponseEntity<>(postService.getPost(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts(){
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addPost(@RequestBody Post post){
        postService.addPost(post);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
