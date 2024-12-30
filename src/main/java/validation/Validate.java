
package validation;

import java.util.LinkedList;
import java.util.List;

public class Validate{
    private final List<Integer> yRange = new LinkedList<>();
    private final List<Integer> rRange = new LinkedList<>();
    private String log = "all ok";
    public Validate(){
        yRange.add(-4);
        yRange.add(-3);
        yRange.add(-2);
        yRange.add(-1);
        yRange.add(0);
        yRange.add(1);
        yRange.add(2);
        yRange.add(3);
        yRange.add(4);

        rRange.add(1);
        rRange.add(2);
        rRange.add(3);
        rRange.add(4);
        rRange.add(5);
    }
    public boolean check(Float x, Integer y, Integer r){
        return checkX(x) && checkY(y) && checkR(r);
    }

    public String getErr(){
        return log;
    }

    public boolean checkX(Float x){
        if (-5 <= x && x <= 3){
            return true;
        }
        log = "X value must be -5<=x<=3";
        return false;
    }


    public boolean checkY(int y){
        if (yRange.contains(y)){
            return true;
        }
        log = "Y must be selected";
        return false;
    }

    public boolean checkR(int r){
        if (rRange.contains(r)){
            return true;
        }
        log = "R must be selected";
        return false;
    }
}
