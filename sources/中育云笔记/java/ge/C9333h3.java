package ge;

import de.AbstractC9025a;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9956a0;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.C10784o;

/* renamed from: ge.h3 */
/* loaded from: classes6.dex */
public final class C9333h3 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9333h3 f21734a = new C9333h3();

    /* renamed from: b */
    public static final InterfaceC9129f f21735b = AbstractC9373r0.m18531a("kotlin.UShort", AbstractC9025a.m17634B(C9956a0.f23405a));

    /* renamed from: a */
    public short m18445a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return C10784o.m23047b(decoder.decodeInline(getDescriptor()).decodeShort());
    }

    /* renamed from: b */
    public void m18446b(InterfaceC9229f encoder, short s10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeShort(s10);
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        return C10784o.m23046a(m18445a(interfaceC9228e));
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21735b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18446b(interfaceC9229f, ((C10784o) obj).m23051f());
    }
}
