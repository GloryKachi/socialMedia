package data.repositories;

import semicolon.africa.socialMedia.data.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.africa.socialMedia.data.repositories.PostRepository;
import semicolon.africa.socialMedia.data.repositories.PostRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepositoryImplTest {
    private PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
    }

    @Test
    public void saveNewPost_countShouldBeOne_Test(){
        Post post = new Post();
        post.setBody("Our post body");
        post.setTitle("Our post title");

        postRepository.save(post);

        assertEquals(1L, postRepository.count());
    }
    @Test
    public void saveNewPost_findById_shouldReturnSavedPostTest(){
        Post post = new Post();
        post.setBody("Our post body");
        post.setTitle("Our post title");

        postRepository.save(post);
        assertEquals(1L, postRepository.count());

        Post savedPost = postRepository.findById(1);
        assertEquals(post, savedPost);
        Post post2 = new Post();
        postRepository.save(post2);
        assertEquals(post2,postRepository.findById(2));
    }
    @Test
    public void saveNewPost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setTitle("Our post title");
        post.setBody("Our post body");
        postRepository.save(post);

        Post updatedPost = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("Updated body");
        updatedPost.setTitle("Updated title");
        postRepository.save(updatedPost);

        assertEquals(1l,postRepository.count());
        assertEquals(post,postRepository.findById(1));
        assertEquals("Updated body",post.getBody());
        assertEquals("Updated title",post.getTitle());

    }
    @Test
    public void delete(){
        Post post = new Post();
        post.setTitle("Our post title");
        post.setBody("Our post body");
        postRepository.save(post);

        Post post2 = new Post();
        post2.setTitle("Our post2 title");
        post2.setBody("Our post2 body");
        postRepository.save(post2);

        Post post3 = new Post();
        post3.setTitle("Our post3 title");
        post3.setBody("Our post3 body");
        postRepository.save(post3);

        Post post4 = new Post();
        post4.setTitle("Our post4 title");
        post4.setBody("Our post4 body");
        postRepository.save(post4);


        assertEquals(4L,postRepository.count());
        assertEquals(post2,postRepository.findById(2));

        postRepository.delete(1);
        assertEquals(3L,postRepository.count());

        postRepository.delete(4);
        assertEquals(2L,postRepository.count());

        Post post5 = new Post();
        post5.setTitle("Our post5 title");
        post5.setBody("Our post5 body");
        postRepository.save(post5);
        System.out.println(post5.getId());
        assertEquals(post5,postRepository.findById(5));
    }



}