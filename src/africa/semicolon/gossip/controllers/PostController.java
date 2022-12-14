package controllers;

import datas.models.Post;
import dtos.requests.CreatePostRequests;
import services.PostService;
import services.PostServiceImpl;

public class PostController {

    private PostService postService = new PostServiceImpl();
    public String createPost(CreatePostRequests createPostRequests){
        postService.createPost(createPostRequests);
        return "Successfully";
    }

    public Post viewPost(int postId){
        return postService.viewPost(postId);
    }

}
