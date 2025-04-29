public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    // The 'name' field from the UML is not used in the output, so omitting it.

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public PdfDocument clone() {
        try {
            // Perform a shallow copy, which is sufficient for this example
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should not happen as we implement Cloneable
            throw new RuntimeException("Cloning not supported for PdfDocument", e);
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }

    // Setters to configure the cloned instance
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}