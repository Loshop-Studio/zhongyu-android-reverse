package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC6724o;
import com.tencent.bugly.proguard.C6663aa;
import com.tencent.bugly.proguard.C6674al;
import com.tencent.bugly.proguard.C6679aq;
import com.tencent.bugly.proguard.C6682at;
import com.tencent.bugly.proguard.C6683au;
import com.tencent.bugly.proguard.C6730u;
import com.tencent.bugly.proguard.C6735z;

/* loaded from: classes4.dex */
public class CrashModule extends AbstractC6724o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f5582c;

    /* renamed from: e */
    private static CrashModule f5583e = new CrashModule();

    /* renamed from: a */
    private long f5584a;

    /* renamed from: b */
    private BuglyStrategy.C6648a f5585b;

    /* renamed from: d */
    private boolean f5586d = false;

    /* renamed from: a */
    private synchronized void m4929a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C6663aa.m4967a(context).f5788t = libBuglySOFilePath;
                C6674al.m5102a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f5585b = buglyStrategy.getCrashHandleCallback();
                C6674al.m5102a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f5584a = appReportDelay;
                C6674al.m5102a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f5583e;
        crashModule.f6210id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6724o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f5586d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6724o
    public synchronized void init(Context context, boolean z9, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f5586d) {
                    C6674al.m5102a("Initializing crash module.", new Object[0]);
                    C6730u c6730uM5455a = C6730u.m5455a();
                    int i9 = f5582c + 1;
                    f5582c = i9;
                    c6730uM5455a.m5468a(i9);
                    this.f5586d = true;
                    CrashReport.setContext(context);
                    m4929a(context, buglyStrategy);
                    C6682at c6682atM5226a = C6682at.m5226a(context, z9, this.f5585b);
                    c6682atM5226a.f5954t.m5254a();
                    if (buglyStrategy != null) {
                        c6682atM5226a.f5950B = buglyStrategy.getCallBackType();
                        c6682atM5226a.f5951C = buglyStrategy.getCloseErrorCallback();
                        C6682at.f5945o = buglyStrategy.isUploadSpotCrash();
                        C6663aa.m4967a(context).f5738S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c6682atM5226a.f5955u.enableCatchAnrTrace();
                        } else {
                            c6682atM5226a.f5955u.disableCatchAnrTrace();
                        }
                    } else {
                        c6682atM5226a.f5955u.enableCatchAnrTrace();
                    }
                    if (C6663aa.m4969b().f5772d.equals(C6735z.m5501a(c6682atM5226a.f5952c))) {
                        c6682atM5226a.f5955u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c6682atM5226a.m5235e();
                    } else {
                        C6674al.m5102a("[crash] Closed native crash monitor!", new Object[0]);
                        c6682atM5226a.m5234d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c6682atM5226a.m5236f();
                    } else {
                        C6674al.m5102a("[crash] Closed ANR monitor!", new Object[0]);
                        c6682atM5226a.m5237g();
                    }
                    if (buglyStrategy != null) {
                        C6682at.f5935e = buglyStrategy.isMerged();
                    }
                    c6682atM5226a.m5229a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c6682atM5226a.f5955u.checkUploadRecordCrash();
                    C6683au.m5243a(context);
                    C6679aq c6679aqM5175a = C6679aq.m5175a();
                    c6679aqM5175a.m5180a("android.net.conn.CONNECTIVITY_CHANGE");
                    c6679aqM5175a.m5179a(context);
                    C6730u c6730uM5455a2 = C6730u.m5455a();
                    int i10 = f5582c - 1;
                    f5582c = i10;
                    c6730uM5455a2.m5468a(i10);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6724o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C6682at c6682atM5225a;
        if (strategyBean == null || (c6682atM5225a = C6682at.m5225a()) == null) {
            return;
        }
        c6682atM5225a.f5954t.m5255a(strategyBean);
        c6682atM5225a.f5955u.onStrategyChanged(strategyBean);
        c6682atM5225a.f5958x.m5278b();
    }
}
