package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.c1 */
/* loaded from: classes5.dex */
public final class C10373c1 extends AbstractC10394g2 {

    /* renamed from: a */
    public long[] f20655a;

    /* renamed from: b */
    public int f20656b;

    public C10373c1(long[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20655a = bufferWithData;
        this.f20656b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        long[] jArr = this.f20655a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC8323h.m13510e(i10, jArr.length * 2));
            AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
            this.f20655a = jArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20656b;
    }

    /* renamed from: e */
    public final void m19347e(long j10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        long[] jArr = this.f20655a;
        int iMo19315d = mo19315d();
        this.f20656b = iMo19315d + 1;
        jArr[iMo19315d] = j10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] mo19313a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20655a, mo19315d());
        AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
