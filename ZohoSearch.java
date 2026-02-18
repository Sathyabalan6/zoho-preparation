public class ZohoSearch {
    public static void main(String[] args) {
        String str = "WELCOMETOZOHOCORPORATION";
        char[][] grid = new char[5][5];
        String target = "TOO";
        
        // Fill the grid
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (k < str.length()) grid[i][j] = str.charAt(k++);
            }
        }

        int len = target.length();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Vertical Search (Top to Bottom)
                if (i + len <= 5) {
                    String sub = "" + grid[i][j] + grid[i+1][j] + grid[i+2][j];
                    if (sub.equalsIgnoreCase(target)) {
                        System.out.println("Start index : <" + i + "," + j + "> End index: <" + (i + 2) + "," + j + ">");
                    }
                }
                // Horizontal Search (Left to Right)
                if (j + len <= 5) {
                    String sub = "" + grid[i][j] + grid[i][j+1] + grid[i][j+2];
                    if (sub.equalsIgnoreCase(target)) {
                        System.out.println("Start index : <" + i + "," + j + "> End index: <" + i + "," + (j + 2) + ">");
                    }
                }
            }
        }
    }
}