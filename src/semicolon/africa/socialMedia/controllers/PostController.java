package semicolon.africa.socialMedia.controllers;

import org.springframework.web.bind.annotation.*;
import semicolon.africa.socialMedia.data.models.Post;
import semicolon.africa.socialMedia.dtos.requests.CreatePostRequest;
import semicolon.africa.socialMedia.services.PostService;
import semicolon.africa.socialMedia.services.PostServiceImpl;

@RestController
public class PostController {

    private PostService postService = new PostServiceImpl();
    @PostMapping("/Post")

    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
        return "Successful";
    }
    @GetMapping("/Post/{postId}")
    public Post viewPost(@PathVariable int postId){
        return postService.viewPost(postId);
    }
}
