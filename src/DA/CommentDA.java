package DA;

import PD.Comment;

import java.sql.SQLException;
import java.text.DateFormatSymbols;

/**
 * Created by mingtao on 15-11-4.
 */
public class CommentDA {
    static public void add(Comment comment){
        String sql="INSERT INTO comment(Id,Content,Time,ArticleId,User)" +
                "VALUES ('"+comment.getID()+"','"+comment.getContent()+"','"+
                comment.getTime()+"','"+comment.getArticleID()+"','"+comment.getUserID()+"')";
        try{
            Base.statement.executeUpdate(sql);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
