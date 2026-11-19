package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9121i;
import p123h7.C8727g;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.y2 */
/* loaded from: classes5.dex */
public final class C10470y2 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10470y2 f20802a = new C10470y2();

    /* renamed from: b */
    public static final InterfaceC10210f f20803b = AbstractC10440r0.m19505a("kotlin.UByte", AbstractC10124a.m18880A(C9121i.f17488a));

    /* renamed from: a */
    public byte m19584a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return C8727g.m14232b(decoder.decodeInline(getDescriptor()).decodeByte());
    }

    /* renamed from: b */
    public void m19585b(InterfaceC10257f encoder, byte b10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(b10);
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        return C8727g.m14231a(m19584a(interfaceC10256e));
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20803b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19585b(interfaceC10257f, ((C8727g) obj).m14236f());
    }
}
