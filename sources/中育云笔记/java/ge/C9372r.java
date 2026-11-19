package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.r */
/* loaded from: classes6.dex */
public final class C9372r implements InterfaceC5432b {

    /* renamed from: a */
    public static final C9372r f21787a = new C9372r();

    /* renamed from: b */
    public static final InterfaceC9129f f21788b = new C9342j2("kotlin.Char", AbstractC9128e.c.f21303a);

    @Override // p049ce.InterfaceC5431a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return Character.valueOf(decoder.decodeChar());
    }

    /* renamed from: b */
    public void m18530b(InterfaceC9229f encoder, char c10) {
        AbstractC9979u.m20294g(encoder, "encoder");
        encoder.encodeChar(c10);
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return f21788b;
    }

    @Override // p049ce.InterfaceC5439i
    public /* bridge */ /* synthetic */ void serialize(InterfaceC9229f interfaceC9229f, Object obj) {
        m18530b(interfaceC9229f, ((Character) obj).charValue());
    }
}
