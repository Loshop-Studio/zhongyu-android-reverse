package com.huawei.hms.framework.common.hianalytics;

import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.common.CommonActivityUtil;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes5.dex */
public class HianalyticsHelper {

    /* renamed from: l */
    public static volatile HianalyticsHelper f11656l;

    /* renamed from: a */
    public boolean f11657a;

    /* renamed from: b */
    public boolean f11658b;

    /* renamed from: g */
    public ReportCallBack f11663g;

    /* renamed from: k */
    public boolean f11667k;

    /* renamed from: c */
    public String f11659c = "hms_hwid";

    /* renamed from: d */
    public HiAnalyticsInstance f11660d = null;

    /* renamed from: e */
    public boolean f11661e = false;

    /* renamed from: f */
    public ExecutorService f11662f = ExecutorsUtils.newSingleThreadExecutor(AgooConstants.MESSAGE_REPORT);

    /* renamed from: h */
    public boolean f11664h = true;

    /* renamed from: i */
    public boolean f11665i = true;

    /* renamed from: j */
    public final int f11666j = new SecureRandom().nextInt(1000);

    public static class HianalyticsRunnable implements Runnable {

        /* renamed from: c */
        public final HianalyticsBaseData f11668c;

        /* renamed from: d */
        public final String f11669d;

        public HianalyticsRunnable(HianalyticsBaseData hianalyticsBaseData, String str) {
            this.f11668c = hianalyticsBaseData;
            this.f11669d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HianalyticsHelper.getInstance().onEvent(this.f11668c.get(), this.f11669d);
        }
    }

    public interface ReportCallBack {
        void onReport(int i10, String str, LinkedHashMap<String, String> linkedHashMap);
    }

    public HianalyticsHelper() {
        boolean z10 = true;
        try {
            HiAnalyticsManager.getInitFlag("_default_config_tag");
            this.f11657a = true;
        } catch (Throwable unused) {
            Logger.m8580i("HianalyticsHelper", "Hianalytics sdk not found");
            this.f11657a = false;
        }
        if (!this.f11657a) {
            m8618d(ContextHolder.getAppContext());
        }
        try {
            if (ContextHolder.getAppContext().getPackageManager().getPackageInfo("com.huawei.works", 0) == null) {
                z10 = false;
            }
            this.f11667k = z10;
        } catch (Exception unused2) {
            this.f11667k = false;
        }
        Logger.m8587v("HianalyticsHelper", "this time the ha %s, mini %s", Boolean.valueOf(this.f11657a), Boolean.valueOf(this.f11658b));
    }

    public static HianalyticsHelper getInstance() {
        if (f11656l == null) {
            synchronized (HianalyticsHelper.class) {
                try {
                    if (f11656l == null) {
                        f11656l = new HianalyticsHelper();
                    }
                } finally {
                }
            }
        }
        return f11656l;
    }

