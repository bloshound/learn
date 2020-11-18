package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Defensable, Attackable{
    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;
     //   System.out.println(hitCount);

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 7) {
            attackedBodyPart = BodyPart.LEG;
        } else  if(hitCount == 10) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;
     //   System.out.println(hitCount);

        if (hitCount == 3) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 6) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 9) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 12) {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
