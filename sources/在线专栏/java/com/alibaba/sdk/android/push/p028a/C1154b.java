package com.alibaba.sdk.android.push.p028a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.C0320a;
import androidx.core.content.C0332a;
import anet.channel.util.ALog;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import com.alibaba.sdk.android.crashdefend.CrashDefendApi;
import com.alibaba.sdk.android.crashdefend.CrashDefendCallback;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.IPushPermissionCallback;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.p030c.C1160a;
import com.alibaba.sdk.android.push.p034e.C1175a;
import com.alibaba.sdk.android.push.util.C1190a;
import com.alibaba.sdk.android.push.util.DownloadUtil;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.agoo.p066a.p067a.C1806a;
import com.taobao.agoo.p066a.p067a.C1808c;

/* renamed from: com.alibaba.sdk.android.push.a.b */
/* loaded from: classes.dex */
public class C1154b implements CloudPushService {

    /* renamed from: a */
    private static final C1154b f6608a = new C1154b();

    /* renamed from: b */
    private C1153a f6609b;

    /* renamed from: c */
    private Context f6610c;

    /* renamed from: f */
    private DownloadUtil.OnLargeIconDownloadListener f6613f;

    /* renamed from: d */
    private boolean f6611d = true;

    /* renamed from: e */
    private boolean f6612e = false;

    /* renamed from: g */
    private boolean f6614g = false;

    /* renamed from: a */
    public static C1154b m5144a() {
        return f6608a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5145a(final Context context, final CommonCallback commonCallback) {
        AmsLogger.getImportantLogger().m5022i("call register");
        C1175a.m5194a().m5202a(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.b.23
            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onFailed(String str, String str2) {
                commonCallback.onFailed(str, str2);
            }

            @Override // com.alibaba.sdk.android.push.CommonCallback
            public void onSuccess(String str) {
                commonCallback.onSuccess(str);
                C1154b.this.f6609b.m5130b(context);
            }
        });
        C1160a.m5160a(context).m5161a(C1100c.m5010a().mo4998a());
    }

