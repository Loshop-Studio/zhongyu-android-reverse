package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.alibaba.android.arouter.utils.Consts;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.stats.C7322a;
import com.huawei.hms.stats.HiAnalyticsOfCpUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p318r5.AbstractC10844a;

/* loaded from: classes5.dex */
public class HiAnalyticsUtils {

    /* renamed from: c */
    public static final Object f11756c = new Object();

    /* renamed from: d */
    public static final Object f11757d = new Object();

    /* renamed from: e */
    public static HiAnalyticsUtils f11758e;

    /* renamed from: a */
    public int f11759a = 0;

    /* renamed from: b */
    public final boolean f11760b = HianalyticsExist.isHianalyticsExist();

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$a */
    public class RunnableC7339a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11761c;

        /* renamed from: d */
        public final /* synthetic */ String f11762d;

        /* renamed from: e */
        public final /* synthetic */ Map f11763e;

        public RunnableC7339a(Context context, String str, Map map) {
            this.f11761c = context;
            this.f11762d = str;
            this.f11763e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.f11761c, this.f11762d, this.f11763e);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$b */
    public class RunnableC7340b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11765c;

        /* renamed from: d */
        public final /* synthetic */ String f11766d;

        /* renamed from: e */
        public final /* synthetic */ String f11767e;

        public RunnableC7340b(Context context, String str, String str2) {
            this.f11765c = context;
            this.f11766d = str;
            this.f11767e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.f11765c, this.f11766d, this.f11767e);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$c */
    public class RunnableC7341c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11769c;

        /* renamed from: d */
        public final /* synthetic */ String f11770d;

        /* renamed from: e */
        public final /* synthetic */ Map f11771e;

        public RunnableC7341c(Context context, String str, Map map) {
            this.f11769c = context;
            this.f11770d = str;
            this.f11771e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f11769c, this.f11770d, this.f11771e);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$d */
    public class RunnableC7342d implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11773c;

        /* renamed from: d */
        public final /* synthetic */ String f11774d;

        /* renamed from: e */
        public final /* synthetic */ Map f11775e;

        /* renamed from: f */
        public final /* synthetic */ int f11776f;

        public RunnableC7342d(Context context, String str, Map map, int i10) {
            this.f11773c = context;
            this.f11774d = str;
            this.f11775e = map;
            this.f11776f = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f11773c, this.f11774d, this.f11775e, this.f11776f);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$e */
    public class RunnableC7343e implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11778c;

        /* renamed from: d */
        public final /* synthetic */ String f11779d;

        /* renamed from: e */
        public final /* synthetic */ Map f11780e;

        public RunnableC7343e(Context context, String str, Map map) {
            this.f11778c = context;
            this.f11779d = str;
            this.f11780e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f11778c, this.f11779d, this.f11780e);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$f */
    public class RunnableC7344f implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11782c;

        /* renamed from: d */
        public final /* synthetic */ String f11783d;

        /* renamed from: e */
        public final /* synthetic */ Map f11784e;

        /* renamed from: f */
        public final /* synthetic */ int f11785f;

