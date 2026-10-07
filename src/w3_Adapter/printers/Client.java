package w3_Adapter.printers;

//Client
public class Client {
    static void main(String[] args) {
        Printer printer = new PrinterAdapter();
        printer.print("Hello");
    }
}
