package semicolon.africa.socialMedia.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import semicolon.africa.socialMedia.dtos.requests.CreateCommentRequest;
import semicolon.africa.socialMedia.services.CommentService;
import semicolon.africa.socialMedia.services.CommentServiceImpl;

@RestController
public class CommentController {
    private CommentService commentService = new CommentServiceImpl();
    @PostMapping("/comment")

    public String addComment(@RequestBody CreateCommentRequest createCommentRequest) {
        commentService.createComment(createCommentRequest);
        return "Comment added";
    }

}
