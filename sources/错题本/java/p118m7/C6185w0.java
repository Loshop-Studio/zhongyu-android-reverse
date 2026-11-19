package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.w0 */
/* loaded from: classes4.dex */
public final class C6185w0 implements InterfaceC5686b {

    /* renamed from: a */
    public final InterfaceC5686b f9884a;

    /* renamed from: b */
    public final C6141h1 f9885b;

    public C6185w0(InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(serializer, "serializer");
        this.f9884a = serializer;
        this.f9885b = new C6141h1(serializer.getDescriptor());
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return decoder.decodeNotNullMark() ? decoder.decodeSerializableValue(this.f9884a) : decoder.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6185w0.class == obj.getClass() && AbstractC5830k.m5325b(this.f9884a, ((C6185w0) obj).f9884a);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return this.f9885b;
    }

    public final int hashCode() {
        return this.f9884a.hashCode();
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        if (obj == null) {
            interfaceC6072f.encodeNull();
        } else {
            interfaceC6072f.encodeNotNullMark();
            interfaceC6072f.encodeSerializableValue(this.f9884a, obj);
        }
    }
}
