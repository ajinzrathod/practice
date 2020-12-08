class ClassName{
    public static void funcName(int what)
    {
        int divide;
        int nums[] = new int[2];
        try{
            switch(what){
                case 0:
                    divide = 10 / 0;
                    break;
                case 1:
                    nums[3] = 10;
                    break;
                case 2:
                    // If you return from here, finally will be printed
                    return;
                default:
                    return;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Zero Division Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out Of Bound");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Done");
    }
}

class A{
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            ClassName.funcName(i);
            System.out.println();
        }
    }
}
