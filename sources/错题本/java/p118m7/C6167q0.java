package p118m7;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import p160s6.InterfaceC6560a;

/* renamed from: m7.q0 */
/* loaded from: classes4.dex */
public final class C6167q0 implements Map.Entry, InterfaceC6560a {

    /* renamed from: a */
    public final Object f9849a;

    /* renamed from: b */
    public final Object f9850b;

    public C6167q0(Object obj, Object obj2) {
        this.f9849a = obj;
        this.f9850b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6167q0)) {
            return false;
        }
        C6167q0 c6167q0 = (C6167q0) obj;
        return AbstractC5830k.m5325b(this.f9849a, c6167q0.f9849a) && AbstractC5830k.m5325b(this.f9850b, c6167q0.f9850b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9849a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9850b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f9849a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9850b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f9849a + ", value=" + this.f9850b + ')';
    }
}
