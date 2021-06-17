public class King extends Piece implements Interaction{

    public King(int row, int column, boolean wCheck){
        super(row, column, "King", wCheck);
    }

    @Override
    public boolean checkMovement(int row, int col) {
        if(row > 9 || col > 9) return false;
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        return Math.abs(row - currentRow) <= 1 || Math.abs(col - currentCol) <= 1;
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
