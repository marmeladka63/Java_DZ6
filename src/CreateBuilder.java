public class CreateBuilder {
    Builder temp;
    public CreateBuilder(){
        temp = new Builder();
        temp.count = Const.VALUE;
        temp.name = Const.EMPTY;
        temp.prise = Const.VALUE;
        //temp.description = new StringBuilder()
        temp.description = new StringBuilder(Const.EMPTY);
    }
    public CreateBuilder setCount(int count){
        temp.count = count;
        return this;
    }
    public CreateBuilder setName(String name) {
        temp.name = name;
        return this;
    }
    public CreateBuilder setPrise(double prise) {
        temp.prise = prise;
        return this;
    }
    public CreateBuilder setDescription(StringBuilder description) {
        temp.description = description;
        return this;
    }
    public Builder Create(){
        return temp;
    }
}
