package p102l5;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6358b0;
import p058f5.C6384w;

/* renamed from: l5.i */
/* loaded from: classes4.dex */
public final class C7355i {

    /* renamed from: a */
    public static final C7355i f9343a = new C7355i();

    /* renamed from: a */
    public final String m8352a(C6358b0 request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m6584h());
        sb.append(' ');
        C7355i c7355i = f9343a;
        if (c7355i.m8353b(request, proxyType)) {
            sb.append(request.m6588l());
        } else {
            sb.append(c7355i.m8354c(request.m6588l()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean m8353b(C6358b0 c6358b0, Proxy.Type type) {
        return !c6358b0.m6583g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m8354c(C6384w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strM6819c = url.m6819c();
        String strM6821e = url.m6821e();
        if (strM6821e == null) {
            return strM6819c;
        }
        return strM6819c + '?' + strM6821e;
    }
}
