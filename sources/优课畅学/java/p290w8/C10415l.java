package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.l */
/* loaded from: classes5.dex */
public final class C10415l implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10415l f20730a = new C10415l();

    /* renamed from: b */
    public static final InterfaceC10210f f20731b = new C10409j2("kotlin.Byte", AbstractC10209e.b.f20363a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    /* renamed from: b */
    public void m19459b(InterfaceC10257f encoder, byte b10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeByte(b10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20731b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19459b(interfaceC10257f, ((Number) obj).byteValue());
    }
}
