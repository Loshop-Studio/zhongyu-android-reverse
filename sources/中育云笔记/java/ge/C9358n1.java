package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.n1 */
/* loaded from: classes6.dex */
public final class C9358n1 implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9358n1 f21771a = new C9358n1();

    /* renamed from: b */
    public static final InterfaceC9129f f21772b = C9354m1.f21764a;

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, Void value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21772b;
    }
}
