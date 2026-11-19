package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8734n;
import p123h7.C8735o;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.g3 */
/* loaded from: classes5.dex */
public final class C10395g3 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10395g3 f20697c = new C10395g3();

    public C10395g3() {
        super(AbstractC10124a.m18911w(C8734n.f16363b));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19306e(Object obj) {
        return m19404v(((C8735o) obj).m14322p());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo19311k(Object obj) {
        return m19407y(((C8735o) obj).m14322p());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19325r() {
        return C8735o.m14307a(m19405w());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19326u(InterfaceC10255d interfaceC10255d, Object obj, int i10) {
        m19408z(interfaceC10255d, ((C8735o) obj).m14322p(), i10);
    }

    /* renamed from: v */
    public int m19404v(short[] collectionSize) {
        AbstractC9133u.m16133g(collectionSize, "$this$collectionSize");
        return C8735o.m14314j(collectionSize);
    }

    /* renamed from: w */
    public short[] m19405w() {
        return C8735o.m14308b(0);
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10390f3 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19391e(C8734n.m14302b(decoder.decodeInlineElement(getDescriptor(), i10).decodeShort()));
    }

    /* renamed from: y */
    public C10390f3 m19407y(short[] toBuilder) {
        AbstractC9133u.m16133g(toBuilder, "$this$toBuilder");
        return new C10390f3(toBuilder, null);
    }

    /* renamed from: z */
    public void m19408z(InterfaceC10255d encoder, short[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeShort(C8735o.m14313h(content, i11));
        }
    }
}
