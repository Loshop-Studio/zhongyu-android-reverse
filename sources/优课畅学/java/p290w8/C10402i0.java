package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.i0 */
/* loaded from: classes5.dex */
public final class C10402i0 extends AbstractC10394g2 {

    /* renamed from: a */
    public float[] f20711a;

    /* renamed from: b */
    public int f20712b;

    public C10402i0(float[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20711a = bufferWithData;
        this.f20712b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        float[] fArr = this.f20711a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, AbstractC8323h.m13510e(i10, fArr.length * 2));
            AbstractC9133u.m16132f(fArrCopyOf, "copyOf(...)");
            this.f20711a = fArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20712b;
    }

    /* renamed from: e */
    public final void m19423e(float f10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        float[] fArr = this.f20711a;
        int iMo19315d = mo19315d();
        this.f20712b = iMo19315d + 1;
        fArr[iMo19315d] = f10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] mo19313a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f20711a, mo19315d());
        AbstractC9133u.m16132f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
