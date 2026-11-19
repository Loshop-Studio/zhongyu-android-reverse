package p125n7;

import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: n7.f */
/* loaded from: classes4.dex */
public final class C6231f implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6231f f9973a = new C6231f();

    /* renamed from: b */
    public static final C6230e f9974b = C6230e.f9970b;

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        AbstractC5806u.m5268g(decoder);
        return new C6229d((List) AbstractC5806u.m5264c(C6238m.f9984a).deserialize(decoder));
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9974b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6229d value = (C6229d) obj;
        AbstractC5830k.m5330g(value, "value");
        AbstractC5806u.m5265d(interfaceC6072f);
        AbstractC5806u.m5264c(C6238m.f9984a).serialize(interfaceC6072f, value);
    }
}
