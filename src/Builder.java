public class Builder {

    public double prise;
    public int count;
    public String name;
    public StringBuilder description;

    public void print(){

        System.out.println(String.format("%d %f %s %s", count, prise,name,description));
    }
}
