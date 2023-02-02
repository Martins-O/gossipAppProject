package africa.semicolon.gossip.dtos.requests;

import africa.semicolon.gossip.datas.repositories.CommentRepository;
import lombok.Data;


@Data
public class CreateCommentRequests {

    private CommentRepository comRep;
    private String postId;

    private String comment;
    private String commenterName;


}
