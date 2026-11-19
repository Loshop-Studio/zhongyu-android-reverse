package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.r */
/* loaded from: classes5.dex */
public final class C10439r implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10439r f20760a = new C10439r();

    /* renamed from: b */
    public static final InterfaceC10210f f20761b = new C10409j2("kotlin.Char", AbstractC10209e.c.f20364a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Character.valueOf(decoder.decodeChar());
    }

    /* renamed from: b */
    public void m19504b(InterfaceC10257f encoder, char c10) {
        AbstractC9133u.m16133g(encoder, "encoder");
        encoder.encodeChar(c10);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20761b;
    }

    @Override // p246s8.InterfaceC10059i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC10257f interfaceC10257f, Object obj) {
        m19504b(interfaceC10257f, ((Character) obj).charValue());
    }
}
