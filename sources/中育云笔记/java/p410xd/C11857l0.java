package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xd.l0 */
/* loaded from: classes6.dex */
public final class C11857l0 implements InterfaceC9945d.c {

    /* renamed from: c */
    public final ThreadLocal f28109c;

    public C11857l0(ThreadLocal threadLocal) {
        this.f28109c = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11857l0) && AbstractC9979u.m20289b(this.f28109c, ((C11857l0) obj).f28109c);
    }

    public int hashCode() {
        return this.f28109c.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f28109c + ')';
    }
}
