package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import anet.channel.util.HttpConstant;
import je.AbstractC9746z;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.GzipSource;
import okio.Okio;
import p310qd.AbstractC10819z;

@Keep
/* loaded from: classes6.dex */
public final class GzipInterceptor implements InterfaceC9739s {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final C8579a Companion;
    private static final String TAG;

    /* renamed from: com.zykj.http.interceptor.GzipInterceptor$a */
    public static final class C8579a {
        public /* synthetic */ C8579a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8579a() {
        }
    }

    static {
        C8579a c8579a = new C8579a(null);
        Companion = c8579a;
        String name = c8579a.getClass().getName();
        AbstractC9979u.m20293f(name, "getName(...)");
        TAG = name;
    }

    private final boolean isGzipped(C9745y c9745y) {
        return C9745y.m19626p(c9745y, "Content-Encoding", null, 2, null) != null && AbstractC10819z.m23231D(C9745y.m19626p(c9745y, "Content-Encoding", null, 2, null), HttpConstant.GZIP, false, 2, null);
    }

    private final C9745y unzip(C9745y c9745y) {
        if (c9745y.m19628e() == null) {
            return c9745y;
        }
        AbstractC9746z abstractC9746zM19628e = c9745y.m19628e();
        AbstractC9979u.m20291d(abstractC9746zM19628e);
        String utf8 = Okio.buffer(new GzipSource(abstractC9746zM19628e.source())).readUtf8();
        Log.i(TAG, "response.url=" + c9745y.m19645z().m19592j() + " \n " + utf8);
        AbstractC9746z.b bVar = AbstractC9746z.Companion;
        AbstractC9746z abstractC9746zM19628e2 = c9745y.m19628e();
        return c9745y.m19641v().m19656k(c9745y.m19637r().m19391c().m19402h("Content-Encoding").m19402h("Content-Length").m19400f()).m19647b(bVar.m19667a(utf8, abstractC9746zM19628e2 != null ? abstractC9746zM19628e2.contentType() : null)).m19658m(c9745y.m19639t()).m19648c();
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9979u.m20294g(chain, "chain");
        C9743w.a aVarM19590h = chain.request().m19590h();
        aVarM19590h.m19594a(HttpConstant.ACCEPT_ENCODING, HttpConstant.GZIP);
        C9745y c9745yMo19477a = chain.mo19477a(aVarM19590h.m19595b());
        return isGzipped(c9745yMo19477a) ? unzip(c9745yMo19477a) : c9745yMo19477a;
    }
}
