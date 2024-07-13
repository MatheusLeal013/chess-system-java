package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // Acesso apenas para a classe e subclasses
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    // Método concreto utilizando método abstrato - Template methods - faz um gancho com a subclasse
    // Fornecer uma implementação padrão de um método que depende de um método abstrato
    // Só faz sentido quando existir um classe concreta que implementa essa operação abstrata
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
