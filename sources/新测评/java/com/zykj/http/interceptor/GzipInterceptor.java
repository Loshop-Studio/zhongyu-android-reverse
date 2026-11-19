package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p011a9.AbstractC0063z;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;

@Keep
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m13558d2 = {"Lcom/zykj/http/interceptor/GzipInterceptor;", "La9/s;", "<init>", "()V", "La9/y;", "response", "", "isGzipped", "(La9/y;)Z", "unzip", "(La9/y;)La9/y;", "La9/s$a;", "chain", "intercept", "(La9/s$a;)La9/y;", "Companion", "a", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class GzipInterceptor implements InterfaceC0056s {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String TAG;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }

    private final boolean isGzipped(C0062y response) {
        return C0062y.m413n(response, "Content-Encoding", null, 2, null) != null && StringsKt.equals$default(C0062y.m413n(response, "Content-Encoding", null, 2, null), "gzip", false, 2, null);
    }

    private final C0062y unzip(C0062y response) throws IOException {
        if (response.m414a() == null) {
            return response;
        }
        AbstractC0063z abstractC0063zM414a = response.m414a();
        Intrinsics.checkNotNull(abstractC0063zM414a);
        String utf8 = Okio.buffer(new GzipSource(abstractC0063zM414a.source())).readUtf8();
        Log.i(TAG, "response.url=" + response.m431w().m381j() + " \n " + utf8);
        AbstractC0063z.b bVar = AbstractC0063z.Companion;
        AbstractC0063z abstractC0063zM414a2 = response.m414a();
        return response.m427s().m443k(response.m423o().m182c().m193h("Content-Encoding").m193h(HttpHeaders.CONTENT_LENGTH).m191f()).m434b(bVar.m458e(utf8, abstractC0063zM414a2 != null ? abstractC0063zM414a2.contentType() : null)).m445m(response.m425q()).m435c();
    }

    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C0060w.a aVarM379h = chain.mo268a().m379h();
        aVarM379h.m383a("Accept-Encoding", "gzip");
        C0062y c0062yMo269b = chain.mo269b(aVarM379h.m384b());
        return isGzipped(c0062yMo269b) ? unzip(c0062yMo269b) : c0062yMo269b;
    }
}
