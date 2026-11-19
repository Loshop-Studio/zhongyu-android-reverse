package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.s2 */
/* loaded from: classes5.dex */
public final class C10446s2 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10446s2 f20772a = new C10446s2();

    /* renamed from: b */
    public static final InterfaceC10210f f20773b = new C10409j2("kotlin.String", AbstractC10209e.i.f20370a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return decoder.decodeString();
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, String value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        encoder.encodeString(value);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20773b;
    }
}
