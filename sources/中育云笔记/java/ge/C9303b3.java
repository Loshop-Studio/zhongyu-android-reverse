package ge;

import de.AbstractC9025a;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9978t;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.C10779j;

/* renamed from: ge.b3 */
/* loaded from: classes6.dex */
public final class C9303b3 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9303b3 f21678a = new C9303b3();

    /* renamed from: b */
    public static final InterfaceC9129f f21679b = AbstractC9373r0.m18531a("kotlin.UInt", AbstractC9025a.m17668z(C9978t.f23425a));

    /* renamed from: a */
    public int m18367a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return C10779j.m23000b(decoder.decodeInline(getDescriptor()).decodeInt());
    }

    /* renamed from: b */
    public void m18368b(InterfaceC9229f encoder, int i10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeInt(i10);
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        return C10779j.m22999a(m18367a(interfaceC9228e));
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21679b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18368b(interfaceC9229f, ((C10779j) obj).m23004f());
    }
}
