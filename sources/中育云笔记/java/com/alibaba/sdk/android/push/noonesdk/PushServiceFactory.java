package com.alibaba.sdk.android.push.noonesdk;

import android.app.Application;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.p050a.C5572b;
import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.p058a.C5645b;
import com.alibaba.sdk.android.push.p058a.C5648e;
import com.alibaba.sdk.android.push.p064e.C5666a;
import com.taobao.accs.ACCSClient;

/* loaded from: classes3.dex */
public class PushServiceFactory {
    public static CloudPushService getCloudPushService() {
        return C5645b.m3595a();
    }

    public static PushControlService getPushControlService() {
        return C5648e.m3604a();
    }

    public static void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            C5572b.m3392a((Application) applicationContext);
        }
        C5572b.m3393a(applicationContext);
        C5645b c5645bM3595a = C5645b.m3595a();
        c5645bM3595a.m3601a(applicationContext);
        ACCSClient.enableChannelProcess(applicationContext, true);
        c5645bM3595a.setPushIntentService(null);
        C5666a.m3645a().m3656b();
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            C5572b.m3392a((Application) applicationContext);
        }
        C5572b.m3393a(applicationContext);
        C5645b c5645bM3595a = C5645b.m3595a();
        c5645bM3595a.m3601a(applicationContext);
        c5645bM3595a.setAppkey(str);
        c5645bM3595a.setAppSecret(str2);
        c5645bM3595a.setPushIntentService(null);
        C5666a.m3645a().m3656b();
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z10) {
        ACCSClient.enableChannelProcess(context, z10);
        init(context, str, str2);
    }

    @Deprecated
    public static void init(Context context, boolean z10) {
        ACCSClient.enableChannelProcess(context, z10);
        init(context);
    }

    public static void init(PushInitConfig pushInitConfig) {
        C5572b.m3392a(pushInitConfig.getApplication());
        C5572b.m3393a(pushInitConfig.getApplication().getApplicationContext());
        C5572b.m3395a(pushInitConfig.isDisableForegroundCheck());
        C5572b.m3394a(pushInitConfig.getPushHost());
        C5572b.m3396b(pushInitConfig.getAccsAppConnectHost());
        C5572b.m3397c(pushInitConfig.getAccsSilentConnectHost());
        C5645b c5645bM3595a = C5645b.m3595a();
        c5645bM3595a.m3601a(pushInitConfig.getApplication().getApplicationContext());
        c5645bM3595a.setPushIntentService(null);
        if (pushInitConfig.getAppKey() != null) {
            c5645bM3595a.setAppkey(pushInitConfig.getAppKey());
        }
        if (pushInitConfig.getAppSecret() != null) {
            c5645bM3595a.setAppSecret(pushInitConfig.getAppSecret());
        }
        if (pushInitConfig.getLargeIconDownloadListener() != null) {
            c5645bM3595a.setLargeIconDownloadListener(pushInitConfig.getLargeIconDownloadListener());
        }
        ACCSClient.enableChannelProcess(pushInitConfig.getApplication(), !pushInitConfig.isDisableChannelProcess());
        ACCSClient.enableChannelProcessHeartbeat(pushInitConfig.getApplication(), !pushInitConfig.isDisableChannelProcessHeartbeat());
        C5666a.m3645a().m3655a(pushInitConfig.isLoopStartChannel(), pushInitConfig.getLoopInterval());
    }
}
