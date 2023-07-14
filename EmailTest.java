public class EmailTest
{
    public static void main(String[] args) {
        Email email1 = null;
        
        try {
            try {
                email1 = new Email("a@a.com", "b@b.com", "Hello");
                email1.attach(null);
            } catch(IllegalArgumentException e) {
                e.printStackTrace();
                for (;;) email1.attach(new Attachment("file1.pdf", 0.21));
            }
        } catch (EmailAttachmentException e) {
             e.printStackTrace();
        } finally {
            email1 = new Email("a@a.com", "b@b.com", "Hello");
        }
        
        try {
           for (;;) email1.attach(new Attachment("file2.docx", 2.45));
        } catch(IllegalArgumentException e) {
            e.printStackTrace();
        }
        catch (EmailAttachmentException e) {
            e.printStackTrace();
        }
    }
}
