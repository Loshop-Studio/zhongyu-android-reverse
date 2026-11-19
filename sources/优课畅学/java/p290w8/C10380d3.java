package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8731k;
import p123h7.C8732l;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.d3 */
/* loaded from: classes5.dex */
public final class C10380d3 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10380d3 f20674c = new C10380d3();

    public C10380d3() {
        super(AbstractC10124a.m18910v(C8731k.f16357b));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19306e(Object obj) {
        return m19372v(((C8732l) obj).m14299p());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo19311k(Object obj) {
        return m19375y(((C8732l) obj).m14299p());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19325r() {
        return C8732l.m14284a(m19373w());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19326u(InterfaceC10255d interfaceC10255d, Object obj, int i10) {
        m19376z(interfaceC10255d, ((C8732l) obj).m14299p(), i10);
    }

    /* renamed from: v */
    public int m19372v(long[] collectionSize) {
        AbstractC9133u.m16133g(collectionSize, "$this$collectionSize");
        return C8732l.m14291j(collectionSize);
    }

    /* renamed from: w */
    public long[] m19373w() {
        return C8732l.m14285b(0);
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10375c3 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19349e(C8731k.m14278b(decoder.decodeInlineElement(getDescriptor(), i10).decodeLong()));
    }

    /* renamed from: y */
    public C10375c3 m19375y(long[] toBuilder) {
        AbstractC9133u.m16133g(toBuilder, "$this$toBuilder");
        return new C10375c3(toBuilder, null);
    }

    /* renamed from: z */
    public void m19376z(InterfaceC10255d encoder, long[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeLong(C8732l.m14290h(content, i11));
        }
    }
}
