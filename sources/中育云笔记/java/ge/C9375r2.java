package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.r2 */
/* loaded from: classes6.dex */
public final class C9375r2 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9375r2 f21793a = new C9375r2();

    /* renamed from: b */
    public static final InterfaceC9129f f21794b = new C9342j2("kotlin.Short", AbstractC9128e.h.f21308a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Short.valueOf(decoder.decodeShort());
    }

    /* renamed from: b */
    public void m18537b(InterfaceC9229f encoder, short s10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeShort(s10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21794b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18537b(interfaceC9229f, ((Number) obj).shortValue());
    }
}
