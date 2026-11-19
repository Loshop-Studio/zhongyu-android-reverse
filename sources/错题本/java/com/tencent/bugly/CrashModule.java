package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC4127o;
import com.tencent.bugly.proguard.C4044aa;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4060aq;
import com.tencent.bugly.proguard.C4063at;
import com.tencent.bugly.proguard.C4064au;
import com.tencent.bugly.proguard.C4139u;
import com.tencent.bugly.proguard.C4149z;

/* loaded from: classes3.dex */
public class CrashModule extends AbstractC4127o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f3239c;

    /* renamed from: e */
    private static CrashModule f3240e = new CrashModule();

    /* renamed from: a */
    private long f3241a;

    /* renamed from: b */
    private BuglyStrategy.C4032a f3242b;

    /* renamed from: d */
    private boolean f3243d = false;

    /* renamed from: a */
    private synchronized void m2849a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C4044aa.m2888a(context).f3450t = libBuglySOFilePath;
                C4055al.m3021a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f3242b = buglyStrategy.getCrashHandleCallback();
                C4055al.m3021a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f3241a = appReportDelay;
                C4055al.m3021a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f3240e;
        crashModule.f3857id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC4127o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f3243d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC4127o
    public synchronized void init(Context context, boolean z8, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f3243d) {
                    C4055al.m3021a("Initializing crash module.", new Object[0]);
                    C4139u c4139uM3373a = C4139u.m3373a();
                    int i = f3239c + 1;
                    f3239c = i;
                    c4139uM3373a.m3386a(i);
                    this.f3243d = true;
                    CrashReport.setContext(context);
                    m2849a(context, buglyStrategy);
                    C4063at c4063atM3144a = C4063at.m3144a(context, z8, this.f3242b);
                    c4063atM3144a.f3593t.m3172a();
                    if (buglyStrategy != null) {
                        c4063atM3144a.f3589B = buglyStrategy.getCallBackType();
                        c4063atM3144a.f3590C = buglyStrategy.getCloseErrorCallback();
                        C4063at.f3584o = buglyStrategy.isUploadSpotCrash();
                        C4044aa.m2888a(context).f3400S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c4063atM3144a.f3594u.enableCatchAnrTrace();
                        } else {
                            c4063atM3144a.f3594u.disableCatchAnrTrace();
                        }
                    } else {
                        c4063atM3144a.f3594u.enableCatchAnrTrace();
                    }
                    if (C4044aa.m2890b().f3434d.equals(C4149z.m3418a(c4063atM3144a.f3591c))) {
                        c4063atM3144a.f3594u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c4063atM3144a.m3153e();
                    } else {
                        C4055al.m3021a("[crash] Closed native crash monitor!", new Object[0]);
                        c4063atM3144a.m3152d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c4063atM3144a.m3154f();
                    } else {
                        C4055al.m3021a("[crash] Closed ANR monitor!", new Object[0]);
                        c4063atM3144a.m3155g();
                    }
                    if (buglyStrategy != null) {
                        C4063at.f3574e = buglyStrategy.isMerged();
                    }
                    c4063atM3144a.m3147a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c4063atM3144a.f3594u.checkUploadRecordCrash();
                    C4064au.m3161a(context);
                    C4060aq c4060aqM3094a = C4060aq.m3094a();
                    c4060aqM3094a.m3099a("android.net.conn.CONNECTIVITY_CHANGE");
                    c4060aqM3094a.m3098a(context);
                    C4139u c4139uM3373a2 = C4139u.m3373a();
                    int i8 = f3239c - 1;
                    f3239c = i8;
                    c4139uM3373a2.m3386a(i8);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4127o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C4063at c4063atM3143a;
        if (strategyBean == null || (c4063atM3143a = C4063at.m3143a()) == null) {
            return;
        }
        c4063atM3143a.f3593t.m3173a(strategyBean);
        c4063atM3143a.f3594u.onStrategyChanged(strategyBean);
        c4063atM3143a.f3597x.m3196b();
    }
}
