package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.u0 */
/* loaded from: classes5.dex */
public final class C10452u0 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10452u0 f20783a = new C10452u0();

    /* renamed from: b */
    public static final InterfaceC10210f f20784b = new C10409j2("kotlin.Int", AbstractC10209e.f.f20367a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Integer.valueOf(decoder.decodeInt());
    }

    /* renamed from: b */
    public void m19530b(InterfaceC10257f encoder, int i10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeInt(i10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20784b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19530b(interfaceC10257f, ((Number) obj).intValue());
    }
}
