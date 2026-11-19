package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5433i;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.q1 */
/* loaded from: classes4.dex */
public final class C6168q1 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6168q1 f9851a = new C6168q1();

    /* renamed from: b */
    public static final C6134f0 f9852b = AbstractC6191y0.m5831a("kotlin.UByte", C6145j.f9814a);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return new C5433i(decoder.decodeInline(f9852b).decodeByte());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9852b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        interfaceC6072f.encodeInline(f9852b).encodeByte(((C5433i) obj).f8393a);
    }
}
