package africa.semicolon.gossip.datas.repositories;

import africa.semicolon.gossip.datas.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String> {
    Post findPostById(String postId);
}
