package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC6464o;
import com.tencent.bugly.proguard.C6403aa;
import com.tencent.bugly.proguard.C6414al;
import com.tencent.bugly.proguard.C6419aq;
import com.tencent.bugly.proguard.C6422at;
import com.tencent.bugly.proguard.C6423au;
import com.tencent.bugly.proguard.C6470u;
import com.tencent.bugly.proguard.C6475z;

/* loaded from: classes4.dex */
public class CrashModule extends AbstractC6464o {
    public static final int MODULE_ID = 1004;

    /* renamed from: c */
    private static int f5005c;

    /* renamed from: e */
    private static CrashModule f5006e = new CrashModule();

    /* renamed from: a */
    private long f5007a;

    /* renamed from: b */
    private BuglyStrategy.C6388a f5008b;

    /* renamed from: d */
    private boolean f5009d = false;

    /* renamed from: a */
    private synchronized void m4750a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        try {
            String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
            if (!TextUtils.isEmpty(libBuglySOFilePath)) {
                C6403aa.m4788a(context).f5211t = libBuglySOFilePath;
                C6414al.m4923a("setted libBugly.so file path :%s", libBuglySOFilePath);
            }
            if (buglyStrategy.getCrashHandleCallback() != null) {
                this.f5008b = buglyStrategy.getCrashHandleCallback();
                C6414al.m4923a("setted CrashHanldeCallback", new Object[0]);
            }
            if (buglyStrategy.getAppReportDelay() > 0) {
                long appReportDelay = buglyStrategy.getAppReportDelay();
                this.f5007a = appReportDelay;
                C6414al.m4923a("setted delay: %d", Long.valueOf(appReportDelay));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static CrashModule getInstance() {
        CrashModule crashModule = f5006e;
        crashModule.f5633id = 1004;
        return crashModule;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6464o
    public String[] getTables() {
        return new String[]{"t_cr"};
    }

    public synchronized boolean hasInitialized() {
        return this.f5009d;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6464o
    public synchronized void init(Context context, boolean z9, BuglyStrategy buglyStrategy) {
        if (context != null) {
            try {
                if (!this.f5009d) {
                    C6414al.m4923a("Initializing crash module.", new Object[0]);
                    C6470u c6470uM5276a = C6470u.m5276a();
                    int i10 = f5005c + 1;
                    f5005c = i10;
                    c6470uM5276a.m5289a(i10);
                    this.f5009d = true;
                    CrashReport.setContext(context);
                    m4750a(context, buglyStrategy);
                    C6422at c6422atM5047a = C6422at.m5047a(context, z9, this.f5008b);
                    c6422atM5047a.f5377t.m5075a();
                    if (buglyStrategy != null) {
                        c6422atM5047a.f5373B = buglyStrategy.getCallBackType();
                        c6422atM5047a.f5374C = buglyStrategy.getCloseErrorCallback();
                        C6422at.f5368o = buglyStrategy.isUploadSpotCrash();
                        C6403aa.m4788a(context).f5161S = buglyStrategy.isEnableRecordAnrMainStack();
                        if (buglyStrategy.isEnableCatchAnrTrace()) {
                            c6422atM5047a.f5378u.enableCatchAnrTrace();
                        } else {
                            c6422atM5047a.f5378u.disableCatchAnrTrace();
                        }
                    } else {
                        c6422atM5047a.f5378u.enableCatchAnrTrace();
                    }
                    if (C6403aa.m4790b().f5195d.equals(C6475z.m5322a(c6422atM5047a.f5375c))) {
                        c6422atM5047a.f5378u.removeEmptyNativeRecordFiles();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableNativeCrashMonitor()) {
                        c6422atM5047a.m5056e();
                    } else {
                        C6414al.m4923a("[crash] Closed native crash monitor!", new Object[0]);
                        c6422atM5047a.m5055d();
                    }
                    if (buglyStrategy == null || buglyStrategy.isEnableANRCrashMonitor()) {
                        c6422atM5047a.m5057f();
                    } else {
                        C6414al.m4923a("[crash] Closed ANR monitor!", new Object[0]);
                        c6422atM5047a.m5058g();
                    }
                    if (buglyStrategy != null) {
                        C6422at.f5358e = buglyStrategy.isMerged();
                    }
                    c6422atM5047a.m5050a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
                    c6422atM5047a.f5378u.checkUploadRecordCrash();
                    C6423au.m5064a(context);
                    C6419aq c6419aqM4996a = C6419aq.m4996a();
                    c6419aqM4996a.m5001a("android.net.conn.CONNECTIVITY_CHANGE");
                    c6419aqM4996a.m5000a(context);
                    C6470u c6470uM5276a2 = C6470u.m5276a();
                    int i11 = f5005c - 1;
                    f5005c = i11;
                    c6470uM5276a2.m5289a(i11);
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6464o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        C6422at c6422atM5046a;
        if (strategyBean == null || (c6422atM5046a = C6422at.m5046a()) == null) {
            return;
        }
        c6422atM5046a.f5377t.m5076a(strategyBean);
        c6422atM5046a.f5378u.onStrategyChanged(strategyBean);
        c6422atM5046a.f5381x.m5099b();
    }
}
