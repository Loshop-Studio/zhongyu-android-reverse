package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p309qc.C10777h;
import p309qc.C10778i;

/* renamed from: ge.x2 */
/* loaded from: classes6.dex */
public final class C9399x2 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9399x2 f21825c = new C9399x2();

    public C9399x2() {
        super(AbstractC9025a.m17637E(C10777h.f25992d));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo18332e(Object obj) {
        return m18599v(((C10778i) obj).m22997p());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18337k(Object obj) {
        return m18602y(((C10778i) obj).m22997p());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo18351r() {
        return C10778i.m22982a(m18600w());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo18352u(InterfaceC9227d interfaceC9227d, Object obj, int i10) {
        m18603z(interfaceC9227d, ((C10778i) obj).m22997p(), i10);
    }

    /* renamed from: v */
    public int m18599v(byte[] collectionSize) {
        AbstractC9979u.m20294g(collectionSize, "$this$collectionSize");
        return C10778i.m22989j(collectionSize);
    }

    /* renamed from: w */
    public byte[] m18600w() {
        return C10778i.m22983b(0);
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9395w2 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18588e(C10777h.m22977b(decoder.decodeInlineElement(getDescriptor(), i10).decodeByte()));
    }

    /* renamed from: y */
    public C9395w2 m18602y(byte[] toBuilder) {
        AbstractC9979u.m20294g(toBuilder, "$this$toBuilder");
        return new C9395w2(toBuilder, null);
    }

    /* renamed from: z */
    public void m18603z(InterfaceC9227d encoder, byte[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeByte(C10778i.m22988h(content, i11));
        }
    }
}
