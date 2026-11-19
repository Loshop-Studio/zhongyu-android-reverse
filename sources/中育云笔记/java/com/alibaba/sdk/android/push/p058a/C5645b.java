package com.alibaba.sdk.android.push.p058a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import anet.channel.util.ALog;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import com.alibaba.sdk.android.crashdefend.CrashDefendApi;
import com.alibaba.sdk.android.crashdefend.CrashDefendCallback;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.IPushPermissionCallback;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.p060c.C5651a;
import com.alibaba.sdk.android.push.p064e.C5666a;
import com.alibaba.sdk.android.push.util.C5689a;
import com.alibaba.sdk.android.push.util.DownloadUtil;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.agoo.p087a.p088a.C7705a;
import com.taobao.agoo.p087a.p088a.C7707c;

/* renamed from: com.alibaba.sdk.android.push.a.b */
/* loaded from: classes3.dex */
public class C5645b implements CloudPushService {

    /* renamed from: a */
    private static final C5645b f4132a = new C5645b();

    /* renamed from: b */
    private C5644a f4133b;

    /* renamed from: c */
    private Context f4134c;

    /* renamed from: f */
    private DownloadUtil.OnLargeIconDownloadListener f4137f;

    /* renamed from: d */
    private boolean f4135d = true;

    /* renamed from: e */
    private boolean f4136e = false;

    /* renamed from: g */
    private boolean f4138g = false;