    /* renamed from: a */
    public final boolean m8615a(Context context, boolean z10, boolean z11) {
        if (this.f11663g != null) {
            return true;
        }
        if (z10 && ((z11 && !this.f11665i) || (!z11 && !this.f11664h))) {
            return false;
        }
        if (this.f11658b) {
            return true;
        }
        if (!this.f11657a) {
            return false;
        }
        if (this.f11661e) {
            return m8616b();
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", -1) == 1) {
                return m8616b();
            }
        } catch (IllegalStateException unused) {
            Logger.m8588w("HianalyticsHelper", "the setting has illegalStateException");
        } catch (Throwable unused2) {
            Logger.m8588w("HianalyticsHelper", "the setting has other error");
        }
        Logger.m8580i("HianalyticsHelper", "user experience involved needs to be opened");
        return false;
    }

    /* renamed from: b */
    public final boolean m8616b() {
        if (this.f11660d != null) {
            return true;
        }
        if (HiAnalyticsManager.getInitFlag("_default_config_tag")) {
            this.f11660d = HiAnalyticsManager.getInstanceByTag("_default_config_tag");
        } else {
            this.f11660d = HiAnalyticsManager.getInstanceByTag(this.f11659c);
        }
        return this.f11660d != null;
    }

    /* renamed from: c */
    public final void m8617c(Context context, String str, Map map, int i10) {
        if (context == null || map == null) {
            return;
        }
        Logger.m8587v("HianalyticsHelper", "data = %s", map);
        try {
            HiAnalyticsUtils.getInstance().onNewEvent(context, str, map, i10);
        } catch (NoSuchMethodError unused) {
            Logger.m8588w("HianalyticsHelper", "may be you need upgrade stats sdk");
        } catch (Throwable unused2) {
            Logger.m8580i("HianalyticsHelper", "the stats has other error,pls check it");
        }
    }

    /* renamed from: d */
    public final void m8618d(Context context) {
        if (context == null) {
            Logger.m8580i("HianalyticsHelper", "the appContext hasn't init");
            return;
        }
        try {
            HMSBIInitializer.getInstance(context).initBI();
            this.f11658b = true;
        } catch (NoClassDefFoundError unused) {
            Logger.m8588w("HianalyticsHelper", "maybe you need add base sdk!");
        } catch (Throwable unused2) {
            Logger.m8588w("HianalyticsHelper", "the hms base has other error!");
        }
    }

    public void enablePrivacyPolicy(boolean z10) {
        this.f11661e = z10;
    }

    public void executeReportHa(HianalyticsBaseData hianalyticsBaseData, String str) {
        getReportExecutor().execute(new HianalyticsRunnable(hianalyticsBaseData, str));
    }

    public ExecutorService getReportExecutor() {
        return this.f11662f;
    }

    public boolean inRate() {
        return this.f11664h;
    }

    public boolean isEnableReport(Context context) {
        return m8615a(context, true, false);
    }

    public boolean isEnableReportNoSeed(Context context) {
        return m8615a(context, false, false);
    }

    public boolean isQuicEnableReport(Context context) {
        return m8615a(context, true, true);
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        onEvent(linkedHashMap, str, 1);
    }

    public void reportData(Context context, LinkedHashMap<String, String> linkedHashMap, String str, int i10) {
        if (isEnableReportNoSeed(context)) {
            onEvent(linkedHashMap, str, i10);
        }
    }

    public void reportException(final Throwable th, final String str) {
        if (getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            final String name = Thread.currentThread().getName();
            InitReport.reportWhenInit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    CrashHianalyticsData crashHianalyticsData = new CrashHianalyticsData();
                    crashHianalyticsData.put("sdk_version", "8.0.1.304");
                    crashHianalyticsData.put(CrashHianalyticsData.CRASH_TYPE, "exception");
                    crashHianalyticsData.put(CrashHianalyticsData.THREAD_NAME, name);
                    crashHianalyticsData.put(CrashHianalyticsData.EXCEPTION_NAME, th.getClass().getName());
                    crashHianalyticsData.put("message", StringUtils.anonymizeMessage(th.getMessage()));
                    crashHianalyticsData.put(CrashHianalyticsData.STACK_TRACE, StringUtils.getTraceInfo(th));
                    HianalyticsHelper.getInstance().onEvent(crashHianalyticsData.get(), str);
                }
            });
        }
    }

    public void setHaTag(String str) {
        this.f11659c = str;
    }

    public void setQuicRate(int i10) {
        boolean z10 = true;
        if (i10 < 0 || i10 >= 1000) {
            this.f11665i = true;
            return;
        }
        if (this.f11666j >= i10 && !this.f11667k) {
            z10 = false;
        }
        this.f11665i = z10;
    }

    public void setRate(int i10) {
        boolean z10 = true;
        if (i10 < 0 || i10 >= 1000) {
            this.f11664h = true;
            return;
        }
        if (this.f11666j >= i10 && !this.f11667k) {
            z10 = false;
        }
        this.f11664h = z10;
        Logger.m8580i("HianalyticsHelper", "bReportable = " + this.f11664h + ", inuser = " + this.f11667k + ", rate = " + i10);
    }

    public void setReportCallback(ReportCallBack reportCallBack) {
        this.f11663g = reportCallBack;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str, int i10) {
        if (linkedHashMap == null) {
            return;
        }
        linkedHashMap.put("in_user", "" + (this.f11667k ? 1 : 0));
        if (CommonActivityUtil.getInstance().isRegistered()) {
            linkedHashMap.put("foreground", "" + (CommonActivityUtil.getInstance().isForeground() ? 1 : 0));
        }
        Logger.m8587v("HianalyticsHelper", "data = %s", linkedHashMap);
        ReportCallBack reportCallBack = this.f11663g;
        if (reportCallBack != null) {
            reportCallBack.onReport(i10, str, linkedHashMap);
            return;
        }
        if (this.f11658b) {
            m8617c(ContextHolder.getAppContext(), str, linkedHashMap, i10);
        } else if (i10 == 0) {
            Logger.m8587v("HianalyticsHelper", "the base sdk isn't exsit, and reportType is %s", Integer.valueOf(i10));
            return;
        }
        if (this.f11657a) {
            HiAnalyticsInstance hiAnalyticsInstance = this.f11660d;
            if (hiAnalyticsInstance != null) {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
            } else {
                Logger.m8573e("HianalyticsHelper", "the ha has error,has init but is null!");
            }
        }
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, HianalyticsBaseData.EVENT_ID);
    }
}
