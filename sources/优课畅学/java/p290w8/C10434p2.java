package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.p2 */
/* loaded from: classes5.dex */
public final class C10434p2 extends AbstractC10394g2 {

    /* renamed from: a */
    public short[] f20754a;

    /* renamed from: b */
    public int f20755b;

    public C10434p2(short[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20754a = bufferWithData;
        this.f20755b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        short[] sArr = this.f20754a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC8323h.m13510e(i10, sArr.length * 2));
            AbstractC9133u.m16132f(sArrCopyOf, "copyOf(...)");
            this.f20754a = sArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20755b;
    }

    /* renamed from: e */
    public final void m19491e(short s10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        short[] sArr = this.f20754a;
        int iMo19315d = mo19315d();
        this.f20755b = iMo19315d + 1;
        sArr[iMo19315d] = s10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] mo19313a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f20754a, mo19315d());
        AbstractC9133u.m16132f(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
