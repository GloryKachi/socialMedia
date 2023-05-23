package semicolon.africa.socialMedia.data.repositories;

import semicolon.africa.socialMedia.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository{
    private List<Post> postDb = new ArrayList<>();
    private int count;

    @Override
    public Post save(Post post) {
        if (post.getId()!=0) update(post);
        else
            saveNewPost(post);
        return post;
    }

    private void saveNewPost(Post post) {
        post.setId(++count);
        postDb.add(post);
    }

    public void update (Post post){
        //find the original
        Post savedPost = findById(post.getId());
        savedPost.setTitle(post.getTitle());
        savedPost.setBody(post.getBody());
    }

    @Override
    public Post findById(int id) {
        for (Post post: postDb) if (post.getId()==id) return post;

        return null;
    }

    @Override
    public List<Post> findAll() {
        return postDb;
    }

    @Override
    public long count() {
        return postDb.size();
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < postDb.size() ; i++) {
          Post checkId =  postDb.get(i);
            if (checkId.getId() == id) {
                postDb.remove(checkId);
                break;
            }
        }
//        postDb.removeIf(post -> post.getId() == id);


    }
}