    /* renamed from: d */
    private void m3600d() {
        if (this.f4133b != null || this.f4134c == null) {
            return;
        }
        this.f4133b = new C5644a(this.f4134c);
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void addAlias(final String str, final CommonCallback commonCallback) {
        m3599a("addAlias", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.29
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3585b(str, commonCallback);
            }
        });
    }

    /* renamed from: b */
    public DownloadUtil.OnLargeIconDownloadListener m3602b() {
        return this.f4137f;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindAccount(final String str, final CommonCallback commonCallback) {
        m3599a("bindAccount", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.24
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3577a(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindPhoneNumber(final String str, final CommonCallback commonCallback) {
        m3599a("bindPhoneNumber", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.20
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3591d(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindTag(final int i10, final String[] strArr, final String str, final CommonCallback commonCallback) {
        m3599a("bindTag", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.26
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3571a(i10, strArr, str, commonCallback);
            }
        });
    }

    /* renamed from: c */
    public boolean m3603c() {
        return this.f4138g;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void checkPushChannelStatus(final CommonCallback commonCallback) {
        m3599a("checkPushChannelStatus", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.16
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3593f(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void clearNotifications() {
        m3599a("clearNotifications", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.13
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3579b();
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void clickMessage(final CPushMessage cPushMessage) {
        m3599a("clickMessage", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.18
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3574a(cPushMessage);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void closeDoNotDisturbMode() {
        m3599a("closeDoNotDisturbMode", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3578a(false);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void dismissMessage(final CPushMessage cPushMessage) {
        m3599a("dismissMessage", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.17
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3583b(cPushMessage);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public String getDeviceId() {
        if (m3599a("getDeviceId", (CommonCallback) null, (Runnable) null)) {
            return this.f4133b.m3566a();
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public String getUTDeviceId() {
        if (m3599a("getUTDeviceId", (CommonCallback) null, (Runnable) null)) {
            return this.f4133b.m3567a(this.f4134c);
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void listAliases(final CommonCallback commonCallback) {
        m3599a("listAlias", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3582b(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void listTags(final int i10, final CommonCallback commonCallback) {
        m3599a("listTags", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.28
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3570a(i10, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void onAppStart() {
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public synchronized void register(final Context context, final CommonCallback commonCallback) {
        if (context != null) {
            m3599a(C7707c.JSON_CMD_REGISTER, commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.12
                @Override // java.lang.Runnable
                public void run() {
                    ALog.setUseTlog(false);
                    ACCSClient.changeNetworkSdkLoggerToAccs();
                    C5645b.this.m3596a(context, commonCallback);
                }
            });
            return;
        }
        AmsLogger.getImportantLogger().m3420e("context null");
        if (commonCallback != null) {
            ErrorCode errorCodeBuild = C5654c.f4258q.copy().detail("register context null").build();
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void removeAlias(final String str, final CommonCallback commonCallback) {
        m3599a(C7705a.JSON_CMD_REMOVEALIAS, commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3589c(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void requestNotificationPermission(Activity activity, int i10, IPushPermissionCallback iPushPermissionCallback) {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") != -1) {
            return;
        }
        if (ContextCompat.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") != -1) {
            if (iPushPermissionCallback != null) {
                iPushPermissionCallback.onPushPermissionGranted();
            }
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.POST_NOTIFICATIONS")) {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, i10);
        } else if (iPushPermissionCallback != null) {
            iPushPermissionCallback.onPushPermissionForbidden();
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setAppSecret(final String str) {
        m3599a("setAppSecret", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.11
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3588c(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setAppkey(final String str) {
        m3599a("setAppKey", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.10
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3584b(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setBadgeNum(Context context, int i10) {
        C5689a.m3817a(context, i10);
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setDebug(final boolean z10) {
        m3599a("setDebug", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.22
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3586b(z10);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setDoNotDisturb(final int i10, final int i11, final int i12, final int i13, final CommonCallback commonCallback) {
        m3599a("setDoNotDisturb", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3569a(i10, i11, i12, i13, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setEnableCrashDefend(boolean z10) {
        this.f4136e = z10;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setLargeIconDownloadListener(DownloadUtil.OnLargeIconDownloadListener onLargeIconDownloadListener) {
        this.f4137f = onLargeIconDownloadListener;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setLogLevel(final int i10) {
        m3599a("setLogLevel", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                AmsLogger.log_level = i10;
                ALog.setUseTlog(false);
                ACCSClient.changeNetworkSdkLoggerToAccs();
                int i11 = i10;
                if (i11 == -1) {
                    AccsLogger.enable(false);
                    ALog.setLevel(5);
                    return;
                }
                if (i11 == 0 || i11 == 2 || i11 == 1) {
                    AccsLogger.enable(true);
                    int i12 = i10;
                    if (i12 == 0) {
                        AccsLogger.setLevel(LogLevel.WARN);
                        ALog.setLevel(3);
                    } else if (i12 != 1) {
                        AccsLogger.setLevel(LogLevel.DEBUG);
                        ALog.setLevel(0);
                    } else {
                        AccsLogger.setLevel(LogLevel.INFO);
                        ALog.setLevel(2);
                    }
                }
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationLargeIcon(final Bitmap bitmap) {
        m3599a("setNotificationLargeIcon", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.8
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3572a(bitmap);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationShowInGroup(boolean z10) {
        this.f4138g = z10;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationSmallIcon(final int i10) {
        m3599a("setNotificationSmallIcon", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.9
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3568a(i10);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationSoundFilePath(final String str) {
        m3599a("setNotificationSoundFilePath", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3576a(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setPushIntentService(final Class cls) {
        m3599a("setPushIntentService", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.19
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3575a(cls);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void turnOffPushChannel(final CommonCallback commonCallback) {
        m3599a("turnOffPushChannel", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.15
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3590d(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void turnOnPushChannel(final CommonCallback commonCallback) {
        m3599a("turnOnPushChannel", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.14
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3592e(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindAccount(final CommonCallback commonCallback) {
        m3599a("unbindAccount", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.25
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3573a(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindPhoneNumber(final CommonCallback commonCallback) {
        m3599a("unbindPhoneNumber", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.21
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3587c(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindTag(final int i10, final String[] strArr, final String str, final CommonCallback commonCallback) {
        m3599a("unBindTag", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.27
            @Override // java.lang.Runnable
            public void run() {
                C5645b.this.f4133b.m3580b(i10, strArr, str, commonCallback);
            }
        });
    }

    /* renamed from: a */
    public static C5645b m3595a() {
        return f4132a;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void register(Context context, String str, String str2, CommonCallback commonCallback) {
        if (commonCallback != null) {
            ErrorCode errorCodeBuild = C5654c.f4263v.copy().msg("请使用PushServiceFactory.init(Context appContext, String appKey, String appSecret)动态设置appKey appSecret").build();
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    /* renamed from: a */
    public void m3601a(Context context) {
        AmsLogger.getImportantLogger().m3423i("Initialize Mobile Push service...");
        this.f4134c = context;
        if (this.f4133b == null) {
            this.f4133b = new C5644a(context);
        }
        if (this.f4136e) {
            CrashDefendApi.registerCrashDefendSdk(context, "push", "3.9.5", 10, 5, new CrashDefendCallback() { // from class: com.alibaba.sdk.android.push.a.b.1
                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkClosed(int i10) {
                    AmsLogger.getImportantLogger().m3420e("crash limit exceeds, close forever");
                    C5645b.this.f4135d = false;
                }

                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkStart(int i10, int i11, int i12) {
                    C5645b.this.f4135d = true;
                }

                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkStop(int i10, int i11, int i12, long j10) {
                    AmsLogger.getImportantLogger().m3420e("crash limit exceeds");
                    C5645b.this.f4135d = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m3596a(final Context context, final CommonCallback commonCallback) {
        AmsLogger.getImportantLogger().m3423i("call register");
        C5666a.m3645a().m3653a(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.b.23
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                commonCallback.onFailed(str, str2);
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                commonCallback.onSuccess(str);
                C5645b.this.f4133b.m3581b(context);
            }
        });
        C5651a.m3611a(context).m3612a(C5575c.m3411a().mo3399a());
    }

    /* renamed from: a */
    private boolean m3599a(String str, CommonCallback commonCallback, Runnable runnable) {
        if (this.f4134c == null) {
            AmsLogger.getImportantLogger().m3420e("please call PushServiceFactory.init first");
            if (commonCallback != null) {
                ErrorCode errorCodeBuild = C5654c.f4262u.copy().detail(str).build();
                commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
            return false;
        }
        m3600d();
        if (this.f4135d) {
            if (runnable == null) {
                return true;
            }
            runnable.run();
            return true;
        }
        AmsLogger.getImportantLogger().m3420e("push disabled");
        if (commonCallback != null) {
            ErrorCode errorCodeBuild2 = C5654c.f4261t.copy().detail(str).build();
            commonCallback.onFailed(errorCodeBuild2.getCode(), errorCodeBuild2.getMsg());
        }
        return false;
    }
}
