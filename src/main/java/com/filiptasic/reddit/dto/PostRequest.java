package com.filiptasic.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    private Long postId;
    private String subredditName;
    //validacija neka da post mora da ima ime!
    private String postName;
    private String url;
    private String description;
}
