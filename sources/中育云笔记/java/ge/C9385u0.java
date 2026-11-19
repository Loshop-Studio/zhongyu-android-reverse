package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.u0 */
/* loaded from: classes6.dex */
public final class C9385u0 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9385u0 f21810a = new C9385u0();

    /* renamed from: b */
    public static final InterfaceC9129f f21811b = new C9342j2("kotlin.Int", AbstractC9128e.f.f21306a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Integer.valueOf(decoder.decodeInt());
    }

    /* renamed from: b */
    public void m18556b(InterfaceC9229f encoder, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeInt(i10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21811b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18556b(interfaceC9229f, ((Number) obj).intValue());
    }
}
