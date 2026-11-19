package p236r8;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8919r;
import p172l8.C8924w;

/* renamed from: r8.i */
/* loaded from: classes5.dex */
public final class C9447i {

    /* renamed from: a */
    public static final C9447i f16473a = new C9447i();

    /* renamed from: a */
    public final String m15609a(C8924w request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m14134g());
        sb.append(' ');
        C9447i c9447i = f16473a;
        if (c9447i.m15610b(request, proxyType)) {
            sb.append(request.m14137j());
        } else {
            sb.append(c9447i.m15611c(request.m14137j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: b */
    public final boolean m15610b(C8924w c8924w, Proxy.Type type) {
        return !c8924w.m14133f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m15611c(C8919r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strM13962d = url.m13962d();
        String strM13964f = url.m13964f();
        if (strM13964f == null) {
            return strM13962d;
        }
        return strM13962d + '?' + strM13964f;
    }
}
