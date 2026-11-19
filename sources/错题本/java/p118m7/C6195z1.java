package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5441q;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.z1 */
/* loaded from: classes4.dex */
public final class C6195z1 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6195z1 f9904a = new C6195z1();

    /* renamed from: b */
    public static final C6134f0 f9905b = AbstractC6191y0.m5831a("kotlin.UShort", C6153l1.f9824a);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return new C5441q(decoder.decodeInline(f9905b).decodeShort());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9905b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        interfaceC6072f.encodeInline(f9905b).encodeShort(((C5441q) obj).f8403a);
    }
}
