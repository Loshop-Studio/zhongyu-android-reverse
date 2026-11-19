package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p309qc.C10779j;
import p309qc.C10780k;

/* renamed from: ge.a3 */
/* loaded from: classes6.dex */
public final class C9298a3 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9298a3 f21673c = new C9298a3();

    public C9298a3() {
        super(AbstractC9025a.m17638F(C10779j.f25997d));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo18332e(Object obj) {
        return m18353v(((C10780k) obj).m23020p());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18337k(Object obj) {
        return m18356y(((C10780k) obj).m23020p());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo18351r() {
        return C10780k.m23005a(m18354w());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo18352u(InterfaceC9227d interfaceC9227d, Object obj, int i10) {
        m18357z(interfaceC9227d, ((C10780k) obj).m23020p(), i10);
    }

    /* renamed from: v */
    public int m18353v(int[] collectionSize) {
        AbstractC9979u.m20294g(collectionSize, "$this$collectionSize");
        return C10780k.m23012j(collectionSize);
    }

    /* renamed from: w */
    public int[] m18354w() {
        return C10780k.m23006b(0);
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9407z2 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18614e(C10779j.m23000b(decoder.decodeInlineElement(getDescriptor(), i10).decodeInt()));
    }

    /* renamed from: y */
    public C9407z2 m18356y(int[] toBuilder) {
        AbstractC9979u.m20294g(toBuilder, "$this$toBuilder");
        return new C9407z2(toBuilder, null);
    }

    /* renamed from: z */
    public void m18357z(InterfaceC9227d encoder, int[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeInt(C10780k.m23011h(content, i11));
        }
    }
}
