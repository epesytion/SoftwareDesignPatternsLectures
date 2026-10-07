package w3_Adapter.printers;

//Adapter
public class PrinterAdapter extends OldPrinter implements Printer {
    @Override
    public void print(String text) {
        printText(text);
    }
}
