package override;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    String priceType;
    double priceInEuros;

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        clonedSmartphonePrice.priceType = priceType;
        clonedSmartphonePrice.priceInEuros = priceInEuros;
        return clonedSmartphonePrice.clone();
    }

    @Override
    public String toString() {
        return "Price type: " + priceType + ". Price in euros: " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice(String type, double price){
        this.priceType = type;
        this.priceInEuros = price;

    }
}

    /*define a SmartphonePrice class that implements Cloneable and has:
        2 attributes:
        a string priceType
        a double priceInEuros
        [using IntelliJ] an override of the clone() method (that will have to be public) where:
        a clonedSmartphonePrice is generated using super.clone()
        the return value is a SmartphonePrice object
        [using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
        [using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
        [using IntelliJ] an override of the hashCode(), using the 2 attributes
        a constructor method that accepts 2 params (type, price) and assign the right values to the object
        define a tester class with main() method where you:
        create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
        create 2 new Smartphone objects, using the 4 newly created SmartphonePrice objects
        print in console all the details of the 2 newly created Smartphone objects
        check if the first smartphone is equal to the second smartphone, informing the user
        use a try{ ... } catch(Exception exception) { ... } to:
        get a new Smartphone object by cloning the second Smartphone
        print in console all the details of the newly cloned object
        check if the second smartphone is equal to the newly cloned object, informing the user
        inside the catch(Exception exception) { ... } scope:
        print the stack trace of the exception
        inform the user about the error*/

