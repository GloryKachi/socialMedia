package semicolon.africa.socialMedia.services;

import semicolon.africa.socialMedia.data.models.Comment;
import semicolon.africa.socialMedia.data.models.Post;
import semicolon.africa.socialMedia.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {
    private PostService postService;

    @BeforeEach
    public void setUp() {
        postService = new PostServiceImpl();
        //createPostRequest = new CreatePostRequest();
    }

    @Test
    public void createPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("New Post");
        createPostRequest.setTitle("Egusi is my best soup");
        postService.createPost(createPostRequest);
        assertEquals(1, postService.viewAllPost().size());
    }
    @Test
    public void viewPostTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New Post");
        postService.createPost(createPostRequest);
        assertEquals(1,postService.viewAllPost().size());

        Post post = postService.viewPost(1);
        assertEquals("New Post",post.getTitle());
        assertEquals("Egusi is my best soup",post.getBody());

    }
    @Test public void addCommentTest(){
       //given I have a saved post
       // given I have a comment
        //When I save the comment to post
        //Confirm that post's comment is now 1
        CreatePostRequest createPostRequest = new CreatePostRequest();
        Post post = new Post();
        post.setBody("Post Body");
        post.setTitle("Post Title");
        postService.createPost(createPostRequest);
        Comment comment = new Comment();
        comment.setComment("I love your post");
        postService.addComment(1,comment);

        Post savedPost = postService.viewPost(1);
        assertEquals(1,savedPost.getComments().size());
        assertEquals("I love your post",savedPost.getComments().get(0).getComment());
    }
}