package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.j */
/* loaded from: classes5.dex */
public final class C10406j extends AbstractC10394g2 {

    /* renamed from: a */
    public byte[] f20718a;

    /* renamed from: b */
    public int f20719b;

    public C10406j(byte[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20718a = bufferWithData;
        this.f20719b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        byte[] bArr = this.f20718a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC8323h.m13510e(i10, bArr.length * 2));
            AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
            this.f20718a = bArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20719b;
    }

    /* renamed from: e */
    public final void m19436e(byte b10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        byte[] bArr = this.f20718a;
        int iMo19315d = mo19315d();
        this.f20719b = iMo19315d + 1;
        bArr[iMo19315d] = b10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] mo19313a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f20718a, mo19315d());
        AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
