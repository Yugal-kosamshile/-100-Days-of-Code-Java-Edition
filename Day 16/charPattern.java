public class charPattern {
    public static void main(String[] args) {
        int n=4;
        
        for (int i = 1; i <=n; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
                
            }System.out.println();
            
        }
    }
}
