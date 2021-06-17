public class Rook extends Piece implements Interaction{

    public Rook(int row, int column, boolean wCheck){
        super(row, column, "Rook", wCheck);
    }

    @Override
    public boolean checkMovement(int row, int col) {
        if(row > 9 || col > 9) return false;
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        if(currentRow == row || currentCol == col){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkTake(int row, int col) {
        if(checkMovement(row, col)){
            return true;
        } else {
            return false;
        }
    }
}