package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {


    private Animal animal1;
    private Animal animal2;
    private Timer timer;


    public AnimalsCage(@Qualifier("dog") Animal animal1,
                       @Qualifier("cat") Animal animal2,Timer timer)  {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.timer= timer;

    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString()+" "+animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return  null;
    }
}
