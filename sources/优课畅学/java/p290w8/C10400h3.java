package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9110a0;
import p123h7.C8734n;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.h3 */
/* loaded from: classes5.dex */
public final class C10400h3 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10400h3 f20707a = new C10400h3();

    /* renamed from: b */
    public static final InterfaceC10210f f20708b = AbstractC10440r0.m19505a("kotlin.UShort", AbstractC10124a.m18886G(C9110a0.f17476a));

    /* renamed from: a */
    public short m19419a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return C8734n.m14302b(decoder.decodeInline(getDescriptor()).decodeShort());
    }

    /* renamed from: b */
    public void m19420b(InterfaceC10257f encoder, short s10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeShort(s10);
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        return C8734n.m14301a(m19419a(interfaceC10256e));
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20708b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19420b(interfaceC10257f, ((C8734n) obj).m14306f());
    }
}
