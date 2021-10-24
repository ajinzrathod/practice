// Marker Interface
interface Deletable{}

// class Student{
class Student implements Deletable {
    public boolean delete() {
        if(this instanceof Deletable){
            return true;
        }
        return false;
    }
}


class C{
    public static void main(String[] args){
        Student a = new Student();

        // check in main
        if (a instanceof Deletable){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        // check using function
        System.out.println(a.delete());
    }
}
