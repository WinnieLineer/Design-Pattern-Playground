package pers.design.pattern.decorator1;

public class BasicRockMan implements RockMan {
    @Override
    public void shoot() {
        System.out.println("Basic shoot!");
    }
}