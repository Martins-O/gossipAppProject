//package africa.semicolon.gossip.services;
//
//import africa.semicolon.gossip.dtos.requests.CreateCommentRequests;
//import africa.semicolon.gossip.dtos.requests.CreatePostRequests;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class CommentServiceImplTest {
//
//    private CommentService service;
//    private PostService postService;
//
//    @BeforeEach
//    public void setUp() {
//        service = new CommentServiceImpl();
//        postService = new PostServiceImpl();
//    }
//
//    @Test
//    public void createCommentTest(){
//        CreateCommentRequests request = new CreateCommentRequests();
//        request.setComment("I love");
//        request.setPostId(1);
//        request.setCommenterName("Martins");
//
//        CreatePostRequests postRequest = new CreatePostRequests();
//        postRequest.setBody("body");
//        postRequest.setTitle("title");
//        postService.createPost(postRequest);
//
//        service.createComment(request);
//
//        assertEquals(1L, service.viewAllComments().size());
//        PostService postService = new PostServiceImpl();
//        System.out.println(postService.viewPost("1"));
//
//
//    }
//
//}