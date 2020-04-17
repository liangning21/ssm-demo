package cn.lihuan.entity;

public class jobs {

    private String id;
    private String title;
    private int minasalary;
    private int maxasalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinasalary() {
        return minasalary;
    }

    public void setMinasalary(int minasalary) {
        this.minasalary = minasalary;
    }

    public int getMaxasalary() {
        return maxasalary;
    }

    public void setMaxasalary(int maxasalary) {
        this.maxasalary = maxasalary;
    }

    @Override
    public String toString() {
        return "jobs{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", minasalary=" + minasalary +
                ", maxasalary=" + maxasalary +
                '}';
    }
}
