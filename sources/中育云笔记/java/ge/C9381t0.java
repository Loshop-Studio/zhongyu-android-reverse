package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9978t;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.t0 */
/* loaded from: classes6.dex */
public final class C9381t0 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9381t0 f21805c = new C9381t0();

    public C9381t0() {
        super(AbstractC9025a.m17668z(C9978t.f23425a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return iArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] mo18351r() {
        return new int[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9377s0 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18539e(decoder.decodeIntElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9377s0 mo18337k(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<this>");
        return new C9377s0(iArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, int[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeIntElement(getDescriptor(), i11, content[i11]);
        }
    }
}
