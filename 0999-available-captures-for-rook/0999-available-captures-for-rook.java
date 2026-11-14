class Solution {
    public int numRookCaptures(char[][] board) {

        int rookRow = -1, rookColumn = -1;
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(board[i][j] == 'R') {
                    rookRow = i;
                    rookColumn = j;
                }
            }
        }

        int pawnCount = 0;
        for(int i=rookColumn-1; i>=0; i--) {
            if(board[rookRow][i] == 'p') {
                pawnCount++;
                break;
            }
            else if(board[rookRow][i] == 'B') {
                break;
            }
            else {
                continue;
            }
        }

        for(int i=rookColumn+1; i<8; i++) {
            if(board[rookRow][i] == 'p') {
                pawnCount++;
                break;
            }
            else if(board[rookRow][i] == 'B') {
                break;
            }
            else {
                continue;
            }
        }

        for(int j=rookRow-1; j>=0; j--) {
            if(board[j][rookColumn] == 'p') {
                pawnCount++;
                break;
            }
            else if(board[j][rookColumn] == 'B') {
                break;
            }
            else {
                continue;
            }
        }

        for(int j=rookRow+1; j<8; j++) {
            if(board[j][rookColumn] == 'p') {
                pawnCount++;
                break;
            }
            else if(board[j][rookColumn] == 'B') {
                break;
            }
            else {
                continue;
            }
        }
        return pawnCount;
    }
} 