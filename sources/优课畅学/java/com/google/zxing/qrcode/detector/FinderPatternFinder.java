package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private CenterComparator(float f10) {
            this.average = f10;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            int iCompare = Integer.compare(finderPattern2.getCount(), finderPattern.getCount());
            return iCompare == 0 ? Float.compare(Math.abs(finderPattern.getEstimatedModuleSize() - this.average), Math.abs(finderPattern2.getEstimatedModuleSize() - this.average)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private FurthestFromAverageComparator(float f10) {
            this.average = f10;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(Math.abs(finderPattern2.getEstimatedModuleSize() - this.average), Math.abs(finderPattern.getEstimatedModuleSize() - this.average));
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    private static float centerFromEnd(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean crossCheckDiagonal(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.image.get(i11 - i15, i10 - i15)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i15++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.image.get(i11 - i15, i10 - i15)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i15++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.image.get(i11 - i15, i10 - i15)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i15++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= height || (i14 = i11 + i16) >= width || !this.image.get(i14, i17)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= height || (i13 = i11 + i16) >= width || this.image.get(i13, i18)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i16++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= height || (i12 = i11 + i16) >= width || !this.image.get(i12, i19)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i16++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }

    private float crossCheckHorizontal(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i17 = i10;
        while (i17 >= 0 && bitMatrix.get(i17, i11)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bitMatrix.get(i17, i11)) {
            int i18 = crossCheckStateCount[1];
            if (i18 > i12) {
                break;
            }
            crossCheckStateCount[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && crossCheckStateCount[1] <= i12) {
            while (i17 >= 0 && bitMatrix.get(i17, i11) && (i16 = crossCheckStateCount[0]) <= i12) {
                crossCheckStateCount[0] = i16 + 1;
                i17--;
            }
            if (crossCheckStateCount[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < width && bitMatrix.get(i19, i11)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i19++;
            }
            if (i19 == width) {
                return Float.NaN;
            }
            while (i19 < width && !bitMatrix.get(i19, i11) && (i15 = crossCheckStateCount[3]) < i12) {
                crossCheckStateCount[3] = i15 + 1;
                i19++;
            }
            if (i19 != width && crossCheckStateCount[3] < i12) {
                while (i19 < width && bitMatrix.get(i19, i11) && (i14 = crossCheckStateCount[4]) < i12) {
                    crossCheckStateCount[4] = i14 + 1;
                    i19++;
                }
                int i20 = crossCheckStateCount[4];
                if (i20 < i12 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i20) - i13) * 5 < i13 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i19);
                }
            }
        }
        return Float.NaN;
    }

    private float crossCheckVertical(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i17 = i10;
        while (i17 >= 0 && bitMatrix.get(i11, i17)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bitMatrix.get(i11, i17)) {
            int i18 = crossCheckStateCount[1];
            if (i18 > i12) {
                break;
            }
            crossCheckStateCount[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && crossCheckStateCount[1] <= i12) {
            while (i17 >= 0 && bitMatrix.get(i11, i17) && (i16 = crossCheckStateCount[0]) <= i12) {
                crossCheckStateCount[0] = i16 + 1;
                i17--;
            }
            if (crossCheckStateCount[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < height && bitMatrix.get(i11, i19)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i19++;
            }
            if (i19 == height) {
                return Float.NaN;
            }
            while (i19 < height && !bitMatrix.get(i11, i19) && (i15 = crossCheckStateCount[3]) < i12) {
                crossCheckStateCount[3] = i15 + 1;
                i19++;
            }
            if (i19 != height && crossCheckStateCount[3] < i12) {
                while (i19 < height && bitMatrix.get(i11, i19) && (i14 = crossCheckStateCount[4]) < i12) {
                    crossCheckStateCount[4] = i14 + 1;
                    i19++;
                }
                int i20 = crossCheckStateCount[4];
                if (i20 < i12 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i20) - i13) * 5 < i13 * 2 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i19);
                }
            }
        }
        return Float.NaN;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private int[] getCrossCheckStateCount() {
        clearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i10++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f10 = estimatedModuleSize / size;
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().getEstimatedModuleSize() - f10);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    private FinderPattern[] selectBestPatterns() throws NotFoundException {
        int size = this.possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float estimatedModuleSize = 0.0f;
        if (size > 3) {
            Iterator<FinderPattern> it = this.possibleCenters.iterator();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (it.hasNext()) {
                float estimatedModuleSize2 = it.next().getEstimatedModuleSize();
                f10 += estimatedModuleSize2;
                f11 += estimatedModuleSize2 * estimatedModuleSize2;
            }
            float f12 = f10 / size;
            float fSqrt = (float) Math.sqrt((f11 / r0) - (f12 * f12));
            Collections.sort(this.possibleCenters, new FurthestFromAverageComparator(f12));
            float fMax = Math.max(0.2f * f12, fSqrt);
            int i10 = 0;
            while (i10 < this.possibleCenters.size() && this.possibleCenters.size() > 3) {
                if (Math.abs(this.possibleCenters.get(i10).getEstimatedModuleSize() - f12) > fMax) {
                    this.possibleCenters.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        if (this.possibleCenters.size() > 3) {
            Iterator<FinderPattern> it2 = this.possibleCenters.iterator();
            while (it2.hasNext()) {
                estimatedModuleSize += it2.next().getEstimatedModuleSize();
            }
            Collections.sort(this.possibleCenters, new CenterComparator(estimatedModuleSize / this.possibleCenters.size()));
            List<FinderPattern> list = this.possibleCenters;
            list.subList(3, list.size()).clear();
        }
        return new FinderPattern[]{this.possibleCenters.get(0), this.possibleCenters.get(1), this.possibleCenters.get(2)};
    }

    public final void clearCounts(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    public final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z10 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i10 = (height * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zHaveMultiplyConfirmedCenters = false;
        while (i11 < height && !zHaveMultiplyConfirmedCenters) {
            clearCounts(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < width) {
                if (this.image.get(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i11, i12)) {
                    if (this.hasSkipped) {
                        zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                    } else {
                        int iFindRowSkip = findRowSkip();
                        int i14 = iArr[2];
                        if (iFindRowSkip > i14) {
                            i11 += (iFindRowSkip - i14) - 2;
                            i12 = width - 1;
                        }
                    }
                    clearCounts(iArr);
                    i10 = 2;
                    i13 = 0;
                } else {
                    shiftCounts2(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i11, width)) {
                i10 = iArr[0];
                if (this.hasSkipped) {
                    zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                }
            }
            i11 += i10;
        }
        FinderPattern[] finderPatternArrSelectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(finderPatternArrSelectBestPatterns);
        return new FinderPatternInfo(finderPatternArrSelectBestPatterns);
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i10, int i11, boolean z10) {
        return handlePossibleCenter(iArr, i10, i11);
    }

    public final void shiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    public final boolean handlePossibleCenter(int[] iArr, int i10, int i11) {
        int i12 = 0;
        int i13 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iCenterFromEnd = (int) centerFromEnd(iArr, i11);
        float fCrossCheckVertical = crossCheckVertical(i10, iCenterFromEnd, iArr[2], i13);
        if (!Float.isNaN(fCrossCheckVertical)) {
            int i14 = (int) fCrossCheckVertical;
            float fCrossCheckHorizontal = crossCheckHorizontal(iCenterFromEnd, i14, iArr[2], i13);
            if (!Float.isNaN(fCrossCheckHorizontal) && crossCheckDiagonal(i14, (int) fCrossCheckHorizontal)) {
                float f10 = i13 / 7.0f;
                while (true) {
                    if (i12 < this.possibleCenters.size()) {
                        FinderPattern finderPattern = this.possibleCenters.get(i12);
                        if (finderPattern.aboutEquals(f10, fCrossCheckVertical, fCrossCheckHorizontal)) {
                            this.possibleCenters.set(i12, finderPattern.combineEstimate(fCrossCheckVertical, fCrossCheckHorizontal, f10));
                            break;
                        }
                        i12++;
                    } else {
                        FinderPattern finderPattern2 = new FinderPattern(fCrossCheckHorizontal, fCrossCheckVertical, f10);
                        this.possibleCenters.add(finderPattern2);
                        ResultPointCallback resultPointCallback = this.resultPointCallback;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
