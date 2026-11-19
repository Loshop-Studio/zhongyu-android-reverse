package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final InterfaceC10559a maxValue;
    private final boolean reverseScrolling;
    private final InterfaceC10559a value;

    public ScrollAxisRange(InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, boolean z10) {
        this.value = interfaceC10559a;
        this.maxValue = interfaceC10559a2;
        this.reverseScrolling = z10;
    }

    public final InterfaceC10559a getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final InterfaceC10559a getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.value.invoke()).floatValue() + ", maxValue=" + ((Number) this.maxValue.invoke()).floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a, interfaceC10559a2, (i10 & 4) != 0 ? false : z10);
    }
}
