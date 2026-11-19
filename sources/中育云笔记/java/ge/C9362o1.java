package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.o1 */
/* loaded from: classes6.dex */
public final class C9362o1 implements InterfaceC5432b {

    /* renamed from: a */
    public final InterfaceC5432b f21774a;

    /* renamed from: b */
    public final InterfaceC9129f f21775b;

    public C9362o1(InterfaceC5432b serializer) {
        AbstractC9979u.m20294g(serializer, "serializer");
        this.f21774a = serializer;
        this.f21775b = new C9355m2(serializer.getDescriptor());
    }

    @Override // p049ce.InterfaceC5431a
    public Object deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return decoder.decodeNotNullMark() ? decoder.decodeSerializableValue(this.f21774a) : decoder.decodeNull();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9362o1.class == obj.getClass() && AbstractC9979u.m20289b(this.f21774a, ((C9362o1) obj).f21774a);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21775b;
    }

    public int hashCode() {
        return this.f21774a.hashCode();
    }

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Object obj) {
        AbstractC9979u.m20294g(encoder, "encoder");
        if (obj == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.f21774a, obj);
        }
    }
}
