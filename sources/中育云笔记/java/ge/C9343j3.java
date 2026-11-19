package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.uuid.Uuid;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.j3 */
/* loaded from: classes6.dex */
public final class C9343j3 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9343j3 f21751a = new C9343j3();

    /* renamed from: b */
    public static final InterfaceC9129f f21752b = new C9342j2("kotlin.uuid.Uuid", AbstractC9128e.i.f21309a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Uuid deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Uuid.f23466e.m20360c(decoder.decodeString());
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, Uuid value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.encodeString(value.toString());
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21752b;
    }
}
