package com.zykj.subscriber.application;

import android.app.Application;
import android.util.Log;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushInitConfig;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p178z1.EnumC3509b;

/* loaded from: classes.dex */
public final class MyApplication extends Application {

    /* renamed from: com.zykj.subscriber.application.MyApplication$a */
    public static final class C2433a implements CommonCallback {
        C2433a() {
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(@NotNull String errorCode, @NotNull String errorMessage) {
            C2769l.m9241e(errorCode, "errorCode");
            C2769l.m9241e(errorMessage, "errorMessage");
            Log.d("MyApplication", "init cloudchannel failed -- errorcode:" + errorCode + " -- errorMessage:" + errorMessage);
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(@Nullable String str) {
            Log.d("MyApplication", "init cloudchannel success");
        }
    }

    /* renamed from: a */
    private final void m8122a() {
        PushServiceFactory.init(new PushInitConfig.Builder().application(this).appKey("333433497").appSecret("af2e50cc50d14195a13e794879e099a9").build());
        PushServiceFactory.getCloudPushService().register(getApplicationContext(), new C2433a());
    }

    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate();
        m8122a();
        EnumC3509b.f12309a.mo10702h(this);
        UMConfigure.setLogEnabled(false);
        UMConfigure.setProcessEvent(true);
        UMConfigure.init(this, "5ee035c9978eea085d11e556", "Browser", 1, null);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        EnumC3509b.f12309a.mo10703i();
    }
}
