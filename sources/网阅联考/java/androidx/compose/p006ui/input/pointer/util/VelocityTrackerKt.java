package androidx.compose.p006ui.input.pointer.util;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.pointer.HistoricalChange;
import androidx.compose.p006ui.input.pointer.PointerEventKt;
import androidx.compose.p006ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a1\u0010\u0017\u001a\u00020\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m5175d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "calculateImpulseVelocity", "dataPoints", "", "time", "isDataDifferential", "", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "set", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"})
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            velocityTracker.m10561setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i4 = 0;
        while (i4 < size) {
            HistoricalChange historicalChange = historical.get(i4);
            long jM8949minusMKHz9U = Offset.m8949minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m10561setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m8950plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM8949minusMKHz9U));
            velocityTracker.m10558addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i4++;
            previousPosition = position;
        }
        velocityTracker.m10561setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m8950plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m8949minusMKHz9U(event.getPosition(), previousPosition)));
        velocityTracker.m10558addPositionUv8p0NA(event.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(List<Float> list, List<Float> list2, boolean z3) {
        int size = list.size();
        float fAbs = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                return 0.0f;
            }
            return (z3 ? list.get(0).floatValue() : list.get(0).floatValue() - list.get(1).floatValue()) / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i4 = size - 1;
        for (int i5 = i4; i5 > 0; i5--) {
            int i6 = i5 - 1;
            if (!(list2.get(i5).floatValue() == list2.get(i6).floatValue())) {
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                float fFloatValue = (z3 ? -list.get(i6).floatValue() : list.get(i5).floatValue() - list.get(i6).floatValue()) / (list2.get(i5).floatValue() - list2.get(i6).floatValue());
                fAbs += (fFloatValue - fKineticEnergyToVelocity) * Math.abs(fFloatValue);
                if (i5 == i4) {
                    fAbs *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(fAbs);
    }

    private static final float kineticEnergyToVelocity(float f4) {
        return Math.signum(f4) * ((float) Math.sqrt(2 * Math.abs(f4)));
    }

    public static final List<Float> polyFitLeastSquares(List<Float> x3, List<Float> y3, int i4) {
        Intrinsics.checkNotNullParameter(x3, "x");
        Intrinsics.checkNotNullParameter(y3, "y");
        if (i4 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (x3.size() != y3.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (x3.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i4 >= x3.size() ? x3.size() - 1 : i4;
        int i5 = i4 + 1;
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = x3.size();
        int i7 = size + 1;
        Matrix matrix = new Matrix(i7, size2);
        for (int i8 = 0; i8 < size2; i8++) {
            matrix.set(0, i8, 1.0f);
            for (int i9 = 1; i9 < i7; i9++) {
                matrix.set(i9, i8, matrix.get(i9 - 1, i8) * x3.get(i8).floatValue());
            }
        }
        Matrix matrix2 = new Matrix(i7, size2);
        Matrix matrix3 = new Matrix(i7, i7);
        int i10 = 0;
        while (i10 < i7) {
            for (int i11 = 0; i11 < size2; i11++) {
                matrix2.set(i10, i11, matrix.get(i10, i11));
            }
            for (int i12 = 0; i12 < i10; i12++) {
                float fTimes = matrix2.getRow(i10).times(matrix2.getRow(i12));
                for (int i13 = 0; i13 < size2; i13++) {
                    matrix2.set(i10, i13, matrix2.get(i10, i13) - (matrix2.get(i12, i13) * fTimes));
                }
            }
            float fNorm = matrix2.getRow(i10).norm();
            if (fNorm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f4 = 1.0f / fNorm;
            for (int i14 = 0; i14 < size2; i14++) {
                matrix2.set(i10, i14, matrix2.get(i10, i14) * f4);
            }
            int i15 = 0;
            while (i15 < i7) {
                matrix3.set(i10, i15, i15 < i10 ? 0.0f : matrix2.getRow(i10).times(matrix.getRow(i15)));
                i15++;
            }
            i10++;
        }
        Vector vector = new Vector(size2);
        for (int i16 = 0; i16 < size2; i16++) {
            vector.set(i16, y3.get(i16).floatValue() * 1.0f);
        }
        int i17 = i7 - 1;
        for (int i18 = i17; -1 < i18; i18--) {
            arrayList.set(i18, Float.valueOf(matrix2.getRow(i18).times(vector)));
            int i19 = i18 + 1;
            if (i19 <= i17) {
                int i20 = i17;
                while (true) {
                    arrayList.set(i18, Float.valueOf(((Number) arrayList.get(i18)).floatValue() - (matrix3.get(i18, i20) * ((Number) arrayList.get(i20)).floatValue())));
                    if (i20 != i19) {
                        i20--;
                    }
                }
            }
            arrayList.set(i18, Float.valueOf(((Number) arrayList.get(i18)).floatValue() / matrix3.get(i18, i18)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i4, long j4, float f4) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i4];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i4] = new DataPointAtTime(j4, f4);
        } else {
            dataPointAtTime.setTime(j4);
            dataPointAtTime.setDataPoint(f4);
        }
    }
}
