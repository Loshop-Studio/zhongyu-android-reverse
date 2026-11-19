package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8735o;

/* renamed from: w8.f3 */
/* loaded from: classes5.dex */
public final class C10390f3 extends AbstractC10394g2 {

    /* renamed from: a */
    public short[] f20688a;

    /* renamed from: b */
    public int f20689b;

    public /* synthetic */ C10390f3(short[] sArr, AbstractC9126n abstractC9126n) {
        this(sArr);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo19313a() {
        return C8735o.m14307a(m19392f());
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        if (C8735o.m14314j(this.f20688a) < i10) {
            short[] sArr = this.f20688a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC8323h.m13510e(i10, C8735o.m14314j(sArr) * 2));
            AbstractC9133u.m16132f(sArrCopyOf, "copyOf(...)");
            this.f20688a = C8735o.m14309c(sArrCopyOf);
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20689b;
    }

    /* renamed from: e */
    public final void m19391e(short s10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        short[] sArr = this.f20688a;
        int iMo19315d = mo19315d();
        this.f20689b = iMo19315d + 1;
        C8735o.m14318n(sArr, iMo19315d, s10);
    }

    /* renamed from: f */
    public short[] m19392f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f20688a, mo19315d());
        AbstractC9133u.m16132f(sArrCopyOf, "copyOf(...)");
        return C8735o.m14309c(sArrCopyOf);
    }

    public C10390f3(short[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20688a = bufferWithData;
        this.f20689b = C8735o.m14314j(bufferWithData);
        mo19314b(10);
    }
}
