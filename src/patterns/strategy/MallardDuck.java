package patterns.strategy;

import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.Quack;

/**
 * Крякающая утка
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm real mallard duck!");
    }
}
