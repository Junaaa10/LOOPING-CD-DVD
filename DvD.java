package Inventory;

public class DvD extends Product {
    private int lenght;
    private int rating;
    private String studio;

    public DvD () {
        super();
        lenght = 0;
        rating = 0;
        studio = "";
    }


    public DvD (int Number, String Name, int Quantity, double price, int lenght, int Rating, String Studio) {
        super(Number, Name, Quantity, price);
        this.lenght = lenght;
        this.rating = Rating;
        this.studio = Studio;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int Rating) {
        this.rating = Rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String Studio) {
        this.studio = Studio;
    }

}