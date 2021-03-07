package project.posts.post.Domain;

import javax.persistence.*;

@Entity(name = "Contact")
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long contactid;
    private String fullname;
    private String phonenum;
    private String emailfrom;
    private String message;

    public Contact() {}

    public Contact(String fullname, String phonenum, String emailfrom, String message) {
        super();
        this.fullname=fullname;
        this.phonenum=phonenum;
        this.emailfrom=emailfrom;
        this.message=message;
    }

    public Long getContactid() {
        return contactid;
    }

    public void setContactid(Long contactid) {
        this.contactid = contactid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmailfrom() {
        return emailfrom;
    }

    public void setEmailfrom(String emailfrom) {
        this.emailfrom = emailfrom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
