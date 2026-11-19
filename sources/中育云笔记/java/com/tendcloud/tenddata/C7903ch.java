package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.lifecycle.CoroutineLiveDataKt;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.zykj.download.OssUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.tendcloud.tenddata.ch */
/* loaded from: classes5.dex */
public class C7903ch {

    /* renamed from: a */
    static final String f14536a = "www.talkingdata.net";

    /* renamed from: b */
    static final int f14537b = 80;

    /* renamed from: c */
    private static TelephonyManager f14538c = null;

    /* renamed from: d */
    private static final HashMap<String, String> f14539d;

    /* renamed from: e */
    private static final String[] f14540e;

    /* renamed from: f */
    private static final String[] f14541f;

    /* renamed from: g */
    private static a f14542g = null;

    /* renamed from: h */
    private static boolean f14543h = false;

    /* renamed from: i */
    private static final long f14544i = 300000;

    /* renamed from: j */
    private static long f14545j;

    /* renamed from: k */
    private static volatile boolean f14546k;

    /* renamed from: l */
    private static volatile boolean f14547l;

    /* renamed from: m */
    private static JSONArray f14548m;

    /* renamed from: n */
    private static JSONArray f14549n;

    /* renamed from: o */
    private static volatile boolean f14550o;

    /* renamed from: p */
    private static volatile boolean f14551p;

    /* renamed from: q */
    private static volatile boolean f14552q;

    /* renamed from: r */
    private static JSONArray f14553r;

    /* renamed from: s */
    private static JSONArray f14554s;

    /* renamed from: t */
    private static JSONArray f14555t;

    /* renamed from: u */
    private static boolean f14556u;

    /* renamed from: v */
    private static b f14557v;

    /* renamed from: w */
    private static JSONArray f14558w;

    /* renamed from: x */
    private static volatile boolean f14559x;

    /* renamed from: com.tendcloud.tenddata.ch$a */
    public static class a implements Runnable {
        private Context context;
        private Object lock;
        private BroadcastReceiver receiver;

