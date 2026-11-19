package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p211jd.AbstractC9719c;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Strategy {
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Strategy Empty = new Strategy(KeylineListKt.emptyKeylineList(), AbstractC10978w.m24136n(), AbstractC10978w.m24136n(), 0.0f, 0.0f, 0.0f, 0.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }

        private Companion() {
        }
    }

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f10, float f11, float f12, float f13) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f10;
        this.itemSpacing = f11;
        this.beforeContentPadding = f12;
        this.afterContentPadding = f13;
        float startShiftDistance = StrategyKt.getStartShiftDistance(list, f12);
        this.startShiftDistance = startShiftDistance;
        float endShiftDistance = StrategyKt.getEndShiftDistance(list2, f13);
        this.endShiftDistance = endShiftDistance;
        this.startShiftPoints = StrategyKt.getStepInterpolationPoints(startShiftDistance, list, true);
        this.endShiftPoints = StrategyKt.getStepInterpolationPoints(endShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f10 == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy, float f10, float f11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return strategy.getKeylineListForScrollOffset$material3_release(f10, f11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z10 = this.isValid;
        if (!z10 && !((Strategy) obj).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z10 == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && AbstractC9979u.m20289b(this.startShiftPoints, strategy.startShiftPoints) && AbstractC9979u.m20289b(this.endShiftPoints, strategy.endShiftPoints) && AbstractC9979u.m20289b(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final KeylineList getKeylineListForScrollOffset$material3_release(float f10, float f11, boolean z10) {
        float fMax = Math.max(0.0f, f10);
        float f12 = this.startShiftDistance;
        float fMax2 = Math.max(0.0f, f11 - this.endShiftDistance);
        if (f12 <= fMax && fMax <= fMax2) {
            return this.defaultKeylines;
        }
        float fLerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f12, fMax);
        FloatList floatList = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (fMax > fMax2) {
            fLerp = StrategyKt.lerp(0.0f, 1.0f, fMax2, f11, fMax);
            floatList = this.endShiftPoints;
            list = this.endKeylineSteps;
        }
        ShiftPointRange shiftPointRange = StrategyKt.getShiftPointRange(list.size(), floatList, fLerp);
        if (z10) {
            return list.get(AbstractC9719c.m19282d(shiftPointRange.getSteppedInterpolation()) == 0 ? shiftPointRange.getFromStepIndex() : shiftPointRange.getToStepIndex());
        }
        return KeylineListKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public int hashCode() {
        boolean z10 = this.isValid;
        return !z10 ? Boolean.hashCode(z10) : (((((((((((((((((((Boolean.hashCode(z10) * 31) + Float.hashCode(this.availableSpace)) * 31) + Float.hashCode(this.itemSpacing)) * 31) + Float.hashCode(this.beforeContentPadding)) * 31) + Float.hashCode(this.afterContentPadding)) * 31) + Float.hashCode(getItemMainAxisSize())) * 31) + Float.hashCode(this.startShiftDistance)) * 31) + Float.hashCode(this.endShiftDistance)) * 31) + this.startShiftPoints.hashCode()) * 31) + this.endShiftPoints.hashCode()) * 31) + this.defaultKeylines.hashCode();
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public Strategy(KeylineList keylineList, float f10, float f11, float f12, float f13) {
        this(keylineList, StrategyKt.getStartKeylineSteps(keylineList, f10, f11, f12), StrategyKt.getEndKeylineSteps(keylineList, f10, f11, f13), f10, f11, f12, f13);
    }
}