    /* renamed from: a */
    private boolean m5148a(String str, CommonCallback commonCallback, Runnable runnable) {
        if (this.f6610c == null) {
            AmsLogger.getImportantLogger().m5019e("please call PushServiceFactory.init first");
            if (commonCallback != null) {
                ErrorCode errorCodeBuild = C1163c.f6738u.copy().detail(str).build();
                commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
            return false;
        }
        m5149d();
        if (this.f6611d) {
            if (runnable == null) {
                return true;
            }
            runnable.run();
            return true;
        }
        AmsLogger.getImportantLogger().m5019e("push disabled");
        if (commonCallback != null) {
            ErrorCode errorCodeBuild2 = C1163c.f6737t.copy().detail(str).build();
            commonCallback.onFailed(errorCodeBuild2.getCode(), errorCodeBuild2.getMsg());
        }
        return false;
    }

    /* renamed from: d */
    private void m5149d() {
        if (this.f6609b != null || this.f6610c == null) {
            return;
        }
        this.f6609b = new C1153a(this.f6610c);
    }

    /* renamed from: a */
    public void m5150a(Context context) {
        AmsLogger.getImportantLogger().m5022i("Initialize Mobile Push service...");
        this.f6610c = context;
        if (this.f6609b == null) {
            this.f6609b = new C1153a(context);
        }
        if (this.f6612e) {
            CrashDefendApi.registerCrashDefendSdk(context, "push", "3.10.1", 10, 5, new CrashDefendCallback() { // from class: com.alibaba.sdk.android.push.a.b.1
                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkClosed(int i4) {
                    AmsLogger.getImportantLogger().m5019e("crash limit exceeds, close forever");
                    C1154b.this.f6611d = false;
                }

                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkStart(int i4, int i5, int i6) {
                    C1154b.this.f6611d = true;
                }

                @Override // com.alibaba.sdk.android.crashdefend.CrashDefendCallback
                public void onSdkStop(int i4, int i5, int i6, long j4) {
                    AmsLogger.getImportantLogger().m5019e("crash limit exceeds");
                    C1154b.this.f6611d = false;
                }
            });
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void addAlias(final String str, final CommonCallback commonCallback) {
        m5148a("addAlias", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.29
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5134b(str, commonCallback);
            }
        });
    }

    /* renamed from: b */
    public DownloadUtil.OnLargeIconDownloadListener m5151b() {
        return this.f6613f;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindAccount(final String str, final CommonCallback commonCallback) {
        m5148a("bindAccount", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.24
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5126a(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindPhoneNumber(final String str, final CommonCallback commonCallback) {
        m5148a("bindPhoneNumber", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.20
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5140d(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void bindTag(final int i4, final String[] strArr, final String str, final CommonCallback commonCallback) {
        m5148a("bindTag", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.26
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5120a(i4, strArr, str, commonCallback);
            }
        });
    }

    /* renamed from: c */
    public boolean m5152c() {
        return this.f6614g;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void checkPushChannelStatus(final CommonCallback commonCallback) {
        m5148a("checkPushChannelStatus", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.16
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5142f(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void clearNotifications() {
        m5148a("clearNotifications", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.13
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5128b();
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void clickMessage(final CPushMessage cPushMessage) {
        m5148a("clickMessage", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.18
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5123a(cPushMessage);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void closeDoNotDisturbMode() {
        m5148a("closeDoNotDisturbMode", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5127a(false);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void dismissMessage(final CPushMessage cPushMessage) {
        m5148a("dismissMessage", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.17
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5132b(cPushMessage);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public String getDeviceId() {
        if (m5148a("getDeviceId", (CommonCallback) null, (Runnable) null)) {
            return this.f6609b.m5115a();
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public String getUTDeviceId() {
        if (m5148a("getUTDeviceId", (CommonCallback) null, (Runnable) null)) {
            return this.f6609b.m5116a(this.f6610c);
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void listAliases(final CommonCallback commonCallback) {
        m5148a("listAlias", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5131b(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void listTags(final int i4, final CommonCallback commonCallback) {
        m5148a("listTags", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.28
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5119a(i4, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void onAppStart() {
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public synchronized void register(final Context context, final CommonCallback commonCallback) {
        if (context != null) {
            m5148a(C1808c.JSON_CMD_REGISTER, commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.12
                @Override // java.lang.Runnable
                public void run() {
                    ALog.setUseTlog(false);
                    ACCSClient.changeNetworkSdkLoggerToAccs();
                    C1154b.this.m5145a(context, commonCallback);
                }
            });
            return;
        }
        AmsLogger.getImportantLogger().m5019e("context null");
        if (commonCallback != null) {
            ErrorCode errorCodeBuild = C1163c.f6734q.copy().detail("register context null").build();
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void register(Context context, String str, String str2, CommonCallback commonCallback) {
        if (commonCallback != null) {
            ErrorCode errorCodeBuild = C1163c.f6739v.copy().msg("请使用PushServiceFactory.init(Context appContext, String appKey, String appSecret)动态设置appKey appSecret").build();
            commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void removeAlias(final String str, final CommonCallback commonCallback) {
        m5148a(C1806a.JSON_CMD_REMOVEALIAS, commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5138c(str, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void requestNotificationPermission(Activity activity, int i4, IPushPermissionCallback iPushPermissionCallback) {
        if (Build.VERSION.SDK_INT < 33 || C0332a.m1803a(activity, "android.permission.POST_NOTIFICATIONS") != -1) {
            return;
        }
        if (!(C0332a.m1803a(activity, "android.permission.POST_NOTIFICATIONS") == -1)) {
            if (iPushPermissionCallback != null) {
                iPushPermissionCallback.onPushPermissionGranted();
            }
        } else if (!C0320a.m1761q(activity, "android.permission.POST_NOTIFICATIONS")) {
            C0320a.m1758n(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, i4);
        } else if (iPushPermissionCallback != null) {
            iPushPermissionCallback.onPushPermissionForbidden();
        }
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setAppSecret(final String str) {
        m5148a("setAppSecret", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.11
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5137c(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setAppkey(final String str) {
        m5148a("setAppKey", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.10
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5133b(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setBadgeNum(Context context, int i4) {
        C1190a.m5365a(context, i4);
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setDebug(final boolean z3) {
        m5148a("setDebug", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.22
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5135b(z3);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setDoNotDisturb(final int i4, final int i5, final int i6, final int i7, final CommonCallback commonCallback) {
        m5148a("setDoNotDisturb", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5118a(i4, i5, i6, i7, commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setEnableCrashDefend(boolean z3) {
        this.f6612e = z3;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setLargeIconDownloadListener(DownloadUtil.OnLargeIconDownloadListener onLargeIconDownloadListener) {
        this.f6613f = onLargeIconDownloadListener;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setLogLevel(final int i4) {
        m5148a("setLogLevel", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                AmsLogger.log_level = i4;
                int i5 = 0;
                ALog.setUseTlog(false);
                ACCSClient.changeNetworkSdkLoggerToAccs();
                int i6 = i4;
                if (i6 == -1) {
                    AccsLogger.enable(false);
                    i5 = 5;
                } else {
                    if (i6 != 0 && i6 != 2 && i6 != 1) {
                        return;
                    }
                    AccsLogger.enable(true);
                    int i7 = i4;
                    if (i7 == 0) {
                        AccsLogger.setLevel(LogLevel.WARN);
                        i5 = 3;
                    } else {
                        if (i7 == 1) {
                            AccsLogger.setLevel(LogLevel.INFO);
                            ALog.setLevel(2);
                            return;
                        }
                        AccsLogger.setLevel(LogLevel.DEBUG);
                    }
                }
                ALog.setLevel(i5);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationLargeIcon(final Bitmap bitmap) {
        m5148a("setNotificationLargeIcon", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.8
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5121a(bitmap);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationShowInGroup(boolean z3) {
        this.f6614g = z3;
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationSmallIcon(final int i4) {
        m5148a("setNotificationSmallIcon", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.9
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5117a(i4);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setNotificationSoundFilePath(final String str) {
        m5148a("setNotificationSoundFilePath", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5125a(str);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void setPushIntentService(final Class cls) {
        m5148a("setPushIntentService", (CommonCallback) null, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.19
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5124a(cls);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void turnOffPushChannel(final CommonCallback commonCallback) {
        m5148a("turnOffPushChannel", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.15
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5139d(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void turnOnPushChannel(final CommonCallback commonCallback) {
        m5148a("turnOnPushChannel", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.14
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5141e(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindAccount(final CommonCallback commonCallback) {
        m5148a("unbindAccount", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.25
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5122a(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindPhoneNumber(final CommonCallback commonCallback) {
        m5148a("unbindPhoneNumber", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.21
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5136c(commonCallback);
            }
        });
    }

    @Override // com.alibaba.sdk.android.push.CloudPushService
    public void unbindTag(final int i4, final String[] strArr, final String str, final CommonCallback commonCallback) {
        m5148a("unBindTag", commonCallback, new Runnable() { // from class: com.alibaba.sdk.android.push.a.b.27
            @Override // java.lang.Runnable
            public void run() {
                C1154b.this.f6609b.m5129b(i4, strArr, str, commonCallback);
            }
        });
    }
}
