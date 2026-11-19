package androidx.compose.p011ui.input.pointer.util;

import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.HistoricalChange;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0006*\u00020\u0012H\u0082\b¢\u0006\u0004\b%\u0010&\u001a*\u0010*\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`)0\u00002\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b*\u0010+\u001a.\u0010/\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u00120\u0000j\u0002`,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0082\n¢\u0006\u0004\b/\u00100\u001a6\u0010\t\u001a\u00020\b*\f\u0012\u0004\u0012\u00020\u00120\u0000j\u0002`,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0006H\u0082\n¢\u0006\u0004\b\t\u00102\"\u0014\u00103\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00104\"\u0014\u00106\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00107\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00108\"0\u0010:\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\"0\u0010B\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\bB\u0010;\u0012\u0004\bE\u0010A\u001a\u0004\bC\u0010=\"\u0004\bD\u0010?*\u0018\b\u0002\u0010*\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u0010F\"\u00020\u00122\u00020\u0012¨\u0006G"}, m5110d2 = {"", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "index", "", "time", "", "dataPoint", "Ld6/s;", "set", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", NotificationCompat.CATEGORY_EVENT, "addPointerInputChange", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "", "x", "y", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "calculateImpulseVelocity", "([F[FIZ)F", "kineticEnergy", "kineticEnergyToVelocity", "(F)F", "a", "dot", "([F[F)F", "norm", "([F)F", "rows", "cols", "Landroidx/compose/ui/input/pointer/util/Vector;", "Matrix", "(II)[[F", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "get", "([[FII)F", "value", "([[FIIF)V", "AssumePointerMoveStoppedMilliseconds", "I", "HistorySize", "HorizonMilliseconds", "DefaultWeight", "F", "<set-?>", "VelocityTrackerAddPointsFix", "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "Vector", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"})
/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse;

    private static final float[][] Matrix(int i, int i8) {
        float[][] fArr = new float[i][];
        for (int i9 = 0; i9 < i; i9++) {
            fArr[i9] = new float[i8];
        }
        return fArr;
    }

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange pointerInputChange) {
        if (VelocityTrackerAddPointsFix) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m12008setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m12008setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m10446plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM10445minusMKHz9U));
            velocityTracker.m12004addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i++;
            previousPosition = position;
        }
        velocityTracker.m12008setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m10446plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m10445minusMKHz9U(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.m12004addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = historical.get(i);
                velocityTracker.m12004addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            velocityTracker.m12004addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i, boolean z8) {
        int i8 = i - 1;
        float f = fArr2[i8];
        float f7 = 0.0f;
        int i9 = i8;
        while (i9 > 0) {
            int i10 = i9 - 1;
            float f8 = fArr2[i10];
            if (f != f8) {
                float f9 = (z8 ? -fArr[i10] : fArr[i9] - fArr[i10]) / (f - f8);
                float fAbs = (Math.abs(f9) * (f9 - (Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2))))) + f7;
                if (i9 == i8) {
                    fAbs *= 0.5f;
                }
                f7 = fAbs;
            }
            i9--;
            f = f8;
        }
        return Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    private static final float get(float[][] fArr, int i, int i8) {
        return fArr[i][i8];
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

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    @NotNull
    public static final float[] polyFitLeastSquares(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i8, @NotNull float[] fArr3) {
        int i9 = i8;
        if (i9 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i9 >= i) {
            i9 = i - 1;
        }
        int i10 = i9 + 1;
        float[][] fArr4 = new float[i10][];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr4[i11] = new float[i];
        }
        for (int i12 = 0; i12 < i; i12++) {
            fArr4[0][i12] = 1.0f;
            for (int i13 = 1; i13 < i10; i13++) {
                fArr4[i13][i12] = fArr4[i13 - 1][i12] * fArr[i12];
            }
        }
        float[][] fArr5 = new float[i10][];
        for (int i14 = 0; i14 < i10; i14++) {
            fArr5[i14] = new float[i];
        }
        float[][] fArr6 = new float[i10][];
        for (int i15 = 0; i15 < i10; i15++) {
            fArr6[i15] = new float[i10];
        }
        int i16 = 0;
        while (i16 < i10) {
            float[] fArr7 = fArr5[i16];
            AbstractC5802q.m5176C(fArr4[i16], 0, fArr7, 0, i);
            for (int i17 = 0; i17 < i16; i17++) {
                float[] fArr8 = fArr5[i17];
                float fDot = dot(fArr7, fArr8);
                for (int i18 = 0; i18 < i; i18++) {
                    fArr7[i18] = fArr7[i18] - (fArr8[i18] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i19 = 0; i19 < i; i19++) {
                fArr7[i19] = fArr7[i19] * f;
            }
            float[] fArr9 = fArr6[i16];
            int i20 = 0;
            while (i20 < i10) {
                fArr9[i20] = i20 < i16 ? 0.0f : dot(fArr7, fArr4[i20]);
                i20++;
            }
            i16++;
        }
        for (int i21 = i9; -1 < i21; i21--) {
            float fDot2 = dot(fArr5[i21], fArr2);
            float[] fArr10 = fArr6[i21];
            int i22 = i21 + 1;
            if (i22 <= i9) {
                int i23 = i9;
                while (true) {
                    fDot2 -= fArr10[i23] * fArr3[i23];
                    if (i23 != i22) {
                        i23--;
                    }
                }
            }
            fArr3[i21] = fDot2 / fArr10[i21];
        }
        return fArr3;
    }

    public static float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i, int i8, float[] fArr3, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            int i10 = i8 + 1;
            if (i10 < 0) {
                i10 = 0;
            }
            fArr3 = new float[i10];
        }
        return polyFitLeastSquares(fArr, fArr2, i, i8, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j7, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j7, f);
        } else {
            dataPointAtTime.setTime(j7);
            dataPointAtTime.setDataPoint(f);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z8) {
        VelocityTrackerAddPointsFix = z8;
    }

    @ExperimentalVelocityTrackerApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z8) {
        VelocityTrackerStrategyUseImpulse = z8;
    }

    private static final void set(float[][] fArr, int i, int i8, float f) {
        fArr[i][i8] = f;
    }
}
