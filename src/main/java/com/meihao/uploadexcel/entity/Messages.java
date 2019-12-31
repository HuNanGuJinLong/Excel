package com.meihao.uploadexcel.entity;

import java.io.Serializable;

public class Messages implements Serializable {
    private String classes;

    private String number;

    private String headmaster;

    private String handleman;

    private String date;

    private String bookname;

    private String author;

    private String press;

    private String quantity;

    private String price;

    private String autograph;

    private String remarks;

    private String objectname;

    private String isbn;

    private Integer id;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;
    }

    public String getHandleman() {
        return handleman;
    }

    public void setHandleman(String handleman) {
        this.handleman = handleman;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "classes='" + classes + '\'' +
                ", number='" + number + '\'' +
                ", headmaster='" + headmaster + '\'' +
                ", handleman='" + handleman + '\'' +
                ", date='" + date + '\'' +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", autograph='" + autograph + '\'' +
                ", remarks='" + remarks + '\'' +
                ", objectname='" + objectname + '\'' +
                ", isbn='" + isbn + '\'' +
                ", id=" + id +
                '}';
    }
}