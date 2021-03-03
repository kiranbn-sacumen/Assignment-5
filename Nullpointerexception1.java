public class Nullpointerexception1 {
    public static void main(String[] args) {
        String s= null;
        String a= "KIRAN";
        try{
            if(s.equals(a)) {
                System.out.println("Both are same");
            }
            else{
                    System.out.println("Both are not same");
                }

        }
        catch(Exception e){
            System.out.println("Got rid of null pointer exception");
        }

    }
}
