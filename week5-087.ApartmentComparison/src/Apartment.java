
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment otherApartment) {
        int firstApt = this.pricePerSquareMeter * this.squareMeters;
        int otherApt = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        return Math.abs(firstApt - otherApt);
    }
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int firstApt = this.pricePerSquareMeter * this.squareMeters;
        int otherApt = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        if (firstApt > otherApt) {
            return true;
        }
        return false;
    }
    
}
