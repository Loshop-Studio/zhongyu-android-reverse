package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1 */
    public static /* synthetic */ class C49491 {

        /* renamed from: $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction */
        static final /* synthetic */ int[] f3439x8739cebf;

        static {
            int[] iArr = new int[Direction.values().length];
            f3439x8739cebf = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3439x8739cebf[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3439x8739cebf[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i6, int i7) {
            this.resultCount = i7;
        }
    }

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i6, double d6) {
            this.cutLocation = i6;
            this.maximum = d6;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i6;
        int i7;
        int i8 = C49491.f3439x8739cebf[direction.ordinal()];
        if (i8 == 1) {
            i6 = (-iArr[getIndex(box.f3444r0, box.f3443g1, box.f3441b1)]) + iArr[getIndex(box.f3444r0, box.f3443g1, box.f3440b0)] + iArr[getIndex(box.f3444r0, box.f3442g0, box.f3441b1)];
            i7 = iArr[getIndex(box.f3444r0, box.f3442g0, box.f3440b0)];
        } else if (i8 == 2) {
            i6 = (-iArr[getIndex(box.f3445r1, box.f3442g0, box.f3441b1)]) + iArr[getIndex(box.f3445r1, box.f3442g0, box.f3440b0)] + iArr[getIndex(box.f3444r0, box.f3442g0, box.f3441b1)];
            i7 = iArr[getIndex(box.f3444r0, box.f3442g0, box.f3440b0)];
        } else {
            if (i8 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i6 = (-iArr[getIndex(box.f3445r1, box.f3443g1, box.f3440b0)]) + iArr[getIndex(box.f3445r1, box.f3442g0, box.f3440b0)] + iArr[getIndex(box.f3444r0, box.f3443g1, box.f3440b0)];
            i7 = iArr[getIndex(box.f3444r0, box.f3442g0, box.f3440b0)];
        }
        return i6 - i7;
    }

    public static int getIndex(int i6, int i7, int i8) {
        return (i6 << 10) + (i6 << 6) + i6 + (i7 << 5) + i7 + i8;
    }

    public static int top(Box box, Direction direction, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9 = C49491.f3439x8739cebf[direction.ordinal()];
        if (i9 == 1) {
            i7 = (iArr[getIndex(i6, box.f3443g1, box.f3441b1)] - iArr[getIndex(i6, box.f3443g1, box.f3440b0)]) - iArr[getIndex(i6, box.f3442g0, box.f3441b1)];
            i8 = iArr[getIndex(i6, box.f3442g0, box.f3440b0)];
        } else if (i9 == 2) {
            i7 = (iArr[getIndex(box.f3445r1, i6, box.f3441b1)] - iArr[getIndex(box.f3445r1, i6, box.f3440b0)]) - iArr[getIndex(box.f3444r0, i6, box.f3441b1)];
            i8 = iArr[getIndex(box.f3444r0, i6, box.f3440b0)];
        } else {
            if (i9 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i7 = (iArr[getIndex(box.f3445r1, box.f3443g1, i6)] - iArr[getIndex(box.f3445r1, box.f3442g0, i6)]) - iArr[getIndex(box.f3444r0, box.f3443g1, i6)];
            i8 = iArr[getIndex(box.f3444r0, box.f3442g0, i6)];
        }
        return i7 + i8;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f3445r1, box.f3443g1, box.f3441b1)] - iArr[getIndex(box.f3445r1, box.f3443g1, box.f3440b0)]) - iArr[getIndex(box.f3445r1, box.f3442g0, box.f3441b1)]) + iArr[getIndex(box.f3445r1, box.f3442g0, box.f3440b0)]) - iArr[getIndex(box.f3444r0, box.f3443g1, box.f3441b1)]) + iArr[getIndex(box.f3444r0, box.f3443g1, box.f3440b0)]) + iArr[getIndex(box.f3444r0, box.f3442g0, box.f3441b1)]) - iArr[getIndex(box.f3444r0, box.f3442g0, box.f3440b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb)));
        }
    }

    public CreateBoxesResult createBoxes(int i6) {
        int i7;
        this.cubes = new Box[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            this.cubes[i8] = new Box(null);
        }
        double[] dArr = new double[i6];
        Box box = this.cubes[0];
        box.f3445r1 = 32;
        box.f3443g1 = 32;
        box.f3441b1 = 32;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            if (i10 >= i6) {
                i7 = i6;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i9], boxArr[i10]).booleanValue()) {
                Box box2 = this.cubes[i9];
                dArr[i9] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i10];
                dArr[i10] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i9] = 0.0d;
                i10--;
            }
            double d6 = dArr[0];
            int i11 = 0;
            for (int i12 = 1; i12 <= i10; i12++) {
                double d7 = dArr[i12];
                if (d7 > d6) {
                    i11 = i12;
                    d6 = d7;
                }
            }
            if (d6 <= 0.0d) {
                i7 = i10 + 1;
                break;
            }
            i10++;
            i9 = i11;
        }
        return new CreateBoxesResult(i6, i7);
    }

    public void createMoments() {
        int i6 = 1;
        while (true) {
            int i7 = 33;
            if (i6 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i8 = 1;
            while (i8 < i7) {
                int i9 = 0;
                int i10 = 0;
                double d6 = 0.0d;
                int i11 = 1;
                int i12 = 0;
                int i13 = 0;
                while (i11 < i7) {
                    int index = getIndex(i6, i8, i11);
                    i9 += this.weights[index];
                    i12 += this.momentsR[index];
                    i13 += this.momentsG[index];
                    i10 += this.momentsB[index];
                    d6 += this.moments[index];
                    iArr[i11] = iArr[i11] + i9;
                    iArr2[i11] = iArr2[i11] + i12;
                    iArr3[i11] = iArr3[i11] + i13;
                    iArr4[i11] = iArr4[i11] + i10;
                    dArr[i11] = dArr[i11] + d6;
                    int index2 = getIndex(i6 - 1, i8, i11);
                    int i14 = i11;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i14];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i14];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i14];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i14];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i14];
                    i11 = i14 + 1;
                    i7 = 33;
                }
                i8++;
                i7 = 33;
            }
            i6++;
        }
    }

    public List<Integer> createResult(int i6) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < i6; i7++) {
            Box box = this.cubes[i7];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f3444r0 + 1, box.f3445r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f3442g0 + 1, box.f3443g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f3440b0 + 1, box.f3441b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d6 = maximizeResultMaximize.maximum;
        double d7 = maximizeResultMaximize2.maximum;
        double d8 = maximizeResultMaximize3.maximum;
        if (d6 < d7 || d6 < d8) {
            if (d7 >= d6 && d7 >= d8) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f3445r1 = box.f3445r1;
        box2.f3443g1 = box.f3443g1;
        box2.f3441b1 = box.f3441b1;
        int i6 = C49491.f3439x8739cebf[direction3.ordinal()];
        if (i6 == 1) {
            int i7 = maximizeResultMaximize.cutLocation;
            box.f3445r1 = i7;
            box2.f3444r0 = i7;
            box2.f3442g0 = box.f3442g0;
            box2.f3440b0 = box.f3440b0;
        } else if (i6 == 2) {
            int i8 = maximizeResultMaximize2.cutLocation;
            box.f3443g1 = i8;
            box2.f3444r0 = box.f3444r0;
            box2.f3442g0 = i8;
            box2.f3440b0 = box.f3440b0;
        } else if (i6 == 3) {
            int i9 = maximizeResultMaximize3.cutLocation;
            box.f3441b1 = i9;
            box2.f3444r0 = box.f3444r0;
            box2.f3442g0 = box.f3442g0;
            box2.f3440b0 = i9;
        }
        box.vol = (box.f3445r1 - box.f3444r0) * (box.f3443g1 - box.f3442g0) * (box.f3441b1 - box.f3440b0);
        box2.vol = (box2.f3445r1 - box2.f3444r0) * (box2.f3443g1 - box2.f3442g0) * (box2.f3441b1 - box2.f3440b0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i6, int i7, int i8, int i9, int i10, int i11) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i12 = -1;
        double d6 = 0.0d;
        int i13 = i6;
        while (i13 < i7) {
            int pVar = top(box2, direction, i13, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i13, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i13, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i13, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d7 = (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3)) / pVar4;
                int i14 = i8 - pVar;
                int i15 = i9 - pVar2;
                int i16 = i10 - pVar3;
                int i17 = i11 - pVar4;
                if (i17 != 0) {
                    double d8 = d7 + ((((i14 * i14) + (i15 * i15)) + (i16 * i16)) / i17);
                    if (d8 > d6) {
                        d6 = d8;
                        i12 = i13;
                    }
                }
            }
            i13++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i12, d6);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i6) {
        constructHistogram(new QuantizerMap().quantize(iArr, i6).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i6).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.f3445r1, box.f3443g1, box.f3441b1)] - this.moments[getIndex(box.f3445r1, box.f3443g1, box.f3440b0)]) - this.moments[getIndex(box.f3445r1, box.f3442g0, box.f3441b1)]) + this.moments[getIndex(box.f3445r1, box.f3442g0, box.f3440b0)]) - this.moments[getIndex(box.f3444r0, box.f3443g1, box.f3441b1)]) + this.moments[getIndex(box.f3444r0, box.f3443g1, box.f3440b0)]) + this.moments[getIndex(box.f3444r0, box.f3442g0, box.f3441b1)]) - this.moments[getIndex(box.f3444r0, box.f3442g0, box.f3440b0)]) - ((((iVolume * iVolume) + (iVolume2 * iVolume2)) + (iVolume3 * iVolume3)) / volume(box, this.weights));
    }

    public static final class Box {

        /* renamed from: b0 */
        int f3440b0;

        /* renamed from: b1 */
        int f3441b1;

        /* renamed from: g0 */
        int f3442g0;

        /* renamed from: g1 */
        int f3443g1;

        /* renamed from: r0 */
        int f3444r0;

        /* renamed from: r1 */
        int f3445r1;
        int vol;

        private Box() {
            this.f3444r0 = 0;
            this.f3445r1 = 0;
            this.f3442g0 = 0;
            this.f3443g1 = 0;
            this.f3440b0 = 0;
            this.f3441b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(C49491 c49491) {
            this();
        }
    }
}
