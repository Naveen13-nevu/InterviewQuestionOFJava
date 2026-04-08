import java.util.Scanner;


public class TrainBookingSystem {

    static int [] seats = new int[10];

   public static void ViewSeats(){
    System.out.println("seats status is: ");
    for(int i=0; i<seats.length;i++){
        if(seats[i] == 0){
            System.out.println("seat number "+(i+1)+ " is available");
        }
        else{
            System.out.println("seat number "+(i+1)+ " is not available");
        }
    }
   }

   public static void bookSeats(int seatNumber){
    if(seatNumber <1 || seatNumber>10){
        System.out.println("invalid seat number");
        return;
    }
    if(seats[seatNumber -1] == 0){
        seats[seatNumber -1] = 1;
        System.out.println("seat booked successfully!");
    }
    else{
        System.out.println("seat already booked");
    }


   }

   public static void cancelSeat(int seatNumber){
    if(seats[seatNumber-1] == 1){
        seats[seatNumber-1] = 0;
        System.out.println("seat cancelled successfully");
    }
    else{
        System.out.println("seat already available");
    }
   }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. view seats");
            System.out.println("2. book seats");
            System.out.println("3. cancel seats");
            System.out.println("4.exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ViewSeats();
                    break;
                case 2:
                    System.out.println("Enter the seat number");
                    int seatNumber = sc.nextInt();
                    bookSeats(seatNumber);
                    break;
                
                case 3: 
                System.out.println("Enter the seat you want cancel: ");
                int cancel = sc.nextInt();
                cancelSeat(cancel);
                break;

                case 4:
                    System.exit(0);
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }


    }
}
