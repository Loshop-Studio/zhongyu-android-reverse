package p203o9;

import java.net.Proxy;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8899b0;
import p136i9.C8925w;

/* renamed from: o9.i */
/* loaded from: classes5.dex */
public final class C9554i {

    /* renamed from: a */
    public static final C9554i f18930a = new C9554i();

    /* renamed from: a */
    public final String m17857a(C8899b0 request, Proxy.Type proxyType) {
        AbstractC9133u.m16133g(request, "request");
        AbstractC9133u.m16133g(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m15048h());
        sb.append(' ');
        C9554i c9554i = f18930a;
        if (c9554i.m17858b(request, proxyType)) {
            sb.append(request.m15052l());
        } else {
            sb.append(c9554i.m17859c(request.m15052l()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean m17858b(C8899b0 c8899b0, Proxy.Type type) {
        return !c8899b0.m15047g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m17859c(C8925w url) {
        AbstractC9133u.m16133g(url, "url");
        String strM15280c = url.m15280c();
        String strM15282e = url.m15282e();
        if (strM15282e == null) {
            return strM15280c;
        }
        return strM15280c + '?' + strM15282e;
    }
}
