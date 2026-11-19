package p125n7;

import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.text.AbstractC5861v;
import kotlin.text.AbstractC5862w;
import kotlinx.serialization.json.internal.AbstractC6029j;
import p000a.AbstractC0000a;
import p045d6.C5438n;
import p073h4.AbstractC5625a;
import p084i7.InterfaceC5686b;
import p101k7.C5763e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6132e1;
import p118m7.C6186w1;

/* renamed from: n7.q */
/* loaded from: classes4.dex */
public final class C6242q implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6242q f9989a = new C6242q();

    /* renamed from: b */
    public static final C6132e1 f9990b = AbstractC0000a.m1b("kotlinx.serialization.json.JsonLiteral", C5763e.f9129j);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        AbstractC6235j abstractC6235jMo5658a = AbstractC5806u.m5268g(decoder).mo5658a();
        if (abstractC6235jMo5658a instanceof C6241p) {
            return (C6241p) abstractC6235jMo5658a;
        }
        throw AbstractC6029j.m5684e("Unexpected JSON element, expected JsonLiteral, had " + AbstractC5832m.m5340a(abstractC6235jMo5658a.getClass()), abstractC6235jMo5658a.toString(), -1);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9990b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6241p value = (C6241p) obj;
        AbstractC5830k.m5330g(value, "value");
        String str = value.f9988b;
        AbstractC5806u.m5265d(interfaceC6072f);
        if (value.f9987a) {
            interfaceC6072f.encodeString(str);
            return;
        }
        Long lM5411E = AbstractC5862w.m5411E(str);
        if (lM5411E != null) {
            interfaceC6072f.encodeLong(lM5411E.longValue());
            return;
        }
        C5438n c5438nM4959s = AbstractC5625a.m4959s(str);
        if (c5438nM4959s != null) {
            interfaceC6072f.encodeInline(C6186w1.f9887b).encodeLong(c5438nM4959s.f8400a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = AbstractC5861v.m5406r(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            interfaceC6072f.encodeDouble(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            interfaceC6072f.encodeBoolean(bool.booleanValue());
        } else {
            interfaceC6072f.encodeString(str);
        }
    }
}
