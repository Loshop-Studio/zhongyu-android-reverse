package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5436l;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.t1 */
/* loaded from: classes4.dex */
public final class C6177t1 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6177t1 f9867a = new C6177t1();

    /* renamed from: b */
    public static final C6134f0 f9868b = AbstractC6191y0.m5831a("kotlin.UInt", C6146j0.f9816a);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return new C5436l(decoder.decodeInline(f9868b).decodeInt());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9868b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        interfaceC6072f.encodeInline(f9868b).encodeInt(((C5436l) obj).f8398a);
    }
}
