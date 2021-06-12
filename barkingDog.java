public class barkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 23);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking && hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay <= 23){
            System.out.println("wake up fool!!!!");
            return true;
        }
        else if (barking && hourOfDay < 0 || hourOfDay > 23){
            System.out.println("Do not wake up!!!!");
            return false;
        }
        else{
            System.out.println("Error");
            return false;
        }
    }
}
