package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.c1 */
/* loaded from: classes6.dex */
public final class C9306c1 extends AbstractC9327g2 {

    /* renamed from: a */
    public long[] f21682a;

    /* renamed from: b */
    public int f21683b;

    public C9306c1(long[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21682a = bufferWithData;
        this.f21683b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        long[] jArr = this.f21682a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC10410o.m21752e(i10, jArr.length * 2));
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            this.f21682a = jArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21683b;
    }

    /* renamed from: e */
    public final void m18373e(long j10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        long[] jArr = this.f21682a;
        int iMo18341d = mo18341d();
        this.f21683b = iMo18341d + 1;
        jArr[iMo18341d] = j10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] mo18339a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f21682a, mo18341d());
        AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
