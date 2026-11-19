package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.efs.sdk.base.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import p172l8.AbstractC8927z;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m13413d2 = {"Lcom/zykj/http/interceptor/GzipInterceptor;", "Ll8/s;", "<init>", "()V", "Ll8/y;", "response", "", "isGzipped", "(Ll8/y;)Z", "unzip", "(Ll8/y;)Ll8/y;", "Ll8/s$a;", "chain", "intercept", "(Ll8/s$a;)Ll8/y;", "Companion", "a", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class GzipInterceptor implements InterfaceC8920s {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String TAG;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        TAG = name;
    }

    private final boolean isGzipped(C8926y response) {
        return C8926y.m14169n(response, "Content-Encoding", null, 2, null) != null && StringsKt.equals$default(C8926y.m14169n(response, "Content-Encoding", null, 2, null), Constants.CP_GZIP, false, 2, null);
    }

    private final C8926y unzip(C8926y response) throws IOException {
        if (response.m14170a() == null) {
            return response;
        }
        AbstractC8927z abstractC8927zM14170a = response.m14170a();
        Intrinsics.checkNotNull(abstractC8927zM14170a);
        String utf8 = Okio.buffer(new GzipSource(abstractC8927zM14170a.source())).readUtf8();
        Log.i(TAG, "response.url=" + response.m14187w().m14137j() + " \n " + utf8);
        AbstractC8927z.b bVar = AbstractC8927z.Companion;
        AbstractC8927z abstractC8927zM14170a2 = response.m14170a();
        return response.m14183s().m14199k(response.m14179o().m13938c().m13949h("Content-Encoding").m13949h(HttpHeaders.CONTENT_LENGTH).m13947f()).m14190b(bVar.m14210a(utf8, abstractC8927zM14170a2 == null ? null : abstractC8927zM14170a2.contentType())).m14201m(response.m14181q()).m14191c();
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C8924w.a aVarM14135h = chain.mo14024a().m14135h();
        aVarM14135h.m14139a("Accept-Encoding", Constants.CP_GZIP);
        C8926y c8926yMo14025b = chain.mo14025b(aVarM14135h.m14140b());
        return isGzipped(c8926yMo14025b) ? unzip(c8926yMo14025b) : c8926yMo14025b;
    }
}
