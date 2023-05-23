package semicolon.africa.socialMedia.services;

import semicolon.africa.socialMedia.dtos.requests.CreateCommentRequest;

public interface CommentService {
    void createComment(CreateCommentRequest createCommentRequest);
}
