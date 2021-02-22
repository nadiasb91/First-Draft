package Helpers;


import org.testng.annotations.DataProvider;

public class DP {

    @DataProvider(name = "signup-provider")
    public Object[][] dataProviderMethod(){
        Object[][] data= new Object[1][6];
        data[0][0] = "Laura"; data[0][1] ="Cabo"; data[0][2]="laura"+Math.random()+"@gmail.com"; data[0][3]="12345678";data[0][4]="Pass123";data[0][5]="Pass123";
        //data[1][0] = "Paula"; data[1][1] ="Marin"; data[1][2]="paula"+Math.random()+"gmail.com"; data[1][3]="12345678";data[1][4]="Pass123";data[1][5]="Pass123";
        //data[2][0] = "Susana"; data[2][1] ="Alba"; data[2][2]="susana"+Math.random()+"@gmail"; data[2][3]="12345678";data[2][4]="Pass123";data[2][5]="Pass123";
        //data[2][0] = " "; data[2][1] ="Alba"; data[2][2]="susana"+Math.random()+"@gmail"; data[2][3]="12345678";data[2][4]="Pass123";data[2][5]="Pass123";
        return data;
    }
}
