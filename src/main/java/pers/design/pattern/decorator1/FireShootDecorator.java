package pers.design.pattern.decorator1;

public class FireShootDecorator extends RockManDecorator {

    public FireShootDecorator(RockMan decoratedRockMan) {
        super(decoratedRockMan);
    }

    @Override
    public void shoot() {
        super.shoot();
        System.out.println("... with Fire Shoot!");
    }
}