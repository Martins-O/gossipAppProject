package africa.semicolon.gossip.datas.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Post {

    private String title;

    @Id
    private String id;

    private LocalDateTime creationTime =  LocalDateTime.now();

    private String body;

    @DBRef
    private List<Comment> comments = new ArrayList<>();







//    @Override
//    public String toString() {
//        return "Post{" +
//                "title='" + title + '\'' +
//                ", id=" + id +
//                ", creationTime=" + creationTime +
//                ", body='" + body + '\'' +
//                ", comments=" + comments +
//                '}';
//    }


}
