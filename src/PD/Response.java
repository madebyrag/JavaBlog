package PD;

import DA.ResponseDA;

import java.util.Date;

/**
 * Created by mingtao on 15-11-4.
 */
public class Response {
    String ID;
    String content;
    Date time;
    String commentID;

    public String getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }

    public Date getTime() {
        return time;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getFromUserID() {
        return fromUserID;
    }

    public String getToUserID() {
        return toUserID;
    }

    String fromUserID;
    String toUserID;

    public Response(String ID, String content, Date time, String commentID, String fromUserID, String toUserID) {
        this.ID = ID;
        this.content = content;
        this.time = time;
        this.commentID = commentID;
        this.fromUserID = fromUserID;
        this.toUserID = toUserID;
    }
    public void add(Response response){
        ResponseDA.add(response);
    }
}
