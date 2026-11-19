package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.e1 */
/* loaded from: classes5.dex */
public final class C10383e1 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10383e1 f20678a = new C10383e1();

    /* renamed from: b */
    public static final InterfaceC10210f f20679b = new C10409j2("kotlin.Long", AbstractC10209e.g.f20368a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    /* renamed from: b */
    public void m19378b(InterfaceC10257f encoder, long j10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeLong(j10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20679b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19378b(interfaceC10257f, ((Number) obj).longValue());
    }
}
