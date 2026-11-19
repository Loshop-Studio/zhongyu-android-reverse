package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8732l;

/* renamed from: w8.c3 */
/* loaded from: classes5.dex */
public final class C10375c3 extends AbstractC10394g2 {

    /* renamed from: a */
    public long[] f20658a;

    /* renamed from: b */
    public int f20659b;

    public /* synthetic */ C10375c3(long[] jArr, AbstractC9126n abstractC9126n) {
        this(jArr);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo19313a() {
        return C8732l.m14284a(m19350f());
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        if (C8732l.m14291j(this.f20658a) < i10) {
            long[] jArr = this.f20658a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC8323h.m13510e(i10, C8732l.m14291j(jArr) * 2));
            AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
            this.f20658a = C8732l.m14286c(jArrCopyOf);
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20659b;
    }

    /* renamed from: e */
    public final void m19349e(long j10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        long[] jArr = this.f20658a;
        int iMo19315d = mo19315d();
        this.f20659b = iMo19315d + 1;
        C8732l.m14295n(jArr, iMo19315d, j10);
    }

    /* renamed from: f */
    public long[] m19350f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20658a, mo19315d());
        AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
        return C8732l.m14286c(jArrCopyOf);
    }

    public C10375c3(long[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20658a = bufferWithData;
        this.f20659b = C8732l.m14291j(bufferWithData);
        mo19314b(10);
    }
}
