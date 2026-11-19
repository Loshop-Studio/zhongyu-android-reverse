package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8727g;
import p123h7.C8728h;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.x2 */
/* loaded from: classes5.dex */
public final class C10466x2 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10466x2 f20798c = new C10466x2();

    public C10466x2() {
        super(AbstractC10124a.m18908t(C8727g.f16347b));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19306e(Object obj) {
        return m19571v(((C8728h) obj).m14252p());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo19311k(Object obj) {
        return m19574y(((C8728h) obj).m14252p());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19325r() {
        return C8728h.m14237a(m19572w());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19326u(InterfaceC10255d interfaceC10255d, Object obj, int i10) {
        m19575z(interfaceC10255d, ((C8728h) obj).m14252p(), i10);
    }

    /* renamed from: v */
    public int m19571v(byte[] collectionSize) {
        AbstractC9133u.m16133g(collectionSize, "$this$collectionSize");
        return C8728h.m14244j(collectionSize);
    }

    /* renamed from: w */
    public byte[] m19572w() {
        return C8728h.m14238b(0);
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10462w2 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19560e(C8727g.m14232b(decoder.decodeInlineElement(getDescriptor(), i10).decodeByte()));
    }

    /* renamed from: y */
    public C10462w2 m19574y(byte[] toBuilder) {
        AbstractC9133u.m16133g(toBuilder, "$this$toBuilder");
        return new C10462w2(toBuilder, null);
    }

    /* renamed from: z */
    public void m19575z(InterfaceC10255d encoder, byte[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeByte(C8728h.m14243h(content, i11));
        }
    }
}
