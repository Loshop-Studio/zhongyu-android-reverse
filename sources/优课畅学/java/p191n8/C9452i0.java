package p191n8;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: n8.i0 */
/* loaded from: classes5.dex */
public final class C9452i0 implements InterfaceC9100d.c {

    /* renamed from: a */
    public final ThreadLocal f18657a;

    public C9452i0(ThreadLocal threadLocal) {
        this.f18657a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9452i0) && AbstractC9133u.m16128b(this.f18657a, ((C9452i0) obj).f18657a);
    }

    public int hashCode() {
        return this.f18657a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f18657a + ')';
    }
}
