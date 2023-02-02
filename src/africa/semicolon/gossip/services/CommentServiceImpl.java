package africa.semicolon.gossip.services;

import africa.semicolon.gossip.datas.models.Comment;
import africa.semicolon.gossip.datas.repositories.CommentRepository;
//import africa.semicolon.gossip.data's.repositories.CommentRepositoryImpl;
import africa.semicolon.gossip.dtos.requests.CreateCommentRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository comRep;

    @Autowired
    PostService postService;



    @Override
    public void createComment(CreateCommentRequests requests) {
        Comment comment = new Comment();
        comment.setCommenterName(requests.getCommenterName());
        comment.setComment(requests.getComment());
        Comment save = comRep.save(comment);
        postService.addComment(requests.getPostId(), save);

    }

    @Override
    public List<Comment> viewAllComments() {
        return comRep.findAll();
    }



}
