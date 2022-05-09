
package ass4_code;

import java.util.*;

public class Playground {

private boolean ActivateState =true;
private String name  ;
private String location  ;
private String size  ;
private ArrayList<Integer> availablehours ;
private Float priceperhour  ;
private Float cancellationperiod  ;
//private Float BookedSlots;

    public Playground(){
        this.availablehours=new ArrayList<>();
        
    }
    public Playground (String name ,String location ,String size ,ArrayList<Integer> availablehours ,Float priceperhour,
                       Float cancellationperiod )
{
    this.availablehours=new ArrayList<>();
    this.name=name;
    this.location=location;
    this.size=size;
    this.cancellationperiod=cancellationperiod;
    for(int i=0 ;i<availablehours.size();i++)
    {
        this.availablehours.add(availablehours.get(i));
    }
    this.priceperhour=priceperhour;
    
}

    public boolean isActivateState() {
        return ActivateState;
    }

    public void setActivateState(boolean ActivateState) {
        this.ActivateState = ActivateState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<Integer> getavailablehours() {
        return availablehours;
    }

    public void setavailablehours(ArrayList<Integer> privateavailablehours) {
        this.availablehours = privateavailablehours;
    }

    public Float getPriceperhour() {
        return priceperhour;
    }

    public void setPriceperhour(Float priceperhour) {
        this.priceperhour = priceperhour;
    }

    public Float getCancellationperiod() {
        return cancellationperiod;
    }

    public void setCancellationperiod(Float cancellationperiod) {
        this.cancellationperiod = cancellationperiod;
    }


    
    
}

