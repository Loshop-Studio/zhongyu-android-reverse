package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9968j;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;

/* renamed from: ge.q */
/* loaded from: classes6.dex */
public final class C9368q extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9368q f21783c = new C9368q();

    public C9368q() {
        super(AbstractC9025a.m17665w(C9968j.f23418a));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo18332e(char[] cArr) {
        AbstractC9979u.m20294g(cArr, "<this>");
        return cArr.length;
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] mo18351r() {
        return new char[0];
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9364p builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18509e(decoder.decodeCharElement(getDescriptor(), i10));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9364p mo18337k(char[] cArr) {
        AbstractC9979u.m20294g(cArr, "<this>");
        return new C9364p(cArr);
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo18352u(InterfaceC9227d encoder, char[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeCharElement(getDescriptor(), i11, content[i11]);
        }
    }
}
