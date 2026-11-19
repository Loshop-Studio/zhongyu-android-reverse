package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.s0 */
/* loaded from: classes6.dex */
public final class C9377s0 extends AbstractC9327g2 {

    /* renamed from: a */
    public int[] f21795a;

    /* renamed from: b */
    public int f21796b;

    public C9377s0(int[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21795a = bufferWithData;
        this.f21796b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        int[] iArr = this.f21795a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC10410o.m21752e(i10, iArr.length * 2));
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.f21795a = iArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21796b;
    }

    /* renamed from: e */
    public final void m18539e(int i10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        int[] iArr = this.f21795a;
        int iMo18341d = mo18341d();
        this.f21796b = iMo18341d + 1;
        iArr[iMo18341d] = i10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] mo18339a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f21795a, mo18341d());
        AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
