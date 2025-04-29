public class ProcessedDocument {

    public static void main(String[] args) {
        // Create the registry, which initializes the prototypes
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println(); // Add a blank line for separation as in the desired output

        // Create and open the first PDF document by cloning the prototype
        PdfDocument pdf1 = registry.createPdfDocument();
        pdf1.setFileName("annual_report_2024.pdf");
        pdf1.setAuthor("Acme Corp");
        pdf1.setPageCount(150);
        pdf1.open();

        System.out.println(); // Add a blank line for separation

        // Create and open the Text document by cloning the prototype
        TextDocument text1 = registry.createTextDocument();
        text1.setFilePath("meeting_notes.txt");
        text1.setEncoding("UTF-8");
        text1.setWordCount(250);
        text1.open();

        System.out.println(); // Add a blank line for separation

        // Create and open the Spreadsheet document by cloning the prototype
        SpreadsheetDocument spreadsheet1 = registry.createSpreadsheetDocument();
        spreadsheet1.setSpreadsheetName("sales_data_q1.xlsx");
        spreadsheet1.setRowCount(1000);
        spreadsheet1.setColumnCount(20);
        spreadsheet1.open();

        System.out.println(); // Add a blank line for separation

        // Create and open the second PDF document by cloning the prototype
        PdfDocument pdf2 = registry.createPdfDocument();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setAuthor("Acme Corp"); // Assuming the author is the same for the second PDF
        pdf2.setPageCount(30);
        pdf2.open();
    }
}