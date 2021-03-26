import java.util.*;

public class AlgorithmsDataStructures2 {
    private static int[] arrayOriginal;
    private static int[] arrayResult;

    public static int[] GenerateBBSTArray(int[] a) {
        arrayOriginal = a;
        Arrays.sort(arrayOriginal);
        int arrLength = arrayOriginal.length;
        arrayResult = new int[arrLength];
        recursiveBST(0, arrLength - 1, 0);
        return arrayResult;
    }

    private static void recursiveBST(int indexBeginOriginal, int indexEndOriginal, int indexBST) {
        int indexCentralElement = indexBeginOriginal + (indexEndOriginal - indexBeginOriginal) / 2;

        if (indexBST >= arrayOriginal.length) {
            return;
        }
        recursiveBST(indexBeginOriginal, indexCentralElement - 1, 2 * indexBST + 1);
        arrayResult[indexBST] = arrayOriginal[indexCentralElement];
        recursiveBST(indexCentralElement + 1, indexEndOriginal, 2 * indexBST + 2);
    }
}
