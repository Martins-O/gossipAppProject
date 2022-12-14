package datas.repositories;

import datas.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{

    private  List<Comment> commentDb = new ArrayList<>();
    private static int id;

    public CommentRepositoryImpl() {
        id = 0;
    }

    @Override
    public Comment save(Comment comment) {
        if (comment.getId() != 0) {
            update(comment);
        }else {
            commentDb.add(comment);
            id++;
            comment.setId(id);
        }
        return comment;
    }

    private void update(Comment comment) {
        Comment savedComment = findById(comment.getId());
        savedComment.setCommenterName(comment.getCommenterName());
        savedComment.setComment(comment.getComment());
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment : commentDb) {
            if (comment.getId() == (id)) {
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findComments() {
        return commentDb;
    }

    @Override
    public long count() {
        return commentDb.size();
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(int id) {
        for (Comment comment : commentDb) {
            if (comment.getId() == (id)) {
                commentDb.remove(comment);
                break;
            }
        }
    }
}
