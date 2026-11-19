package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.a0 */
/* loaded from: classes5.dex */
public final class C10362a0 extends AbstractC10394g2 {

    /* renamed from: a */
    public double[] f20642a;

    /* renamed from: b */
    public int f20643b;

    public C10362a0(double[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20642a = bufferWithData;
        this.f20643b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        double[] dArr = this.f20642a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, AbstractC8323h.m13510e(i10, dArr.length * 2));
            AbstractC9133u.m16132f(dArrCopyOf, "copyOf(...)");
            this.f20642a = dArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20643b;
    }

    /* renamed from: e */
    public final void m19316e(double d10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        double[] dArr = this.f20642a;
        int iMo19315d = mo19315d();
        this.f20643b = iMo19315d + 1;
        dArr[iMo19315d] = d10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] mo19313a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f20642a, mo19315d());
        AbstractC9133u.m16132f(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
