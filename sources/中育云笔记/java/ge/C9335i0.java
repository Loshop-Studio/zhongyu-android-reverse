package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.i0 */
/* loaded from: classes6.dex */
public final class C9335i0 extends AbstractC9327g2 {

    /* renamed from: a */
    public float[] f21738a;

    /* renamed from: b */
    public int f21739b;

    public C9335i0(float[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21738a = bufferWithData;
        this.f21739b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        float[] fArr = this.f21738a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, AbstractC10410o.m21752e(i10, fArr.length * 2));
            AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
            this.f21738a = fArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21739b;
    }

    /* renamed from: e */
    public final void m18449e(float f10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        float[] fArr = this.f21738a;
        int iMo18341d = mo18341d();
        this.f21739b = iMo18341d + 1;
        fArr[iMo18341d] = f10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] mo18339a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f21738a, mo18341d());
        AbstractC9979u.m20293f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
