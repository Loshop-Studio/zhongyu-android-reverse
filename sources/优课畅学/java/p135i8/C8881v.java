package p135i8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.InterfaceC9154b;
import p300x7.InterfaceC10570l;

/* renamed from: i8.v */
/* loaded from: classes5.dex */
public final class C8881v {

    /* renamed from: a */
    public final Object f16537a;

    /* renamed from: b */
    public final InterfaceC9154b f16538b;

    /* renamed from: c */
    public final InterfaceC10570l f16539c;

    /* renamed from: d */
    public final Object f16540d;

    /* renamed from: e */
    public final Throwable f16541e;

    public C8881v(Object obj, InterfaceC9154b interfaceC9154b, InterfaceC10570l interfaceC10570l, Object obj2, Throwable th) {
        this.f16537a = obj;
        this.f16538b = interfaceC9154b;
        this.f16539c = interfaceC10570l;
        this.f16540d = obj2;
        this.f16541e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C8881v m14918b(C8881v c8881v, Object obj, InterfaceC9154b interfaceC9154b, InterfaceC10570l interfaceC10570l, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c8881v.f16537a;
        }
        if ((i10 & 2) != 0) {
            interfaceC9154b = c8881v.f16538b;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l = c8881v.f16539c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c8881v.f16540d;
        }
        if ((i10 & 16) != 0) {
            th = c8881v.f16541e;
        }
        Throwable th2 = th;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return c8881v.m14919a(obj, interfaceC9154b, interfaceC10570l2, obj2, th2);
    }

    /* renamed from: a */
    public final C8881v m14919a(Object obj, InterfaceC9154b interfaceC9154b, InterfaceC10570l interfaceC10570l, Object obj2, Throwable th) {
        return new C8881v(obj, interfaceC9154b, interfaceC10570l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m14920c() {
        return this.f16541e != null;
    }

    /* renamed from: d */
    public final void m14921d(C9155c c9155c, Throwable th) {
        InterfaceC9154b interfaceC9154b = this.f16538b;
        if (interfaceC9154b != null) {
            c9155c.m16364k(interfaceC9154b, th);
        }
        InterfaceC10570l interfaceC10570l = this.f16539c;
        if (interfaceC10570l != null) {
            c9155c.m16365l(interfaceC10570l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8881v)) {
            return false;
        }
        C8881v c8881v = (C8881v) obj;
        return AbstractC9133u.m16128b(this.f16537a, c8881v.f16537a) && AbstractC9133u.m16128b(this.f16538b, c8881v.f16538b) && AbstractC9133u.m16128b(this.f16539c, c8881v.f16539c) && AbstractC9133u.m16128b(this.f16540d, c8881v.f16540d) && AbstractC9133u.m16128b(this.f16541e, c8881v.f16541e);
    }

    public int hashCode() {
        Object obj = this.f16537a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC9154b interfaceC9154b = this.f16538b;
        int iHashCode2 = (iHashCode + (interfaceC9154b == null ? 0 : interfaceC9154b.hashCode())) * 31;
        InterfaceC10570l interfaceC10570l = this.f16539c;
        int iHashCode3 = (iHashCode2 + (interfaceC10570l == null ? 0 : interfaceC10570l.hashCode())) * 31;
        Object obj2 = this.f16540d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f16541e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f16537a + ", cancelHandler=" + this.f16538b + ", onCancellation=" + this.f16539c + ", idempotentResume=" + this.f16540d + ", cancelCause=" + this.f16541e + ')';
    }

    public /* synthetic */ C8881v(Object obj, InterfaceC9154b interfaceC9154b, InterfaceC10570l interfaceC10570l, Object obj2, Throwable th, int i10, AbstractC9126n abstractC9126n) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC9154b, (i10 & 4) != 0 ? null : interfaceC10570l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
