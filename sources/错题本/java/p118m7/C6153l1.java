package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.C5763e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.l1 */
/* loaded from: classes4.dex */
public final class C6153l1 implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6153l1 f9824a = new C6153l1();

    /* renamed from: b */
    public static final C6132e1 f9825b = new C6132e1("kotlin.Short", C5763e.f9128i);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return Short.valueOf(decoder.decodeShort());
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9825b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        interfaceC6072f.encodeShort(((Number) obj).shortValue());
    }
}
