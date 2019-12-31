package com.meihao.uploadexcel.entity;

import java.util.Date;

public class Excel {
    private Integer id;
    private String classes;//班级
    private String number;//人数
    private String headmaster;//班主任
    private String handleMan;//经手人
    private String date;//领用日期
    private String bookName;//教材名字
    private String author;//作者
    private String Press;//出版社
    private String quantity;//数量
    private String price;//单价
    private String autograph;//签名
    private String remarks;//备注
    private String objectName;//科目名称
    private String ISBN;//isbn

    public Excel() {
    }

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

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return Press;
    }

    public void setPress(String press) {
        Press = press;
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

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Excel{" +
                "classes='" + classes + '\'' +
                ", number='" + number + '\'' +
                ", headmaster='" + headmaster + '\'' +
                ", handleMan='" + handleMan + '\'' +
                ", date='" + date + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", Press='" + Press + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", autograph='" + autograph + '\'' +
                ", remarks='" + remarks + '\'' +
                ", objectName='" + objectName + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
