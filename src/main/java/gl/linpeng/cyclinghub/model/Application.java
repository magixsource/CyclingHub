package gl.linpeng.cyclinghub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    private Long id;
    private String name;
    private String code;
    private ApplicationTypeEnum type;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApplicationTypeEnum getType() {
        return type;
    }

    public void setType(ApplicationTypeEnum type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
