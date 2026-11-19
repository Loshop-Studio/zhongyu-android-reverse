package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.s2 */
/* loaded from: classes6.dex */
public final class C9379s2 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9379s2 f21799a = new C9379s2();

    /* renamed from: b */
    public static final InterfaceC9129f f21800b = new C9342j2("kotlin.String", AbstractC9128e.i.f21309a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return decoder.decodeString();
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, String value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        encoder.encodeString(value);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21800b;
    }
}
