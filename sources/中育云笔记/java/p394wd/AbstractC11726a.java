package p394wd;

import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p379vd.InterfaceC11612u;
import vc.InterfaceC11588c;

/* renamed from: wd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11726a {

    /* renamed from: c */
    public AbstractC11728c[] f27886c;

    /* renamed from: d */
    public int f27887d;

    /* renamed from: e */
    public int f27888e;

    /* renamed from: f */
    public C11743r f27889f;

    /* renamed from: d */
    public final InterfaceC11612u m25955d() {
        C11743r c11743r;
        synchronized (this) {
            c11743r = this.f27889f;
            if (c11743r == null) {
                c11743r = new C11743r(this.f27887d);
                this.f27889f = c11743r;
            }
        }
        return c11743r;
    }

    /* renamed from: h */
    public final AbstractC11728c m25956h() {
        AbstractC11728c abstractC11728cMo20857i;
        C11743r c11743r;
        synchronized (this) {
            try {
                AbstractC11728c[] abstractC11728cArrMo20858j = this.f27886c;
                if (abstractC11728cArrMo20858j == null) {
                    abstractC11728cArrMo20858j = mo20858j(2);
                    this.f27886c = abstractC11728cArrMo20858j;
                } else if (this.f27887d >= abstractC11728cArrMo20858j.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC11728cArrMo20858j, abstractC11728cArrMo20858j.length * 2);
                    AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                    this.f27886c = (AbstractC11728c[]) objArrCopyOf;
                    abstractC11728cArrMo20858j = (AbstractC11728c[]) objArrCopyOf;
                }
                int i10 = this.f27888e;
                do {
                    abstractC11728cMo20857i = abstractC11728cArrMo20858j[i10];
                    if (abstractC11728cMo20857i == null) {
                        abstractC11728cMo20857i = mo20857i();
                        abstractC11728cArrMo20858j[i10] = abstractC11728cMo20857i;
                    }
                    i10++;
                    if (i10 >= abstractC11728cArrMo20858j.length) {
                        i10 = 0;
                    }
                    AbstractC9979u.m20292e(abstractC11728cMo20857i, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC11728cMo20857i.mo25598a(this));
                this.f27888e = i10;
                this.f27887d++;
                c11743r = this.f27889f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c11743r != null) {
            c11743r.m25971Z(1);
        }
        return abstractC11728cMo20857i;
    }

    /* renamed from: i */
    public abstract AbstractC11728c mo20857i();

    /* renamed from: j */
    public abstract AbstractC11728c[] mo20858j(int i10);

    /* renamed from: k */
    public final void m25957k(AbstractC11728c abstractC11728c) {
        C11743r c11743r;
        int i10;
        InterfaceC11588c[] interfaceC11588cArrMo25599b;
        synchronized (this) {
            try {
                int i11 = this.f27887d - 1;
                this.f27887d = i11;
                c11743r = this.f27889f;
                if (i11 == 0) {
                    this.f27888e = 0;
                }
                AbstractC9979u.m20292e(abstractC11728c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC11588cArrMo25599b = abstractC11728c.mo25599b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC11588c interfaceC11588c : interfaceC11588cArrMo25599b) {
            if (interfaceC11588c != null) {
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
            }
        }
        if (c11743r != null) {
            c11743r.m25971Z(-1);
        }
    }

    /* renamed from: l */
    public final int m25958l() {
        return this.f27887d;
    }

    /* renamed from: m */
    public final AbstractC11728c[] m25959m() {
        return this.f27886c;
    }
}
