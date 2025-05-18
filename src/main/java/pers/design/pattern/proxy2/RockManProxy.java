package pers.design.pattern.proxy2;

import pers.design.pattern.decorator1.RockMan;

public class RockManProxy implements RockMan {
    private RealRockMan realRockMan;
    private final boolean hasPowerUp;

    public RockManProxy(boolean hasPowerUp) {
        this.hasPowerUp = hasPowerUp;
    }

    public void shoot() {
        if (hasPowerUp) {
            if (realRockMan == null) {
                realRockMan = new RealRockMan();
            }
            realRockMan.shoot();
        } else {
            System.out.println("你沒有 PowerUp，無法射擊！");
        }
    }
}
