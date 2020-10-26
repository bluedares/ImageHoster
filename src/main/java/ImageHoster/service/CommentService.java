package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //The method calls Repository to insert comment to persist comments in the DB
    public void insertComment(Comment comment) {
        commentRepository.insertComment(comment);
    }
}

