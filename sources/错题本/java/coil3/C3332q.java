package coil3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5429e;
import p154s.C6530d;

/* renamed from: coil3.q */
/* loaded from: classes2.dex */
public final class C3332q {

    /* renamed from: a */
    public final Context f2039a;

    /* renamed from: b */
    public final C6530d f2040b;

    /* renamed from: c */
    public final InterfaceC5429e f2041c;

    /* renamed from: d */
    public final InterfaceC5429e f2042d;

    /* renamed from: e */
    public final C3259d f2043e;

    public C3332q(Context context, C6530d c6530d, InterfaceC5429e interfaceC5429e, InterfaceC5429e interfaceC5429e2, C3259d c3259d) {
        this.f2039a = context;
        this.f2040b = c6530d;
        this.f2041c = interfaceC5429e;
        this.f2042d = interfaceC5429e2;
        this.f2043e = c3259d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3332q)) {
            return false;
        }
        C3332q c3332q = (C3332q) obj;
        if (!AbstractC5830k.m5325b(this.f2039a, c3332q.f2039a) || !this.f2040b.equals(c3332q.f2040b) || !this.f2041c.equals(c3332q.f2041c) || !this.f2042d.equals(c3332q.f2042d)) {
            return false;
        }
        Object obj2 = C3296g.f1977a;
        return obj2.equals(obj2) && this.f2043e.equals(c3332q.f2043e);
    }

    public final int hashCode() {
        return (this.f2043e.hashCode() + ((C3296g.f1977a.hashCode() + ((this.f2042d.hashCode() + ((this.f2041c.hashCode() + ((this.f2040b.hashCode() + (this.f2039a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f2039a + ", defaults=" + this.f2040b + ", memoryCacheLazy=" + this.f2041c + ", diskCacheLazy=" + this.f2042d + ", eventListenerFactory=" + C3296g.f1977a + ", componentRegistry=" + this.f2043e + ", logger=null)";
    }
}
