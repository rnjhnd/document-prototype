public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        // Initialize the prototype instances
        this.pdfPrototype = new PdfDocument();
        this.textDocumentPrototype = new TextDocument();
        this.spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdfDocument() {
        return pdfPrototype.clone();
    }

    public TextDocument createTextDocument() {
        return textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheetDocument() {
        return spreadsheetPrototype.clone();
    }

    // Ignoring createSheep, createCow, createHorse as they are not related to the document context and output.
}