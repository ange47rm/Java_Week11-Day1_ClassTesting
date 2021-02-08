public class Printer {

    private int sheets;
    private int toner;

    public Printer (int sheets, int toner){

        this.sheets = sheets;
        this.toner = toner;
    }

    public int print(int pages, int copies){
        if (this.sheets > (pages * copies)) {
        return this.sheets - (pages * copies);
    } else {
//            return null;
        }
    }

}
