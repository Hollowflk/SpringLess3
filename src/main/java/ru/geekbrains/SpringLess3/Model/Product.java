package ru.geekbrains.SpringLess3.Model;

public class Product {

    private Integer id;

    private String title;

    private Integer coast;

    public Product(Integer id, String title, Integer coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        this.coast = coast;
    }


}
