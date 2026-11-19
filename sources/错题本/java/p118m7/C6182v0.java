package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.SerializationException;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.v0 */
/* loaded from: classes4.dex */
public final class C6182v0 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6182v0 f9876a = new C6182v0();

    /* renamed from: b */
    public static final C6179u0 f9877b = C6179u0.f9871a;

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9877b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        Void value = (Void) obj;
        AbstractC5830k.m5330g(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
