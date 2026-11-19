package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.coroutines.o */
/* loaded from: classes4.dex */
public final class C5986o {

    /* renamed from: a */
    public final Object f9475a;

    /* renamed from: b */
    public final C5892e f9476b;

    /* renamed from: c */
    public final InterfaceC6474f f9477c;

    /* renamed from: d */
    public final Object f9478d;

    /* renamed from: e */
    public final Throwable f9479e;

    public C5986o(Object obj, C5892e c5892e, InterfaceC6474f interfaceC6474f, Object obj2, Throwable th) {
        this.f9475a = obj;
        this.f9476b = c5892e;
        this.f9477c = interfaceC6474f;
        this.f9478d = obj2;
        this.f9479e = th;
    }

    /* renamed from: a */
    public static C5986o m5602a(C5986o c5986o, C5892e c5892e, Throwable th, int i) {
        Object obj = c5986o.f9475a;
        if ((i & 2) != 0) {
            c5892e = c5986o.f9476b;
        }
        C5892e c5892e2 = c5892e;
        InterfaceC6474f interfaceC6474f = c5986o.f9477c;
        Object obj2 = c5986o.f9478d;
        if ((i & 16) != 0) {
            th = c5986o.f9479e;
        }
        c5986o.getClass();
        return new C5986o(obj, c5892e2, interfaceC6474f, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5986o)) {
            return false;
        }
        C5986o c5986o = (C5986o) obj;
        return AbstractC5830k.m5325b(this.f9475a, c5986o.f9475a) && AbstractC5830k.m5325b(this.f9476b, c5986o.f9476b) && AbstractC5830k.m5325b(this.f9477c, c5986o.f9477c) && AbstractC5830k.m5325b(this.f9478d, c5986o.f9478d) && AbstractC5830k.m5325b(this.f9479e, c5986o.f9479e);
    }

    public final int hashCode() {
        Object obj = this.f9475a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C5892e c5892e = this.f9476b;
        int iHashCode2 = (iHashCode + (c5892e == null ? 0 : c5892e.hashCode())) * 31;
        InterfaceC6474f interfaceC6474f = this.f9477c;
        int iHashCode3 = (iHashCode2 + (interfaceC6474f == null ? 0 : interfaceC6474f.hashCode())) * 31;
        Object obj2 = this.f9478d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f9479e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f9475a + ", cancelHandler=" + this.f9476b + ", onCancellation=" + this.f9477c + ", idempotentResume=" + this.f9478d + ", cancelCause=" + this.f9479e + ')';
    }

    public /* synthetic */ C5986o(Object obj, C5892e c5892e, InterfaceC6474f interfaceC6474f, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c5892e, (i & 4) != 0 ? null : interfaceC6474f, (Object) null, (i & 16) != 0 ? null : th);
    }
}
