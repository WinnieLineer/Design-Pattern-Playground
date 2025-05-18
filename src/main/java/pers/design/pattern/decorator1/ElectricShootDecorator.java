package pers.design.pattern.decorator1;

public class ElectricShootDecorator extends RockManDecorator {

    public ElectricShootDecorator(RockMan decoratedRockMan) {
        super(decoratedRockMan);
    }

    @Override
    public void shoot() {
        super.shoot();
        System.out.println("... with Electric Shock!");
    }
}