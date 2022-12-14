package services;

import datas.models.Post;
import datas.repositories.PostRepository;
import datas.repositories.PostRepositoryImpl;
import dtos.requests.CreatePostRequests;

import java.util.List;

public class PostServiceImpl implements PostService{

    private PostRepository postRep = new PostRepositoryImpl();
    @Override
    public void createPost(CreatePostRequests createPostRequests) {
        Post post = new Post();
        post.setTitle(createPostRequests.getTitle());
        post.setBody(createPostRequests.getBody());
        postRep.save(post);
    }

    @Override
    public void updatePost(int id, String body, String title) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return postRep.findById(id);
    }

    @Override
    public List<Post> viewAllPosts() {
        return postRep.findAll();
    }
}
