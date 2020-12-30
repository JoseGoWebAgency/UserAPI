package pt.com.goweb.dbUser.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
    private String contact;
    private String password;


}
