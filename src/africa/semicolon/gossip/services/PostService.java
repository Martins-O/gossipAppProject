package services;

import datas.models.Post;
import dtos.requests.CreatePostRequests;

import java.util.List;

public interface PostService {
    void createPost(CreatePostRequests createPostRequests);
    void updatePost(int  id, String body, String title);
    void deletePost(int id);
    Post viewPost(int id);

    List <Post> viewAllPosts();
}
