public class Knight extends Piece implements Interaction{

    public Knight(int row, int column, boolean wCheck){
        super(row, column, "Knight", wCheck);
    }

    @Override
    public boolean checkMovement(int row, int col) {
        if(row > 9 || col > 9) return false;
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        if((Math.abs(row - currentRow) == 2 && Math.abs(col - currentCol) == 1) ||
                (Math.abs(row - currentRow) == 1 && Math.abs(col - currentCol) == 2)){
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
