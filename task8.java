public class task8 {
    private static int[][] arrForWork;

    private static int getRndValue(int lowLim, int hightLim) {
        long lengRet;
        do {
            lengRet = Math.round(Math.random() * hightLim);
        }
        while (lengRet < lowLim);
        return (int) lengRet;
    }


    private static void fillArrOnlyPositivRndValue(int[][] arrTarget, int minVal, int maxVal) {
        for (int i = 0; i < arrTarget.length; i++) {
            for (int j = 0; j < arrTarget[0].length; j++) {
                arrTarget[i][j] = getRndValue(minVal, maxVal);
            }
        }
    }

    private static void addInArrNegativRndValue(int[][] arrTarget) {
        int rowRnd, colRnd;
        for (int k = 0; k < arrTarget.length * arrTarget[0].length / 2; k++) {
            rowRnd = (int) Math.round(Math.random() * (arrTarget.length - 1));
            colRnd = (int) Math.round(Math.random() * (arrTarget[0].length - 1));
            arrTarget[rowRnd][colRnd] = -1 * arrTarget[rowRnd][colRnd];
        }
    }

    private static void printValueArr(int[][] arrTarget) {
        for (int[] row : arrTarget) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }

    private static void replaceMaxValue(int[][] arrTarget) {
        int tmpValue = Integer.MIN_VALUE;
        int[] indexMaxVal = {-1, -1};
        for (int i = 0; i < arrTarget.length; i++) {
            for (int j = 0; j < arrTarget[0].length; j++) {
                if (arrTarget[i][j] > tmpValue) {
                    tmpValue = arrTarget[i][j];
                    indexMaxVal[0] = i;
                    indexMaxVal[1] = j;
                }
            }
        }
        if (indexMaxVal[0] != -1)
            arrTarget[indexMaxVal[0]][indexMaxVal[1]] = 0;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        arrForWork = new int[row][col];
        int minLimVal = 0, maxLimVal = 9;
        fillArrOnlyPositivRndValue(arrForWork, minLimVal, maxLimVal);
        addInArrNegativRndValue(arrForWork);
        System.out.println("First array:");
        printValueArr(arrForWork);
        replaceMaxValue(arrForWork);
        System.out.println("Second array:");
        printValueArr(arrForWork);
    }
}

