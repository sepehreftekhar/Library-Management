abstract public class LibraryItem implements ILibraryItem{
    String Title;
    String ItemID;
    boolean CheckedOut;
    String Borrower;

    public LibraryItem(String Title, String ItemID) {
        this.Title = Title;
        this.ItemID = ItemID;
        this.CheckedOut = false;
        this.Borrower = null;
    }

    @Override
    public void CheckOut(String Borrower) {

    }

    @Override
    public void CheckIn() {

    }

    @Override
    public String GetTitle() {
        return null;
    }

    @Override
    public boolean IsCheckedOut() {
        return false;
    }

    abstract void displayItemDetails();
}