        public a(Context context, Object obj, BroadcastReceiver broadcastReceiver) {
            this.context = context;
            this.lock = obj;
            this.receiver = broadcastReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            BroadcastReceiver broadcastReceiver;
            try {
                synchronized (this.lock) {
                    try {
                        try {
                            this.lock.notifyAll();
                            context = this.context;
                            broadcastReceiver = this.receiver;
                        } catch (Throwable unused) {
                            context = this.context;
                            broadcastReceiver = this.receiver;
                        }
                        context.unregisterReceiver(broadcastReceiver);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused2) {
            }
        }

        public void unRegisterReceiver() {
            BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                try {
                    this.context.unregisterReceiver(broadcastReceiver);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.tendcloud.tenddata.ch$b */
    public static class b extends BroadcastReceiver {
        private CountDownLatch latch = new CountDownLatch(1);

        public void await() {
            try {
                this.latch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                C7896ca.eForInternal(th);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.net.wifi.SCAN_RESULTS".equals(intent.getAction()) || this.latch.getCount() <= 0) {
                return;
            }
            this.latch.countDown();
        }

        public void reset() {
            this.latch = new CountDownLatch(1);
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f14539d = map;
        f14540e = new String[]{GrsBaseInfo.CountryCodeSource.UNKNOWN, "GPRS", "EDGE", "UMTS", "CDMA", "EVDO_0", "EVDO_A", "1xRTT", "HSDPA", "HSUPA", "HSPA", "IDEN", "EVDO_B", "LTE", "EHRPD", "HSPAP"};
        f14541f = new String[]{"NONE", "GSM", "CDMA", "SIP"};
        f14542g = null;
        if (C7843ab.f14307g != null) {
            String[] strArrM11523a = m11523a();
            map.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, strArrM11523a[0]);
            map.put("ipv6", strArrM11523a[1]);
            map.put("cell_ip", strArrM11523a[2]);
            map.put("cell_ipv6", strArrM11523a[3]);
            map.put(DispatchConstants.BSSID, m11549q(C7843ab.f14307g));
            map.put("ssid", m11555w(C7843ab.f14307g));
        }
        f14543h = false;
        f14545j = -300000L;
        f14546k = false;
        f14547l = false;
        f14548m = new JSONArray();
        f14550o = false;
        f14551p = false;
        f14552q = false;
        f14553r = new JSONArray();
        f14556u = false;
        f14557v = new b();
        f14558w = new JSONArray();
        f14559x = false;
    }

    /* renamed from: A */
    public static JSONArray m11503A(Context context) {
        if (f14558w.length() > 0 || f14559x) {
            return f14558w;
        }
        if (!C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
            return f14558w;
        }
        m11506D(context);
        return f14558w;
    }

    /* renamed from: B */
    public static int m11504B(Context context) {
        try {
            if (!C7912cq.m11595a(23)) {
                return m11503A(context).length();
            }
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getPhoneCount();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: C */
    public static Map<String, Object> m11505C(Context context) {
        DatagramSocket datagramSocket;
        if (m11536d(context)) {
            try {
                String str = f14539d.get(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                if (str != null) {
                    String strSubstring = str.substring(0, str.lastIndexOf(46) + 1);
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[0], 0, 0);
                    datagramSocket = new DatagramSocket();
                    for (int i10 = 1; i10 < 255; i10++) {
                        try {
                            try {
                                datagramPacket.setAddress(InetAddress.getByName(strSubstring + i10));
                                datagramSocket.send(datagramPacket);
                                if (i10 == 125) {
                                    datagramSocket.close();
                                    datagramSocket = new DatagramSocket();
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            if (datagramSocket != null) {
                                try {
                                    datagramSocket.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            return null;
                        }
                    }
                    datagramSocket.close();
                } else {
                    datagramSocket = null;
                }
                Thread.sleep(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                Map<String, Object> mapM11533c = m11533c();
                if (datagramSocket != null) {
                    try {
                        datagramSocket.close();
                    } catch (Throwable unused4) {
                    }
                }
                return mapM11533c;
            } catch (Throwable unused5) {
                datagramSocket = null;
            }
        }
        return null;
    }

    /* renamed from: D */
    private static void m11506D(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            ArrayList arrayList = new ArrayList();
            if (C7912cq.m11595a(22)) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                try {
                    JSONObject jSONObjectM11518a = m11518a(context, subscriptionManager, 0);
                    if (C7912cq.m11595a(26)) {
                        try {
                            jSONObjectM11518a.put(Constants.KEY_IMEI, C7900ce.m11481a("imei1"));
                            jSONObjectM11518a.put("imei5", C7900ce.m11485b(0));
                        } catch (Throwable unused) {
                        }
                        try {
                            jSONObjectM11518a.put("meid", C7900ce.m11481a("meid1"));
                            jSONObjectM11518a.put("meid5", C7900ce.m11489c(0));
                        } catch (Throwable unused2) {
                        }
                    } else {
                        jSONObjectM11518a.put(Constants.KEY_IMEI, C7900ce.m11481a("imei1"));
                        jSONObjectM11518a.put("imei5", C7900ce.m11485b(0));
                    }
                    if (jSONObjectM11518a.length() > 0) {
                        f14558w.put(jSONObjectM11518a);
                    }
                } catch (Throwable unused3) {
                }
                JSONObject jSONObjectM11518a2 = m11518a(context, subscriptionManager, 1);
                if (telephonyManager != null) {
                    if (C7912cq.m11595a(26)) {
                        try {
                            jSONObjectM11518a2.put(Constants.KEY_IMEI, C7900ce.m11481a("imei2"));
                            jSONObjectM11518a2.put("imei5", C7900ce.m11485b(1));
                        } catch (Throwable unused4) {
                        }
                        try {
                            jSONObjectM11518a2.put("meid", C7900ce.m11481a("meid2"));
                            jSONObjectM11518a2.put("meid5", C7900ce.m11489c(1));
                        } catch (Throwable unused5) {
                        }
                    } else {
                        jSONObjectM11518a2.put(Constants.KEY_IMEI, C7900ce.m11481a("imei2"));
                        jSONObjectM11518a2.put("imei5", C7900ce.m11485b(1));
                    }
                }
                if (jSONObjectM11518a2.length() > 0) {
                    f14558w.put(jSONObjectM11518a2);
                }
            } else {
                String deviceId = telephonyManager != null ? telephonyManager.getDeviceId() : "";
                if (m11530c(deviceId.trim()).booleanValue()) {
                    arrayList.add(deviceId.trim());
                    JSONObject jSONObjectM11519a = m11519a(telephonyManager, deviceId);
                    if (jSONObjectM11519a != null) {
                        f14558w.put(jSONObjectM11519a);
                    }
                }
                try {
                    TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone1");
                    String deviceId2 = telephonyManager2 != null ? telephonyManager2.getDeviceId() : "";
                    if (deviceId2 != null && m11530c(deviceId2).booleanValue() && !arrayList.contains(deviceId2)) {
                        arrayList.add(deviceId2);
                        JSONObject jSONObjectM11519a2 = m11519a(telephonyManager2, deviceId2);
                        if (jSONObjectM11519a2 != null) {
                            f14558w.put(jSONObjectM11519a2);
                        }
                    }
                } catch (Throwable unused6) {
                }
                try {
                    TelephonyManager telephonyManager3 = (TelephonyManager) context.getSystemService("phone2");
                    String deviceId3 = telephonyManager3 != null ? telephonyManager3.getDeviceId() : "";
                    if (deviceId3 != null && m11530c(deviceId3).booleanValue() && !arrayList.contains(deviceId3)) {
                        arrayList.add(deviceId3);
                        JSONObject jSONObjectM11519a3 = m11519a(telephonyManager3, deviceId3);
                        if (jSONObjectM11519a3 != null) {
                            f14558w.put(jSONObjectM11519a3);
                        }
                    }
                } catch (Throwable unused7) {
                }
                JSONArray jSONArrayM11510H = m11510H(context);
                JSONArray jSONArrayM11509G = m11509G(context);
                if (jSONArrayM11509G != null) {
                    jSONArrayM11510H = jSONArrayM11509G;
                }
                JSONArray jSONArrayM11508F = m11508F(context);
                if (jSONArrayM11508F != null) {
                    jSONArrayM11510H = jSONArrayM11508F;
                }
                JSONArray jSONArrayM11507E = m11507E(context);
                if (jSONArrayM11507E != null) {
                    jSONArrayM11510H = jSONArrayM11507E;
                }
                if (jSONArrayM11510H != null && jSONArrayM11510H.length() > 0) {
                    for (int i10 = 0; i10 < jSONArrayM11510H.length(); i10++) {
                        JSONObject jSONObject = jSONArrayM11510H.getJSONObject(i10);
                        String string = jSONObject.getString(Constants.KEY_IMEI);
                        if (!arrayList.contains(string)) {
                            arrayList.add(string);
                            f14558w.put(jSONObject);
                        }
                    }
                }
            }
        } catch (Throwable unused8) {
        }
        f14559x = true;
    }

    /* renamed from: E */
    private static JSONArray m11507E(Context context) {
        int i10;
        int i11;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i10 = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i11 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i10 = 0;
                i11 = 1;
            }
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            if (telephonyManager != null && declaredMethod != null) {
                String strTrim = ((String) declaredMethod.invoke(telephonyManager, i10)).trim();
                String strTrim2 = ((String) declaredMethod.invoke(telephonyManager, i11)).trim();
                if (m11530c(strTrim).booleanValue()) {
                    jSONArray.put(m11520a(TelephonyManager.class, telephonyManager, i10, strTrim, "Gemini"));
                }
                if (m11530c(strTrim2).booleanValue()) {
                    jSONArray.put(m11520a(TelephonyManager.class, telephonyManager, i11, strTrim2, "Gemini"));
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: F */
    private static JSONArray m11508F(Context context) {
        int i10;
        int i11;
        JSONObject jSONObjectM11519a;
        JSONObject jSONObjectM11519a2;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i10 = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i11 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i10 = 0;
                i11 = 1;
            }
            Method method = TelephonyManager.class.getMethod("getDefault", Integer.TYPE);
            TelephonyManager telephonyManager2 = (TelephonyManager) method.invoke(telephonyManager, i10);
            TelephonyManager telephonyManager3 = (TelephonyManager) method.invoke(telephonyManager, i11);
            String strTrim = telephonyManager2.getDeviceId().trim();
            String strTrim2 = telephonyManager3.getDeviceId().trim();
            if (m11530c(strTrim).booleanValue() && (jSONObjectM11519a2 = m11519a(telephonyManager2, strTrim)) != null) {
                jSONArray.put(jSONObjectM11519a2);
            }
            if (m11530c(strTrim2).booleanValue() && (jSONObjectM11519a = m11519a(telephonyManager3, strTrim2)) != null) {
                jSONArray.put(jSONObjectM11519a);
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: G */
    private static JSONArray m11509G(Context context) {
        JSONObject jSONObjectM11519a;
        JSONObject jSONObjectM11519a2;
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("com.android.internal.telephony.PhoneFactory");
            String str = (String) cls.getMethod("getServiceName", String.class, Integer.TYPE).invoke(cls, HintConstants.AUTOFILL_HINT_PHONE, 1);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            String strTrim = telephonyManager.getDeviceId().trim();
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService(str);
            String strTrim2 = telephonyManager2.getDeviceId().trim();
            if (m11530c(strTrim).booleanValue() && (jSONObjectM11519a2 = m11519a(telephonyManager, strTrim)) != null) {
                jSONArray.put(jSONObjectM11519a2);
            }
            if (m11530c(strTrim2).booleanValue() && (jSONObjectM11519a = m11519a(telephonyManager2, strTrim2)) != null) {
                jSONArray.put(jSONObjectM11519a);
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    private static JSONArray m11510H(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            Object systemService = context.getSystemService("phone_msim");
            Method method = cls.getMethod("getDeviceId", Integer.TYPE);
            String strTrim = ((String) method.invoke(systemService, 0)).trim();
            String strTrim2 = ((String) method.invoke(systemService, 1)).trim();
            if (m11530c(strTrim).booleanValue()) {
                jSONArray.put(m11520a(cls, systemService, 0, strTrim, ""));
            }
            if (m11530c(strTrim2).booleanValue()) {
                jSONArray.put(m11520a(cls, systemService, 1, strTrim2, ""));
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m11521a(Context context) {
        try {
            f14538c = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m11527b(String[] strArr) throws SocketException {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (networkInterfaceNextElement.getName().toLowerCase().startsWith("wlan") && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null) {
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement != null && !inetAddressNextElement.isLoopbackAddress()) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (inetAddressNextElement instanceof Inet4Address) {
                                strArr[0] = hostAddress;
                            } else if (inetAddressNextElement instanceof Inet6Address) {
                                int iIndexOf = hostAddress.indexOf("%");
                                if (iIndexOf > 0) {
                                    hostAddress = hostAddress.substring(0, iIndexOf);
                                }
                                strArr[1] = hostAddress;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m11534c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            if (C7912cq.m11607b(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m11536d(Context context) {
        try {
            if (m11541i(context)) {
                return true;
            }
            return ((WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI)).isWifiEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m11537e(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
        } catch (Throwable unused) {
        }
        return f14538c.getSimState() == 5;
    }

    /* renamed from: f */
    public static boolean m11538f(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: g */
    public static boolean m11539g(Context context) {
        return C7912cq.m11595a(17) ? Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    /* renamed from: h */
    public static boolean m11540h(Context context) {
        int simState;
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            simState = f14538c.getSimState();
        } catch (Throwable unused) {
        }
        return (1 == simState || simState == 0) ? false : true;
    }

    /* renamed from: i */
    public static boolean m11541i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            if (C7912cq.m11607b(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                if (C7912cq.m11595a(29)) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) ? false : true;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && 1 == activeNetworkInfo.getType() && activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m11542j(Context context) {
        if (context == null && (context = C7843ab.f14307g) == null) {
            return false;
        }
        try {
            if (f14538c == null) {
                m11521a(context);
            }
        } catch (Throwable unused) {
        }
        return f14538c.getDataState() == 2;
    }

    /* renamed from: k */
    public static String m11543k(Context context) {
        return !m11529b(context) ? "OFFLINE" : m11541i(context) ? "WIFI" : m11511a(m11546n(context));
    }

    /* renamed from: l */
    public static String m11544l(Context context) {
        return !m11529b(context) ? "offline" : m11541i(context) ? UtilityImpl.NET_TYPE_WIFI : "cellular";
    }

    /* renamed from: m */
    public static String m11545m(Context context) {
        return (!(context == null && (context = C7843ab.f14307g) == null) && m11529b(context)) ? m11541i(context) ? "WIFI" : m11525b(m11546n(context)) : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    /* renamed from: n */
    public static int m11546n(Context context) {
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        if (f14538c == null) {
            m11521a(context);
        }
        return f14538c.getNetworkType();
    }

    /* renamed from: o */
    public static String m11547o(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getNetworkOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static String m11548p(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getSimOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static String m11549q(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        if (C7843ab.f14283R || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(UtilityImpl.NET_TYPE_WIFI)) == null || !C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE") || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getBSSID();
    }

    /* renamed from: r */
    public static String m11550r(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getNetworkCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static String m11551s(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getNetworkOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static String m11552t(Context context) {
        try {
            if (f14538c == null) {
                m11521a(context);
            }
            return f14538c.getSimOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void tryGetDoubleSimInfoReCheck(Context context) {
        try {
            if (f14558w.length() <= 0 && !f14559x) {
                m11506D(context);
            }
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }

    /* renamed from: u */
    public static JSONArray m11553u(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", UtilityImpl.NET_TYPE_WIFI);
            jSONObject.put("available", m11536d(context));
            jSONObject.put("connected", m11541i(context));
            jSONObject.put("current", m11557y(context));
            jSONObject.put("scannable", m11558z(context));
            jSONObject.put("configured", m11556x(context));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "cellular");
            jSONObject2.put("available", m11537e(context));
            jSONObject2.put("connected", m11542j(context));
            jSONObject2.put("current", m11513a(context, false));
            jSONObject2.put("scannable", m11554v(context));
            jSONArray.put(jSONObject2);
        } catch (Throwable unused2) {
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x016d, B:58:0x0172, B:60:0x0179, B:62:0x017e, B:64:0x0185, B:66:0x018c, B:67:0x019c, B:46:0x00cd, B:47:0x0114, B:49:0x011a, B:51:0x013c, B:53:0x0140), top: B:92:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x016d, B:58:0x0172, B:60:0x0179, B:62:0x017e, B:64:0x0185, B:66:0x018c, B:67:0x019c, B:46:0x00cd, B:47:0x0114, B:49:0x011a, B:51:0x013c, B:53:0x0140), top: B:92:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x016d, B:58:0x0172, B:60:0x0179, B:62:0x017e, B:64:0x0185, B:66:0x018c, B:67:0x019c, B:46:0x00cd, B:47:0x0114, B:49:0x011a, B:51:0x013c, B:53:0x0140), top: B:92:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x016d, B:58:0x0172, B:60:0x0179, B:62:0x017e, B:64:0x0185, B:66:0x018c, B:67:0x019c, B:46:0x00cd, B:47:0x0114, B:49:0x011a, B:51:0x013c, B:53:0x0140), top: B:92:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:56:0x016d, B:58:0x0172, B:60:0x0179, B:62:0x017e, B:64:0x0185, B:66:0x018c, B:67:0x019c, B:46:0x00cd, B:47:0x0114, B:49:0x011a, B:51:0x013c, B:53:0x0140), top: B:92:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.telephony.CellSignalStrength] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @android.annotation.TargetApi(18)
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray m11554v(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7903ch.m11554v(android.content.Context):org.json.JSONArray");
    }

    /* renamed from: w */
    public static String m11555w(Context context) {
        WifiInfo connectionInfo;
        if (C7843ab.f14283R) {
            return null;
        }
        try {
            if (!C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE")) {
                return null;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI);
            if (wifiManager.isWifiEnabled() && m11541i(context) && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static JSONArray m11556x(Context context) {
        List<WifiConfiguration> configuredNetworks;
        if (C7843ab.f14283R) {
            return null;
        }
        JSONArray jSONArray = f14554s;
        if (jSONArray != null && (jSONArray.length() > 0 || f14551p)) {
            return f14554s;
        }
        try {
            if (C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE") && (configuredNetworks = ((WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI)).getConfiguredNetworks()) != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkId", wifiConfiguration.networkId);
                        jSONObject.put("priority", wifiConfiguration.priority);
                        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, wifiConfiguration.SSID);
                        jSONObject.put(AgooConstants.MESSAGE_ID, wifiConfiguration.BSSID);
                        jSONArray2.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
                f14551p = true;
                JSONArray jSONArrayM11526b = m11526b(jSONArray2, 30);
                f14554s = jSONArrayM11526b;
                return jSONArrayM11526b;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: y */
    public static JSONArray m11557y(Context context) {
        WifiInfo connectionInfo;
        if (C7843ab.f14283R) {
            return null;
        }
        if (f14553r.length() > 0 || f14550o) {
            return f14553r;
        }
        try {
            if (C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE")) {
                WifiManager wifiManager = (WifiManager) context.getSystemService(UtilityImpl.NET_TYPE_WIFI);
                if (wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    String strM11512a = m11512a(DispatchConstants.BSSID);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, m11512a("ssid"));
                        jSONObject.put(AgooConstants.MESSAGE_ID, strM11512a);
                        jSONObject.put("level", connectionInfo.getRssi());
                        jSONObject.put("hidden", connectionInfo.getHiddenSSID());
                        jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, connectionInfo.getIpAddress());
                        jSONObject.put(OssUtils.SPEED, connectionInfo.getLinkSpeed());
                        jSONObject.put("networkId", connectionInfo.getNetworkId());
                        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                        if (dhcpInfo != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("dns1", dhcpInfo.dns1);
                            jSONObject2.put("dns2", dhcpInfo.dns2);
                            jSONObject2.put("gw", dhcpInfo.gateway);
                            jSONObject2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, dhcpInfo.ipAddress);
                            jSONObject2.put("mask", dhcpInfo.netmask);
                            jSONObject2.put("server", dhcpInfo.serverAddress);
                            jSONObject2.put("leaseDuration", dhcpInfo.leaseDuration);
                            jSONObject.put("dhcp", jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                    f14550o = true;
                    f14553r.put(jSONObject);
                    return f14553r;
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: z */
    public static synchronized JSONArray m11558z(Context context) {
        try {
            if (!C7912cq.f14610c) {
                return null;
            }
            if (C7843ab.f14283R) {
                return null;
            }
            JSONArray jSONArray = f14555t;
            if (jSONArray == null || (jSONArray.length() <= 0 && !f14552q)) {
                try {
                    if (C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE")) {
                        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(UtilityImpl.NET_TYPE_WIFI);
                        if (wifiManager.isWifiEnabled() || wifiManager.isScanAlwaysAvailable()) {
                            if (C7912cq.m11607b(context, "android.permission.CHANGE_WIFI_STATE") && !f14556u) {
                                try {
                                    context.registerReceiver(f14557v, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                                } catch (Throwable unused) {
                                }
                                f14556u = true;
                            }
                            wifiManager.startScan();
                            f14557v.await();
                            List<ScanResult> scanResults = wifiManager.getScanResults();
                            f14557v.reset();
                            if (scanResults != null) {
                                ArrayList arrayList = new ArrayList();
                                for (ScanResult scanResult : scanResults) {
                                    if (scanResult.level >= -85) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put(AgooConstants.MESSAGE_ID, scanResult.BSSID);
                                            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, scanResult.SSID);
                                            jSONObject.put("level", scanResult.level);
                                            jSONObject.put("freq", scanResult.frequency);
                                            if (C7912cq.m11595a(17)) {
                                                jSONObject.put("ts", scanResult.timestamp);
                                                jSONObject.put("scanTs", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.timestamp / 1000));
                                            }
                                            arrayList.add(jSONObject);
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                                f14552q = true;
                                JSONArray jSONArrayM11514a = m11514a(arrayList, 20);
                                f14555t = jSONArrayM11514a;
                                return jSONArrayM11514a;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
                return null;
            }
            return f14555t;
        } finally {
        }
    }

    /* renamed from: a */
    public static String m11512a(String str) {
        return f14539d.get(str);
    }

    /* renamed from: a */
    public static String[] m11523a() {
        String[] strArr = {null, null, null, null};
        if (!C7843ab.f14284S) {
            boolean zM11541i = m11541i(C7843ab.f14307g);
            boolean zM11542j = m11542j(C7843ab.f14307g);
            if (!zM11541i && !zM11542j) {
                C7896ca.iForInternal("no-network");
                return strArr;
            }
            try {
                if (zM11541i) {
                    m11527b(strArr);
                    return strArr;
                }
                if (zM11542j) {
                    m11522a(strArr);
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    /* renamed from: d */
    private static Map<String, Object> m11535d() {
        Process processExec;
        HashMap map;
        String[] strArrSplit;
        BufferedReader bufferedReader = null;
        try {
            processExec = Runtime.getRuntime().exec("ip n");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                try {
                    map = new HashMap();
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.indexOf("lladdr") > -1 && (strArrSplit = line.split(" ")) != null && strArrSplit.length > 5) {
                                String str = strArrSplit[0];
                                String strM11532c = m11532c(strArrSplit);
                                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strM11532c) && !map.containsKey(str)) {
                                    map.put(str, strM11532c);
                                }
                            }
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (processExec != null) {
                                processExec.destroy();
                            }
                            return map;
                        }
                    }
                    processExec.waitFor();
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    map = null;
                }
            } catch (Throwable unused5) {
                map = null;
            }
        } catch (Throwable unused6) {
            processExec = null;
            map = null;
        }
        processExec.destroy();
        return map;
    }

    /* renamed from: c */
    private static String m11531c(int i10) {
        if (i10 >= 0) {
            String[] strArr = f14541f;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        return String.valueOf(i10);
    }

    /* renamed from: c */
    private static Boolean m11530c(String str) {
        try {
            int length = str.length();
            if (length > 10 && length < 20 && !m11524b(str.trim()).booleanValue()) {
                return Boolean.TRUE;
            }
        } catch (Throwable unused) {
        }
        return Boolean.FALSE;
    }

    /* renamed from: a */
    private static void m11522a(String[] strArr) throws SocketException {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (!networkInterfaceNextElement.isLoopback()) {
                String lowerCase = networkInterfaceNextElement.getName().toLowerCase();
                if (!lowerCase.startsWith("wlan") && !lowerCase.startsWith("eth") && !lowerCase.startsWith("dummy") && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null && inetAddresses.hasMoreElements()) {
                    arrayList.add(Collections.list(inetAddresses));
                }
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        Collections.sort(arrayList, new Comparator<List<InetAddress>>() { // from class: com.tendcloud.tenddata.ch.1
            @Override // java.util.Comparator
            public int compare(List<InetAddress> list, List<InetAddress> list2) {
                return list.size() - list2.size();
            }
        });
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            for (InetAddress inetAddress : (List) arrayList.get(size)) {
                if (!inetAddress.isLinkLocalAddress() && !inetAddress.isLoopbackAddress()) {
                    if (inetAddress instanceof Inet4Address) {
                        strArr[2] = inetAddress.getHostAddress();
                    } else if (inetAddress instanceof Inet6Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (!hostAddress.contains("ff:fe")) {
                            strArr[3] = hostAddress;
                        }
                    }
                }
            }
            if (strArr[2] != null || strArr[3] != null) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static Map<String, Object> m11533c() {
        try {
            if (C7912cq.m11595a(29)) {
                return m11535d();
            }
            HashMap map = new HashMap();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/net/arp")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String[] strArrSplit = line.split("[ ]+");
                    if (!strArrSplit[0].matches("IP")) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[3];
                        if (!map.containsKey(str) && !str2.equals("00:00:00:00:00:00")) {
                            map.put(str, str2);
                        }
                    }
                } else {
                    bufferedReader.close();
                    return map;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m11529b(Context context) {
        Socket socket;
        ConnectivityManager connectivityManager;
        try {
            if (C7912cq.m11607b(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                if (C7912cq.m11595a(29)) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                        return networkCapabilities != null && networkCapabilities.hasCapability(12);
                    }
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                    if (networkInfo == null || !networkInfo.getState().equals(NetworkInfo.State.UNKNOWN)) {
                        return false;
                    }
                }
            }
            if (SystemClock.elapsedRealtime() - f14545j > 300000) {
                f14545j = SystemClock.elapsedRealtime();
                Socket socket2 = null;
                try {
                    try {
                        if (m11528b()) {
                            socket = new Socket(Proxy.getDefaultHost(), Proxy.getDefaultPort());
                        } else {
                            socket = new Socket(f14536a, 80);
                        }
                        socket2 = socket;
                        f14543h = true;
                    } catch (Throwable th) {
                        if (socket2 != null) {
                            try {
                                socket2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    f14543h = false;
                    if (socket2 != null) {
                    }
                }
                socket2.close();
            }
        } catch (Throwable unused3) {
        }
        return f14543h;
    }

    /* renamed from: c */
    private static String m11532c(String[] strArr) {
        if (strArr != null && strArr.length >= 6) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= strArr.length) {
                    break;
                }
                if ("lladdr".equalsIgnoreCase(strArr[i11])) {
                    i10 = i11 + 1;
                    break;
                }
                i11++;
            }
            if (i10 > 0 && i10 < strArr.length) {
                String str = strArr[i10];
                if (str.matches("([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}") && !str.equals("00:00:00:00:00:00")) {
                    return str;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m11511a(int i10) {
        if (i10 >= 0) {
            String[] strArr = f14540e;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        return String.valueOf(i10);
    }

    /* renamed from: a */
    public static JSONArray m11513a(Context context, boolean z10) {
        CdmaCellLocation cdmaCellLocation;
        if (context == null) {
            try {
                context = C7843ab.f14307g;
                if (context == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        if (f14548m.length() <= 0 && !f14546k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", m11546n(context));
            jSONObject.put("mcc", m11547o(context));
            jSONObject.put("operator", m11551s(context));
            jSONObject.put("country", m11550r(context));
            if (C7912cq.m11607b(context, "android.permission.ACCESS_COARSE_LOCATION") || C7912cq.m11607b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                if (f14538c == null) {
                    m11521a(context);
                }
                if ((C7912cq.f14610c || z10) && !C7843ab.f14282Q) {
                    CellLocation cellLocation = f14538c.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        if (gsmCellLocation != null) {
                            jSONObject.put("systemId", gsmCellLocation.getLac());
                            jSONObject.put("networkId", gsmCellLocation.getCid());
                            if (C7912cq.m11595a(9)) {
                                jSONObject.put("basestationId", gsmCellLocation.getPsc());
                            }
                        }
                    } else if ((cellLocation instanceof CdmaCellLocation) && (cdmaCellLocation = (CdmaCellLocation) cellLocation) != null) {
                        jSONObject.put("systemId", cdmaCellLocation.getSystemId());
                        jSONObject.put("networkId", cdmaCellLocation.getNetworkId());
                        jSONObject.put("basestationId", cdmaCellLocation.getBaseStationId());
                        jSONObject.put(RequestParameters.SUBRESOURCE_LOCATION, m11517a(cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude()));
                    }
                }
            }
            f14546k = true;
            f14548m.put(jSONObject);
            return f14548m;
        }
        return f14548m;
    }

    /* renamed from: b */
    public static boolean m11528b() {
        try {
            if (C7912cq.m11595a(11)) {
                return !TextUtils.isEmpty(System.getProperty("http.proxyHost"));
            }
            return !TextUtils.isEmpty(Proxy.getDefaultHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m11525b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
                return "4G";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: b */
    public static JSONArray m11526b(JSONArray jSONArray, int i10) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.optJSONObject(i11));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.ch.3
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject.getInt("networkId") - jSONObject2.getInt("networkId");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i10) {
                i10 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Boolean m11524b(String str) {
        try {
            char cCharAt = str.length() > 0 ? str.charAt(0) : '0';
            Boolean bool = Boolean.TRUE;
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (cCharAt != str.charAt(i10)) {
                    return Boolean.FALSE;
                }
            }
            return bool;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static JSONArray m11516a(JSONArray jSONArray, int i10) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.optJSONObject(i11));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.ch.2
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("asuLevel") - jSONObject.getInt("asuLevel");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i10) {
                i10 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m11517a(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DispatchConstants.LATITUDE, i10);
            jSONObject.put(DispatchConstants.LONGTITUDE, i11);
            jSONObject.put("unit", "qd");
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONArray m11514a(ArrayList arrayList, int i10) {
        try {
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.ch.4
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("level") - jSONObject.getInt("level");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i10) {
                i10 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONArray m11515a(BitSet bitSet) {
        if (bitSet == null || bitSet.cardinality() < 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i10 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i10);
            if (iNextSetBit < 0) {
                return jSONArray;
            }
            jSONArray.put(iNextSetBit);
            i10 = iNextSetBit + 1;
        }
    }

    /* renamed from: a */
    private static JSONObject m11519a(TelephonyManager telephonyManager, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_IMEI, str.trim());
            jSONObject.put("imei5", C7912cq.m11612c(str.trim()));
            String simCountryIso = "";
            jSONObject.put("subscriberId", telephonyManager.getSubscriberId() == null ? "" : telephonyManager.getSubscriberId());
            jSONObject.put("simSerialNumber", telephonyManager.getSimSerialNumber() == null ? "" : telephonyManager.getSimSerialNumber());
            jSONObject.put("dataState", telephonyManager.getDataState());
            jSONObject.put("networkType", m11511a(telephonyManager.getNetworkType()));
            jSONObject.put("networkOperator", telephonyManager.getNetworkOperator());
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, m11531c(telephonyManager.getPhoneType()));
            jSONObject.put("simOperator", telephonyManager.getSimOperator() == null ? "" : telephonyManager.getSimOperator());
            jSONObject.put("simOperatorName", telephonyManager.getSimOperatorName() == null ? "" : telephonyManager.getSimOperatorName());
            if (telephonyManager.getSimCountryIso() != null) {
                simCountryIso = telephonyManager.getSimCountryIso();
            }
            jSONObject.put("simCountryIso", simCountryIso);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m11518a(Context context, SubscriptionManager subscriptionManager, int i10) {
        SubscriptionInfo activeSubscriptionInfoForSimSlotIndex;
        JSONObject jSONObject = new JSONObject();
        try {
            if (C7912cq.m11595a(22) && (activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i10)) != null) {
                String countryIso = "";
                jSONObject.put("simSerialNumber", activeSubscriptionInfoForSimSlotIndex.getIccId() == null ? "" : activeSubscriptionInfoForSimSlotIndex.getIccId());
                jSONObject.put("simOperator", activeSubscriptionInfoForSimSlotIndex.getMcc() + "0" + activeSubscriptionInfoForSimSlotIndex.getMnc());
                jSONObject.put("simOperatorName", activeSubscriptionInfoForSimSlotIndex.getCarrierName() == null ? "" : activeSubscriptionInfoForSimSlotIndex.getCarrierName());
                if (activeSubscriptionInfoForSimSlotIndex.getCountryIso() != null) {
                    countryIso = activeSubscriptionInfoForSimSlotIndex.getCountryIso();
                }
                jSONObject.put("simCountryIso", countryIso);
                jSONObject.put("subscriberId", C7900ce.m11481a(Constants.KEY_IMSI));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m11520a(Class<?> cls, Object obj, Integer num, String str, String str2) throws JSONException {
        String strTrim;
        String strTrim2;
        String strTrim3;
        String strTrim4 = "";
        Class cls2 = Integer.TYPE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_IMEI, str);
        jSONObject.put("imei5", C7912cq.m11612c(str));
        try {
            Method method = cls.getMethod("getSubscriberId" + str2, cls2);
            if (method.invoke(obj, num) == null) {
                strTrim3 = "";
            } else {
                strTrim3 = ((String) method.invoke(obj, num)).trim();
            }
            jSONObject.put("subscriberId", strTrim3);
        } catch (Throwable unused) {
        }
        try {
            Method method2 = cls.getMethod("getSimSerialNumber" + str2, cls2);
            if (method2.invoke(obj, num) == null) {
                strTrim2 = "";
            } else {
                strTrim2 = ((String) method2.invoke(obj, num)).trim();
            }
            jSONObject.put("simSerialNumber", strTrim2);
        } catch (Throwable unused2) {
        }
        try {
            jSONObject.put("dataState", (Integer) cls.getMethod("getDataState" + str2, cls2).invoke(obj, num));
        } catch (Throwable unused3) {
        }
        try {
            jSONObject.put("networkType", m11511a(((Integer) cls.getMethod("getNetworkType" + str2, cls2).invoke(obj, num)).intValue()));
        } catch (Throwable unused4) {
        }
        try {
            jSONObject.put("networkOperator", (String) cls.getMethod("getNetworkOperator" + str2, cls2).invoke(obj, num));
        } catch (Throwable unused5) {
        }
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, m11531c(((Integer) cls.getMethod("getPhoneType" + str2, cls2).invoke(obj, num)).intValue()));
        } catch (Throwable unused6) {
        }
        try {
            Method method3 = cls.getMethod("getSimOperator" + str2, cls2);
            if (method3.invoke(obj, num) == null) {
                strTrim = "";
            } else {
                strTrim = ((String) method3.invoke(obj, num)).trim();
            }
            jSONObject.put("simOperator", strTrim);
        } catch (Throwable unused7) {
        }
        try {
            Method method4 = cls.getMethod("getSimOperatorName" + str2, cls2);
            if (method4.invoke(obj, num) != null) {
                strTrim4 = ((String) method4.invoke(obj, num)).trim();
            }
            jSONObject.put("simOperatorName", strTrim4);
        } catch (Throwable unused8) {
        }
        return jSONObject;
    }
}
