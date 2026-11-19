package com.zykj.http.interceptor;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p172l8.C8919r;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/http/interceptor/HeadInterceptor;", "Ll8/s;", "<init>", "()V", "Ll8/s$a;", "chain", "Ll8/y;", "intercept", "(Ll8/s$a;)Ll8/y;", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Companion", "a", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class HeadInterceptor implements InterfaceC8920s {
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

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) {
        C8919r c8919rM14017f;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C8924w c8924wMo14024a = chain.mo14024a();
        C8924w.a aVarM14135h = c8924wMo14024a.m14135h();
        HeaderBean value = getHeaderLiveData().getValue();
        if (value != null) {
            Log.i(TAG, String.valueOf(value));
            String appName = value.getAppName();
            if (appName != null) {
                aVarM14135h.m14145h(APP_NAME_KEY, appName);
            }
            String versionCode = value.getVersionCode();
            if (versionCode != null) {
                aVarM14135h.m14145h(APP_VERSION_KEY, versionCode);
            }
            String accessToken = value.getAccessToken();
            if (accessToken != null && accessToken.length() > 0 && !StringsKt.isBlank(accessToken)) {
                aVarM14135h.m14145h("Authorization", Intrinsics.stringPlus("Bearer ", accessToken));
            }
            String serverUrl = value.getServerUrl();
            if (serverUrl != null && (c8919rM14017f = C8919r.f14796k.m14017f(serverUrl)) != null) {
                C8919r.a aVarM13968k = c8919rM14017f.m13968k();
                String string = c8924wMo14024a.m14137j().toString();
                String strStringPlus = StringsKt.contains$default((CharSequence) string, (CharSequence) "?", false, 2, (Object) null) ? Intrinsics.stringPlus("?", StringsKt.split$default((CharSequence) string, new String[]{"?"}, false, 0, 6, (Object) null).get(1)) : "";
                Iterator it = c8924wMo14024a.m14137j().m13970m().iterator();
                while (it.hasNext()) {
                    aVarM13968k.m13979b((String) it.next());
                }
                aVarM14135h.m14151n(aVarM13968k + strStringPlus);
                return chain.mo14025b(aVarM14135h.m14140b());
            }
        }
        return chain.mo14025b(aVarM14135h.m14140b());
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
