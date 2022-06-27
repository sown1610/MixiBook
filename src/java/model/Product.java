/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sown
 */
public class Product {

    private int bookID;
    private String bookName;
    private float price;
    private int quantity;
    private int genreID;
    private String author;
    private String publisher;
    
    private String publicDATE;
    
    
    private String img;
    
    private String desc;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicDATE() {
        return publicDATE;
    }

    public void setPublicDATE(String publicDATE) {
        this.publicDATE = publicDATE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Product() {
    }

    public Product(int bookID, String bookName, float price, int quantity, int genreID, String author, String publisher, String publicDATE, String img, String desc) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.price = price;
        this.quantity = quantity;
        this.genreID = genreID;
        this.author = author;
        this.publisher = publisher;
        this.publicDATE = publicDATE;
        this.img = img;
        this.desc = desc;
    }

    
   

    
}
