package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.o1 */
/* loaded from: classes5.dex */
public final class C10429o1 implements InterfaceC10052b {

    /* renamed from: a */
    public final InterfaceC10052b f20747a;

    /* renamed from: b */
    public final InterfaceC10210f f20748b;

    public C10429o1(InterfaceC10052b serializer) {
        AbstractC9133u.m16133g(serializer, "serializer");
        this.f20747a = serializer;
        this.f20748b = new C10422m2(serializer.getDescriptor());
    }

    @Override // p246s8.InterfaceC10051a
    public Object deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return decoder.decodeNotNullMark() ? decoder.decodeSerializableValue(this.f20747a) : decoder.decodeNull();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10429o1.class == obj.getClass() && AbstractC9133u.m16128b(this.f20747a, ((C10429o1) obj).f20747a);
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public InterfaceC10210f getDescriptor() {
        return this.f20748b;
    }

    public int hashCode() {
        return this.f20747a.hashCode();
    }

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Object obj) {
        AbstractC9133u.m16133g(encoder, "encoder");
        if (obj == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.f20747a, obj);
        }
    }
}
