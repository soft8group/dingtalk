package context;

import java.util.ArrayList;
import java.util.List;

import database.IndexedDB;
import context.ApplicationContext;
import entity.Comment;
import entity.OfficialAccount;
import entity.Like;
import entity.Video;
import util.Command;

public class OfficialAccountContext {
    private OfficialAccount account;

    private IndexedDB<Integer, Video> videoDB = ApplicationContext.getInstance().getvideoDB();
    private IndexedDB<Integer, Comment> commentDB = ApplicationContext.getInstance().getCommentDB();
    private IndexedDB<Integer, Like> likeDB = ApplicationContext.getInstance().getLikeDB();


    public OfficialAccountContext(OfficialAccount oa) {
        this.account = oa;
    }

    private List<Integer> subscribers = new ArrayList<>();

    public OfficialAccount getAccount() {
        return account;
    }

    public void addVideo(Video video) {
        videoDB.insert(video);
        IndexedDB<Integer, UserContext> friendContextDb = ApplicationContext.getInstance().getFriendContextDB();
        for (Integer id : subscribers) {
            friendContextDb.findById(id).onUpdate(Command.ADD, article.getId());
        }
    }
}
