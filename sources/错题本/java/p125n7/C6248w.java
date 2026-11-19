package p125n7;

import java.util.Map;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6131e0;
import p118m7.C6156m1;

/* renamed from: n7.w */
/* loaded from: classes4.dex */
public final class C6248w implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6248w f9997a = new C6248w();

    /* renamed from: b */
    public static final C6247v f9998b = C6247v.f9994b;

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        AbstractC5806u.m5268g(decoder);
        return new C6246u((Map) new C6131e0(C6156m1.f9829a, C6238m.f9984a, 1).deserialize(decoder));
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9998b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6246u value = (C6246u) obj;
        AbstractC5830k.m5330g(value, "value");
        AbstractC5806u.m5265d(interfaceC6072f);
        new C6131e0(C6156m1.f9829a, C6238m.f9984a, 1).serialize(interfaceC6072f, value);
    }
}
