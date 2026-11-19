package ge;

import de.AbstractC9025a;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9967i;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.C10777h;

/* renamed from: ge.y2 */
/* loaded from: classes6.dex */
public final class C9403y2 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9403y2 f21829a = new C9403y2();

    /* renamed from: b */
    public static final InterfaceC9129f f21830b = AbstractC9373r0.m18531a("kotlin.UByte", AbstractC9025a.m17664v(C9967i.f23417a));

    /* renamed from: a */
    public byte m18612a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return C10777h.m22977b(decoder.decodeInline(getDescriptor()).decodeByte());
    }

    /* renamed from: b */
    public void m18613b(InterfaceC9229f encoder, byte b10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeByte(b10);
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        return C10777h.m22976a(m18612a(interfaceC9228e));
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21830b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18613b(interfaceC9229f, ((C10777h) obj).m22981f());
    }
}
