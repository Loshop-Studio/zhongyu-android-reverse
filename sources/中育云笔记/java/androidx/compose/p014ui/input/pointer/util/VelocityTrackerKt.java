package androidx.compose.p014ui.input.pointer.util;

import androidx.compose.p014ui.ExperimentalComposeUiApi;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.HistoricalChange;
import androidx.compose.p014ui.input.pointer.PointerEventKt;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import java.util.List;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse;

    private static final float[][] Matrix(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (VelocityTrackerAddPointsFix) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m32204setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m32104getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long jM32105getPreviousPositionF1C5BW0 = pointerInputChange.m32105getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i10 = 0;
        while (i10 < size) {
            HistoricalChange historicalChange = historical.get(i10);
            long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(historicalChange.m32027getPositionF1C5BW0(), jM32105getPreviousPositionF1C5BW0);
            long jM32027getPositionF1C5BW0 = historicalChange.m32027getPositionF1C5BW0();
            velocityTracker.m32204setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m30642plusMKHz9U(velocityTracker.m32203getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), jM30641minusMKHz9U));
            velocityTracker.m32200addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m32203getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i10++;
            jM32105getPreviousPositionF1C5BW0 = jM32027getPositionF1C5BW0;
        }
        velocityTracker.m32204setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m30642plusMKHz9U(velocityTracker.m32203getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m30641minusMKHz9U(pointerInputChange.m32104getPositionF1C5BW0(), jM32105getPreviousPositionF1C5BW0)));
        velocityTracker.m32200addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m32203getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i10 = 0; i10 < size; i10++) {
                HistoricalChange historicalChange = historical.get(i10);
                velocityTracker.m32200addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m32026getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m32200addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m32103getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
                fSignum += (f12 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f12);
                if (i12 == i11) {
                    fSignum *= 0.5f;
                }
            }
            i12--;
            f10 = f11;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    private static final float get(float[][] fArr, int i10, int i11) {
        return fArr[i10][i11];
    }

    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    @ExperimentalVelocityTrackerApi
    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return VelocityTrackerStrategyUseImpulse;
    }

    @ExperimentalVelocityTrackerApi
    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    private static final float kineticEnergyToVelocity(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i10 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            AbstractC10964p.m24020m(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fDot = dot(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : dot(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fDot2 = dot(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fDot2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fDot2 / fArr10[i24];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            fArr3 = new float[AbstractC10410o.m21752e(i11 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i10, i11, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i10, long j10, float f10) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i10];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i10] = new DataPointAtTime(j10, f10);
        } else {
            dataPointAtTime.setTime(j10);
            dataPointAtTime.setDataPoint(f10);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z10) {
        VelocityTrackerAddPointsFix = z10;
    }

    @ExperimentalVelocityTrackerApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z10) {
        VelocityTrackerStrategyUseImpulse = z10;
    }

    private static final void set(float[][] fArr, int i10, int i11, float f10) {
        fArr[i10][i11] = f10;
    }
}
