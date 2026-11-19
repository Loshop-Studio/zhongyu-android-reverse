package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.p */
/* loaded from: classes6.dex */
public final class C9364p extends AbstractC9327g2 {

    /* renamed from: a */
    public char[] f21776a;

    /* renamed from: b */
    public int f21777b;

    public C9364p(char[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21776a = bufferWithData;
        this.f21777b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        char[] cArr = this.f21776a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC10410o.m21752e(i10, cArr.length * 2));
            AbstractC9979u.m20293f(cArrCopyOf, "copyOf(...)");
            this.f21776a = cArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21777b;
    }

    /* renamed from: e */
    public final void m18509e(char c10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        char[] cArr = this.f21776a;
        int iMo18341d = mo18341d();
        this.f21777b = iMo18341d + 1;
        cArr[iMo18341d] = c10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] mo18339a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f21776a, mo18341d());
        AbstractC9979u.m20293f(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
