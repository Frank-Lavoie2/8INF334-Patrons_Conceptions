import decorateur.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Malbouffe> malbouffes = new ArrayList<>();

        McDo mcDo = new McDo();
        HotDog hotDog = new HotDog();
        Poutine poutine = new Poutine();

        malbouffes.add(poutine);
        malbouffes.add(hotDog);
        malbouffes.add(mcDo);

        malbouffes.add(new Sauce(poutine));
        malbouffes.add(new Sauce(mcDo));
        malbouffes.add(new Ketchup(hotDog));
        malbouffes.add(new Ketchup(mcDo));

        for(Malbouffe malbouffe:malbouffes)
            System.out.println(malbouffe.getDescription());
    }
}