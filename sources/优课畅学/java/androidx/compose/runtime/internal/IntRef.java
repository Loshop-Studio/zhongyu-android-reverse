package androidx.compose.runtime.internal;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;

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
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String string = Integer.toString(hashCode(), AbstractC8656a.m13939a(16));
        AbstractC9133u.m16132f(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    public IntRef(int i10) {
        this.element = i10;
    }

    public /* synthetic */ IntRef(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
