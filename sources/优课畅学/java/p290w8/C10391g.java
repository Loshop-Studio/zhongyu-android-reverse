package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: w8.g */
/* loaded from: classes5.dex */
public final class C10391g extends AbstractC10394g2 {

    /* renamed from: a */
    public boolean[] f20690a;

    /* renamed from: b */
    public int f20691b;

    public C10391g(boolean[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20690a = bufferWithData;
        this.f20691b = bufferWithData.length;
        mo19314b(10);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        boolean[] zArr = this.f20690a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, AbstractC8323h.m13510e(i10, zArr.length * 2));
            AbstractC9133u.m16132f(zArrCopyOf, "copyOf(...)");
            this.f20690a = zArrCopyOf;
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20691b;
    }

    /* renamed from: e */
    public final void m19393e(boolean z10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        boolean[] zArr = this.f20690a;
        int iMo19315d = mo19315d();
        this.f20691b = iMo19315d + 1;
        zArr[iMo19315d] = z10;
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] mo19313a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f20690a, mo19315d());
        AbstractC9133u.m16132f(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
