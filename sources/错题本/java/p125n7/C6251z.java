package p125n7;

import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.serialization.json.internal.AbstractC6029j;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5763e;
import p101k7.C5766h;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: n7.z */
/* loaded from: classes4.dex */
public final class C6251z implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6251z f9999a = new C6251z();

    /* renamed from: b */
    public static final C5766h f10000b = AbstractC0000a.m7h("kotlinx.serialization.json.JsonPrimitive", C5763e.f9129j, new InterfaceC5765g[0]);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        AbstractC6235j abstractC6235jMo5658a = AbstractC5806u.m5268g(decoder).mo5658a();
        if (abstractC6235jMo5658a instanceof AbstractC6250y) {
            return (AbstractC6250y) abstractC6235jMo5658a;
        }
        throw AbstractC6029j.m5684e("Unexpected JSON element, expected JsonPrimitive, had " + AbstractC5832m.m5340a(abstractC6235jMo5658a.getClass()), abstractC6235jMo5658a.toString(), -1);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f10000b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        AbstractC6250y value = (AbstractC6250y) obj;
        AbstractC5830k.m5330g(value, "value");
        AbstractC5806u.m5265d(interfaceC6072f);
        if (value instanceof C6243r) {
            interfaceC6072f.encodeSerializableValue(C6244s.f9991a, C6243r.INSTANCE);
        } else {
            interfaceC6072f.encodeSerializableValue(C6242q.f9989a, (C6241p) value);
        }
    }
}
