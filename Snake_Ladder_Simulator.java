import java.util.Random;

 class Snake_Ladder_Simulator{

	public static final int START_POSITION = 0;
	public static final int END_POSITION = 100;

        private static int newPosition = 0;

        public static int throwDice(){
            Random r=new Random();
            int random = r.nextInt(6)+1;
//            int r1 = 1 + (random % 6);
            return random;
         }
	public static void main(String[] args) {
		System.out.println("Starting Position : "+ START_POSITION);
		System.out.println("Ending Position : "+ END_POSITION);
                newPosition = newPosition+throwDice();
                System.out.println("New Position : "+ newPosition);
	}
   }
