package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.uuid.Uuid;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.j3 */
/* loaded from: classes5.dex */
public final class C10410j3 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10410j3 f20724a = new C10410j3();

    /* renamed from: b */
    public static final InterfaceC10210f f20725b = new C10409j2("kotlin.uuid.Uuid", AbstractC10209e.i.f20370a);

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uuid deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return Uuid.f17537c.m16200c(decoder.decodeString());
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, Uuid value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        encoder.encodeString(value.toString());
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20725b;
    }
}
