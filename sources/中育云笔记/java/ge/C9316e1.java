package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.e1 */
/* loaded from: classes6.dex */
public final class C9316e1 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9316e1 f21705a = new C9316e1();

    /* renamed from: b */
    public static final InterfaceC9129f f21706b = new C9342j2("kotlin.Long", AbstractC9128e.g.f21307a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    /* renamed from: b */
    public void m18404b(InterfaceC9229f encoder, long j10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeLong(j10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21706b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18404b(interfaceC9229f, ((Number) obj).longValue());
    }
}
