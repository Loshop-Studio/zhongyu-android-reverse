package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9134v;
import p123h7.C8731k;
import p246s8.InterfaceC10052b;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.e3 */
/* loaded from: classes5.dex */
public final class C10385e3 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10385e3 f20680a = new C10385e3();

    /* renamed from: b */
    public static final InterfaceC10210f f20681b = AbstractC10440r0.m19505a("kotlin.ULong", AbstractC10124a.m18885F(C9134v.f17497a));

    /* renamed from: a */
    public long m19380a(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return C8731k.m14278b(decoder.decodeInline(getDescriptor()).decodeLong());
    }

    /* renamed from: b */
    public void m19381b(InterfaceC10257f encoder, long j10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeLong(j10);
    }

    @Override // p246s8.InterfaceC10051a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC10256e interfaceC10256e) {
        return C8731k.m14277a(m19380a(interfaceC10256e));
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20681b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19381b(interfaceC10257f, ((C8731k) obj).m14283g());
    }
}
