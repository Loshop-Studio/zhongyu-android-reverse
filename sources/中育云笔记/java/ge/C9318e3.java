package ge;

import de.AbstractC9025a;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9980v;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.C10781l;

/* renamed from: ge.e3 */
/* loaded from: classes6.dex */
public final class C9318e3 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9318e3 f21707a = new C9318e3();

    /* renamed from: b */
    public static final InterfaceC9129f f21708b = AbstractC9373r0.m18531a("kotlin.ULong", AbstractC9025a.m17633A(C9980v.f23426a));

    /* renamed from: a */
    public long m18406a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return C10781l.m23023b(decoder.decodeInline(getDescriptor()).decodeLong());
    }

    /* renamed from: b */
    public void m18407b(InterfaceC9229f encoder, long j10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeLong(j10);
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        return C10781l.m23022a(m18406a(interfaceC9228e));
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21708b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18407b(interfaceC9229f, ((C10781l) obj).m23028g());
    }
}
