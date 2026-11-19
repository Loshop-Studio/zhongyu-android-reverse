package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p117r2.C4496a0;
import p117r2.C4517t;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m5175d2 = {"Lcom/zykj/http/interceptor/HeadInterceptor;", "Lr2/u;", "Lr2/u$a;", "chain", "Lr2/a0;", "intercept", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "<init>", "()V", "Companion", C3335ai.f1705at, "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class HeadInterceptor implements InterfaceC4518u {
    public static final String APP_NAME_KEY = "AppName";
    public static final String APP_VERSION_KEY = "AppVersion";
    public static final String AUTH_KEY = "Authorization";
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        TAG = name;
    }

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) {
        C4517t c4517tM6038f;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4522y c4522yMo6045S = chain.mo6045S();
        C4522y.a aVarM6139h = c4522yMo6045S.m6139h();
        HeaderBean value = getHeaderLiveData().getValue();
        if (value != null) {
            Log.i(TAG, String.valueOf(value));
            String appName = value.getAppName();
            if (appName != null) {
                aVarM6139h.m6144c(APP_NAME_KEY, appName);
            }
            String versionCode = value.getVersionCode();
            if (versionCode != null) {
                aVarM6139h.m6144c(APP_VERSION_KEY, versionCode);
            }
            String accessToken = value.getAccessToken();
            if (accessToken != null) {
                if ((accessToken.length() > 0) && (!StringsKt__StringsJVMKt.isBlank(accessToken))) {
                    aVarM6139h.m6144c(AUTH_KEY, Intrinsics.stringPlus("Bearer ", accessToken));
                }
            }
            String serverUrl = value.getServerUrl();
            if (serverUrl != null && (c4517tM6038f = C4517t.f5536l.m6038f(serverUrl)) != null) {
                C4517t.a aVarM5989k = c4517tM6038f.m5989k();
                String string = c4522yMo6045S.m6141j().toString();
                String strStringPlus = StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "?", false, 2, (Object) null) ? Intrinsics.stringPlus("?", StringsKt__StringsKt.split$default((CharSequence) string, new String[]{"?"}, false, 0, 6, (Object) null).get(1)) : "";
                Iterator it = c4522yMo6045S.m6141j().m5991m().iterator();
                while (it.hasNext()) {
                    aVarM5989k.m6000b((String) it.next());
                }
                aVarM6139h.m6149h(aVarM5989k + strStringPlus);
                return chain.mo6046a(aVarM6139h.m6143b());
            }
        }
        return chain.mo6046a(aVarM6139h.m6143b());
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
