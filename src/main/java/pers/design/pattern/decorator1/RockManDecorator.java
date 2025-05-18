package pers.design.pattern.decorator1;

public abstract class RockManDecorator implements RockMan {
    protected RockMan decoratedRockMan;

    public RockManDecorator(RockMan decoratedRockMan) {
        this.decoratedRockMan = decoratedRockMan;
    }

    @Override
    public void shoot() {
        decoratedRockMan.shoot();
    }
}