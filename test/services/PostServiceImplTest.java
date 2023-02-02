//package services;
//
//import africa.semicolon.gossip.datas.models.Comment;
//import africa.semicolon.gossip.datas.models.Post;
//import africa.semicolon.gossip.dtos.requests.CreatePostRequests;
//import africa.semicolon.gossip.services.PostService;
//import africa.semicolon.gossip.services.PostServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class PostServiceImplTest {
//    private PostService service;
//    private CreatePostRequests createPostRequests;
//
//    @BeforeEach
//    public void setUp(){
//        service = new PostServiceImpl();
//        createPostRequests = new CreatePostRequests();
//    }
//
//    @Test
//    public void createPostTest(){
//        createPostRequests.setBody("Hallelujah!");
//        createPostRequests.setTitle("I'm alive Alive");
//        service.createPost(createPostRequests);
//        assertEquals(1L, service.viewAllPosts().size());
//
//        Post post = service.viewPost("1");
//        assertEquals("Hallelujah!", post.getBody());
//        assertEquals("I'm alive Alive", post.getTitle());
//        assertNotNull(post.getCreationTime());
//    }
//
//    @Test
//    public void addCommentTest(){
//
//        createPostRequests.setTitle("Amen");
//        createPostRequests.setBody("Hallelujah");
//
//        service.createPost(createPostRequests);
//        Comment comment = new Comment();
//        comment.setComment("I love you Lord!");
//        service.addComment("1", comment);
//
//        Post savePost = service.viewPost("1");
//        assertEquals(1, savePost.getComments().size());
//        assertEquals("I love you Lord!", savePost.getComments().get(0).getComment());
//
//    }
//
//}