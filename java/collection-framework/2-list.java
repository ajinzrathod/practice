import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


// final -> class : cannot ingerit
// final -> varibake: value cannot change

class A{
    static int showChoices(){
        Scanner choiceReader = new Scanner(System.in);

        System.out.println("Enter Choice");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Show all by iterating");
        System.out.println("4. Modify");
        System.out.println("5. Truncate");
        System.out.println("6. Check num if exists");
        System.out.println("0. Exit");

        int choice = choiceReader.nextInt();
        return choice;
    }

    static int askIndex(String choice){
        System.out.println("Which index you do u want to " + choice);
        Scanner indexScanner = new Scanner(System.in);
        int index = indexScanner.nextInt();
        return index;
    }

    static int askNumber(String task){
        System.out.println("WHich number do u want to " + task);
        Scanner numReader = new Scanner(System.in);
        int num = numReader.nextInt();
        return num;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int choice = 1;
        while(choice != 0){
            choice = showChoices();
            switch(choice){
                case 1:
                    int num = askNumber("add");
                    int addIndex = askIndex("add");

                    list.add(addIndex, num);

                    System.out.println(list);
                    break;

                case 2:
                    int deleteIndex = askIndex("delete");
                    list.remove(deleteIndex);
                    System.out.println(list);
                    break;

                case 3:
                    System.out.println(list);
                    for(Integer element: list){
                        System.out.println(element);
                    }
                    // or
                    for(int i = 0; i < list.size(); i++){
                        System.out.println(list.get(i));
                    }
                    // or
                    Iterator<Integer> it = list.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;

                case 4:
                    int index = askIndex("modify");
                    int modnum = askNumber("modify");
                    list.set(index, modnum);
                    System.out.println(list);
                    break;
                case 5:
                    list.clear();
                    System.out.println(list);
                    break;

                case 6:
                    int checkNum = askNumber("check");
                    System.out.println(list.contains(checkNum));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println(choice);
        }
    }
}
