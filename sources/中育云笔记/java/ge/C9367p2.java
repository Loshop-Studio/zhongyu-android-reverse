package ge;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: ge.p2 */
/* loaded from: classes6.dex */
public final class C9367p2 extends AbstractC9327g2 {

    /* renamed from: a */
    public short[] f21781a;

    /* renamed from: b */
    public int f21782b;

    public C9367p2(short[] bufferWithData) {
        AbstractC9979u.m20294g(bufferWithData, "bufferWithData");
        this.f21781a = bufferWithData;
        this.f21782b = bufferWithData.length;
        mo18340b(10);
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: b */
    public void mo18340b(int i10) {
        short[] sArr = this.f21781a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC10410o.m21752e(i10, sArr.length * 2));
            AbstractC9979u.m20293f(sArrCopyOf, "copyOf(...)");
            this.f21781a = sArrCopyOf;
        }
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: d */
    public int mo18341d() {
        return this.f21782b;
    }

    /* renamed from: e */
    public final void m18517e(short s10) {
        AbstractC9327g2.m18429c(this, 0, 1, null);
        short[] sArr = this.f21781a;
        int iMo18341d = mo18341d();
        this.f21782b = iMo18341d + 1;
        sArr[iMo18341d] = s10;
    }

    @Override // ge.AbstractC9327g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] mo18339a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f21781a, mo18341d());
        AbstractC9979u.m20293f(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
