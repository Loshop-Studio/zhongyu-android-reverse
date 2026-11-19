package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.stats.C7322a;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;

/* loaded from: classes5.dex */
public class AnalyticsSwitchHolder {
    public static final int ANALYTICS_DISABLED = 2;
    public static final int ANALYTICS_ENABLED = 1;

    /* renamed from: a */
    public static volatile int f11816a;

    /* renamed from: b */
    public static final Object f11817b = new Object();

    /* renamed from: c */
    public static volatile Long f11818c = 0L;

    /* renamed from: d */
    public static volatile boolean f11819d = false;

    /* renamed from: e */
    public static volatile boolean f11820e = false;

    /* renamed from: com.huawei.hms.utils.AnalyticsSwitchHolder$a */
    public class RunnableC7354a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11821c;

        public RunnableC7354a(Context context) {
            this.f11821c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.m8751f(this.f11821c);
            HMSLog.m8727i("AnalyticsSwitchHolder", "getStateForHmsAnalyticsProvider");
        }
    }

    /* renamed from: com.huawei.hms.utils.AnalyticsSwitchHolder$b */
    public class RunnableC7355b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11822c;

        public RunnableC7355b(Context context) {
            this.f11822c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m8727i("AnalyticsSwitchHolder", "enter setAnalyticsStateAndTimestamp");
            AnalyticsSwitchHolder.m8751f(this.f11822c);
            HMSLog.m8727i("AnalyticsSwitchHolder", "quit setAnalyticsStateAndTimestamp");
        }
    }

    /* renamed from: b */
    public static boolean m8747b(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m8725e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.m8725e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            } catch (RuntimeException e10) {
                HMSLog.m8726e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.", e10);
            }
        }
        HMSLog.m8727i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    /* renamed from: c */
    public static void m8748c(Context context) {
        f11818c = Long.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        new Thread(new RunnableC7354a(context), "Thread-getStateForHmsAnalyticsProvider").start();
    }

    /* renamed from: d */
    public static boolean m8749d(Context context) {
        return RegionUtils.isChinaROM(context);
    }

    /* renamed from: e */
    public static void m8750e(Context context) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (timestamp.getTime() - f11818c.longValue() < 86400000 || f11818c.longValue() <= 0) {
            return;
        }
        f11818c = Long.valueOf(timestamp.getTime());
        new Thread(new RunnableC7355b(context), "Thread-refreshOobeAnalyticsState").start();
    }

    /* renamed from: f */
    public static void m8751f(Context context) {
        if (context == null) {
            HMSLog.m8725e("AnalyticsSwitchHolder", "In setAnalyticsState、, context is null.");
            return;
        }
        if (HiAnalyticsUtils.getInstance().getOobeAnalyticsState(context) != 1) {
            synchronized (f11817b) {
                f11816a = 2;
            }
            C7322a.m8666c().m8667a();
            return;
        }
        synchronized (f11817b) {
            f11816a = 1;
        }
        if (HiAnalyticsUtils.getInstance().getInitFlag() || f11819d) {
            return;
        }
        HMSBIInitializer.getInstance(context).m8760h();
        f11819d = true;
    }

    public static int getAndRefreshAnalyticsState(Context context) {
        int i10;
        synchronized (f11817b) {
            isAnalyticsDisabled(context);
            i10 = f11816a;
        }
        return i10;
    }

    public static boolean getBiSetting(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m8725e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.m8725e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            } catch (RuntimeException e10) {
                HMSLog.m8726e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.", e10);
            }
        }
        HMSLog.m8727i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (f11817b) {
            try {
                if (f11816a == 0) {
                    if (context == null) {
                        return true;
                    }
                    if (m8747b(context)) {
                        HMSLog.m8727i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                        f11816a = 1;
                    } else if (getBiSetting(context)) {
                        HMSLog.m8727i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                        f11816a = 2;
                    } else if (m8749d(context)) {
                        f11816a = 1;
                    } else {
                        HMSLog.m8727i("AnalyticsSwitchHolder", "not ChinaROM");
                        f11816a = 3;
                        f11820e = true;
                        m8748c(context);
                    }
                } else if (f11820e) {
                    m8750e(context);
                }
                return f11816a != 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
