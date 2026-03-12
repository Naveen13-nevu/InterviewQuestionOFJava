import java.util.Scanner;

public class TrainBooking {

    static int [] seats = new int[10];

    public static void viewSeats(){
        System.out.println("seat status: ");

        for(int i=0;i<seats.length;i++){
            if(seats[i]==0){
                System.out.println("seats "+(i+1)+" is available");
            }
            else{
                System.out.println("seats "+ (i+1)+" is not available");
            }
        }
    }

    public static void bookSeat(int seatNumber){
        if(seatNumber<1 || seatNumber>10){
            System.out.println("Invalid seat number");
            return;
        }
       if(seats[seatNumber -1]==0){
        seats[seatNumber -1]=1;
        System.out.println("Seat booked successfully ");
       }
       else{
        System.out.println("Seat already booked ");
       }
    }

    public static void cancelSeat(int seatNumber){
        if(seats[seatNumber -1]==1){
            seats[seatNumber -1]=0;
            System.out.println("cancelled succesfully");
        }
        else{
            System.out.println("Seat is already available");
        }
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) { 
            
            System.out.println("1. View Seats");
            System.out.println("2. Book Seats");
            System.out.println("3. Cancel Seats");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    viewSeats();
                    break;

                case 2:
                    System.out.println("Enter the seat number: ");
                    int seat = sc.nextInt();
                    bookSeat(seat);
                    break;

                case 3:
                    System.out.println("Enter the cancel seat number");
                    int cancel = sc.nextInt();
                    cancelSeat(cancel);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid number");
                    break;

            }


        }
    }
    }

