package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.p */
/* loaded from: classes5.dex */
public final class C10431p extends AbstractC10394g2 {

    /* renamed from: a */
    public char[] f20749a;

    /* renamed from: b */
    public int f20750b;

    public C10431p(char[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20749a = bufferWithData;
        this.f20750b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        char[] cArr = this.f20749a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC8323h.m13510e(i10, cArr.length * 2));
            AbstractC9133u.m16132f(cArrCopyOf, "copyOf(...)");
            this.f20749a = cArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20750b;
    }

    /* renamed from: e */
    public final void m19483e(char c10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        char[] cArr = this.f20749a;
        int iMo19315d = mo19315d();
        this.f20750b = iMo19315d + 1;
        cArr[iMo19315d] = c10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] mo19313a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f20749a, mo19315d());
        AbstractC9133u.m16132f(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
