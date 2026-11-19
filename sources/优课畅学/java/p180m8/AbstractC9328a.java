package p180m8;

import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;

/* renamed from: m8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9328a {

    /* renamed from: a */
    public AbstractC9330c[] f18385a;

    /* renamed from: b */
    public int f18386b;

    /* renamed from: c */
    public int f18387c;

    /* renamed from: d */
    public C9342o f18388d;

    /* renamed from: b */
    public final InterfaceC9280q m17158b() {
        C9342o c9342o;
        synchronized (this) {
            c9342o = this.f18388d;
            if (c9342o == null) {
                c9342o = new C9342o(this.f18386b);
                this.f18388d = c9342o;
            }
        }
        return c9342o;
    }

    /* renamed from: i */
    public final AbstractC9330c m17159i() {
        AbstractC9330c abstractC9330cMo16674j;
        C9342o c9342o;
        synchronized (this) {
            try {
                AbstractC9330c[] abstractC9330cArrMo16675k = this.f18385a;
                if (abstractC9330cArrMo16675k == null) {
                    abstractC9330cArrMo16675k = mo16675k(2);
                    this.f18385a = abstractC9330cArrMo16675k;
                } else if (this.f18386b >= abstractC9330cArrMo16675k.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC9330cArrMo16675k, abstractC9330cArrMo16675k.length * 2);
                    AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
                    this.f18385a = (AbstractC9330c[]) objArrCopyOf;
                    abstractC9330cArrMo16675k = (AbstractC9330c[]) objArrCopyOf;
                }
                int i10 = this.f18387c;
                do {
                    abstractC9330cMo16674j = abstractC9330cArrMo16675k[i10];
                    if (abstractC9330cMo16674j == null) {
                        abstractC9330cMo16674j = mo16674j();
                        abstractC9330cArrMo16675k[i10] = abstractC9330cMo16674j;
                    }
                    i10++;
                    if (i10 >= abstractC9330cArrMo16675k.length) {
                        i10 = 0;
                    }
                    AbstractC9133u.m16131e(abstractC9330cMo16674j, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC9330cMo16674j.mo17050a(this));
                this.f18387c = i10;
                this.f18386b++;
                c9342o = this.f18388d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c9342o != null) {
            c9342o.m17170a0(1);
        }
        return abstractC9330cMo16674j;
    }

    /* renamed from: j */
    public abstract AbstractC9330c mo16674j();

    /* renamed from: k */
    public abstract AbstractC9330c[] mo16675k(int i10);

    /* renamed from: l */
    public final void m17160l(AbstractC9330c abstractC9330c) {
        C9342o c9342o;
        int i10;
        InterfaceC9324c[] interfaceC9324cArrMo17051b;
        synchronized (this) {
            try {
                int i11 = this.f18386b - 1;
                this.f18386b = i11;
                c9342o = this.f18388d;
                if (i11 == 0) {
                    this.f18387c = 0;
                }
                AbstractC9133u.m16131e(abstractC9330c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC9324cArrMo17051b = abstractC9330c.mo17051b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC9324c interfaceC9324c : interfaceC9324cArrMo17051b) {
            if (interfaceC9324c != null) {
                Result.C9076a c9076a = Result.f17350b;
                interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
            }
        }
        if (c9342o != null) {
            c9342o.m17170a0(-1);
        }
    }

    /* renamed from: m */
    public final int m17161m() {
        return this.f18386b;
    }

    /* renamed from: n */
    public final AbstractC9330c[] m17162n() {
        return this.f18385a;
    }
}
