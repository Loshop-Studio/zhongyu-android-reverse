package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9967i;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.k */
/* loaded from: classes6.dex */
public final class C9344k extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9344k f21753c = new C9344k();

    public C9344k() {
        super(AbstractC9025a.m17664v(C9967i.f23417a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(byte[] bArr) {
        AbstractC9979u.m20294g(bArr, "<this>");
        return bArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] mo18351r() {
        return new byte[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9339j builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18462e(decoder.decodeByteElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9339j mo18337k(byte[] bArr) {
        AbstractC9979u.m20294g(bArr, "<this>");
        return new C9339j(bArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, byte[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeByteElement(getDescriptor(), i11, content[i11]);
        }
    }
}
