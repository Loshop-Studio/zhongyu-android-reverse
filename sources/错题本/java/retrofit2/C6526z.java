package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.AbstractC6297g0;

/* renamed from: retrofit2.z */
/* loaded from: classes4.dex */
public final class C6526z extends AbstractC6522v {

    /* renamed from: d */
    public final Method f10811d;

    /* renamed from: e */
    public final int f10812e;

    /* renamed from: f */
    public final InterfaceC6506m f10813f;

    public C6526z(Method method, int i, InterfaceC6506m interfaceC6506m) {
        this.f10811d = method;
        this.f10812e = i;
        this.f10813f = interfaceC6506m;
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        int i = this.f10812e;
        Method method = this.f10811d;
        if (obj == null) {
            throw AbstractC6522v.m6172n(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c6503k0.f10721k = (AbstractC6297g0) this.f10813f.convert(obj);
        } catch (IOException e) {
            throw AbstractC6522v.m6173o(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
