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
public class Publisher {
    private int PublisherID;
    private String PublisherName;

    public Publisher(int PublisherID, String PublisherName) {
        this.PublisherID = PublisherID;
        this.PublisherName = PublisherName;
    }

    public Publisher() {
    }

    public int getPublisherID() {
        return PublisherID;
    }

    public void setPublisherID(int PublisherID) {
        this.PublisherID = PublisherID;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }
}
