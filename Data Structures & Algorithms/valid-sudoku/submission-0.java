class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 1. Correct Data Types: Set<Character>
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> cols = new HashMap<>();
        HashMap<Integer, Set<Character>> squares = new HashMap<>();

        // 2. Initialize the HashMaps to prevent NullPointerExceptions
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            squares.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                
                // 3. Convert 2D square coordinates to a 1D integer key
                int squareKey = (i / 3) * 3 + (j / 3);
                
                char val = board[i][j];

                // 4. Use .contains() for Sets
                if (rows.get(i).contains(val) ||
                    cols.get(j).contains(val) ||
                    squares.get(squareKey).contains(val)) {
                        return false;
                }
                
                // 5. Use .add() for Sets
                rows.get(i).add(val);
                cols.get(j).add(val);
                squares.get(squareKey).add(val);
            }
        }
        return true;
    }
}