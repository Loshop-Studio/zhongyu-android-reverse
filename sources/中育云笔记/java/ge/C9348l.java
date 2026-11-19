package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.l */
/* loaded from: classes6.dex */
public final class C9348l implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9348l f21757a = new C9348l();

    /* renamed from: b */
    public static final InterfaceC9129f f21758b = new C9342j2("kotlin.Byte", AbstractC9128e.b.f21302a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    /* renamed from: b */
    public void m18485b(InterfaceC9229f encoder, byte b10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeByte(b10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21758b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18485b(interfaceC9229f, ((Number) obj).byteValue());
    }
}
