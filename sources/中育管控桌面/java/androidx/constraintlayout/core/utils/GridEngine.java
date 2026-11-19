package androidx.constraintlayout.core.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class GridEngine {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int VERTICAL = 1;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    private int mNextAvailableIndex = 0;
    private int mNumWidgets;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    private String mStrSkips;
    private String mStrSpans;

    public GridEngine() {
    }

    private void addAllConstraintPositions() {
        for (int i6 = 0; i6 < this.mNumWidgets; i6++) {
            if (leftOfWidget(i6) == -1) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    addConstraintPosition(i6, rowByIndex, colByIndex, 1, 1);
                }
            }
        }
    }

    private void addConstraintPosition(int i6, int i7, int i8, int i9, int i10) {
        int[] iArr = this.mConstraintMatrix[i6];
        iArr[0] = i8;
        iArr[1] = i7;
        iArr[2] = (i8 + i10) - 1;
        iArr[3] = (i7 + i9) - 1;
    }

    private void fillConstraintMatrix(boolean z6) {
        int[][] spans;
        int[][] spans2;
        if (z6) {
            for (int i6 = 0; i6 < this.mPositionMatrix.length; i6++) {
                int i7 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i7 < zArr[0].length) {
                        zArr[i6][i7] = true;
                        i7++;
                    }
                }
            }
            for (int i8 = 0; i8 < this.mConstraintMatrix.length; i8++) {
                int i9 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i9 < iArr[0].length) {
                        iArr[i8][i9] = -1;
                        i9++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mStrSkips;
        if (str != null && !str.trim().isEmpty() && (spans2 = parseSpans(this.mStrSkips)) != null) {
            handleSkips(spans2);
        }
        String str2 = this.mStrSpans;
        if (str2 != null && !str2.trim().isEmpty() && (spans = parseSpans(this.mStrSpans)) != null) {
            handleSpans(spans);
        }
        addAllConstraintPositions();
    }

    private int getColByIndex(int i6) {
        return this.mOrientation == 1 ? i6 / this.mRows : i6 % this.mColumns;
    }

    private int getNextPosition() {
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            i6 = this.mNextAvailableIndex;
            if (i6 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i6);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z6 = true;
            }
            this.mNextAvailableIndex++;
        }
        return i6;
    }

    private int getRowByIndex(int i6) {
        return this.mOrientation == 1 ? i6 % this.mRows : i6 / this.mColumns;
    }

    private void handleSkips(int[][] iArr) {
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int rowByIndex = getRowByIndex(iArr[i6][0]);
            int colByIndex = getColByIndex(iArr[i6][0]);
            int[] iArr2 = iArr[i6];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int rowByIndex = getRowByIndex(iArr[i6][0]);
            int colByIndex = getColByIndex(iArr[i6][0]);
            int[] iArr2 = iArr[i6];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
            int[] iArr3 = iArr[i6];
            addConstraintPosition(i6, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
        }
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i6 = this.mNumWidgets;
        if (i6 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i6, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean invalidatePositions(int i6, int i7, int i8, int i9) {
        for (int i10 = i6; i10 < i6 + i8; i10++) {
            for (int i11 = i7; i11 < i7 + i9; i11++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i10 < zArr.length && i11 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i10];
                    if (zArr2[i11]) {
                        zArr2[i11] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansValid(CharSequence charSequence) {
        return charSequence != null;
    }

    private int[][] parseSpans(String str) {
        if (!isSpansValid(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String[] strArrSplit2 = strArrSplit[i6].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i6][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i6][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i6][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    private void updateActualRowsAndColumns() {
        int i6;
        int i7 = this.mRowsSet;
        if (i7 != 0 && (i6 = this.mColumnsSet) != 0) {
            this.mRows = i7;
            this.mColumns = i6;
            return;
        }
        int i8 = this.mColumnsSet;
        if (i8 > 0) {
            this.mColumns = i8;
            this.mRows = ((this.mNumWidgets + i8) - 1) / i8;
        } else if (i7 > 0) {
            this.mRows = i7;
            this.mColumns = ((this.mNumWidgets + i7) - 1) / i7;
        } else {
            int iSqrt = (int) (Math.sqrt(this.mNumWidgets) + 1.5d);
            this.mRows = iSqrt;
            this.mColumns = ((this.mNumWidgets + iSqrt) - 1) / iSqrt;
        }
    }

    public int bottomOfWidget(int i6) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i6 >= iArr.length) {
            return 0;
        }
        return iArr[i6][3];
    }

    public int leftOfWidget(int i6) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i6 >= iArr.length) {
            return 0;
        }
        return iArr[i6][0];
    }

    public int rightOfWidget(int i6) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i6 >= iArr.length) {
            return 0;
        }
        return iArr[i6][2];
    }

    public void setColumns(int i6) {
        if (i6 <= 50 && this.mColumnsSet != i6) {
            this.mColumnsSet = i6;
            updateActualRowsAndColumns();
        }
    }

    public void setNumWidgets(int i6) {
        if (i6 > this.mRows * this.mColumns) {
            return;
        }
        this.mNumWidgets = i6;
    }

    public void setOrientation(int i6) {
        if ((i6 == 0 || i6 == 1) && this.mOrientation != i6) {
            this.mOrientation = i6;
        }
    }

    public void setRows(int i6) {
        if (i6 <= 50 && this.mRowsSet != i6) {
            this.mRowsSet = i6;
            updateActualRowsAndColumns();
        }
    }

    public void setSkips(String str) {
        String str2 = this.mStrSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mStrSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.mStrSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mStrSpans = charSequence.toString();
        }
    }

    public void setup() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z6 = false;
        if (iArr != null && iArr.length == this.mNumWidgets && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z6 = true;
        }
        if (!z6) {
            initVariables();
        }
        fillConstraintMatrix(z6);
    }

    public int topOfWidget(int i6) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i6 >= iArr.length) {
            return 0;
        }
        return iArr[i6][1];
    }

    public GridEngine(int i6, int i7) {
        this.mRowsSet = i6;
        this.mColumnsSet = i7;
        if (i6 > 50) {
            this.mRowsSet = 3;
        }
        if (i7 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initVariables();
    }

    public GridEngine(int i6, int i7, int i8) {
        this.mRowsSet = i6;
        this.mColumnsSet = i7;
        this.mNumWidgets = i8;
        if (i6 > 50) {
            this.mRowsSet = 3;
        }
        if (i7 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        int i9 = this.mRows;
        int i10 = this.mColumns;
        if (i8 > i9 * i10 || i8 < 1) {
            this.mNumWidgets = i9 * i10;
        }
        initVariables();
        fillConstraintMatrix(false);
    }
}
