//package semicolon.africa.socialMedia.data.repositories;
//
//import semicolon.africa.socialMedia.data.models.Comment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CommentRepositoryImpl implements CommentRepository {
//    private List<Comment> commentDb = new ArrayList<>();
//    private int count;
//
//    @Override
//    public Comment save(Comment comment) {
//        if (comment.getId() != 0) update(comment);
//        else
//            saveNewComment(comment);
//        return comment;
//    }
//
//    private void saveNewComment(Comment comment) {
//        comment.setId(++count);
//        commentDb.add(comment);
//    }
//
//    private void update(Comment comment) {
//        Comment savedPost = findById(comment.getId());
//        savedPost.setTitle(comment.getTitle());
//        savedPost.setBody(comment.getBody());
//    }
//
//
//    @Override
//    public Comment findById(int id) {
//        for (Comment comment : commentDb) if (comment.getId() == id) return comment;
//        return null;
//    }
//
//    @Override
//    public List<Comment> findAll() {
//        return commentDb;
//    }
//
//    @Override
//    public long count() {
//        return commentDb.size();
//    }
//
//    @Override
//    public void delete(int id) {
//        for (int i = 0; i < commentDb.size(); i++) {
//            Comment checkId = commentDb.get(i);
//            if (checkId.getId() == id) {
//                commentDb.remove(checkId);
//                break;
//
//            }
//
//        }
//    }
//
//    @Override
//    public void delete(Comment comment){
//
//    }
//}