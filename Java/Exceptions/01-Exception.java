class A{
    public static void main(String[] args){
        int nums[] = new int[4];
        try{
        nums[5] = 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
