package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.j */
/* loaded from: classes6.dex */
public final class C9339j extends AbstractC9327g2 {

    /* renamed from: a */
    public byte[] f21745a;

    /* renamed from: b */
    public int f21746b;

    public C9339j(byte[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21745a = bufferWithData;
        this.f21746b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        byte[] bArr = this.f21745a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC10410o.m21752e(i10, bArr.length * 2));
            AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
            this.f21745a = bArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21746b;
    }

    /* renamed from: e */
    public final void m18462e(byte b10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        byte[] bArr = this.f21745a;
        int iMo18341d = mo18341d();
        this.f21746b = iMo18341d + 1;
        bArr[iMo18341d] = b10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] mo18339a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f21745a, mo18341d());
        AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
