// Server Classes 
abstract class Data {
    abstract public void DisplayValue();
}
class Integer extends  Data {
    int value;
    Integer() {
        value=100;
    }
    public void DisplayValue(){
        System.out.println (value);
    }
}
class Short extends Data {
    short value;
    Short() {
        value = 5237;
    }
    public void DisplayValue(){
        System.out.println (value);
    }
}
// Pattern Classes 
abstract class Factory {
    abstract public Data CreateDataObject();
}
class IntFactory extends Factory {
    public Data CreateDataObject(){
        return new Integer();
    }
}
class ShortFactory extends Factory {
    public Data CreateDataObject(){
        return new Short();
    }
}
//Client classes 
class Document {
    Data pd;
    Document(Factory pf){
        pd = pf.CreateDataObject();
    }
    public void DisplayData(){
        pd.DisplayValue();
    }
}
//Test class
public class MyDoc {
    static Document d;
    public static void main(String[] args) {
        d = new Document(new ShortFactory());
        d.DisplayData();
    }
}
