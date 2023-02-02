package africa.semicolon.gossip.controllers;

import africa.semicolon.gossip.dtos.requests.CreateCommentRequests;
import africa.semicolon.gossip.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public String createComment(@RequestBody CreateCommentRequests requests){
        commentService.createComment(requests);
        return "Successfully created comment";
    }

//    @GetMapping("/comments/{commentId}")
//    public Comment viewComment(@PathVariable int commentId){
//        return commentService.viewComment(commentId);
//    }
}
