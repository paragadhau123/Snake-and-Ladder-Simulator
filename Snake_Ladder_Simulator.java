import java.util.Random;

 class Snake_Ladder_Simulator{

	public static final int startPosn = 0;
	public static final int endPosn = 100;
        private static int newPosition = startPosn;
        private static int option = 0;
        private static int diceNumber = 0;

        public static int throwDice(){
            Random r=new Random();
            int random = r.nextInt(6)+1;
          //int r1 = 1 + (random % 6);
            return random;
         }

        public static int optionCheck(){
            Random r1 = new Random();
            int random1 =r1.nextInt(3)+1;
            return random1;
          }

 	public static void main(String[] args) {

                diceNumber=throwDice();
                option=optionCheck();

                if (option == 2){
		  newPosition = newPosition+diceNumber;
                 }
		else if (option == 3){
		  newPosition = newPosition-diceNumber;
                 }
                else if (option == 0){
                  newPosition=newPosition;
                 }

                System.out.println("Starting Position : "+ startPosn);
		System.out.println("Ending Position : "+ endPosn);
                System.out.println("New Position : "+ newPosition);
	}
   }
