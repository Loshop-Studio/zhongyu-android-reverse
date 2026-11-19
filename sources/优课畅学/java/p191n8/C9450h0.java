package p191n8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8877t1;
import p300x7.InterfaceC10574p;

/* renamed from: n8.h0 */
/* loaded from: classes5.dex */
public final class C9450h0 implements InterfaceC8877t1 {

    /* renamed from: a */
    public final Object f18654a;

    /* renamed from: b */
    public final ThreadLocal f18655b;

    /* renamed from: c */
    public final InterfaceC9100d.c f18656c;

    public C9450h0(Object obj, ThreadLocal threadLocal) {
        this.f18654a = obj;
        this.f18655b = threadLocal;
        this.f18656c = new C9452i0(threadLocal);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public Object fold(Object obj, InterfaceC10574p interfaceC10574p) {
        return InterfaceC8877t1.a.m14915a(this, obj, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d.b get(InterfaceC9100d.c cVar) {
        if (!AbstractC9133u.m16128b(getKey(), cVar)) {
            return null;
        }
        AbstractC9133u.m16131e(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return this.f18656c;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return AbstractC9133u.m16128b(getKey(), cVar) ? EmptyCoroutineContext.f17438a : this;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC8877t1.a.m14916b(this, interfaceC9100d);
    }

    @Override // p135i8.InterfaceC8877t1
    public void restoreThreadContext(InterfaceC9100d interfaceC9100d, Object obj) {
        this.f18655b.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f18654a + ", threadLocal = " + this.f18655b + ')';
    }

    @Override // p135i8.InterfaceC8877t1
    public Object updateThreadContext(InterfaceC9100d interfaceC9100d) {
        Object obj = this.f18655b.get();
        this.f18655b.set(this.f18654a);
        return obj;
    }
}
