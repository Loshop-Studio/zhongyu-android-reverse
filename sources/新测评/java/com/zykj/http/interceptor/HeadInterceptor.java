package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.bean.HeaderBean;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p011a9.C0055r;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;

@Keep
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m13558d2 = {"Lcom/zykj/http/interceptor/HeadInterceptor;", "La9/s;", "<init>", "()V", "La9/s$a;", "chain", "La9/y;", "intercept", "(La9/s$a;)La9/y;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHeaderBeanFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setHeaderBeanFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getHeaderBeanFlow$annotations", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHeadInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadInterceptor.kt\ncom/zykj/http/interceptor/HeadInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 HeadInterceptor.kt\ncom/zykj/http/interceptor/HeadInterceptor\n*L\n56#1:67,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HeadInterceptor implements InterfaceC0056s {
    public MutableStateFlow<HeaderBean> headerBeanFlow;

    @HeaderBeanFlow
    public static /* synthetic */ void getHeaderBeanFlow$annotations() {
    }

    public final MutableStateFlow<HeaderBean> getHeaderBeanFlow() {
        MutableStateFlow<HeaderBean> mutableStateFlow = this.headerBeanFlow;
        if (mutableStateFlow != null) {
            return mutableStateFlow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerBeanFlow");
        return null;
    }

    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) {
        C0055r c0055rM261f;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C0060w c0060wMo268a = chain.mo268a();
        C0060w.a aVarM379h = c0060wMo268a.m379h();
        HeaderBean value = getHeaderBeanFlow().getValue();
        String appName = value.getAppName();
        if (appName != null) {
            aVarM379h.m389h("AppName", appName);
        }
        String versionCode = value.getVersionCode();
        if (versionCode != null) {
            aVarM379h.m389h("AppVersion", versionCode);
        }
        String accessToken = value.getAccessToken();
        if (accessToken != null) {
            aVarM379h.m389h(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        }
        String serverUrl = value.getServerUrl();
        if (serverUrl != null && (c0055rM261f = C0055r.f168k.m261f(serverUrl)) != null) {
            C0055r.a aVarM212k = c0055rM261f.m212k();
            String string = c0060wMo268a.m381j().toString();
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) "?", false, 2, (Object) null)) {
                str = "?" + StringsKt.split$default((CharSequence) string, new String[]{"?"}, false, 0, 6, (Object) null).get(1);
            } else {
                str = "";
            }
            Iterator it = c0060wMo268a.m381j().m214m().iterator();
            while (it.hasNext()) {
                aVarM212k.m223b((String) it.next());
            }
            aVarM379h.m396o(aVarM212k + str);
        }
        return chain.mo269b(aVarM379h.m384b());
    }

    public final void setHeaderBeanFlow(MutableStateFlow<HeaderBean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.headerBeanFlow = mutableStateFlow;
    }
}
