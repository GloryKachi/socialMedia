package semicolon.africa.socialMedia.services;

import semicolon.africa.socialMedia.data.models.Comment;
import semicolon.africa.socialMedia.data.models.Post;
import semicolon.africa.socialMedia.dtos.requests.CreatePostRequest;

import java.util.List;

public interface PostService {
    void createPost(CreatePostRequest createPostRequest);

//    void createPost(String title, String body);
    void updatePost(int id, String title, String body);
    void deletePost(int id);
    Post viewPost(int id);
    List<Post> viewAllPost();
    void addComment(int postId, Comment comment);
}
