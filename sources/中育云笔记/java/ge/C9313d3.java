package ge;

import de.AbstractC9025a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p309qc.C10781l;
import p309qc.C10782m;

/* renamed from: ge.d3 */
/* loaded from: classes6.dex */
public final class C9313d3 extends AbstractC9337i2 implements InterfaceC5432b {

    /* renamed from: c */
    public static final C9313d3 f21701c = new C9313d3();

    public C9313d3() {
        super(AbstractC9025a.m17639G(C10781l.f26002d));
    }

    @Override // ge.AbstractC9294a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo18332e(Object obj) {
        return m18398v(((C10782m) obj).m23044p());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18337k(Object obj) {
        return m18401y(((C10782m) obj).m23044p());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo18351r() {
        return C10782m.m23029a(m18399w());
    }

    @Override // ge.AbstractC9337i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo18352u(InterfaceC9227d interfaceC9227d, Object obj, int i10) {
        m18402z(interfaceC9227d, ((C10782m) obj).m23044p(), i10);
    }

    /* renamed from: v */
    public int m18398v(long[] collectionSize) {
        AbstractC9979u.m20294g(collectionSize, "$this$collectionSize");
        return C10782m.m23036j(collectionSize);
    }

    /* renamed from: w */
    public long[] m18399w() {
        return C10782m.m23030b(0);
    }

    @Override // ge.AbstractC9392w, ge.AbstractC9294a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo18335h(InterfaceC9226c decoder, int i10, C9308c3 builder, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        AbstractC9979u.m20294g(builder, "builder");
        builder.m18375e(C10781l.m23023b(decoder.decodeInlineElement(getDescriptor(), i10).decodeLong()));
    }

    /* renamed from: y */
    public C9308c3 m18401y(long[] toBuilder) {
        AbstractC9979u.m20294g(toBuilder, "$this$toBuilder");
        return new C9308c3(toBuilder, null);
    }

    /* renamed from: z */
    public void m18402z(InterfaceC9227d encoder, long[] content, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeLong(C10782m.m23035h(content, i11));
        }
    }
}
