package in.ravikalla;

public class SampleBean {

    private final long id;
    private final String content;

    public SampleBean(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
