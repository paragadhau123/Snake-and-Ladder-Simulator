import java.util.Random;

  class Snake_Ladder_Simulator{

        static final int startPosn = 0;
        static final int endPosn = 100;
        static int newPosition = startPosn;
        static int option = 0;
        static int diceNumber = 0;
        static int numberOfTimesDiceRoll = 0;
        static int playerOne=0;
        static int playerTwo=0;
        static int switchPlayer=0;
    //writing method for getting dice number//
        public static int throwDice(){
             numberOfTimesDiceRoll = numberOfTimesDiceRoll+1;//for counting number of times dice roll//
             Random r=new Random();
             int random = r.nextInt(6)+1;
             //int r1 = 1 + (random % 6);
             return random;
           }
    //writing method for getting option for no-play,ladder and snake//
        public static int optionCheck(){
             Random r1 = new Random();
             int random1 =r1.nextInt(3)+1;
             return random1;
           }

        public static void play(){

                 if( switchPlayer % 2 == 0 ){

                 System.out.println("For Player 1 ");
                 newPosition=playerOne;
                 diceNumber=throwDice();
                 System.out.println("Dice number is==>"+diceNumber);
                 option=optionCheck();

                 if (option == 2){//for ladder//

                    System.out.println("Option is for Ladder");
                    newPosition = newPosition+diceNumber;

                    if(newPosition>100){      //if current position becomes grater than 100//

                       newPosition = newPosition-diceNumber;
                       System.out.println("New position is going above 100 so it will be on same position");

                     }

                   }

                else if (option == 3){//for snake//

                   System.out.println("Option is for Snake");
                   newPosition = newPosition-diceNumber;

                   if(newPosition<0){//if current position become less than 0//

                       newPosition=0;
                       System.out.println("New position is going below 0 so it will again start from 0");

                     }

                   }

                else if (option == 1){//for no-play//

                   System.out.println("Option is No-Play");
                   newPosition=newPosition;
                 }

                playerOne = newPosition;
                System.out.println("Position of player one is==>"+playerOne);

               }

            else{

                  System.out.println("For Player 2 ");
                  newPosition = playerTwo;
                  diceNumber = throwDice();
                  System.out.println("Dice number is ==>"+diceNumber);
                  option = optionCheck();

                  if ( option == 2 ){//for ladder//

                      System.out.println("Option is for Ladder");
                      newPosition = newPosition+diceNumber;

                      if( newPosition > 100 ){      //if current position becomes grater than 100//

                         newPosition = newPosition - diceNumber;
                         System.out.println("New position is going above 100 so it will be on same position");

                       }

                      }

                else if ( option == 3 ){//for snake//

                     System.out.println("Option is for Snake");
                     newPosition = newPosition-diceNumber;

                     if( newPosition < 0 ){//if current position become less than 0//

                         newPosition = 0;
                         System.out.println("New position is going below 0 so it will again start from 0");

                       }

                     }

                else if (option == 1){//for no-play//

                     System.out.println("Option is No-Play");
                     newPosition = newPosition;

                    }

                     playerTwo = newPosition;
                    System.out.println("Position of player two is ==>"+playerTwo);

                 }

              }

          public static void whoWins(){

                 while( newPosition < endPosn ){
                 play();
                 System.out.println("--------------------------------------");

                 if( playerOne == endPosn ){

                    System.out.println("Player one win the game as 100th position is reached");

                  }

                 else if ( playerTwo == endPosn){

                    System.out.println("Player two win the game as 100th position is reached");

                  }

                  switchPlayer = switchPlayer + 1;
               }
            }


           public static void main(String[] args) {

                System.out.println("Starting Position : "+ startPosn);

                System.out.println("Ending Position : "+ endPosn);

                whoWins();

                System.out.println("*******Number of times dice roll to win the game =>"+numberOfTimesDiceRoll+"**********");
              }
           }


