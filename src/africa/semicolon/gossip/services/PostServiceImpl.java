package africa.semicolon.gossip.services;

import africa.semicolon.gossip.datas.models.Comment;
import africa.semicolon.gossip.datas.models.Post;
import africa.semicolon.gossip.datas.repositories.PostRepository;
//import africa.semicolon.gossip.datas.repositories.PostRepositoryImpl;
import africa.semicolon.gossip.dtos.requests.CreatePostRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRep;
    @Override
    public void createPost(CreatePostRequests createPostRequests) {
        Post post = new Post();
        post.setTitle(createPostRequests.getTitle());
        post.setBody(createPostRequests.getBody());
        postRep.save(post);
    }

    @Override
    public void updatePost(String id, String body, String title) {

    }

    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(String id) {
        return postRep.findPostById(id);
    }

    @Override
    public List<Post> viewAllPosts() {
        return postRep.findAll();
    }

    @Override
    public void addComment(String postId, Comment comment) {
        Post save = postRep.findPostById(postId);
        save.getComments().add(comment);
        postRep.save(save);
    }
}
