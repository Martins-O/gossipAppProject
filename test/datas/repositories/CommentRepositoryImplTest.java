//package datas.repositories;
//
//import africa.semicolon.gossip.datas.models.Comment;
//import africa.semicolon.gossip.datas.repositories.CommentRepository;
//import africa.semicolon.gossip.datas.repositories.CommentRepositoryImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class CommentRepositoryImplTest {
//    private CommentRepository comments;
//
//    @BeforeEach
//    public void setUp() {
//        comments = new CommentRepositoryImpl();
//    }
//
//    @Test
//    public void saveNewCommentCountShouldBeOneTest() {
//        Comment com = new Comment();
//        com.setComment("I love it");
//        com.setCommenterName("Martins");
//        comments.save(com);
//
//        assertEquals(1L, comments.count());
//    }
//
//    @Test
//    public void saveNewPostCountFindByIdShouldReturnSavedPostTest() {
//        Comment com = new Comment();
//        com.setComment("I love it");
//        com.setCommenterName("Martins");
//        comments.save(com);
//
//        assertEquals(1L, comments.count());
//
//        Comment savedCom = comments.findById(1);
//        assertEquals(com, savedCom);
//
//        Comment com1 = new Comment();
//        comments.save(com1);
//        assertEquals(com1, comments.findById(2));
//    }
//
//    @Test
//    public void saveNewPostUpdatePostCountIs1Test() {
//        Comment com = new Comment();
//        com.setComment("I love it");
//        com.setCommenterName("Martins");
//        comments.save(com);
//        Comment updateCom = new Comment();
//        updateCom.setId(1);
//        updateCom.setComment("I like it");
//        updateCom.setCommenterName("Martin");
//        comments.save(updateCom);
//        assertEquals(1L, comments.count());
//        assertEquals(com, comments.findById(1));
//        assertEquals("I like it", com.getComment());
//        assertEquals("Martin", com.getCommenterName());
//    }
//
//    @Test
//    public void deletePost() {
//        Comment com = new Comment();
//        com.setComment("I love it");
//        com.setCommenterName("Martins");
//        comments.save(com);
//        assertEquals(1L, comments.count());
//
//
//        comments.delete(1);
//    }
//
//
//    @Test
//    public void deleteMultiplePost() {
//        Comment com = new Comment();
//        Comment com1 = new Comment();
//        Comment com2 = new Comment();
//        Comment com3 = new Comment();
//
//        comments.save(com);
//        comments.save(com1);
//        comments.save(com2);
//
//
//        comments.delete(1);
//        comments.save(com3);
//        assertEquals(3L, com2.getId());
//        assertEquals(4L, com3.getId());
//
//
//    }
//}