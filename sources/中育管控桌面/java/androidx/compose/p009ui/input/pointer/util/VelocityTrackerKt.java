package androidx.compose.p009ui.input.pointer.util;

import androidx.compose.p009ui.ExperimentalComposeUiApi;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.input.pointer.HistoricalChange;
import androidx.compose.p009ui.input.pointer.PointerEventKt;
import androidx.compose.p009ui.input.pointer.PointerInputChange;
import androidx.compose.p009ui.internal.InlineClassHelperKt;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a(\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a2\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u0012\u0010&\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*\u001a\u0014\u0010+\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010,\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002\u001a,\u0010/\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0082\n¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0003*\u00020\u0015H\u0082\b\u001a4\u00105\u001a\u00020'*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0003H\u0082\n¢\u0006\u0002\u00107\u001a1\u00105\u001a\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00142\u0006\u00109\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010<\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\",\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e*\u0018\b\u0002\u0010\u0013\"\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0012\u0004\u0012\u00020\u00150\u0014*\f\b\u0002\u0010=\"\u00020\u00152\u00020\u0015¨\u0006>"}, m7880d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "<set-?>", "", "VelocityTrackerAddPointsFix", "getVelocityTrackerAddPointsFix$annotations", "()V", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "VelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "Matrix", "", "", "Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "(II)[[F", "calculateImpulseVelocity", "dataPoints", "time", "sampleCount", "isDataDifferential", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "coefficients", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "dot", "a", "get", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "([[FII)F", "norm", "set", "value", "([[FIIF)V", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Vector", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"})
/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse;

    private static final float[][] Matrix(int i6, int i7) {
        float[][] fArr = new float[i6][];
        for (int i8 = 0; i8 < i6; i8++) {
            fArr[i8] = new float[i7];
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
            velocityTracker.m15222setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i6 = 0;
        while (i6 < size) {
            HistoricalChange historicalChange = historical.get(i6);
            long jM13662minusMKHz9U = Offset.m13662minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m15222setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m13663plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM13662minusMKHz9U));
            velocityTracker.m15218addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i6++;
            previousPosition = position;
        }
        velocityTracker.m15222setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m13663plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m13662minusMKHz9U(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.m15218addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i6 = 0; i6 < size; i6++) {
                HistoricalChange historicalChange = historical.get(i6);
                velocityTracker.m15218addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            velocityTracker.m15218addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i6, boolean z6) {
        int i7 = i6 - 1;
        float f6 = fArr2[i7];
        float fSignum = 0.0f;
        int i8 = i7;
        while (i8 > 0) {
            int i9 = i8 - 1;
            float f7 = fArr2[i9];
            if (f6 != f7) {
                float f8 = (z6 ? -fArr[i9] : fArr[i8] - fArr[i9]) / (f6 - f7);
                fSignum += (f8 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f8);
                if (i8 == i7) {
                    fSignum *= 0.5f;
                }
            }
            i8--;
            f6 = f7;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < length; i6++) {
            f6 += fArr[i6] * fArr2[i6];
        }
        return f6;
    }

    private static final float get(float[][] fArr, int i6, int i7) {
        return fArr[i6][i7];
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

    private static final float kineticEnergyToVelocity(float f6) {
        return Math.signum(f6) * ((float) Math.sqrt(2 * Math.abs(f6)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i6, int i7, float[] fArr3) {
        int i8 = i7;
        if (i8 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i6 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i8 >= i6) {
            i8 = i6 - 1;
        }
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i6];
        }
        for (int i11 = 0; i11 < i6; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9][];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i6];
        }
        float[][] fArr6 = new float[i9][];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        int i15 = 0;
        while (i15 < i9) {
            float[] fArr7 = fArr5[i15];
            ArraysKt.copyInto(fArr4[i15], fArr7, 0, 0, i6);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr8 = fArr5[i16];
                float fDot = dot(fArr7, fArr8);
                for (int i17 = 0; i17 < i6; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr8[i17] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f6 = 1.0f / fSqrt;
            for (int i18 = 0; i18 < i6; i18++) {
                fArr7[i18] = fArr7[i18] * f6;
            }
            float[] fArr9 = fArr6[i15];
            int i19 = 0;
            while (i19 < i9) {
                fArr9[i19] = i19 < i15 ? 0.0f : dot(fArr7, fArr4[i19]);
                i19++;
            }
            i15++;
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float fDot2 = dot(fArr5[i20], fArr2);
            float[] fArr10 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    fDot2 -= fArr10[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = fDot2 / fArr10[i20];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i6, int i7, float[] fArr3, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            fArr3 = new float[RangesKt.coerceAtLeast(i7 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i6, i7, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i6, long j6, float f6) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i6];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i6] = new DataPointAtTime(j6, f6);
        } else {
            dataPointAtTime.setTime(j6);
            dataPointAtTime.setDataPoint(f6);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z6) {
        VelocityTrackerAddPointsFix = z6;
    }

    @ExperimentalVelocityTrackerApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z6) {
        VelocityTrackerStrategyUseImpulse = z6;
    }

    private static final void set(float[][] fArr, int i6, int i7, float f6) {
        fArr[i6][i7] = f6;
    }
}
