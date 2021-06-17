public class Bishop extends Piece implements Interaction{

    public Bishop(int row, int column, boolean wCheck){
        super(row, column, "Bishop", wCheck);
    }

    @Override
    public boolean checkMovement(int row, int col) {
        if(row > 9 || col > 9) return false;
        int currentRow = this.getRow();
        int currentCol = this.getColumn();

        if(Math.abs(currentRow-row) == Math.abs(currentCol - col)){
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
        }    }
}
