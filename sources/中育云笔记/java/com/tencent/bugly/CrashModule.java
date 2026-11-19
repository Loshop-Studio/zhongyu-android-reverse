package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC7829o;
import com.tencent.bugly.proguard.C7768aa;
import com.tencent.bugly.proguard.C7779al;
import com.tencent.bugly.proguard.C7784aq;
import com.tencent.bugly.proguard.C7787at;
import com.tencent.bugly.proguard.C7788au;
import com.tencent.bugly.proguard.C7835u;
import com.tencent.bugly.proguard.C7840z;

/* loaded from: classes5.dex */
public class CrashModule extends AbstractC7829o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f13447c;

    /* renamed from: e */
    private static CrashModule f13448e = new CrashModule();

    /* renamed from: a */
    private long f13449a;

    /* renamed from: b */
    private BuglyStrategy.C7753a f13450b;

    /* renamed from: d */
    private boolean f13451d = false;

    /* renamed from: a */
    private synchronized void m10440a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C7768aa.m10478a(context).f13653t = libBuglySOFilePath;
                C7779al.m10613a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f13450b = buglyStrategy.getCrashHandleCallback();
                C7779al.m10613a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f13449a = appReportDelay;
                C7779al.m10613a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f13448e;
        crashModule.f14075id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC7829o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f13451d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC7829o
    public synchronized void init(Context context, boolean z10, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f13451d) {
                    C7779al.m10613a("Initializing crash module.", new Object[0]);
                    C7835u c7835uM10966a = C7835u.m10966a();
                    int i10 = f13447c + 1;
                    f13447c = i10;
                    c7835uM10966a.m10979a(i10);
                    this.f13451d = true;
                    CrashReport.setContext(context);
                    m10440a(context, buglyStrategy);
                    C7787at c7787atM10737a = C7787at.m10737a(context, z10, this.f13450b);
                    c7787atM10737a.f13819t.m10765a();
                    if (buglyStrategy != null) {
                        c7787atM10737a.f13815B = buglyStrategy.getCallBackType();
                        c7787atM10737a.f13816C = buglyStrategy.getCloseErrorCallback();
                        C7787at.f13810o = buglyStrategy.isUploadSpotCrash();
                        C7768aa.m10478a(context).f13603S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c7787atM10737a.f13820u.enableCatchAnrTrace();
                        } else {
                            c7787atM10737a.f13820u.disableCatchAnrTrace();
                        }
                    } else {
                        c7787atM10737a.f13820u.enableCatchAnrTrace();
                    }
                    if (C7768aa.m10480b().f13637d.equals(C7840z.m11012a(c7787atM10737a.f13817c))) {
                        c7787atM10737a.f13820u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c7787atM10737a.m10746e();
                    } else {
                        C7779al.m10613a("[crash] Closed native crash monitor!", new Object[0]);
                        c7787atM10737a.m10745d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c7787atM10737a.m10747f();
                    } else {
                        C7779al.m10613a("[crash] Closed ANR monitor!", new Object[0]);
                        c7787atM10737a.m10748g();
                    }
                    if (buglyStrategy != null) {
                        C7787at.f13800e = buglyStrategy.isMerged();
                    }
                    c7787atM10737a.m10740a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c7787atM10737a.f13820u.checkUploadRecordCrash();
                    C7788au.m10754a(context);
                    C7784aq c7784aqM10686a = C7784aq.m10686a();
                    c7784aqM10686a.m10691a("android.net.conn.CONNECTIVITY_CHANGE");
                    c7784aqM10686a.m10690a(context);
                    C7835u c7835uM10966a2 = C7835u.m10966a();
                    int i11 = f13447c - 1;
                    f13447c = i11;
                    c7835uM10966a2.m10979a(i11);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7829o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C7787at c7787atM10736a;
        if (strategyBean == null || (c7787atM10736a = C7787at.m10736a()) == null) {
            return;
        }
        c7787atM10736a.f13819t.m10766a(strategyBean);
        c7787atM10736a.f13820u.onStrategyChanged(strategyBean);
        c7787atM10736a.f13823x.m10789b();
    }
}
