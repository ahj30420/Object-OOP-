package chapter09.factory.step02;

import chapter09.Money;
import chapter09.Movie;

public class Client {
    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public Money getAvatarFee(){
        Movie avatar = factory.createAvatarMovie();
        return avatar.getFee();
    }
}
