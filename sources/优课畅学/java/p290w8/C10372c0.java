package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.c0 */
/* loaded from: classes5.dex */
public final class C10372c0 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10372c0 f20653a = new C10372c0();

    /* renamed from: b */
    public static final InterfaceC10210f f20654b = new C10409j2("kotlin.Double", AbstractC10209e.d.f20365a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Double.valueOf(decoder.decodeDouble());
    }

    /* renamed from: b */
    public void m19346b(InterfaceC10257f encoder, double d10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeDouble(d10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20654b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19346b(interfaceC10257f, ((Number) obj).doubleValue());
    }
}
