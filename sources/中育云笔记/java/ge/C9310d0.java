package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p326rd.C10986a;

/* renamed from: ge.d0 */
/* loaded from: classes6.dex */
public final class C9310d0 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9310d0 f21687a = new C9310d0();

    /* renamed from: b */
    public static final InterfaceC9129f f21688b = new C9342j2("kotlin.time.Duration", AbstractC9128e.i.f21309a);

    /* renamed from: a */
    public long m18377a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return C10986a.f26491d.m24208d(decoder.decodeString());
    }

    /* renamed from: b */
    public void m18378b(InterfaceC9229f encoder, long j10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeString(C10986a.m24174F(j10));
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        return C10986a.m24183f(m18377a(interfaceC9228e));
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21688b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18378b(interfaceC9229f, ((C10986a) obj).m24203J());
    }
}
