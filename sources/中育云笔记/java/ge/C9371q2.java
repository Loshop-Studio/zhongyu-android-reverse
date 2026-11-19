package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9956a0;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.q2 */
/* loaded from: classes6.dex */
public final class C9371q2 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9371q2 f21786c = new C9371q2();

    public C9371q2() {
        super(AbstractC9025a.m17634B(C9956a0.f23405a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(short[] sArr) {
        AbstractC9979u.m20294g(sArr, "<this>");
        return sArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] mo18351r() {
        return new short[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9367p2 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18517e(decoder.decodeShortElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9367p2 mo18337k(short[] sArr) {
        AbstractC9979u.m20294g(sArr, "<this>");
        return new C9367p2(sArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, short[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeShortElement(getDescriptor(), i11, content[i11]);
        }
    }
}
