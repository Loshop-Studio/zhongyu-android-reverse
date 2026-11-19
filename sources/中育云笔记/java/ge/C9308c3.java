package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10782m;

/* renamed from: ge.c3 */
/* loaded from: classes6.dex */
public final class C9308c3 extends AbstractC9327g2 {

    /* renamed from: a */
    public long[] f21685a;

    /* renamed from: b */
    public int f21686b;

    public /* synthetic */ C9308c3(long[] jArr, AbstractC9972n abstractC9972n) {
        this(jArr);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18339a() {
        return C10782m.m23029a(m18376f());
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        if (C10782m.m23036j(this.f21685a) < i10) {
            long[] jArr = this.f21685a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC10410o.m21752e(i10, C10782m.m23036j(jArr) * 2));
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            this.f21685a = C10782m.m23031c(jArrCopyOf);
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21686b;
    }

    /* renamed from: e */
    public final void m18375e(long j10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        long[] jArr = this.f21685a;
        int iMo18341d = mo18341d();
        this.f21686b = iMo18341d + 1;
        C10782m.m23040n(jArr, iMo18341d, j10);
    }

    /* renamed from: f */
    public long[] m18376f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f21685a, mo18341d());
        AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
        return C10782m.m23031c(jArrCopyOf);
    }

    public C9308c3(long[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21685a = bufferWithData;
        this.f21686b = C10782m.m23036j(bufferWithData);
        mo18340b(10);
    }
}
