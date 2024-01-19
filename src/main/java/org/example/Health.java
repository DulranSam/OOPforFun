package org.example;

public class Health implements Creative{
    protected int whiteHealth;
    protected int shieldHealth;

    public Health(){
        whiteHealth=100;
        shieldHealth=0;
    }

    public int totalHealth(){
        return whiteHealth+shieldHealth;
    }

    public int getWhiteHealth(){
        return whiteHealth;
    }

    public int getShieldHealth(){
        return shieldHealth;
    }

    public void miniShield(){
      if(shieldHealth<100){
          shieldHealth+=25;
          System.out.println("You popped a mini!");
      }else{
          System.out.println("Full Shield!");
      }

    }

    public void bigShield(){
        if(shieldHealth<100){
            shieldHealth+=50;
        }
    }

    public void medKit(){
        if(whiteHealth<100){
            whiteHealth=100;
        }
    }

    public void chugJug(){
        if(totalHealth()<200){
            whiteHealth =100;
            shieldHealth = 100;
        }
    }


    public String toString(){
        return "White Health -> "+whiteHealth+"\nShield Health -> "+shieldHealth;
    }


    @Override
    public void maxHealth(int userWhiteHealth, int userShieldHealth) {
        whiteHealth = userWhiteHealth;
        shieldHealth = userShieldHealth;
    }
}
