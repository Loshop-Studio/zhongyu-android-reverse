package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.efs.sdk.base.Constants;
import com.umeng.analytics.pro.C3335ai;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.GzipSource;
import okio.Okio;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, m5175d2 = {"Lcom/zykj/http/interceptor/GzipInterceptor;", "Lr2/u;", "Lr2/a0;", "response", "", "isGzipped", "unzip", "Lr2/u$a;", "chain", "intercept", "<init>", "()V", "Companion", C3335ai.f1705at, "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GzipInterceptor implements InterfaceC4518u {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String TAG;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        TAG = name;
    }

    private final boolean isGzipped(C4496a0 response) {
        return C4496a0.m5799i(response, CONTENT_ENCODING, null, 2, null) != null && StringsKt__StringsJVMKt.equals$default(C4496a0.m5799i(response, CONTENT_ENCODING, null, 2, null), Constants.CP_GZIP, false, 2, null);
    }

    private final C4496a0 unzip(C4496a0 response) throws IOException {
        if (response.m5800a() == null) {
            return response;
        }
        AbstractC4498b0 abstractC4498b0M5800a = response.m5800a();
        Intrinsics.checkNotNull(abstractC4498b0M5800a);
        String utf8 = Okio.buffer(new GzipSource(abstractC4498b0M5800a.mo5092f())).readUtf8();
        Log.i(TAG, "response.url=" + response.m5816r().m6141j() + " \n " + utf8);
        AbstractC4498b0.b bVar = AbstractC4498b0.f5320b;
        AbstractC4498b0 abstractC4498b0M5800a2 = response.m5800a();
        return response.m5812n().m5828k(response.m5808j().m5961c().m5970g(CONTENT_ENCODING).m5970g("Content-Length").m5968e()).m5819b(bVar.m5843a(utf8, abstractC4498b0M5800a2 == null ? null : abstractC4498b0M5800a2.mo5091d())).m5830m(response.m5810l()).m5820c();
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4522y.a aVarM6139h = chain.mo6045S().m6139h();
        aVarM6139h.m6142a("Accept-Encoding", Constants.CP_GZIP);
        C4496a0 c4496a0Mo6046a = chain.mo6046a(aVarM6139h.m6143b());
        return isGzipped(c4496a0Mo6046a) ? unzip(c4496a0Mo6046a) : c4496a0Mo6046a;
    }
}