        public RunnableC7344f(Context context, String str, Map map, int i10) {
            this.f11782c = context;
            this.f11783d = str;
            this.f11784e = map;
            this.f11785f = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f11782c, this.f11783d, this.f11784e, this.f11785f);
        }
    }

    /* renamed from: b */
    public static LinkedHashMap m8706b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f11756c) {
            try {
                if (f11758e == null) {
                    f11758e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = f11758e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) throws NumberFormatException {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + Consts.DOT + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + Consts.DOT + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + Consts.DOT + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public final int m8707a(Context context) throws Settings.SettingNotFoundException {
        int i10 = 0;
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.m8727i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i10);
            return i10;
        } catch (Settings.SettingNotFoundException e10) {
            HMSLog.m8727i("HiAnalyticsUtils", "Settings.SettingNotFoundException " + e10.getMessage());
            return i10;
        }
    }

    /* renamed from: c */
    public final void m8708c(Context context, String str, String str2) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7340b(context.getApplicationContext(), str, str2));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnEvent2ToCache> Failed. " + th.getMessage());
        }
    }

    /* renamed from: d */
    public final void m8709d(Context context, String str, Map map) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7339a(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnEventToCache> failed. " + th.getMessage());
        }
    }

    /* renamed from: e */
    public final void m8710e(Context context, String str, Map map, int i10) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7342d(context.getApplicationContext(), str, map, i10));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnNewEventToCache with type> failed. " + th.getMessage());
        }
    }

    public void enableLog(Context context) {
        HMSLog.m8727i("HiAnalyticsUtils", "Enable Log");
        if (this.f11760b) {
            HiAnalyticTools.enableLog(context);
        } else {
            AbstractC10844a.m23333a();
        }
    }

    /* renamed from: f */
    public final boolean m8711f(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName(Request.DEFAULT_CHARSET)).length <= 512;
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<isValidSize String> Exception: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: g */
    public final boolean m8712g(boolean z10, boolean z11, Map map) {
        return !z10 && z11 && m8716k(map);
    }

    public boolean getInitFlag() {
        return !this.f11760b ? AbstractC10844a.m23334b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) throws Settings.SettingNotFoundException {
        if (context == null) {
            return 0;
        }
        int iM8707a = m8707a(context);
        if (iM8707a == 1) {
            return iM8707a;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider" + MqttTopic.TOPIC_LEVEL_SEPARATOR + "com.huawei.hms.privacy.HmsAnalyticsStateProvider");
        try {
            Bundle bundleCall = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, bundle);
            if (bundleCall == null) {
                return iM8707a;
            }
            iM8707a = bundleCall.getInt("SWITCH_IS_CHECKED");
            HMSLog.m8727i("HiAnalyticsUtils", "get hms analyticsOobe state " + iM8707a);
            return iM8707a;
        } catch (IllegalArgumentException unused) {
            HMSLog.m8727i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return iM8707a;
        } catch (SecurityException unused2) {
            HMSLog.m8727i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return iM8707a;
        } catch (Exception unused3) {
            HMSLog.m8727i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return iM8707a;
        }
    }

    /* renamed from: h */
    public final void m8713h(Context context) {
        synchronized (f11757d) {
            try {
                int i10 = this.f11759a;
                if (i10 < 60) {
                    this.f11759a = i10 + 1;
                } else {
                    this.f11759a = 0;
                    if (this.f11760b) {
                        HiAnalyticsOfCpUtils.onReport(context, 0);
                        HiAnalyticsOfCpUtils.onReport(context, 1);
                    } else {
                        AbstractC10844a.m23338f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    /* renamed from: i */
    public final void m8714i(Context context, String str, Map map) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7341c(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnNewEventToCache> failed. " + th.getMessage());
        }
    }

    /* renamed from: j */
    public final void m8715j(Context context, String str, Map map, int i10) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7344f(context.getApplicationContext(), str, map, i10));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnReportToCache with type> failed. " + th.getMessage());
        }
    }

    /* renamed from: k */
    public final boolean m8716k(Map map) {
        try {
            Iterator it = map.values().iterator();
            long length = 0;
            while (it.hasNext()) {
                if (it.next() instanceof String) {
                    length += ((String) r3).getBytes(Charset.forName(Request.DEFAULT_CHARSET)).length;
                }
            }
            return length <= 512;
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<isValidSize map> Exception: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public final void m8717l(Context context, String str, Map map) {
        try {
            C7322a.m8666c().m8668a(new RunnableC7343e(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m8725e("HiAnalyticsUtils", "<addOnReportToCache> failed. " + th.getMessage());
        }
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m8712g(initFlag, andRefreshAnalyticsState != 2, map)) {
            m8709d(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f11760b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, m8706b(map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, m8706b(map));
            } else {
                AbstractC10844a.m23336d(0, str, m8706b(map));
                AbstractC10844a.m23336d(1, str, m8706b(map));
            }
            m8713h(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && m8711f(str2)) {
            m8708c(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f11760b) {
                HiAnalyticsOfCpUtils.onEvent(context, str, str2);
            } else {
                AbstractC10844a.m23337e(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m8712g(initFlag, andRefreshAnalyticsState != 2, map)) {
            m8714i(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f11760b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, m8706b(map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, m8706b(map));
            } else {
                AbstractC10844a.m23336d(0, str, m8706b(map));
                AbstractC10844a.m23336d(1, str, m8706b(map));
            }
            m8713h(context);
        }
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m8712g(initFlag, andRefreshAnalyticsState != 2, map)) {
            m8717l(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f11760b) {
                HiAnalyticsOfCpUtils.onStreamEvent(context, 0, str, m8706b(map));
                HiAnalyticsOfCpUtils.onStreamEvent(context, 1, str, m8706b(map));
            } else {
                AbstractC10844a.m23339g(0, str, m8706b(map));
                AbstractC10844a.m23339g(1, str, m8706b(map));
            }
        }
    }

    public void enableLog() {
        HMSLog.m8727i("HiAnalyticsUtils", "Enable Log");
        if (!this.f11760b) {
            AbstractC10844a.m23333a();
        } else {
            HMSLog.m8727i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    public void onReport(Context context, String str, Map map, int i10) {
        if (i10 != 0 && i10 != 1) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (m8712g(initFlag, andRefreshAnalyticsState != 2, map)) {
                m8715j(context, str, map, i10);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f11760b) {
                    AbstractC10844a.m23339g(i10, str, m8706b(map));
                    return;
                } else {
                    HiAnalyticsOfCpUtils.onStreamEvent(context, i10, str, m8706b(map));
                    return;
                }
            }
            return;
        }
        HMSLog.m8725e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    public void onNewEvent(Context context, String str, Map map, int i10) {
        if (i10 != 0 && i10 != 1) {
            HMSLog.m8725e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (m8712g(initFlag, andRefreshAnalyticsState != 2, map)) {
                m8710e(context, str, map, i10);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f11760b) {
                    AbstractC10844a.m23336d(i10, str, m8706b(map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, i10, str, m8706b(map));
                }
                m8713h(context);
                return;
            }
            return;
        }
        HMSLog.m8725e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
    }
}
