package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p124h8.C8738a;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.d0 */
/* loaded from: classes5.dex */
public final class C10377d0 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10377d0 f20660a = new C10377d0();

    /* renamed from: b */
    public static final InterfaceC10210f f20661b = new C10409j2("kotlin.time.Duration", AbstractC10209e.i.f20370a);

    /* renamed from: a */
    public long m19351a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return C8738a.f16369b.m14367d(decoder.decodeString());
    }

    /* renamed from: b */
    public void m19352b(InterfaceC10257f encoder, long j10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeString(C8738a.m14333F(j10));
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        return C8738a.m14342f(m19351a(interfaceC10256e));
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20661b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19352b(interfaceC10257f, ((C8738a) obj).m14362J());
    }
}
