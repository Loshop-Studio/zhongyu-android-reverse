package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8797p;
import p212p7.InterfaceC9760a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Strategy {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Lsq2 = new Strategy("Lsq2", 0);
        public static final Strategy Impulse = new Strategy("Impulse", 1);

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{Lsq2, Impulse};
        }

        static {
            Strategy[] strategyArr$values = $values();
            $VALUES = strategyArr$values;
            $ENTRIES = AbstractC9108a.m16085a(strategyArr$values);
        }

        private Strategy(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

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

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i10) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i10, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j10, float f10) {
        int i10 = (this.index + 1) % 20;
        this.index = i10;
        VelocityTrackerKt.set(this.samples, i10, j10, f10);
    }

    public final float calculateVelocity() {
        float fCalculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i10 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i10];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i11 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i10];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = dataPointAtTime3.getDataPoint();
            fArr2[i11] = -time;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i11 < this.minSampleSize) {
            return 0.0f;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i12 == 1) {
            fCalculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i11, this.isDataDifferential);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fCalculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i11);
        }
        return fCalculateImpulseVelocity * 1000;
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        AbstractC8797p.m14617G(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z10, Strategy strategy) {
        this.isDataDifferential = z10;
        this.strategy = strategy;
        if (z10 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.minSampleSize = i11;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z10, Strategy strategy, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final float calculateVelocity(float f10) {
        if (!(f10 > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fCalculateVelocity = calculateVelocity();
        if (fCalculateVelocity == 0.0f || Float.isNaN(fCalculateVelocity)) {
            return 0.0f;
        }
        if (fCalculateVelocity > 0.0f) {
            return AbstractC8323h.m13512g(fCalculateVelocity, f10);
        }
        return AbstractC8323h.m13509d(fCalculateVelocity, -f10);
    }

    public VelocityTracker1D(boolean z10) {
        this(z10, Strategy.Impulse);
    }
}
