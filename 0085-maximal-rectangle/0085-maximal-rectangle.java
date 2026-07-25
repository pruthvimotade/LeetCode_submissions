class Solution {
    public int maximalRectangle(char[][] matrix) {
         if (matrix.length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            for (int j = 0; j < cols; j++) {

                int minHeight = heights[j];

                for (int k = j; k < cols; k++) {

                    minHeight = Math.min(minHeight, heights[k]);

                    int width = k - j + 1;

                    int area = minHeight * width;

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}