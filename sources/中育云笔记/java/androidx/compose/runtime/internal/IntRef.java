package androidx.compose.runtime.internal;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i10) {
        this.element = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.element);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), AbstractC10788a.m23073a(16));
        AbstractC9979u.m20293f(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public IntRef(int i10) {
        this.element = i10;
    }

    public /* synthetic */ IntRef(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
