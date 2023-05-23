package semicolon.africa.socialMedia.services;

import semicolon.africa.socialMedia.data.models.Comment;
import semicolon.africa.socialMedia.data.models.Post;
import semicolon.africa.socialMedia.data.repositories.PostRepository;
import semicolon.africa.socialMedia.data.repositories.PostRepositoryImpl;
import semicolon.africa.socialMedia.dtos.requests.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements PostService{
    private PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);

    }


    @Override
    public void updatePost(int id, String title, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(int postId, Comment comment) {

    }
}
