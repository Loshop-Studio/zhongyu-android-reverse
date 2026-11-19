package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10778i;

/* renamed from: ge.w2 */
/* loaded from: classes6.dex */
public final class C9395w2 extends AbstractC9327g2 {

    /* renamed from: a */
    public byte[] f21822a;

    /* renamed from: b */
    public int f21823b;

    public /* synthetic */ C9395w2(byte[] bArr, AbstractC9972n abstractC9972n) {
        this(bArr);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18339a() {
        return C10778i.m22982a(m18589f());
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        if (C10778i.m22989j(this.f21822a) < i10) {
            byte[] bArr = this.f21822a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC10410o.m21752e(i10, C10778i.m22989j(bArr) * 2));
            AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
            this.f21822a = C10778i.m22984c(bArrCopyOf);
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21823b;
    }

    /* renamed from: e */
    public final void m18588e(byte b10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        byte[] bArr = this.f21822a;
        int iMo18341d = mo18341d();
        this.f21823b = iMo18341d + 1;
        C10778i.m22993n(bArr, iMo18341d, b10);
    }

    /* renamed from: f */
    public byte[] m18589f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f21822a, mo18341d());
        AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
        return C10778i.m22984c(bArrCopyOf);
    }

    public C9395w2(byte[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21822a = bufferWithData;
        this.f21823b = C10778i.m22989j(bufferWithData);
        mo18340b(10);
    }
}
