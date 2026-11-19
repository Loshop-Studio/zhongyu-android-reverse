package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10409n;
import p265nd.InterfaceC10401f;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, AbstractC10409n.m21749b(0.0f, 0.0f), 0, 4, null);
    private final float current;
    private final InterfaceC10401f range;
    private final int steps;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        private Companion() {
        }
    }

    public ProgressBarRangeInfo(float f10, InterfaceC10401f interfaceC10401f, int i10) {
        this.current = f10;
        this.range = interfaceC10401f;
        this.steps = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.current == progressBarRangeInfo.current && AbstractC9979u.m20289b(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final InterfaceC10401f getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f10, InterfaceC10401f interfaceC10401f, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(f10, interfaceC10401f, (i11 & 4) != 0 ? 0 : i10);
    }
}
