package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8729i;
import p123h7.C8730j;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;

/* renamed from: w8.a3 */
/* loaded from: classes5.dex */
public final class C10365a3 extends AbstractC10404i2 implements InterfaceC10052b {

    /* renamed from: c */
    public static final C10365a3 f20646c = new C10365a3();

    public C10365a3() {
        super(AbstractC10124a.m18909u(C8729i.f16352b));
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19306e(Object obj) {
        return m19327v(((C8730j) obj).m14275p());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo19311k(Object obj) {
        return m19330y(((C8730j) obj).m14275p());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19325r() {
        return C8730j.m14260a(m19328w());
    }

    @Override // p290w8.AbstractC10404i2
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19326u(InterfaceC10255d interfaceC10255d, Object obj, int i10) {
        m19331z(interfaceC10255d, ((C8730j) obj).m14275p(), i10);
    }

    /* renamed from: v */
    public int m19327v(int[] collectionSize) {
        AbstractC9133u.m16133g(collectionSize, "$this$collectionSize");
        return C8730j.m14267j(collectionSize);
    }

    /* renamed from: w */
    public int[] m19328w() {
        return C8730j.m14261b(0);
    }

    @Override // p290w8.AbstractC10459w, p290w8.AbstractC10361a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19309h(InterfaceC10254c decoder, int i10, C10474z2 builder, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        AbstractC9133u.m16133g(builder, "builder");
        builder.m19586e(C8729i.m14255b(decoder.decodeInlineElement(getDescriptor(), i10).decodeInt()));
    }

    /* renamed from: y */
    public C10474z2 m19330y(int[] toBuilder) {
        AbstractC9133u.m16133g(toBuilder, "$this$toBuilder");
        return new C10474z2(toBuilder, null);
    }

    /* renamed from: z */
    public void m19331z(InterfaceC10255d encoder, int[] content, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeInt(C8730j.m14266h(content, i11));
        }
    }
}
