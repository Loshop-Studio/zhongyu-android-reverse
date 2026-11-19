package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8728h;

/* renamed from: w8.w2 */
/* loaded from: classes5.dex */
public final class C10462w2 extends AbstractC10394g2 {

    /* renamed from: a */
    public byte[] f20795a;

    /* renamed from: b */
    public int f20796b;

    public /* synthetic */ C10462w2(byte[] bArr, AbstractC9126n abstractC9126n) {
        this(bArr);
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo19313a() {
        return C8728h.m14237a(m19561f());
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: b */
    public void mo19314b(int i10) {
        if (C8728h.m14244j(this.f20795a) < i10) {
            byte[] bArr = this.f20795a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, AbstractC8323h.m13510e(i10, C8728h.m14244j(bArr) * 2));
            AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
            this.f20795a = C8728h.m14239c(bArrCopyOf);
        }
    }

    @Override // p290w8.AbstractC10394g2
    /* renamed from: d */
    public int mo19315d() {
        return this.f20796b;
    }

    /* renamed from: e */
    public final void m19560e(byte b10) {
        AbstractC10394g2.m19403c(this, 0, 1, null);
        byte[] bArr = this.f20795a;
        int iMo19315d = mo19315d();
        this.f20796b = iMo19315d + 1;
        C8728h.m14248n(bArr, iMo19315d, b10);
    }

    /* renamed from: f */
    public byte[] m19561f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f20795a, mo19315d());
        AbstractC9133u.m16132f(bArrCopyOf, "copyOf(...)");
        return C8728h.m14239c(bArrCopyOf);
    }

    public C10462w2(byte[] bufferWithData) {
        AbstractC9133u.m16133g(bufferWithData, "bufferWithData");
        this.f20795a = bufferWithData;
        this.f20796b = C8728h.m14244j(bufferWithData);
        mo19314b(10);
    }
}
