package pers.design.pattern.proxy2;
import pers.design.pattern.decorator1.RockMan;

public class Main {
    public static void main(String[] args) {
        RockMan proxy = new RockManProxy(false);
        proxy.shoot();

        proxy = new RockManProxy(true);
        proxy.shoot();
    }
}
