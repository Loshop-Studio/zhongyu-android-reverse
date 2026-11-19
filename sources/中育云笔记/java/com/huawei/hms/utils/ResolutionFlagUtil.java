package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class ResolutionFlagUtil {

    /* renamed from: a */
    public static volatile ResolutionFlagUtil f11876a;

    /* renamed from: b */
    public static final Map f11877b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Object f11878c = new Object();

    public static ResolutionFlagUtil getInstance() {
        if (f11876a != null) {
            return f11876a;
        }
        synchronized (f11878c) {
            try {
                if (f11876a == null) {
                    f11876a = new ResolutionFlagUtil();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11876a;
    }

    /* renamed from: a */
    public final void m8828a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10800000;
        for (String str : f11877b.keySet()) {
            Map map = f11877b;
            Long l10 = (Long) map.get(str);
            if (l10 == null || l10.longValue() == 0) {
                map.remove(str);
                HMSLog.m8727i("ResolutionFlagUtil", "remove resolution flag because the data in this pair was abnormal: " + str);
            } else if (time >= l10.longValue()) {
                map.remove(str);
                HMSLog.m8727i("ResolutionFlagUtil", "remove resolution flag because aging time: " + str);
            }
        }
    }

    /* renamed from: b */
    public final void m8829b(String str, long j10) {
        Map map = f11877b;
        synchronized (map) {
            m8828a();
            map.put(str, Long.valueOf(j10));
            HMSLog.m8727i("ResolutionFlagUtil", "save resolution flag");
        }
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            HMSLog.m8725e("ResolutionFlagUtil", "transactionId is null");
            return 0L;
        }
        Map map = f11877b;
        if (map.get(str) != null) {
            return ((Long) map.get(str)).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            HMSLog.m8725e("ResolutionFlagUtil", "transactionId is null");
        } else {
            f11877b.remove(str);
            HMSLog.m8727i("ResolutionFlagUtil", "remove resolution flag");
        }
    }

    public void saveResolutionFlag(String str, long j10) {
        if (!TextUtils.isEmpty(str) && j10 != 0) {
            m8829b(str, j10);
            return;
        }
        HMSLog.m8725e("ResolutionFlagUtil", "saveResolutionFlag error, transactionId: " + str + ", timestamp: " + j10);
    }
}
