package androidx.compose.p006ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "isDataDifferential", "", "(Z)V", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "index", "", "()Z", "minSampleSize", "samples", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "addDataPoint", "", "timeMillis", "", "dataPoint", "", "calculateLeastSquaresVelocity", "dataPoints", "", "time", "calculateVelocity", "resetTracking", "Strategy", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    @Metadata(m5174d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum Strategy {
        Lsq2,
        Impulse
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float calculateLeastSquaresVelocity(List<Float> dataPoints, List<Float> time) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(time, dataPoints, 2).get(1).floatValue();
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long timeMillis, float dataPoint) {
        int i4 = (this.index + 1) % 20;
        this.index = i4;
        VelocityTrackerKt.set(this.samples, i4, timeMillis, dataPoint);
    }

    public final float calculateVelocity() {
        float fCalculateImpulseVelocity;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i4];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i5 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i4];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            arrayList.add(Float.valueOf(dataPointAtTime3.getDataPoint()));
            arrayList2.add(Float.valueOf(-time));
            if (i4 == 0) {
                i4 = 20;
            }
            i4--;
            i5++;
            if (i5 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime3;
        }
        if (i5 < this.minSampleSize) {
            return 0.0f;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i6 == 1) {
            fCalculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(arrayList, arrayList2, this.isDataDifferential);
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fCalculateImpulseVelocity = calculateLeastSquaresVelocity(arrayList, arrayList2);
        }
        return fCalculateImpulseVelocity * 1000;
    }

    /* renamed from: isDataDifferential, reason: from getter */
    public final boolean getIsDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        ArraysKt___ArraysJvmKt.fill$default(this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z3, Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.isDataDifferential = z3;
        this.strategy = strategy;
        if (z3 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i5 = 2;
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = 3;
        }
        this.minSampleSize = i5;
        DataPointAtTime[] dataPointAtTimeArr = new DataPointAtTime[20];
        for (int i6 = 0; i6 < 20; i6++) {
            dataPointAtTimeArr[i6] = null;
        }
        this.samples = dataPointAtTimeArr;
    }

    public /* synthetic */ VelocityTracker1D(boolean z3, Strategy strategy, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z3) {
        this(z3, Strategy.Impulse);
    }
}
