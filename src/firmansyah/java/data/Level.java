package firmansyah.java.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String desc;

    Level(String description){
        this.desc = description;
    }

    public String geteDescription(){
        return this.desc;
    }
}
