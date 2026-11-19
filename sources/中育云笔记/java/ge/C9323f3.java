package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10785p;

/* renamed from: ge.f3 */
/* loaded from: classes6.dex */
public final class C9323f3 extends AbstractC9327g2 {

    /* renamed from: a */
    public short[] f21715a;

    /* renamed from: b */
    public int f21716b;

    public /* synthetic */ C9323f3(short[] sArr, AbstractC9972n abstractC9972n) {
        this(sArr);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo18339a() {
        return C10785p.m23052a(m18418f());
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        if (C10785p.m23059j(this.f21715a) < i10) {
            short[] sArr = this.f21715a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC10410o.m21752e(i10, C10785p.m23059j(sArr) * 2));
            AbstractC9979u.m20293f(sArrCopyOf, "copyOf(...)");
            this.f21715a = C10785p.m23054c(sArrCopyOf);
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21716b;
    }

    /* renamed from: e */
    public final void m18417e(short s10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        short[] sArr = this.f21715a;
        int iMo18341d = mo18341d();
        this.f21716b = iMo18341d + 1;
        C10785p.m23063n(sArr, iMo18341d, s10);
    }

    /* renamed from: f */
    public short[] m18418f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f21715a, mo18341d());
        AbstractC9979u.m20293f(sArrCopyOf, "copyOf(...)");
        return C10785p.m23054c(sArrCopyOf);
    }

    public C9323f3(short[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21715a = bufferWithData;
        this.f21716b = C10785p.m23059j(bufferWithData);
        mo18340b(10);
    }
}
