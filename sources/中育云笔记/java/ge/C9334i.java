package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.i */
/* loaded from: classes6.dex */
public final class C9334i implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9334i f21736a = new C9334i();

    /* renamed from: b */
    public static final InterfaceC9129f f21737b = new C9342j2("kotlin.Boolean", AbstractC9128e.a.f21301a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Boolean.valueOf(decoder.decodeBoolean());
    }

    /* renamed from: b */
    public void m18448b(InterfaceC9229f encoder, boolean z10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeBoolean(z10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21737b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18448b(interfaceC9229f, ((Boolean) obj).booleanValue());
    }
}
