package pe;

import java.net.Proxy;
import je.C9738r;
import je.C9743w;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pe.i */
/* loaded from: classes6.dex */
public final class C10682i {

    /* renamed from: a */
    public static final C10682i f25746a = new C10682i();

    /* renamed from: a */
    public final String m22635a(C9743w request, Proxy.Type proxyType) {
        AbstractC9979u.m20294g(request, "request");
        AbstractC9979u.m20294g(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m19589g());
        sb2.append(' ');
        C10682i c10682i = f25746a;
        if (c10682i.m22636b(request, proxyType)) {
            sb2.append(request.m19592j());
        } else {
            sb2.append(c10682i.m22637c(request.m19592j()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: b */
    public final boolean m22636b(C9743w c9743w, Proxy.Type type) {
        return !c9743w.m19588f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m22637c(C9738r url) {
        AbstractC9979u.m20294g(url, "url");
        String strM19415d = url.m19415d();
        String strM19417f = url.m19417f();
        if (strM19417f == null) {
            return strM19415d;
        }
        return strM19415d + '?' + strM19417f;
    }
}
