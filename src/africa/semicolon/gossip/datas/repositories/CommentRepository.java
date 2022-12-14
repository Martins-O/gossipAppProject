package datas.repositories;

import datas.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);

    Comment findById(int id);

    List<Comment> findComments();
    long count();
    void delete(Comment comment);
    void delete(int id);
}
