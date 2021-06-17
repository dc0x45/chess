public class Piece {
    private int row;
    private int column;
    private String name;
    private String color;

    public Piece(int row, int column, String name, boolean wCheck) {
        this.row = row; this.column = column; this.name = name;
        if (wCheck) {
            this.color = "White";
        } else {
            this.color = "Black";
        }
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }



}
