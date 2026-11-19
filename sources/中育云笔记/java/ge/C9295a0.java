package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.a0 */
/* loaded from: classes6.dex */
public final class C9295a0 extends AbstractC9327g2 {

    /* renamed from: a */
    public double[] f21669a;

    /* renamed from: b */
    public int f21670b;

    public C9295a0(double[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21669a = bufferWithData;
        this.f21670b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        double[] dArr = this.f21669a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, AbstractC10410o.m21752e(i10, dArr.length * 2));
            AbstractC9979u.m20293f(dArrCopyOf, "copyOf(...)");
            this.f21669a = dArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21670b;
    }

    /* renamed from: e */
    public final void m18342e(double d10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        double[] dArr = this.f21669a;
        int iMo18341d = mo18341d();
        this.f21670b = iMo18341d + 1;
        dArr[iMo18341d] = d10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] mo18339a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f21669a, mo18341d());
        AbstractC9979u.m20293f(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
