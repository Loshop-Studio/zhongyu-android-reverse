package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5438n;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.w1 */
/* loaded from: classes4.dex */
public final class C6186w1 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6186w1 f9886a = new C6186w1();

    /* renamed from: b */
    public static final C6134f0 f9887b = AbstractC6191y0.m5831a("kotlin.ULong", C6161o0.f9839a);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return new C5438n(decoder.decodeInline(f9887b).decodeLong());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9887b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        interfaceC6072f.encodeInline(f9887b).encodeLong(((C5438n) obj).f8400a);
    }
}
