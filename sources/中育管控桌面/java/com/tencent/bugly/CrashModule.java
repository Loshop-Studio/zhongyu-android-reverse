package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC5841o;
import com.tencent.bugly.proguard.C5780aa;
import com.tencent.bugly.proguard.C5791al;
import com.tencent.bugly.proguard.C5796aq;
import com.tencent.bugly.proguard.C5799at;
import com.tencent.bugly.proguard.C5800au;
import com.tencent.bugly.proguard.C5847u;
import com.tencent.bugly.proguard.C5852z;

/* loaded from: classes3.dex */
public class CrashModule extends AbstractC5841o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f3726c;

    /* renamed from: e */
    private static CrashModule f3727e = new CrashModule();

    /* renamed from: a */
    private long f3728a;

    /* renamed from: b */
    private BuglyStrategy.C5765a f3729b;

    /* renamed from: d */
    private boolean f3730d = false;

    /* renamed from: a */
    private synchronized void m3755a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C5780aa.m3793a(context).f3932t = libBuglySOFilePath;
                C5791al.m3928a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f3729b = buglyStrategy.getCrashHandleCallback();
                C5791al.m3928a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f3728a = appReportDelay;
                C5791al.m3928a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f3727e;
        crashModule.f4354id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC5841o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f3730d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC5841o
    public synchronized void init(Context context, boolean z6, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f3730d) {
                    C5791al.m3928a("Initializing crash module.", new Object[0]);
                    C5847u c5847uM4281a = C5847u.m4281a();
                    int i6 = f3726c + 1;
                    f3726c = i6;
                    c5847uM4281a.m4294a(i6);
                    this.f3730d = true;
                    CrashReport.setContext(context);
                    m3755a(context, buglyStrategy);
                    C5799at c5799atM4052a = C5799at.m4052a(context, z6, this.f3729b);
                    c5799atM4052a.f4098t.m4080a();
                    if (buglyStrategy != null) {
                        c5799atM4052a.f4094B = buglyStrategy.getCallBackType();
                        c5799atM4052a.f4095C = buglyStrategy.getCloseErrorCallback();
                        C5799at.f4089o = buglyStrategy.isUploadSpotCrash();
                        C5780aa.m3793a(context).f3882S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c5799atM4052a.f4099u.enableCatchAnrTrace();
                        } else {
                            c5799atM4052a.f4099u.disableCatchAnrTrace();
                        }
                    } else {
                        c5799atM4052a.f4099u.enableCatchAnrTrace();
                    }
                    if (C5780aa.m3795b().f3916d.equals(C5852z.m4327a(c5799atM4052a.f4096c))) {
                        c5799atM4052a.f4099u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c5799atM4052a.m4061e();
                    } else {
                        C5791al.m3928a("[crash] Closed native crash monitor!", new Object[0]);
                        c5799atM4052a.m4060d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c5799atM4052a.m4062f();
                    } else {
                        C5791al.m3928a("[crash] Closed ANR monitor!", new Object[0]);
                        c5799atM4052a.m4063g();
                    }
                    if (buglyStrategy != null) {
                        C5799at.f4079e = buglyStrategy.isMerged();
                    }
                    c5799atM4052a.m4055a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c5799atM4052a.f4099u.checkUploadRecordCrash();
                    C5800au.m4069a(context);
                    C5796aq c5796aqM4001a = C5796aq.m4001a();
                    c5796aqM4001a.m4006a("android.net.conn.CONNECTIVITY_CHANGE");
                    c5796aqM4001a.m4005a(context);
                    C5847u c5847uM4281a2 = C5847u.m4281a();
                    int i7 = f3726c - 1;
                    f3726c = i7;
                    c5847uM4281a2.m4294a(i7);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5841o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C5799at c5799atM4051a;
        if (strategyBean == null || (c5799atM4051a = C5799at.m4051a()) == null) {
            return;
        }
        c5799atM4051a.f4098t.m4081a(strategyBean);
        c5799atM4051a.f4099u.onStrategyChanged(strategyBean);
        c5799atM4051a.f4102x.m4104b();
    }
}
