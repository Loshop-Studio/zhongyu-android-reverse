package p410xd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import sd.InterfaceC11112f2;

/* renamed from: xd.k0 */
/* loaded from: classes6.dex */
public final class C11855k0 implements InterfaceC11112f2 {

    /* renamed from: c */
    public final Object f28106c;

    /* renamed from: d */
    public final ThreadLocal f28107d;

    /* renamed from: e */
    public final InterfaceC9945d.c f28108e;

    public C11855k0(Object obj, ThreadLocal threadLocal) {
        this.f28106c = obj;
        this.f28107d = threadLocal;
        this.f28108e = new C11857l0(threadLocal);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public Object fold(Object obj, InterfaceC9544p interfaceC9544p) {
        return InterfaceC11112f2.a.m24714a(this, obj, interfaceC9544p);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d.b get(InterfaceC9945d.c cVar) {
        if (!AbstractC9979u.m20289b(getKey(), cVar)) {
            return null;
        }
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b
    public InterfaceC9945d.c getKey() {
        return this.f28108e;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return AbstractC9979u.m20289b(getKey(), cVar) ? EmptyCoroutineContext.f23351c : this;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC11112f2.a.m24715b(this, interfaceC9945d);
    }

    @Override // sd.InterfaceC11112f2
    public void restoreThreadContext(InterfaceC9945d interfaceC9945d, Object obj) {
        this.f28107d.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f28106c + ", threadLocal = " + this.f28107d + ')';
    }

    @Override // sd.InterfaceC11112f2
    public Object updateThreadContext(InterfaceC9945d interfaceC9945d) {
        Object obj = this.f28107d.get();
        this.f28107d.set(this.f28106c);
        return obj;
    }
}
