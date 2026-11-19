package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.g0 */
/* loaded from: classes4.dex */
public final class C6137g0 implements InterfaceC6125c0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5686b f9802a;

    public C6137g0(InterfaceC5686b interfaceC5686b) {
        this.f9802a = interfaceC5686b;
    }

    @Override // p118m7.InterfaceC6125c0
    public final InterfaceC5686b[] childSerializers() {
        return new InterfaceC5686b[]{this.f9802a};
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        throw new IllegalStateException("unsupported");
    }
}
