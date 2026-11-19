package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.bean.HeaderBean;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6384w;
import p058f5.InterfaceC6385x;

@Keep
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/http/interceptor/HeadInterceptor;", "Lf5/x;", "<init>", "()V", "Lf5/x$a;", "chain", "Lf5/d0;", "intercept", "(Lf5/x$a;)Lf5/d0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHeaderBeanFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setHeaderBeanFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getHeaderBeanFlow$annotations", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nHeadInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadInterceptor.kt\ncom/zykj/http/interceptor/HeadInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n*S KotlinDebug\n*F\n+ 1 HeadInterceptor.kt\ncom/zykj/http/interceptor/HeadInterceptor\n*L\n56#1:67,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HeadInterceptor implements InterfaceC6385x {

    @Inject
    public MutableStateFlow<HeaderBean> headerBeanFlow;

    @Inject
    public HeadInterceptor() {
    }

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

    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) {
        C6384w c6384wM6869d;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6358b0 c6358b0Mo6871a = chain.mo6871a();
        C6358b0.a aVarM6585i = c6358b0Mo6871a.m6585i();
        HeaderBean value = getHeaderBeanFlow().getValue();
        String appName = value.getAppName();
        if (appName != null) {
            aVarM6585i.m6603o("AppName", appName);
        }
        String versionCode = value.getVersionCode();
        if (versionCode != null) {
            aVarM6585i.m6603o("AppVersion", versionCode);
        }
        String accessToken = value.getAccessToken();
        if (accessToken != null) {
            aVarM6585i.m6603o(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        }
        String serverUrl = value.getServerUrl();
        if (serverUrl != null && (c6384wM6869d = C6384w.f7965j.m6869d(serverUrl)) != null) {
            C6384w.a aVarM6825j = c6384wM6869d.m6825j();
            String string = c6358b0Mo6871a.m6588l().toString();
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) "?", false, 2, (Object) null)) {
                str = "?" + StringsKt.split$default((CharSequence) string, new String[]{"?"}, false, 0, 6, (Object) null).get(1);
            } else {
                str = "";
            }
            Iterator it = c6358b0Mo6871a.m6588l().m6827l().iterator();
            while (it.hasNext()) {
                aVarM6825j.m6841b((String) it.next());
            }
            aVarM6585i.m6611w(aVarM6825j + str);
        }
        return chain.mo6872b(aVarM6585i.m6591b());
    }

    public final void setHeaderBeanFlow(MutableStateFlow<HeaderBean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.headerBeanFlow = mutableStateFlow;
    }
}
