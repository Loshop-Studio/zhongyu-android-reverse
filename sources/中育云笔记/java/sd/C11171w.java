package sd;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.InterfaceC9996b;
import p181hd.InterfaceC9545q;

/* renamed from: sd.w */
/* loaded from: classes6.dex */
public final class C11171w {

    /* renamed from: a */
    public final Object f26830a;

    /* renamed from: b */
    public final InterfaceC9996b f26831b;

    /* renamed from: c */
    public final InterfaceC9545q f26832c;

    /* renamed from: d */
    public final Object f26833d;

    /* renamed from: e */
    public final Throwable f26834e;

    public C11171w(Object obj, InterfaceC9996b interfaceC9996b, InterfaceC9545q interfaceC9545q, Object obj2, Throwable th) {
        this.f26830a = obj;
        this.f26831b = interfaceC9996b;
        this.f26832c = interfaceC9545q;
        this.f26833d = obj2;
        this.f26834e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C11171w m24809b(C11171w c11171w, Object obj, InterfaceC9996b interfaceC9996b, InterfaceC9545q interfaceC9545q, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c11171w.f26830a;
        }
        if ((i10 & 2) != 0) {
            interfaceC9996b = c11171w.f26831b;
        }
        if ((i10 & 4) != 0) {
            interfaceC9545q = c11171w.f26832c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c11171w.f26833d;
        }
        if ((i10 & 16) != 0) {
            th = c11171w.f26834e;
        }
        Throwable th2 = th;
        InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
        return c11171w.m24810a(obj, interfaceC9996b, interfaceC9545q2, obj2, th2);
    }

    /* renamed from: a */
    public final C11171w m24810a(Object obj, InterfaceC9996b interfaceC9996b, InterfaceC9545q interfaceC9545q, Object obj2, Throwable th) {
        return new C11171w(obj, interfaceC9996b, interfaceC9545q, obj2, th);
    }

    /* renamed from: c */
    public final boolean m24811c() {
        return this.f26834e != null;
    }

    /* renamed from: d */
    public final void m24812d(C9997c c9997c, Throwable th) {
        InterfaceC9996b interfaceC9996b = this.f26831b;
        if (interfaceC9996b != null) {
            c9997c.m20527l(interfaceC9996b, th);
        }
        InterfaceC9545q interfaceC9545q = this.f26832c;
        if (interfaceC9545q != null) {
            c9997c.m20528m(interfaceC9545q, th, this.f26830a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11171w)) {
            return false;
        }
        C11171w c11171w = (C11171w) obj;
        return AbstractC9979u.m20289b(this.f26830a, c11171w.f26830a) && AbstractC9979u.m20289b(this.f26831b, c11171w.f26831b) && AbstractC9979u.m20289b(this.f26832c, c11171w.f26832c) && AbstractC9979u.m20289b(this.f26833d, c11171w.f26833d) && AbstractC9979u.m20289b(this.f26834e, c11171w.f26834e);
    }

    public int hashCode() {
        Object obj = this.f26830a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC9996b interfaceC9996b = this.f26831b;
        int iHashCode2 = (iHashCode + (interfaceC9996b == null ? 0 : interfaceC9996b.hashCode())) * 31;
        InterfaceC9545q interfaceC9545q = this.f26832c;
        int iHashCode3 = (iHashCode2 + (interfaceC9545q == null ? 0 : interfaceC9545q.hashCode())) * 31;
        Object obj2 = this.f26833d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f26834e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f26830a + ", cancelHandler=" + this.f26831b + ", onCancellation=" + this.f26832c + ", idempotentResume=" + this.f26833d + ", cancelCause=" + this.f26834e + ')';
    }

    public /* synthetic */ C11171w(Object obj, InterfaceC9996b interfaceC9996b, InterfaceC9545q interfaceC9545q, Object obj2, Throwable th, int i10, AbstractC9972n abstractC9972n) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC9996b, (i10 & 4) != 0 ? null : interfaceC9545q, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
