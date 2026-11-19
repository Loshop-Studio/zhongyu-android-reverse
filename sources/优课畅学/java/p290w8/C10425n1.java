package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.n1 */
/* loaded from: classes5.dex */
public final class C10425n1 implements InterfaceC10052b {

    /* renamed from: a */
    public static final C10425n1 f20744a = new C10425n1();

    /* renamed from: b */
    public static final InterfaceC10210f f20745b = C10421m1.f20737a;

    @Override // p246s8.InterfaceC10051a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // p246s8.InterfaceC10059i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC10257f encoder, Void value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return f20745b;
    }
}
