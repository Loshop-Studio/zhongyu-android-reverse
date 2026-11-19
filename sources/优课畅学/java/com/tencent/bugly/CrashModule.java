package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC6486o;
import com.tencent.bugly.proguard.C6425aa;
import com.tencent.bugly.proguard.C6436al;
import com.tencent.bugly.proguard.C6441aq;
import com.tencent.bugly.proguard.C6444at;
import com.tencent.bugly.proguard.C6445au;
import com.tencent.bugly.proguard.C6492u;
import com.tencent.bugly.proguard.C6497z;

/* loaded from: classes4.dex */
public class CrashModule extends AbstractC6486o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f4348c;

    /* renamed from: e */
    private static CrashModule f4349e = new CrashModule();

    /* renamed from: a */
    private long f4350a;

    /* renamed from: b */
    private BuglyStrategy.C6410a f4351b;

    /* renamed from: d */
    private boolean f4352d = false;

    /* renamed from: a */
    private synchronized void m4110a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C6425aa.m4148a(context).f4554t = libBuglySOFilePath;
                C6436al.m4283a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f4351b = buglyStrategy.getCrashHandleCallback();
                C6436al.m4283a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f4350a = appReportDelay;
                C6436al.m4283a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f4349e;
        crashModule.f4976id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6486o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f4352d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6486o
    public synchronized void init(Context context, boolean z10, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f4352d) {
                    C6436al.m4283a("Initializing crash module.", new Object[0]);
                    C6492u c6492uM4636a = C6492u.m4636a();
                    int i10 = f4348c + 1;
                    f4348c = i10;
                    c6492uM4636a.m4649a(i10);
                    this.f4352d = true;
                    CrashReport.setContext(context);
                    m4110a(context, buglyStrategy);
                    C6444at c6444atM4407a = C6444at.m4407a(context, z10, this.f4351b);
                    c6444atM4407a.f4720t.m4435a();
                    if (buglyStrategy != null) {
                        c6444atM4407a.f4716B = buglyStrategy.getCallBackType();
                        c6444atM4407a.f4717C = buglyStrategy.getCloseErrorCallback();
                        C6444at.f4711o = buglyStrategy.isUploadSpotCrash();
                        C6425aa.m4148a(context).f4504S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c6444atM4407a.f4721u.enableCatchAnrTrace();
                        } else {
                            c6444atM4407a.f4721u.disableCatchAnrTrace();
                        }
                    } else {
                        c6444atM4407a.f4721u.enableCatchAnrTrace();
                    }
                    if (C6425aa.m4150b().f4538d.equals(C6497z.m4682a(c6444atM4407a.f4718c))) {
                        c6444atM4407a.f4721u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c6444atM4407a.m4416e();
                    } else {
                        C6436al.m4283a("[crash] Closed native crash monitor!", new Object[0]);
                        c6444atM4407a.m4415d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c6444atM4407a.m4417f();
                    } else {
                        C6436al.m4283a("[crash] Closed ANR monitor!", new Object[0]);
                        c6444atM4407a.m4418g();
                    }
                    if (buglyStrategy != null) {
                        C6444at.f4701e = buglyStrategy.isMerged();
                    }
                    c6444atM4407a.m4410a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c6444atM4407a.f4721u.checkUploadRecordCrash();
                    C6445au.m4424a(context);
                    C6441aq c6441aqM4356a = C6441aq.m4356a();
                    c6441aqM4356a.m4361a("android.net.conn.CONNECTIVITY_CHANGE");
                    c6441aqM4356a.m4360a(context);
                    C6492u c6492uM4636a2 = C6492u.m4636a();
                    int i11 = f4348c - 1;
                    f4348c = i11;
                    c6492uM4636a2.m4649a(i11);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6486o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C6444at c6444atM4406a;
        if (strategyBean == null || (c6444atM4406a = C6444at.m4406a()) == null) {
            return;
        }
        c6444atM4406a.f4720t.m4436a(strategyBean);
        c6444atM4406a.f4721u.onStrategyChanged(strategyBean);
        c6444atM4406a.f4724x.m4459b();
    }
}
