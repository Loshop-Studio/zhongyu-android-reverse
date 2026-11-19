package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.r2 */
/* loaded from: classes5.dex */
public final class C10442r2 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10442r2 f20766a = new C10442r2();

    /* renamed from: b */
    public static final InterfaceC10210f f20767b = new C10409j2("kotlin.Short", AbstractC10209e.h.f20369a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Short.valueOf(decoder.decodeShort());
    }

    /* renamed from: b */
    public void m19511b(InterfaceC10257f encoder, short s10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeShort(s10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20767b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19511b(interfaceC10257f, ((Number) obj).shortValue());
    }
}
