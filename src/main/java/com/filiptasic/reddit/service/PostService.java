package com.filiptasic.reddit.service;

import com.filiptasic.reddit.exception.PostNotFoundException;
import com.filiptasic.reddit.model.Post;
import com.filiptasic.reddit.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postRepository;

    public Post getPost(Long postId){
        return postRepository.findById(postId)
                .orElseThrow(()-> new PostNotFoundException(postId.toString()));
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public void deletePost(Long postId){
        postRepository.deleteById(postId);
    }
}
