package africa.semicolon.gossip.controllers;

import africa.semicolon.gossip.datas.models.Post;
import africa.semicolon.gossip.dtos.requests.CreatePostRequests;
import africa.semicolon.gossip.services.PostService;
import africa.semicolon.gossip.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {


    @Autowired
    private PostService postService = new PostServiceImpl();

    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequests createPostRequests){
        postService.createPost(createPostRequests);
        return "Successfully post created";
    }

    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return postService.viewPost(postId);
    }

}
