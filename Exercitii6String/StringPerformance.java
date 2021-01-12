public class StringPerformance {  
    public static void main(String[] args) {  
        
        long startTime = System.currentTimeMillis();     
        for (int i = 0; i < 100000; i++) {  
            String str1 = "Lorem";  
            String str2= "Lorem";  
        }  
        long endTime = System.currentTimeMillis();  
        System.out.println("Time taken to create literal String : " + (endTime - startTime) + " ms"); 
        
        long startTime1 = System.currentTimeMillis();     
        for (int i = 0; i < 100000; i++) {  
            String str1 = new String("Lorem");  
            String str2 = new String("Lorem");  
        }  
        long endTime1 = System.currentTimeMillis();  
        
        System.out.println("Time taken to create Object String : " + (endTime1 - startTime1) + " ms");  
    }  
} 