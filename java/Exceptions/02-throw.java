class A{
    public static void main(String[] args){
        try{
            System.out.println("Hello Before Throw");
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("Excpetion caught");
        }
        System.out.println("After Catch");
    }
}
