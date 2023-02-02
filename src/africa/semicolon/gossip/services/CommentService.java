package africa.semicolon.gossip.services;

import africa.semicolon.gossip.datas.models.Comment;
import africa.semicolon.gossip.dtos.requests.CreateCommentRequests;

import java.util.List;

public interface CommentService {
    void createComment(CreateCommentRequests requests);
    List<Comment> viewAllComments();
}
