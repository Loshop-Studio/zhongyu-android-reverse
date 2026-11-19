package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.AbstractC1923c;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
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
    public static /* synthetic */ class C35341 {

        /* renamed from: $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction */
        static final /* synthetic */ int[] f2856x8739cebf;

        static {
            int[] iArr = new int[Direction.values().length];
            f2856x8739cebf = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2856x8739cebf[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2856x8739cebf[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i, int i8) {
            this.resultCount = i8;
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

        public MaximizeResult(int i, double d9) {
            this.cutLocation = i;
            this.maximum = d9;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i8;
        int i9 = C35341.f2856x8739cebf[direction.ordinal()];
        if (i9 == 1) {
            i = (-iArr[getIndex(box.f2861r0, box.f2860g1, box.f2858b1)]) + iArr[getIndex(box.f2861r0, box.f2860g1, box.f2857b0)] + iArr[getIndex(box.f2861r0, box.f2859g0, box.f2858b1)];
            i8 = iArr[getIndex(box.f2861r0, box.f2859g0, box.f2857b0)];
        } else if (i9 == 2) {
            i = (-iArr[getIndex(box.f2862r1, box.f2859g0, box.f2858b1)]) + iArr[getIndex(box.f2862r1, box.f2859g0, box.f2857b0)] + iArr[getIndex(box.f2861r0, box.f2859g0, box.f2858b1)];
            i8 = iArr[getIndex(box.f2861r0, box.f2859g0, box.f2857b0)];
        } else {
            if (i9 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i = (-iArr[getIndex(box.f2862r1, box.f2860g1, box.f2857b0)]) + iArr[getIndex(box.f2862r1, box.f2859g0, box.f2857b0)] + iArr[getIndex(box.f2861r0, box.f2860g1, box.f2857b0)];
            i8 = iArr[getIndex(box.f2861r0, box.f2859g0, box.f2857b0)];
        }
        return i - i8;
    }

    public static int getIndex(int i, int i8, int i9) {
        return (i << 10) + (i << 6) + i + (i8 << 5) + i8 + i9;
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i8;
        int i9;
        int i10 = C35341.f2856x8739cebf[direction.ordinal()];
        if (i10 == 1) {
            i8 = (iArr[getIndex(i, box.f2860g1, box.f2858b1)] - iArr[getIndex(i, box.f2860g1, box.f2857b0)]) - iArr[getIndex(i, box.f2859g0, box.f2858b1)];
            i9 = iArr[getIndex(i, box.f2859g0, box.f2857b0)];
        } else if (i10 == 2) {
            i8 = (iArr[getIndex(box.f2862r1, i, box.f2858b1)] - iArr[getIndex(box.f2862r1, i, box.f2857b0)]) - iArr[getIndex(box.f2861r0, i, box.f2858b1)];
            i9 = iArr[getIndex(box.f2861r0, i, box.f2857b0)];
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i8 = (iArr[getIndex(box.f2862r1, box.f2860g1, i)] - iArr[getIndex(box.f2862r1, box.f2859g0, i)]) - iArr[getIndex(box.f2861r0, box.f2860g1, i)];
            i9 = iArr[getIndex(box.f2861r0, box.f2859g0, i)];
        }
        return i8 + i9;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f2862r1, box.f2860g1, box.f2858b1)] - iArr[getIndex(box.f2862r1, box.f2860g1, box.f2857b0)]) - iArr[getIndex(box.f2862r1, box.f2859g0, box.f2858b1)]) + iArr[getIndex(box.f2862r1, box.f2859g0, box.f2857b0)]) - iArr[getIndex(box.f2861r0, box.f2860g1, box.f2858b1)]) + iArr[getIndex(box.f2861r0, box.f2860g1, box.f2857b0)]) + iArr[getIndex(box.f2861r0, box.f2859g0, box.f2858b1)]) - iArr[getIndex(box.f2861r0, box.f2859g0, box.f2857b0)];
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
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + AbstractC1923c.m1038b(iBlueFromArgb, iBlueFromArgb, (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb), iIntValue2);
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i8;
        this.cubes = new Box[i];
        for (int i9 = 0; i9 < i; i9++) {
            this.cubes[i9] = new Box(null);
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f2862r1 = 32;
        box.f2860g1 = 32;
        box.f2858b1 = 32;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            if (i11 >= i) {
                i8 = i;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i10], boxArr[i11]).booleanValue()) {
                Box box2 = this.cubes[i10];
                dArr[i10] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i11];
                dArr[i11] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i10] = 0.0d;
                i11--;
            }
            double d9 = dArr[0];
            int i12 = 0;
            for (int i13 = 1; i13 <= i11; i13++) {
                double d10 = dArr[i13];
                if (d10 > d9) {
                    i12 = i13;
                    d9 = d10;
                }
            }
            if (d9 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                i8 = i11 + 1;
                break;
            }
            i11++;
            i10 = i12;
        }
        return new CreateBoxesResult(i, i8);
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i8 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i9 = 1;
            while (i9 < i8) {
                int i10 = 0;
                int i11 = 0;
                double d9 = 0.0d;
                int i12 = 1;
                int i13 = 0;
                int i14 = 0;
                while (i12 < i8) {
                    int index = getIndex(i, i9, i12);
                    i10 += this.weights[index];
                    i13 += this.momentsR[index];
                    i14 += this.momentsG[index];
                    i11 += this.momentsB[index];
                    d9 += this.moments[index];
                    iArr[i12] = iArr[i12] + i10;
                    iArr2[i12] = iArr2[i12] + i13;
                    iArr3[i12] = iArr3[i12] + i14;
                    iArr4[i12] = iArr4[i12] + i11;
                    dArr[i12] = dArr[i12] + d9;
                    int index2 = getIndex(i - 1, i9, i12);
                    int i15 = i12;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i15];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i15];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i15];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i15];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i15];
                    i12 = i15 + 1;
                    i8 = 33;
                }
                i9++;
                i8 = 33;
            }
            i++;
        }
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < i; i8++) {
            Box box = this.cubes[i8];
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
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f2861r0 + 1, box.f2862r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f2859g0 + 1, box.f2860g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f2857b0 + 1, box.f2858b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d9 = maximizeResultMaximize.maximum;
        double d10 = maximizeResultMaximize2.maximum;
        double d11 = maximizeResultMaximize3.maximum;
        if (d9 < d10 || d9 < d11) {
            if (d10 >= d9 && d10 >= d11) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f2862r1 = box.f2862r1;
        box2.f2860g1 = box.f2860g1;
        box2.f2858b1 = box.f2858b1;
        int i = C35341.f2856x8739cebf[direction3.ordinal()];
        if (i == 1) {
            int i8 = maximizeResultMaximize.cutLocation;
            box.f2862r1 = i8;
            box2.f2861r0 = i8;
            box2.f2859g0 = box.f2859g0;
            box2.f2857b0 = box.f2857b0;
        } else if (i == 2) {
            int i9 = maximizeResultMaximize2.cutLocation;
            box.f2860g1 = i9;
            box2.f2861r0 = box.f2861r0;
            box2.f2859g0 = i9;
            box2.f2857b0 = box.f2857b0;
        } else if (i == 3) {
            int i10 = maximizeResultMaximize3.cutLocation;
            box.f2858b1 = i10;
            box2.f2861r0 = box.f2861r0;
            box2.f2859g0 = box.f2859g0;
            box2.f2857b0 = i10;
        }
        box.vol = (box.f2858b1 - box.f2857b0) * (box.f2860g1 - box.f2859g0) * (box.f2862r1 - box.f2861r0);
        box2.vol = (box2.f2858b1 - box2.f2857b0) * (box2.f2860g1 - box2.f2859g0) * (box2.f2862r1 - box2.f2861r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i8, int i9, int i10, int i11, int i12) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i13 = -1;
        double d9 = 0.0d;
        int i14 = i;
        while (i14 < i8) {
            int pVar = top(box2, direction, i14, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i14, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i14, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i14, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d10 = ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar))) / pVar4;
                int i15 = i9 - pVar;
                int i16 = i10 - pVar2;
                int i17 = i11 - pVar3;
                int i18 = i12 - pVar4;
                if (i18 != 0) {
                    int i19 = i17 * i17;
                    double d11 = ((i19 + ((i16 * i16) + (i15 * i15))) / i18) + d10;
                    if (d11 > d9) {
                        i13 = i14;
                        d9 = d11;
                    }
                }
            }
            i14++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i13, d9);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
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
        int i = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f2862r1, box.f2860g1, box.f2858b1)] - this.moments[getIndex(box.f2862r1, box.f2860g1, box.f2857b0)]) - this.moments[getIndex(box.f2862r1, box.f2859g0, box.f2858b1)]) + this.moments[getIndex(box.f2862r1, box.f2859g0, box.f2857b0)]) - this.moments[getIndex(box.f2861r0, box.f2860g1, box.f2858b1)]) + this.moments[getIndex(box.f2861r0, box.f2860g1, box.f2857b0)]) + this.moments[getIndex(box.f2861r0, box.f2859g0, box.f2858b1)]) - this.moments[getIndex(box.f2861r0, box.f2859g0, box.f2857b0)]) - ((i + ((iVolume2 * iVolume2) + (iVolume * iVolume))) / volume(box, this.weights));
    }

    public static final class Box {

        /* renamed from: b0 */
        int f2857b0;

        /* renamed from: b1 */
        int f2858b1;

        /* renamed from: g0 */
        int f2859g0;

        /* renamed from: g1 */
        int f2860g1;

        /* renamed from: r0 */
        int f2861r0;

        /* renamed from: r1 */
        int f2862r1;
        int vol;

        private Box() {
            this.f2861r0 = 0;
            this.f2862r1 = 0;
            this.f2859g0 = 0;
            this.f2860g1 = 0;
            this.f2857b0 = 0;
            this.f2858b1 = 0;
            this.vol = 0;
        }

        public /* synthetic */ Box(C35341 c35341) {
            this();
        }
    }
}
