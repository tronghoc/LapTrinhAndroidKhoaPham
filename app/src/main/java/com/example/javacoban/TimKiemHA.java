package com.example.javacoban;

public class TimKiemHA {
    private int images;
    private String name;
    private String desc;

    public TimKiemHA(int images, String name, String desc) {
        this.images = images;
        this.name = name;
        this.desc = desc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
