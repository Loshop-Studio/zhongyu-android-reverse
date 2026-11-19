package p141x2;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4517t;
import p117r2.C4522y;

/* renamed from: x2.i */
/* loaded from: classes2.dex */
public final class C4672i {

    /* renamed from: a */
    public static final C4672i f5981a = new C4672i();

    /* renamed from: a */
    public final String m6595a(C4522y request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m6138g());
        sb.append(' ');
        C4672i c4672i = f5981a;
        if (c4672i.m6596b(request, proxyType)) {
            sb.append(request.m6141j());
        } else {
            sb.append(c4672i.m6597c(request.m6141j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: b */
    public final boolean m6596b(C4522y c4522y, Proxy.Type type) {
        return !c4522y.m6137f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m6597c(C4517t url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strM5983d = url.m5983d();
        String strM5985f = url.m5985f();
        if (strM5985f == null) {
            return strM5983d;
        }
        return strM5983d + '?' + strM5985f;
    }
}
