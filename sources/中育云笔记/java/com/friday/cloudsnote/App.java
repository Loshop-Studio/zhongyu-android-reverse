package com.friday.cloudsnote;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import androidx.annotation.Keep;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraXConfig;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.blankj.utilcode.util.AbstractC5792j;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ProcessUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.common.helper.C5961a;
import com.friday.common.helper.JudgeException;
import com.tencent.bugly.crashreport.CrashReport;
import com.tendcloud.tenddata.TalkingDataSDK;
import com.zykj.message.client.MessageClient;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9979u;
import me.weishu.reflection.Reflection;
import na.C10341d;
import p033b7.C5172a;
import p141f2.C9167d;
import p158g2.C9261a;
import p382w1.AbstractApplicationC11668i;
import p420y7.AbstractC11916b;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class App extends AbstractApplicationC11668i implements CameraXConfig.Provider {
    public static final int $stable = 8;

    /* renamed from: com.friday.cloudsnote.App$a */
    public static final class C5912a implements CommonCallback {
        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String errorCode, String errorMessage) {
            AbstractC9979u.m20294g(errorCode, "errorCode");
            AbstractC9979u.m20294g(errorMessage, "errorMessage");
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            C5961a.f6080a.m5259a();
        }
    }

    private final void initBugly() {
        CrashReport.initCrashReport(this, "88e0391f9c", false);
    }

    private final void initCloudChannel(Context context) {
        PushServiceFactory.init(this);
        CloudPushService cloudPushService = PushServiceFactory.getCloudPushService();
        cloudPushService.setLogLevel(2);
        cloudPushService.register(context, new C5912a());
    }

    private final void initHelper() {
        Utils.init(this);
        initLogHelper();
        initTalkingData();
        initBugly();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(AbstractC5792j.m3900a("camera", "相机", 4));
        }
    }

    private final void initLogHelper() {
        LogUtils.getConfig().setGlobalTag("cloudsnote");
        LogUtils.getConfig().setLog2FileSwitch(true);
        LogUtils.getConfig().setSaveDays(7);
    }

    private final void initRouter(App app) {
        ARouter.init(app);
    }

    private final void initStrictMode() {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }

    private final void initTalkingData() {
        TalkingDataSDK.init(this, "4B7557A05810477FA563E2397CBCFB3C", "", "");
        TalkingDataSDK.setReportUncaughtExceptions(true);
    }

    private final boolean isMainProcess(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC9979u.m20289b(context.getApplicationContext().getPackageName(), ProcessUtils.getCurrentProcessName());
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        Reflection.m21378b(context);
    }

    @Override // androidx.camera.core.CameraXConfig.Provider
    public CameraXConfig getCameraXConfig() {
        CameraXConfig cameraXConfigBuild = CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig()).setMinimumLoggingLevel(6).build();
        AbstractC9979u.m20293f(cameraXConfigBuild, "build(...)");
        return cameraXConfigBuild;
    }

    @Override // p382w1.AbstractApplicationC11668i, android.app.Application
    public void onCreate() throws IOException, JudgeException {
        super.onCreate();
        if (isMainProcess(this)) {
            initRouter(this);
            initHelper();
            initStrictMode();
            MessageClient.f19777c.mo16542e(this);
            initCloudChannel(this);
            C5172a.m2692h().m2701k(this);
            C9167d.f21407a.m18064b(this);
            C10341d.f24644a.m21627g(this);
            AbstractC11916b.m26462f(this);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        if (C9261a.f21604a.m18258a()) {
            MessageClient.f19777c.mo16547n();
        }
    }
}
