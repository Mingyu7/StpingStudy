package hello.core.sigleton;

public class StatefullService {
    private int price;

    public void order(String name,int price){
        System.out.println("name = " + name+ "price = "+price);
        this.price=price; // 여기가 문제
    }

    public int getPrice() {
        return price;
    }
}
