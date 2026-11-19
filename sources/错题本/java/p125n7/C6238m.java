package p125n7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5761c;
import p101k7.C5766h;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: n7.m */
/* loaded from: classes4.dex */
public final class C6238m implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6238m f9984a = new C6238m();

    /* renamed from: b */
    public static final C5766h f9985b = AbstractC0000a.m6g("kotlinx.serialization.json.JsonElement", C5761c.f9120c, new InterfaceC5765g[0], new C6237l(0));

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return AbstractC5806u.m5268g(decoder).mo5658a();
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9985b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        AbstractC6235j value = (AbstractC6235j) obj;
        AbstractC5830k.m5330g(value, "value");
        AbstractC5806u.m5265d(interfaceC6072f);
        if (value instanceof AbstractC6250y) {
            interfaceC6072f.encodeSerializableValue(C6251z.f9999a, value);
        } else if (value instanceof C6246u) {
            interfaceC6072f.encodeSerializableValue(C6248w.f9997a, value);
        } else {
            if (!(value instanceof C6229d)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC6072f.encodeSerializableValue(C6231f.f9973a, value);
        }
    }
}
