package p103g9;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0055r;
import p011a9.C0060w;

/* renamed from: g9.i */
/* loaded from: classes5.dex */
public final class C7608i {

    /* renamed from: a */
    public static final C7608i f12761a = new C7608i();

    /* renamed from: a */
    public final String m12522a(C0060w request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m378g());
        sb.append(' ');
        C7608i c7608i = f12761a;
        if (c7608i.m12523b(request, proxyType)) {
            sb.append(request.m381j());
        } else {
            sb.append(c7608i.m12524c(request.m381j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: b */
    public final boolean m12523b(C0060w c0060w, Proxy.Type type) {
        return !c0060w.m377f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m12524c(C0055r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strM206d = url.m206d();
        String strM208f = url.m208f();
        if (strM208f == null) {
            return strM206d;
        }
        return strM206d + '?' + strM208f;
    }
}
