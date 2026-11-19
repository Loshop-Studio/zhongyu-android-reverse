package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.a2 */
/* loaded from: classes4.dex */
public final class C6119a2 implements InterfaceC5686b {

    /* renamed from: b */
    public static final C6119a2 f9775b = new C6119a2();

    /* renamed from: a */
    public final /* synthetic */ C6190y f9776a = new C6190y();

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        this.f9776a.deserialize(decoder);
        return C5443s.f8405a;
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return this.f9776a.getDescriptor();
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C5443s value = (C5443s) obj;
        AbstractC5830k.m5330g(value, "value");
        this.f9776a.serialize(interfaceC6072f, value);
    }
}
