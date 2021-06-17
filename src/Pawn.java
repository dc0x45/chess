public class Pawn extends Piece implements Interaction{
    public Pawn(int row, int column, boolean wCheck){
        super(row, column, "Pawn", wCheck);
    }

    @Override
    public boolean checkMovement(int row, int col) {
        if(row > 9 || col > 9) return false;
        int currentRow = this.getRow();
        int currentCol = this.getColumn();

        if(currentRow == row - 1 && currentCol == col){
            if(row == 8){
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean checkTake(int row, int col) {
        int currentRow = this.getRow();
        int currentCol = this.getColumn();
        if(currentRow == row + 1 && Math.abs(currentCol - col) == 1 ){
            return true;
        } else {
            return false;
        }    }
}