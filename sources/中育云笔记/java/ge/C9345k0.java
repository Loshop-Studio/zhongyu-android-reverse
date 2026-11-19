package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.k0 */
/* loaded from: classes6.dex */
public final class C9345k0 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9345k0 f21754a = new C9345k0();

    /* renamed from: b */
    public static final InterfaceC9129f f21755b = new C9342j2("kotlin.Float", AbstractC9128e.e.f21305a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Float.valueOf(decoder.decodeFloat());
    }

    /* renamed from: b */
    public void m18480b(InterfaceC9229f encoder, float f10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeFloat(f10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21755b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18480b(interfaceC9229f, ((Number) obj).floatValue());
    }
}
