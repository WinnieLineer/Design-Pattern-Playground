package pers.design.pattern.decorator1;

public class Main {
    public static void main(String[] args) {
        RockMan basicRockMan = new BasicRockMan();
        basicRockMan.shoot();
        // 輸出: Basic shoot!

        System.out.println();

        RockMan fireRockMan = new FireShootDecorator(basicRockMan);
        fireRockMan.shoot();
        // Basic shoot!
        // ... with Fire Shoot!

        System.out.println();

        RockMan electricFireRockMan = new ElectricShootDecorator(fireRockMan);
        electricFireRockMan.shoot();
        // Basic shoot!
        // ... with Fire Shoot!
        // ... with Electric Shock!
    }
}
