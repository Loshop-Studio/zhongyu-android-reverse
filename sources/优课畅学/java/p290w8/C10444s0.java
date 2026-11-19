package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.s0 */
/* loaded from: classes5.dex */
public final class C10444s0 extends AbstractC10394g2 {

    /* renamed from: a */
    public int[] f20768a;

    /* renamed from: b */
    public int f20769b;

    public C10444s0(int[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20768a = bufferWithData;
        this.f20769b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        int[] iArr = this.f20768a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC8323h.m13510e(i10, iArr.length * 2));
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.f20768a = iArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20769b;
    }

    /* renamed from: e */
    public final void m19513e(int i10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        int[] iArr = this.f20768a;
        int iMo19315d = mo19315d();
        this.f20769b = iMo19315d + 1;
        iArr[iMo19315d] = i10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] mo19313a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f20768a, mo19315d());
        AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
