import java.util.*;
public class Game {

    int computer;

    public Game() {
        Random r = new Random();
        computer = r.nextInt(100);  // without show on the screen
//        System.out.println(computer);
}

     // return to the constructor value this method is create beacuse constructor does not having the return type;
    public int computerNo()
    {
        return computer;
    }
}

class s
{
    public static void main(String[] args)
    {
        int user ,computer ,iteration=0;
        Game g = new Game();
        do{
            user = takeInput();
            computer = g.computerNo();

            correct(user,computer);
            iteration++;
        }
        while(user!=computer);

        System.out.println("You Guess the number is"+ " " + iteration + " "+ "Iteration");
    }

    static int takeInput()
    {
        int user;
        System.out.println("Please Choose the Number");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }


    static void correct(int i,int j)
    {
        if(i==j){
            System.out.println("Correct choose! WellDone");
        }
        else if(i>j){
            System.out.println("Number is greater:");
        }
        else{
            System.out.println("Number is less:");
        }
    }

}





