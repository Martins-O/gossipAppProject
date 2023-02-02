//package datas.repositories;
//
//
//import africa.semicolon.gossip.datas.models.Post;
//import africa.semicolon.gossip.datas.repositories.PostRepository;
//import africa.semicolon.gossip.datas.repositories.PostRepositoryImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class PostRepositoryImplTest {
//    private PostRepository postRep;
//
//    @BeforeEach
//    public void setUp(){
//        postRep = new PostRepositoryImpl();
//    }
//    @Test
//    public void saveNewPostCountShouldBeOneTest(){
//        Post post = new Post();
//        post.setBody("My first post");
//        post.setTitle("Ogo");
//        postRep.save(post);
//
//        assertEquals(1L, postRep.count());
//    }
//
//    @Test
//    public void saveNewPostCountFindByIdShouldReturnSavedPostTest(){
//        Post post = new Post();
//        post.setBody("My first post");
//        post.setTitle("Ogo");
//        postRep.save(post);
//
//        assertEquals(1L, postRep.count());
//
//        Post savedPost = postRep.findPostById("1");
//        assertEquals(post, savedPost);
//
//        Post post2 = new Post();
//        postRep.save(post2);
//        assertEquals(post2, postRep.findPostById("2"));
//    }
//
//    @Test
//    public void saveNewPostUpdatePostCountIs1Test(){
//        Post post = new Post();
//        post.setBody("My first post");
//        post.setTitle("Ogo");
//        postRep.save(post);
//        Post updatePost = new Post();
//        updatePost.setId("1");
//        updatePost.setTitle("Updated Title");
//        updatePost.setBody("Updated Body");
//        postRep.save(updatePost);
//        assertEquals(1L, postRep.count());
//        assertEquals(post, postRep.findById("1"));
//        assertEquals("Updated Title", post.getTitle());
//        assertEquals("Updated Body", post.getBody());
//    }
//
//    @Test
//    public void deletePost(){
//        Post post = new Post();
//        post.setBody("My first post");
//        post.setTitle("Ogo");
//        postRep.save(post);
//        assertEquals(1L, postRep.count());
//
//        postRep.delete("1");
//    }
//
//
//    @Test
//    public void deleteMultiplePost(){
//        Post post1 = new Post();
//        Post post2 = new Post();
//        Post post3 = new Post();
//        Post post4 = new Post();
//
//        postRep.save(post1);
//        postRep.save(post2);
//        postRep.save(post3);
//
//        postRep.delete(1);
//        postRep.save(post4);
//        assertEquals(3L, post3.getId());
//        assertEquals(4L, post4.getId());
//    }
//}