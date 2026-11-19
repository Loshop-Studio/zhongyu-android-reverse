package p125n7;

import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.JsonDecodingException;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5766h;
import p101k7.C5769k;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: n7.s */
/* loaded from: classes4.dex */
public final class C6244s implements InterfaceC5686b {

    /* renamed from: a */
    public static final C6244s f9991a = new C6244s();

    /* renamed from: b */
    public static final C5766h f9992b = AbstractC0000a.m7h("kotlinx.serialization.json.JsonNull", C5769k.f9145b, new InterfaceC5765g[0]);

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        AbstractC5806u.m5268g(decoder);
        if (decoder.decodeNotNullMark()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.decodeNull();
        return C6243r.INSTANCE;
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return f9992b;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        C6243r value = (C6243r) obj;
        AbstractC5830k.m5330g(value, "value");
        AbstractC5806u.m5265d(interfaceC6072f);
        interfaceC6072f.encodeNull();
    }
}
