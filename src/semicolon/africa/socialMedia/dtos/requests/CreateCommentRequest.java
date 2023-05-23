package semicolon.africa.socialMedia.dtos.requests;

import lombok.Data;

@Data
public class CreateCommentRequest {
    private int postId;
    private String commenterName;
    private String comment;
}
