package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final InterfaceC9529a maxValue;
    private final boolean reverseScrolling;
    private final InterfaceC9529a value;

    public ScrollAxisRange(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z10) {
        this.value = interfaceC9529a;
        this.maxValue = interfaceC9529a2;
        this.reverseScrolling = z10;
    }

    public final InterfaceC9529a getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final InterfaceC9529a getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.value.invoke()).floatValue() + ", maxValue=" + ((Number) this.maxValue.invoke()).floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a, interfaceC9529a2, (i10 & 4) != 0 ? false : z10);
    }
}
