package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p309qc.C10784o;
import p309qc.C10785p;

/* renamed from: ge.g3 */
/* loaded from: classes6.dex */
public final class C9328g3 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9328g3 f21724c = new C9328g3();

    public C9328g3() {
        super(AbstractC9025a.m17640H(C10784o.f26008d));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo18332e(Object obj) {
        return m18430v(((C10785p) obj).m23067p());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18337k(Object obj) {
        return m18433y(((C10785p) obj).m23067p());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo18351r() {
        return C10785p.m23052a(m18431w());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo18352u(InterfaceC9227d interfaceC9227d, Object obj, int i10) {
        m18434z(interfaceC9227d, ((C10785p) obj).m23067p(), i10);
    }

    /* renamed from: v */
    public int m18430v(short[] collectionSize) {
        AbstractC9979u.m20294g(collectionSize, "$this$collectionSize");
        return C10785p.m23059j(collectionSize);
    }

    /* renamed from: w */
    public short[] m18431w() {
        return C10785p.m23053b(0);
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9323f3 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18417e(C10784o.m23047b(decoder.decodeInlineElement(getDescriptor(), i10).decodeShort()));
    }

    /* renamed from: y */
    public C9323f3 m18433y(short[] toBuilder) {
        AbstractC9979u.m20294g(toBuilder, "$this$toBuilder");
        return new C9323f3(toBuilder, null);
    }

    /* renamed from: z */
    public void m18434z(InterfaceC9227d encoder, short[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeShort(C10785p.m23058h(content, i11));
        }
    }
}
