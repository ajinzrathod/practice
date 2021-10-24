import java.util.Scanner;
import java.util.ArrayList;


class MyArrayList{
    public static void main(String[] args){
        String[] students = new String[30];

        for(int i = 0; i < 30; i++){
            students[i] = String.valueOf(i);
        }
        for(int i = 0; i < 30; i++){
            System.out.print(students[i]);
        }
        
        Scanner readName = new Scanner(System.in);
        Scanner readChoice = new Scanner(System.in);

        ArrayList<String> s = new ArrayList<>();

        int choice = 1, count = 0;
        while(choice == 1){
            System.out.print("\nEnter name: ");
            String name = readName.nextLine();
            
            s.add(name);

            System.out.print("Press 1 to continue. 0 to Exit: ");
            choice = readChoice.nextInt();
            
            count++;
        }
        for(int i = 0; i < count; i++){
            System.out.println(s.get(i));
        }

    }
}
