package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8730j;

/* renamed from: w8.z2 */
/* loaded from: classes5.dex */
public final class C10474z2 extends AbstractC10394g2 {

    /* renamed from: a */
    public int[] f20807a;

    /* renamed from: b */
    public int f20808b;

    public /* synthetic */ C10474z2(int[] iArr, AbstractC9126n abstractC9126n) {
        this(iArr);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo19313a() {
        return C8730j.m14260a(m19587f());
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        if (C8730j.m14267j(this.f20807a) < i10) {
            int[] iArr = this.f20807a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC8323h.m13510e(i10, C8730j.m14267j(iArr) * 2));
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.f20807a = C8730j.m14262c(iArrCopyOf);
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20808b;
    }

    /* renamed from: e */
    public final void m19586e(int i10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        int[] iArr = this.f20807a;
        int iMo19315d = mo19315d();
        this.f20808b = iMo19315d + 1;
        C8730j.m14271n(iArr, iMo19315d, i10);
    }

    /* renamed from: f */
    public int[] m19587f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f20807a, mo19315d());
        AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
        return C8730j.m14262c(iArrCopyOf);
    }

    public C10474z2(int[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20807a = bufferWithData;
        this.f20808b = C8730j.m14267j(bufferWithData);
        mo19314b(10);
    }
}
