package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.i */
/* loaded from: classes5.dex */
public final class C10401i implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10401i f20709a = new C10401i();

    /* renamed from: b */
    public static final InterfaceC10210f f20710b = new C10409j2("kotlin.Boolean", AbstractC10209e.a.f20362a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Boolean.valueOf(decoder.decodeBoolean());
    }

    /* renamed from: b */
    public void m19422b(InterfaceC10257f encoder, boolean z10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeBoolean(z10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20710b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19422b(interfaceC10257f, ((Boolean) obj).booleanValue());
    }
}
