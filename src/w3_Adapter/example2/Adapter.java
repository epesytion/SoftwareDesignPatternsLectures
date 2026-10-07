package w3_Adapter.example2;

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
    }

    public void PrinterAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void print(String text) {
        adaptee.printText(text);
    }
}

