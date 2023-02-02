package africa.semicolon.gossip.datas.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Comment {

    private String commenterName;

    private String comment;

    @Id
    private String id;


}
