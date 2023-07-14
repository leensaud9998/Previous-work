public class Email
{
    private final String sender;
    private final String receiver;
    private final String subject;
    private double attachmentSize;
    private int attachmentNumber;
    
    private Attachment[] attachments;
    
    public static final double EMAIL_MAX_SIZE = 25.0; // 25 Megabyte
    public static final int EMAIL_MAX_FILES = 50;
    
    public Email(String sender, String receiver, String subject) {
        this.sender = sender; // the sender mustn't be null or empty string
        this.receiver = receiver; // the receiver mustn't be null or empty string
        this.subject = subject; // the subject mustn't be null or empty string
    }
    
    public void attach(Attachment attachment) {
        // attchmentNumber must be less than or equal to EMAIL_MAX_FILES
        // attachment mustn't be null
        // attachment.getSize() + attachmentSize must be less than or equal to EMAIL_MAX_SIZE
        
            attachments[attachmentNumber] = attachment;
            attachmentNumber++;
            attachmentSize += attachment.getSize();
    }    
}
