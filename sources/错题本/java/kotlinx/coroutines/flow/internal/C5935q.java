package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.C5911f0;
import kotlinx.coroutines.flow.InterfaceC5944m0;

/* renamed from: kotlinx.coroutines.flow.internal.q */
/* loaded from: classes4.dex */
public final class C5935q extends C5911f0 implements InterfaceC5944m0 {
    @Override // kotlinx.coroutines.flow.InterfaceC5944m0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f9367h;
            AbstractC5830k.m5327d(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f9368i + ((int) ((m5536o() + this.f9370k) - this.f9368i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* renamed from: v */
    public final void m5567v(int i) {
        synchronized (this) {
            Object[] objArr = this.f9367h;
            AbstractC5830k.m5327d(objArr);
            mo5527a(Integer.valueOf(((Number) objArr[((int) ((this.f9368i + ((int) ((m5536o() + this.f9370k) - this.f9368i))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
