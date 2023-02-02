package africa.semicolon.gossip.datas.repositories;

import africa.semicolon.gossip.datas.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    Comment findCommentById(String id);

}
