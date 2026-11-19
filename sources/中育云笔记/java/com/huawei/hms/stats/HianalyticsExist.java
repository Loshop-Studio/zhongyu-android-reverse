package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class HianalyticsExist {

    /* renamed from: a */
    public static final Object f11700a = new Object();

    /* renamed from: b */
    public static boolean f11701b = false;

    /* renamed from: c */
    public static boolean f11702c = false;

    public static boolean isHianalyticsExist() {
        synchronized (f11700a) {
            if (!f11701b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.m8727i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f11701b = true;
                HMSLog.m8727i("HianalyticsExist", "hianalytics exist: " + f11702c);
            }
        }
        return f11702c;
    }
}
