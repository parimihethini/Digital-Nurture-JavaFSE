package Week1;

interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Week1.Document");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Week1.Document");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Week1.Document");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
    }
}