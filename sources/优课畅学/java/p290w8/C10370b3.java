package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9132t;
import p123h7.C8729i;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.b3 */
/* loaded from: classes5.dex */
public final class C10370b3 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10370b3 f20651a = new C10370b3();

    /* renamed from: b */
    public static final InterfaceC10210f f20652b = AbstractC10440r0.m19505a("kotlin.UInt", AbstractC10124a.m18884E(C9132t.f17496a));

    /* renamed from: a */
    public int m19341a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return C8729i.m14255b(decoder.decodeInline(getDescriptor()).decodeInt());
    }

    /* renamed from: b */
    public void m19342b(InterfaceC10257f encoder, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeInt(i10);
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        return C8729i.m14254a(m19341a(interfaceC10256e));
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20652b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19342b(interfaceC10257f, ((C8729i) obj).m14259f());
    }
}
