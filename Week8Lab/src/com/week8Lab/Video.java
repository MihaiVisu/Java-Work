package com.week8Lab;

/**
 * Created by mihaivisuian on 1/12/15.
 */
public class Video {

    private String title;
    private boolean checkedOut;
    private int ratingSum = 0;
    private int ratingCount = 0;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean addRating(int rating) {
        if (rating <= 5 && rating >= 1) {
            ratingCount++;
            ratingSum += rating;
            return true;
        } else {
            System.out.print("Invalid Rating inserted.");
            return false;
        }
    }

    public double getAverageRating() {
        if (ratingCount == 0)
            return 0;
        return ((double) ratingSum) / ratingCount;
    }

    public boolean checkOut() {
        if (checkedOut) {
            System.out.println(this + " is already checked out.");
            return false;
        }
        checkedOut = true;
        return true;
    }

    public boolean returnToStore() {
        if (!checkedOut) {
            System.out.println(this + " is not checked out.");
            return false;
        }
        checkedOut = false;
        return true;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    @Override
    public String toString() {
        return "Video[title=\"" + title + "\", checkedOut=" + checkedOut + "]";
    }
}

