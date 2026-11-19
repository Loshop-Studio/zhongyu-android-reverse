package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.c0 */
/* loaded from: classes6.dex */
public final class C9305c0 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9305c0 f21680a = new C9305c0();

    /* renamed from: b */
    public static final InterfaceC9129f f21681b = new C9342j2("kotlin.Double", AbstractC9128e.d.f21304a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Double.valueOf(decoder.decodeDouble());
    }

    /* renamed from: b */
    public void m18372b(InterfaceC9229f encoder, double d10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeDouble(d10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21681b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18372b(interfaceC9229f, ((Number) obj).doubleValue());
    }
}
