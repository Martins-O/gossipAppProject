package africa.semicolon.gossip.services;

import africa.semicolon.gossip.datas.models.Comment;
import africa.semicolon.gossip.datas.models.Post;
import africa.semicolon.gossip.dtos.requests.CreatePostRequests;

import java.util.List;

public interface PostService {
    void createPost(CreatePostRequests createPostRequests);
    void updatePost(String id, String body, String title);
    void deletePost(String id);
    Post viewPost(String id);

    List <Post> viewAllPosts();

    void addComment(String postId, Comment comment);

}
