package Vehicle;

public class car {

    String  make;
    String model;
    int year;

    public static void main(String[] args) {
        for( int i=0; i<10; i++){
            System.out.println("car Goes");
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;


    }

    public void setMake(String make) {
        this.make = make;
    }
}
