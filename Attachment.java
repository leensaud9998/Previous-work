public class Attachment
{
    private final String filename;
    private final double size;
    public static final double ATTACHMENT_MAX_SIZE = 10.0; // 10 Megabyte
    
    public Attachment(String filename, double size){
        this.filename = filename;
        this.size = size; // the size must be less than or equal to ATTACHMENT_MAX_SIZE
    }
    
    public String getFilename(){
        return filename;
    }
    
    public double getSize(){
        return size;
    }
}
