package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.g */
/* loaded from: classes6.dex */
public final class C9324g extends AbstractC9327g2 {

    /* renamed from: a */
    public boolean[] f21717a;

    /* renamed from: b */
    public int f21718b;

    public C9324g(boolean[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21717a = bufferWithData;
        this.f21718b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        boolean[] zArr = this.f21717a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, AbstractC10410o.m21752e(i10, zArr.length * 2));
            AbstractC9979u.m20293f(zArrCopyOf, "copyOf(...)");
            this.f21717a = zArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21718b;
    }

    /* renamed from: e */
    public final void m18419e(boolean z10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        boolean[] zArr = this.f21717a;
        int iMo18341d = mo18341d();
        this.f21718b = iMo18341d + 1;
        zArr[iMo18341d] = z10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] mo18339a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f21717a, mo18341d());
        AbstractC9979u.m20293f(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
