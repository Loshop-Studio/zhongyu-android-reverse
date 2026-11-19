package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.p013ui.ExperimentalComposeUiApi;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.HistoricalChange;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a(\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a2\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u0012\u0010&\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*\u001a\u0014\u0010+\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010,\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002\u001a,\u0010/\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0082\n¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0003*\u00020\u0015H\u0082\b\u001a4\u00105\u001a\u00020'*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0003H\u0082\n¢\u0006\u0002\u00107\u001a1\u00105\u001a\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00142\u0006\u00109\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010<\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\",\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e*\u0018\b\u0002\u0010\u0013\"\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0012\u0004\u0012\u00020\u00150\u0014*\f\b\u0002\u0010=\"\u00020\u00152\u00020\u0015¨\u0006>"}, m13558d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "<set-?>", "", "VelocityTrackerAddPointsFix", "getVelocityTrackerAddPointsFix$annotations", "()V", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "VelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "Matrix", "", "", "Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "(II)[[F", "calculateImpulseVelocity", "dataPoints", "time", "sampleCount", "isDataDifferential", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "coefficients", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "dot", "a", "get", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "([[FII)F", "norm", "set", "value", "([[FIIF)V", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Vector", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"})
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
            velocityTracker.m22299setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i10 = 0;
        while (i10 < size) {
            HistoricalChange historicalChange = historical.get(i10);
            long jM20739minusMKHz9U = Offset.m20739minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m22299setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m20740plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM20739minusMKHz9U));
            velocityTracker.m22295addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i10++;
            previousPosition = position;
        }
        velocityTracker.m22299setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m20740plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m20739minusMKHz9U(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.m22295addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
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
                velocityTracker.m22295addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            velocityTracker.m22295addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i10, boolean z9) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z9 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
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
            ArraysKt.copyInto(fArr4[i19], fArr7, 0, 0, i10);
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
            fArr3 = new float[RangesKt.coerceAtLeast(i11 + 1, 0)];
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
    public static final void setVelocityTrackerAddPointsFix(boolean z9) {
        VelocityTrackerAddPointsFix = z9;
    }

    @ExperimentalVelocityTrackerApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z9) {
        VelocityTrackerStrategyUseImpulse = z9;
    }

    private static final void set(float[][] fArr, int i10, int i11, float f10) {
        fArr[i10][i11] = f10;
    }
}
