package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10780k;

/* renamed from: ge.z2 */
/* loaded from: classes6.dex */
public final class C9407z2 extends AbstractC9327g2 {

    /* renamed from: a */
    public int[] f21834a;

    /* renamed from: b */
    public int f21835b;

    public /* synthetic */ C9407z2(int[] iArr, AbstractC9972n abstractC9972n) {
        this(iArr);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18339a() {
        return C10780k.m23005a(m18615f());
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        if (C10780k.m23012j(this.f21834a) < i10) {
            int[] iArr = this.f21834a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC10410o.m21752e(i10, C10780k.m23012j(iArr) * 2));
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.f21834a = C10780k.m23007c(iArrCopyOf);
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21835b;
    }

    /* renamed from: e */
    public final void m18614e(int i10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        int[] iArr = this.f21834a;
        int iMo18341d = mo18341d();
        this.f21835b = iMo18341d + 1;
        C10780k.m23016n(iArr, iMo18341d, i10);
    }

    /* renamed from: f */
    public int[] m18615f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f21834a, mo18341d());
        AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
        return C10780k.m23007c(iArrCopyOf);
    }

    public C9407z2(int[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21834a = bufferWithData;
        this.f21835b = C10780k.m23012j(bufferWithData);
        mo18340b(10);
    }
}
