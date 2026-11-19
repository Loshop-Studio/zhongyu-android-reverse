package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p309qc.C10786q;

/* renamed from: ge.i3 */
/* loaded from: classes6.dex */
public final class C9338i3 implements InterfaceC5432b {

    /* renamed from: b */
    public static final C9338i3 f21743b = new C9338i3();

    /* renamed from: a */
    public final /* synthetic */ C9374r1 f21744a = new C9374r1("kotlin.Unit", C10786q.f26013a);

    /* renamed from: a */
    public void m18460a(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        this.f21744a.deserialize(decoder);
    }

    @Override // p049ce.InterfaceC5439i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC9229f encoder, C10786q value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        this.f21744a.serialize(encoder, value);
    }

    @Override // p049ce.InterfaceC5431a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC9228e interfaceC9228e) {
        m18460a(interfaceC9228e);
        return C10786q.f26013a;
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public InterfaceC9129f getDescriptor() {
        return this.f21744a.getDescriptor();
    }
}
