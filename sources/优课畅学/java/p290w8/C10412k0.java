package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.k0 */
/* loaded from: classes5.dex */
public final class C10412k0 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10412k0 f20727a = new C10412k0();

    /* renamed from: b */
    public static final InterfaceC10210f f20728b = new C10409j2("kotlin.Float", AbstractC10209e.e.f20366a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Float.valueOf(decoder.decodeFloat());
    }

    /* renamed from: b */
    public void m19454b(InterfaceC10257f encoder, float f10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeFloat(f10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20728b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19454b(interfaceC10257f, ((Number) obj).floatValue());
    }
}
