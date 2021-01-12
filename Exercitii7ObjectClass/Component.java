import java.io.*;

public class Component{
    protected static ExceptionHandler exceptionHandler = null;

    public void setExceptionHandler(ExceptionHandler handler){
        this.exceptionHandler = handler;       
        
    }

    public void processFile(String fileName){
        FileInputStream input = null;
        try{
            input = new FileInputStream(fileName);
            processStream(input);
        } catch (IOException e){
            this.exceptionHandler.handle(e,
                "error processing file: " + fileName);
        }
    }

    protected void processStream(InputStream input)
        throws IOException{
        //do something with the stream.
    }
    
    public static void main(String[] args){
        
        
        new Component().setExceptionHandler(exceptionHandler);
    }
}