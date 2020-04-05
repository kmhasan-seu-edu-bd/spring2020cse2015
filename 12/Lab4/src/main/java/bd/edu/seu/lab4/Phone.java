package bd.edu.seu.lab4;

public class Phone {
    private int countryCode;
    private int areaCode;
    private int number;

    public Phone() {
    }

    public Phone(int countryCode, int areaCode, int number) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "countryCode=" + countryCode +
                ", areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }
}
