package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p058f5.AbstractC6364e0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.InterfaceC6385x;

@Keep
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m7880d2 = {"Lcom/zykj/http/interceptor/GzipInterceptor;", "Lf5/x;", "<init>", "()V", "Lf5/d0;", "response", "", "isGzipped", "(Lf5/d0;)Z", "unzip", "(Lf5/d0;)Lf5/d0;", "Lf5/x$a;", "chain", "intercept", "(Lf5/x$a;)Lf5/d0;", "Companion", "a", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class GzipInterceptor implements InterfaceC6385x {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String TAG;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }

    @Inject
    public GzipInterceptor() {
    }

    private final boolean isGzipped(C6362d0 response) {
        return C6362d0.m6660o(response, "Content-Encoding", null, 2, null) != null && StringsKt.equals$default(C6362d0.m6660o(response, "Content-Encoding", null, 2, null), "gzip", false, 2, null);
    }

    private final C6362d0 unzip(C6362d0 response) {
        if (response.m6661c() == null) {
            return response;
        }
        AbstractC6364e0 abstractC6364e0M6661c = response.m6661c();
        Intrinsics.checkNotNull(abstractC6364e0M6661c);
        String utf8 = Okio.buffer(new GzipSource(abstractC6364e0M6661c.source())).readUtf8();
        Log.i(TAG, "response.url=" + response.m6678x().m6588l() + " \n " + utf8);
        AbstractC6364e0.b bVar = AbstractC6364e0.Companion;
        AbstractC6364e0 abstractC6364e0M6661c2 = response.m6661c();
        return response.m6674t().m6689j(response.m6670p().m6802d().m6813h("Content-Encoding").m6813h(HttpHeaders.CONTENT_LENGTH).m6811f()).m6681b(bVar.m6707e(utf8, abstractC6364e0M6661c2 != null ? abstractC6364e0M6661c2.contentType() : null)).m6691l(response.m6672r()).m6682c();
    }

    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6358b0.a aVarM6585i = chain.mo6871a().m6585i();
        aVarM6585i.m6590a("Accept-Encoding", "gzip");
        C6362d0 c6362d0Mo6872b = chain.mo6872b(aVarM6585i.m6591b());
        return isGzipped(c6362d0Mo6872b) ? unzip(c6362d0Mo6872b) : c6362d0Mo6872b;
    }
}
