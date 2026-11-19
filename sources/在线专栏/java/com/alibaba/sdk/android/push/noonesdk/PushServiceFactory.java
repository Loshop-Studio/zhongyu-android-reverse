package com.alibaba.sdk.android.push.noonesdk;

import android.app.Application;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.p020a.C1097b;
import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.p028a.C1154b;
import com.alibaba.sdk.android.push.p028a.C1157e;
import com.alibaba.sdk.android.push.p034e.C1175a;
import com.taobao.accs.ACCSClient;

/* loaded from: classes.dex */
public class PushServiceFactory {
    public static CloudPushService getCloudPushService() {
        return C1154b.m5144a();
    }

    public static PushControlService getPushControlService() {
        return C1157e.m5153a();
    }

    public static void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            C1097b.m4991a((Application) applicationContext);
        }
        C1097b.m4992a(applicationContext);
        C1154b c1154bM5144a = C1154b.m5144a();
        c1154bM5144a.m5150a(applicationContext);
        ACCSClient.enableChannelProcess(applicationContext, true);
        c1154bM5144a.setPushIntentService(null);
        C1175a.m5194a().m5205b();
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            C1097b.m4991a((Application) applicationContext);
        }
        C1097b.m4992a(applicationContext);
        C1154b c1154bM5144a = C1154b.m5144a();
        c1154bM5144a.m5150a(applicationContext);
        c1154bM5144a.setAppkey(str);
        c1154bM5144a.setAppSecret(str2);
        c1154bM5144a.setPushIntentService(null);
        C1175a.m5194a().m5205b();
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z3) {
        ACCSClient.enableChannelProcess(context, z3);
        init(context, str, str2);
    }

    @Deprecated
    public static void init(Context context, boolean z3) {
        ACCSClient.enableChannelProcess(context, z3);
        init(context);
    }

    public static void init(PushInitConfig pushInitConfig) {
        C1097b.m4991a(pushInitConfig.getApplication());
        C1097b.m4992a(pushInitConfig.getApplication().getApplicationContext());
        C1097b.m4994a(pushInitConfig.isDisableForegroundCheck());
        C1097b.m4993a(pushInitConfig.getPushHost());
        C1097b.m4995b(pushInitConfig.getAccsAppConnectHost());
        C1097b.m4996c(pushInitConfig.getAccsSilentConnectHost());
        C1154b c1154bM5144a = C1154b.m5144a();
        c1154bM5144a.m5150a(pushInitConfig.getApplication().getApplicationContext());
        c1154bM5144a.setPushIntentService(null);
        if (pushInitConfig.getAppKey() != null) {
            c1154bM5144a.setAppkey(pushInitConfig.getAppKey());
        }
        if (pushInitConfig.getAppSecret() != null) {
            c1154bM5144a.setAppSecret(pushInitConfig.getAppSecret());
        }
        if (pushInitConfig.getLargeIconDownloadListener() != null) {
            c1154bM5144a.setLargeIconDownloadListener(pushInitConfig.getLargeIconDownloadListener());
        }
        ACCSClient.enableChannelProcess(pushInitConfig.getApplication(), !pushInitConfig.isDisableChannelProcess());
        ACCSClient.enableChannelProcessHeartbeat(pushInitConfig.getApplication(), !pushInitConfig.isDisableChannelProcessHeartbeat());
        C1175a.m5194a().m5204a(pushInitConfig.isLoopStartChannel(), pushInitConfig.getLoopInterval());
    }
}
