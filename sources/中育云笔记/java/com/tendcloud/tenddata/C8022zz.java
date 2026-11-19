package com.tendcloud.tenddata;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.agoo.p087a.p088a.C7707c;
import com.tendcloud.tenddata.C7847af;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.zz */
/* loaded from: classes5.dex */
public final class C8022zz implements InterfaceC7856ao {

    /* renamed from: a */
    public static String f15140a = null;

    /* renamed from: b */
    public static volatile boolean f15141b = false;

    /* renamed from: c */
    public static volatile boolean f15142c = false;

    /* renamed from: d */
    static boolean f15143d = false;

    /* renamed from: e */
    public static C7868b f15144e = null;

    /* renamed from: f */
    public static final int f15145f = 102;

    /* renamed from: g */
    private static volatile C8022zz f15146g = null;

    /* renamed from: h */
    private static String f15147h = null;

    /* renamed from: i */
    private static String f15148i = null;

    /* renamed from: j */
    private static String f15149j = null;

    /* renamed from: k */
    private static boolean f15150k = false;

    /* renamed from: l */
    private static final int f15151l = 101;

    /* renamed from: m */
    private static final int f15152m = 103;

    /* renamed from: n */
    private static Handler f15153n;

    /* renamed from: o */
    private static final HandlerThread f15154o;

    /* renamed from: p */
    private static Handler f15155p;

    /* renamed from: q */
    private static final HandlerThread f15156q;

    /* renamed from: com.tendcloud.tenddata.zz$a */
    public static class a {
        public HashMap<String, Object> paraMap = new HashMap<>();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ProcessingThread", 10);
        f15154o = handlerThread;
        f15155p = null;
        HandlerThread handlerThread2 = new HandlerThread("PauseEventThread", 10);
        f15156q = handlerThread2;
        handlerThread.start();
        f15153n = new Handler(handlerThread.getLooper()) { // from class: com.tendcloud.tenddata.zz.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C7978fb.m11946a();
                C7977fa.m11937a();
                Object obj = message.obj;
                if (obj == null || !(obj instanceof a)) {
                    return;
                }
                try {
                    C7913cr.m11625a().post((a) obj);
                } catch (Throwable unused) {
                }
            }
        };
        handlerThread2.start();
        f15155p = new Handler(handlerThread2.getLooper()) { // from class: com.tendcloud.tenddata.zz.12
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    AbstractC7841a abstractC7841a = (AbstractC7841a) message.obj;
                    if (C7843ab.f14314n == 1) {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 11);
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        aVar.paraMap.put("sessionEnd", 1);
                        aVar.paraMap.put("service", abstractC7841a);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        C7843ab.f14291Z.set(true);
                        C7843ab.f14314n = 2;
                    }
                } catch (Exception unused) {
                }
            }
        };
    }

    public C8022zz() {
        f15146g = this;
    }

    /* renamed from: a */
    public static synchronized C8022zz m12130a() {
        try {
            if (f15146g == null) {
                synchronized (C8022zz.class) {
                    try {
                        if (f15146g == null) {
                            f15146g = new C8022zz();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15146g;
    }

    /* renamed from: b */
    public static Handler m12133b() {
        return f15155p;
    }

    /* renamed from: c */
    public static Handler m12134c() {
        return f15153n;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: d */
    public Context mo11219d() {
        try {
            return C7843ab.f14307g;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: e */
    public void mo11223e() {
        try {
            C7896ca.f14478a = false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    public void removeGlobalKV(String str) {
        if (!f15141b) {
            C7896ca.eForDeveloper("SDK have not been initialized");
            return;
        }
        if (str != null) {
            C7896ca.iForDeveloper("removeGlobalKV# key:" + str);
        }
        C7843ab.f14304d.remove(str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    public void setCustomDataSwitch(TalkingDataSharingFilter talkingDataSharingFilter) {
        C7843ab.f14322v = talkingDataSharingFilter;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public String mo11203b(Context context, AbstractC7841a abstractC7841a) {
        if (context != null) {
            try {
                if (!f15141b) {
                    C7896ca.iForDeveloper("SDK have not been initialized");
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return C7898cc.m11411a(context);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: c */
    public String mo11214c(Context context, AbstractC7841a abstractC7841a) {
        return C7843ab.m11027a(context, abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: d */
    public String mo11220d(Context context, AbstractC7841a abstractC7841a) {
        return C7843ab.m11034b(context, abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: e */
    public String mo11222e(Context context, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
            }
            return C7994fr.m11998a().m11999c();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: c */
    public void mo11218c(boolean z10) {
        try {
            C7843ab.f14305e = z10;
            C7896ca.iForDeveloper(" setReportUncaughtExceptions: " + z10);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: d */
    public void mo11221d(final String str, final String str2, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            C7896ca.iForDeveloper("onPunch called --> profileId: " + str + " punchId: " + str2);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.35
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "user");
                        aVar.paraMap.put("action", "punch");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("punchId", str2);
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public String mo11202b(Context context) {
        try {
            return C7898cc.m11411a(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: c */
    public void mo11215c(final String str, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onReceiveDeepLink: url could not be null or empty");
                return;
            }
            C7896ca.iForDeveloper("onReceiveDeepLink --> link: " + str);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.29
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C7982ff.m11972a().setDeepLink(str);
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 1);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "app");
                        aVar.paraMap.put("action", "deeplink");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("link", str);
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11204b(Activity activity, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
            } else {
                if (f15150k) {
                    return;
                }
                m12131a(activity);
                C7895c.m11367b(activity, abstractC7841a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11158a(Context context, AbstractC7841a abstractC7841a) {
        mo11160a(context, (String) null, (String) null, abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11160a(Context context, String str, String str2, AbstractC7841a abstractC7841a) {
        mo11161a(context, str, str2, (String) null, abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11161a(Context context, String str, String str2, String str3, final AbstractC7841a abstractC7841a) {
        try {
            if (context == null) {
                C7896ca.iForDeveloper("Init failed Context is null");
                return;
            }
            if (!C7912cq.m11607b(context, "android.permission.INTERNET")) {
                C7896ca.eForDeveloper("[SDKInit] Permission \"android.permission.INTERNET\" is needed.");
                return;
            }
            if (abstractC7841a == null) {
                C7896ca.eForDeveloper("Failed to initialize!");
                return;
            }
            try {
                if (f15141b) {
                    return;
                }
                C7843ab.f14307g = context.getApplicationContext();
                f15147h = str;
                f15149j = str2;
                f15140a = str3;
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                String strM11587a = C7912cq.m11587a(bundle, C7843ab.f14295ac);
                String strM11587a2 = C7912cq.m11587a(bundle, "TD_CHANNEL_ID");
                if (C7912cq.m11608b(strM11587a)) {
                    strM11587a = f15147h;
                }
                f15147h = strM11587a;
                if (C7912cq.m11608b(strM11587a2)) {
                    strM11587a2 = f15149j;
                }
                f15149j = strM11587a2;
                C7843ab.m11040c(f15140a, abstractC7841a);
                String strM11586a = C7912cq.m11586a(context, "ChannelConfig.json");
                if (C7912cq.m11608b(strM11586a)) {
                    strM11586a = f15149j;
                }
                f15149j = strM11586a;
                if (C7912cq.m11608b(f15147h)) {
                    C7896ca.eForDeveloper("[SDKInit] TD AppId is null");
                    return;
                }
                String strTrim = f15147h.trim();
                f15147h = strTrim;
                C7843ab.m11030a(strTrim, f15149j, abstractC7841a);
                C7945dw.m11816a();
                C7943du.m11787a().m11807a(f15147h, f15149j, abstractC7841a);
                m12131a(context);
                C7944dv.m11810a();
                C8016u.m12091a();
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.23
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C7950ea.m11828a();
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 1);
                            aVar.paraMap.put("appId", C8022zz.f15147h != null ? C8022zz.f15147h : "");
                            aVar.paraMap.put("channelId", C8022zz.f15149j != null ? C8022zz.f15149j : "");
                            aVar.paraMap.put("service", abstractC7841a);
                            aVar.paraMap.put("action", "init");
                            Message.obtain(C8022zz.m12134c(), 101, aVar).sendToTarget();
                            C7951eb.m11845a();
                            if (C7912cq.m11596a(C7843ab.f14307g)) {
                                C7895c.m11364a(abstractC7841a);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                f15141b = true;
            } catch (Throwable th) {
                C7896ca.m11370a("[SDKInit] Failed to initialize!", th);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11205b(Context context, String str, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C7912cq.m11608b(str)) {
                    str = activity.getLocalClassName();
                }
                if ((activity.getChangingConfigurations() & 128) == 128) {
                    f15143d = true;
                    return;
                }
            }
            m12132a(context, str, 5, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: c */
    public void mo11216c(String str, String str2, AbstractC7841a abstractC7841a) {
        mo11217c(str, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: c */
    public void mo11217c(final String str, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onShare called --> profileId: ");
            sb2.append(str);
            sb2.append(", content: ");
            sb2.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb2.append(str3);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.33
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "user");
                        aVar.paraMap.put("action", "share");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11208b(String str, C7847af.ProfileType profileType, String str2, AbstractC7841a abstractC7841a) {
        mo11209b(str, profileType, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11209b(final String str, final C7847af.ProfileType profileType, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLogin called --> profileId is ");
            sb2.append(str);
            sb2.append(" ，profile is ");
            sb2.append(profileType);
            sb2.append(" , name is ");
            sb2.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb2.append(str3);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("action", "login");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("accountId", str);
                        C7847af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar.paraMap.put(HintConstants.AUTOFILL_HINT_NAME, str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11207b(String str, AbstractC7841a abstractC7841a) {
        mo11213b(str, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11213b(final String str, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str2;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRegister called --> profileId is ");
            sb2.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb2.append(str2);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("action", C7707c.JSON_CMD_REGISTER);
                        aVar.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11210b(final String str, final String str2, final int i10, final String str3, final String str4, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && str.trim().length() > 0) {
                C7896ca.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i10 + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.15
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onPay: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11156a(Activity activity, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
            } else {
                if (f15150k && C7843ab.f14276K) {
                    return;
                }
                m12131a(activity);
                C7895c.m11363a(activity, abstractC7841a);
                C7843ab.f14276K = true;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11206b(final String str, final int i10, final String str2, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && !str.isEmpty()) {
                C7896ca.iForDeveloper("onCancelOrder called --> orderId: " + str + " ,amount: " + i10 + " ,currencyType: " + str2);
                if (str2 != null && str2.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.22
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "cancelOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str2);
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onCancelOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11157a(Activity activity, String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
            } else {
                m12131a(activity);
                mo11156a(activity, abstractC7841a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11159a(Context context, String str, AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (f15143d) {
                f15143d = false;
                return;
            }
            if (C7912cq.m11608b(str) && (context instanceof Activity)) {
                str = ((Activity) context).getLocalClassName();
            }
            m12132a(context, str, 4, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11211b(String str, String str2, AbstractC7841a abstractC7841a) {
        mo11212b(str, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: b */
    public void mo11212b(final String str, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onFavorite called --> category: ");
            sb2.append(str);
            sb2.append(", content: ");
            sb2.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb2.append(str3);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.32
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "user");
                        aVar.paraMap.put("action", "favorites");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("category", str);
                        treeMap.put("content", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m12132a(Context context, final String str, final int i10, final AbstractC7841a abstractC7841a) {
        C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.34
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C8022zz.f15141b) {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", Integer.valueOf(i10));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        HashMap<String, Object> map = aVar.paraMap;
                        String str2 = str;
                        map.put("pageName", str2 == null ? "" : C7912cq.m11588a(str2));
                        aVar.paraMap.put("service", abstractC7841a);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11163a(Context context, String str, String str2, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        mo11164a(context, str, str2, map, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11164a(Context context, final String str, final String str2, final Map<String, Object> map, final Map<String, Object> map2, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onEvent being called! eventId: ");
            sb2.append(str);
            String string = "null";
            if (abstractC7841a.index() != 3) {
                sb2.append(", eventLabel: ");
                sb2.append(str2 == null ? "null" : str2);
            }
            sb2.append(", eventMap: ");
            if (map != null) {
                string = map.toString();
            }
            sb2.append(string);
            if (map2 != null && !map2.isEmpty()) {
                sb2.append(", eventValue: ");
                sb2.append(map2.toString());
            }
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.36
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C7912cq.m11588a(str));
                        HashMap<String, Object> map3 = aVar.paraMap;
                        String str3 = str2;
                        map3.put("eventLabel", str3 == null ? null : C7912cq.m11588a(str3));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Map map4 = map2;
                        if (map4 != null && !map4.isEmpty()) {
                            aVar.paraMap.put("eventValue", map2);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11162a(Context context, final String str, final String str2, final Map<String, Object> map, final double d10, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onEvent being called! eventId: ");
            sb2.append(str);
            String string = "null";
            if (abstractC7841a.index() != 3) {
                sb2.append(", eventLabel: ");
                sb2.append(str2 == null ? "null" : str2);
            }
            sb2.append(", eventMap: ");
            if (map != null) {
                string = map.toString();
            }
            sb2.append(string);
            sb2.append(", value: ");
            sb2.append(d10);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.37
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C7912cq.m11588a(str));
                        HashMap<String, Object> map2 = aVar.paraMap;
                        String str3 = str2;
                        map2.put("eventLabel", str3 == null ? null : C7912cq.m11588a(str3));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("value", Double.valueOf(d10));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11165a(Context context, final String str, final Map<String, Object> map, final double d10, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onEvent()# event id is empty.");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onEvent being called! eventId: ");
            sb2.append(str);
            sb2.append(", eventMap: ");
            sb2.append(map == null ? "null" : map.toString());
            sb2.append(", value: ");
            sb2.append(d10);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.38
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("apiType", 2);
                        aVar.paraMap.put("eventId", C7912cq.m11588a(str));
                        aVar.paraMap.put("map", map);
                        aVar.paraMap.put("value", Double.valueOf(d10));
                        aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11166a(Context context, final Throwable th, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
            } else {
                if (th == null) {
                    return;
                }
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.39
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 3);
                            aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                            aVar.paraMap.put("throwable", th);
                            aVar.paraMap.put("service", abstractC7841a);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11188a(String str, Object obj) {
        if (!f15141b) {
            C7896ca.eForDeveloper("SDK have not been initialized");
            return;
        }
        if (str != null && obj != null) {
            C7896ca.iForDeveloper("setGlobalKV# key:" + str + " value:" + obj.toString());
        }
        C7843ab.f14304d.put(str, obj);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11183a(String str, AbstractC7841a abstractC7841a) {
        mo11200a(str, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11200a(final String str, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str2;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLogin called --> profileId is ");
            sb2.append(str);
            if (map == null || map.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", eventValue: " + map.toString();
            }
            sb2.append(str2);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.40
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("action", "login");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("accountId", str);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11184a(String str, C7847af.ProfileType profileType, String str2, AbstractC7841a abstractC7841a) {
        mo11185a(str, profileType, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11185a(final String str, final C7847af.ProfileType profileType, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRegister called --> profileId is ");
            sb2.append(str);
            sb2.append(" ，type is ");
            sb2.append(profileType);
            sb2.append(" , name is ");
            sb2.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb2.append(str3);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("action", C7707c.JSON_CMD_REGISTER);
                        aVar.paraMap.put("accountId", str);
                        C7847af.ProfileType profileType2 = profileType;
                        if (profileType2 != null) {
                            aVar.paraMap.put("type", profileType2.name());
                        }
                        String str4 = str2;
                        if (str4 != null) {
                            aVar.paraMap.put(HintConstants.AUTOFILL_HINT_NAME, str4);
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11180a(String str, TalkingDataProfile talkingDataProfile, String str2, AbstractC7841a abstractC7841a) {
        mo11181a(str, talkingDataProfile, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11181a(final String str, final TalkingDataProfile talkingDataProfile, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            String str3 = "";
            if (talkingDataProfile != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onRegister called --> profileId is ");
                sb2.append(str);
                sb2.append(" , profile is ");
                sb2.append(C7912cq.m11591a(talkingDataProfile).toString());
                sb2.append(" , invitationCode is ");
                sb2.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb2.append(str3);
                C7896ca.iForDeveloper(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onRegister called --> profileId is ");
                sb3.append(str);
                sb3.append(" , invitationCode is ");
                sb3.append(str2);
                if (map != null && !map.isEmpty()) {
                    str3 = ", eventValue: " + map.toString();
                }
                sb3.append(str3);
                C7896ca.iForDeveloper(sb3.toString());
            }
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("action", C7707c.JSON_CMD_REGISTER);
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(abstractC7841a.name())) {
                            aVar.paraMap.put("action", "_td_register");
                        }
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put("invitationCode", str2);
                        aVar.paraMap.put("data", C7912cq.m11591a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11179a(String str, TalkingDataProfile talkingDataProfile, AbstractC7841a abstractC7841a) {
        mo11182a(str, talkingDataProfile, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11182a(final String str, final TalkingDataProfile talkingDataProfile, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onLogin: profileId could not be null or empty");
                return;
            }
            String str2 = "";
            if (talkingDataProfile != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLogin called --> profileId is ");
                sb2.append(str);
                sb2.append(" ，profile is ");
                sb2.append(C7912cq.m11591a(talkingDataProfile).toString());
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb2.append(str2);
                C7896ca.iForDeveloper(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onLogin called --> profileId is ");
                sb3.append(str);
                if (map != null && !map.isEmpty()) {
                    str2 = ", eventValue: " + map.toString();
                }
                sb3.append(str2);
                C7896ca.iForDeveloper(sb3.toString());
            }
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("action", "login");
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(abstractC7841a.name())) {
                            aVar.paraMap.put("action", "_td_login");
                        }
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put("data", C7912cq.m11591a(talkingDataProfile));
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11171a(final TalkingDataProfile talkingDataProfile, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            C7896ca.iForDeveloper("onProfileUpdate called --> profile is " + C7912cq.m11591a(talkingDataProfile).toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("action", "update");
                        if (GrsBaseInfo.CountryCodeSource.APP.equals(abstractC7841a.name())) {
                            aVar.paraMap.put("action", "_td_update");
                        }
                        aVar.paraMap.put("data", C7912cq.m11591a(talkingDataProfile));
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11192a(String str, String str2, AbstractC7841a abstractC7841a) {
        mo11199a(str, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11199a(final String str, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("onRegister: profileId could not be null or empty");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRegister called --> profileId is ");
            sb2.append(str);
            sb2.append(" invitationCode: ");
            sb2.append(str2);
            if (map == null || map.isEmpty()) {
                str3 = "";
            } else {
                str3 = ", eventValue: " + map.toString();
            }
            sb2.append(str3);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 9);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put("action", C7707c.JSON_CMD_REGISTER);
                        aVar.paraMap.put("accountId", str);
                        aVar.paraMap.put("invitationCode", str2);
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            aVar.paraMap.put("eventValue", map);
                        }
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11198a(final String str, final String str2, final String str3, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            C7896ca.iForDeveloper("onCreateCard called --> profileId: " + str + " method: " + str2 + "  content: " + str3);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "account");
                        aVar.paraMap.put("action", "card");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str);
                        treeMap.put("method", str2);
                        treeMap.put("content", str3);
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11194a(String str, String str2, String str3, int i10, int i11, AbstractC7841a abstractC7841a) {
        mo11195a(str, str2, str3, i10, i11, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11195a(final String str, final String str2, final String str3, final int i10, final int i11, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str4;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAddItemToShoppingCart called --> itemId: ");
            sb2.append(str);
            sb2.append(" ,category: ");
            sb2.append(str2);
            sb2.append(" ,name: ");
            sb2.append(str3);
            sb2.append(" ,unitPrice: ");
            sb2.append(i10);
            sb2.append(" ,amount: ");
            sb2.append(i11);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb2.append(str4);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                        aVar.paraMap.put("action", "addItem");
                        aVar.paraMap.put("service", abstractC7841a);
                        TreeMap treeMap = new TreeMap();
                        if (abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put(AgooConstants.MESSAGE_ID, str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put(HintConstants.AUTOFILL_HINT_NAME, str3);
                            }
                            treeMap.put("unitPrice", Integer.valueOf(i10));
                            treeMap.put("count", Integer.valueOf(i11));
                        } else {
                            treeMap.put(AgooConstants.MESSAGE_ID, str);
                            treeMap.put("category", str2);
                            treeMap.put(HintConstants.AUTOFILL_HINT_NAME, str3);
                            treeMap.put("unitPrice", Integer.valueOf(i10));
                            treeMap.put("count", Integer.valueOf(i11));
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11177a(final String str, final int i10, final String str2, final String str3, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && !str.isEmpty()) {
                C7896ca.iForDeveloper("onOrderPaySucc called --> orderid: " + str + " ,amount: " + i10 + " ,currencyType: " + str2 + " ,payType: " + str3);
                if (str2 != null && str2.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.11
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "pay");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str2);
                                treeMap.put("payType", str3);
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onOrderPaySucc: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11169a(final TalkingDataOrder talkingDataOrder, final String str, final String str2, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (talkingDataOrder == null) {
                C7896ca.eForDeveloper("onPay: order could not be null or empty");
                return;
            }
            C7896ca.iForDeveloper("onOrderPaySucc called --> order: " + talkingDataOrder.toString() + " ,paymentType: " + str + " ,profileId: " + str2);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.13
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                        aVar.paraMap.put("action", "pay");
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("accountId", str2);
                        treeMap.put("orderId", talkingDataOrder.getString("keyOrderId"));
                        treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt("keyTotalPrice")));
                        String strOptString = talkingDataOrder.optString("keyCurrencyType");
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = "CNY";
                        }
                        treeMap.put("currencyType", strOptString);
                        if (!TextUtils.isEmpty(str)) {
                            treeMap.put("payType", str);
                        }
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11189a(final String str, final String str2, final int i10, final String str3, final String str4, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && str.trim().length() > 0) {
                C7896ca.iForDeveloper("onOrderPaySucc called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i10 + " ,currencyType: " + str3 + " ,payType: " + str4);
                if (str3 != null && str3.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.14
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onOrderPaySucc: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11191a(final String str, final String str2, final int i10, final String str3, final String str4, final String str5, final int i11, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str2 != null && str2.trim().length() > 0) {
                C7896ca.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i10 + " ,currencyType: " + str3 + " ,payType: " + str4 + " ,itemId: " + str5 + " ,itemCount: " + i11);
                if (str3 != null && str3.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.16
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "currencyPurchase");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                treeMap.put("itemId", str5);
                                treeMap.put("itemCount", Integer.valueOf(i11));
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onPay: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11190a(final String str, final String str2, final int i10, final String str3, final String str4, final C8000fx c8000fx, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && str.trim().length() > 0) {
                if (c8000fx == null) {
                    C7896ca.eForDeveloper("onPay: order could not be null");
                    return;
                }
                C7896ca.iForDeveloper("onPay called --> profileId: " + str + " ,orderid: " + str2 + " ,amount: " + i10 + " ,currencyType: " + str3 + " ,payType: " + str4 + " ,order: " + c8000fx.toString());
                if (str3 != null && str3.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.17
                        @Override // java.lang.Runnable
                        public void run() {
                            JSONArray jSONArray;
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "recharge");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", str2);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str3);
                                treeMap.put("payType", str4);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("orderId", c8000fx.getString("keyOrderId"));
                                jSONObject.put("amount", c8000fx.getInt("keyTotalPrice"));
                                jSONObject.put("currencyType", c8000fx.getString("keyCurrencyType"));
                                if (c8000fx.has("keyOrderDetail") && (jSONArray = c8000fx.getJSONArray("keyOrderDetail")) != null && jSONArray.length() > 0) {
                                    jSONObject.put("items", jSONArray);
                                }
                                treeMap.put("order", jSONObject);
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onPay: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11193a(final String str, final String str2, final C8000fx c8000fx, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && str.trim().length() > 0) {
                if (c8000fx != null && !c8000fx.optString("keyOrderId").isEmpty()) {
                    C7896ca.iForDeveloper("onPay called --> profileId: " + str + " ,payType: " + str2 + " ,order: " + c8000fx.toString());
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.18
                        @Override // java.lang.Runnable
                        public void run() {
                            JSONArray jSONArray;
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "pay");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                if (abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                                    treeMap.put("orderId", c8000fx.getString("keyOrderId"));
                                    if (!TextUtils.isEmpty(str2)) {
                                        treeMap.put("payType", str2);
                                    }
                                    treeMap.put("amount", Integer.valueOf(c8000fx.optInt("keyTotalPrice")));
                                    String strOptString = c8000fx.optString("keyCurrencyType");
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "CNY";
                                    }
                                    treeMap.put("currencyType", strOptString);
                                } else {
                                    treeMap.put("payType", str2);
                                    treeMap.put("orderId", c8000fx.getString("keyOrderId"));
                                    treeMap.put("amount", Integer.valueOf(c8000fx.optInt("keyTotalPrice")));
                                    treeMap.put("currencyType", c8000fx.optString("keyCurrencyType"));
                                }
                                if (c8000fx.has("keyOrderDetail") && (jSONArray = c8000fx.getJSONArray("keyOrderDetail")) != null && jSONArray.length() > 0) {
                                    treeMap.put("items", jSONArray);
                                }
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("onPay: order or orderID could not be null or empty");
                return;
            }
            C7896ca.eForDeveloper("onPay: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11186a(String str, C8000fx c8000fx, AbstractC7841a abstractC7841a) {
        mo11187a(str, c8000fx, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11187a(final String str, final C8000fx c8000fx, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str2;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && str.trim().length() > 0) {
                if (c8000fx != null && !c8000fx.optString("keyOrderId").isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onPlaceOrder called --> profileId: ");
                    sb2.append(str);
                    sb2.append(" ,order: ");
                    sb2.append(c8000fx.toString());
                    if (map == null || map.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", eventValue: " + map.toString();
                    }
                    sb2.append(str2);
                    C7896ca.iForDeveloper(sb2.toString());
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.19
                        @Override // java.lang.Runnable
                        public void run() {
                            JSONArray jSONArray;
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "placeOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("accountId", str);
                                treeMap.put("orderId", c8000fx.getString("keyOrderId"));
                                treeMap.put("amount", Integer.valueOf(c8000fx.optInt("keyTotalPrice")));
                                if (abstractC7841a.name().equals("TRACKING")) {
                                    treeMap.put("currencyType", c8000fx.optString("keyCurrencyType"));
                                } else if (abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                                    String strOptString = c8000fx.optString("keyCurrencyType");
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "CNY";
                                    }
                                    treeMap.put("currencyType", strOptString);
                                }
                                if (c8000fx.has("keyOrderDetail") && (jSONArray = c8000fx.getJSONArray("keyOrderDetail")) != null && jSONArray.length() > 0) {
                                    treeMap.put("items", jSONArray);
                                }
                                Map map2 = map;
                                if (map2 != null && !map2.isEmpty()) {
                                    treeMap.put("eventValue", map);
                                }
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("onPlaceOrder: order or orderID could not be null or empty");
                return;
            }
            C7896ca.eForDeveloper("onPlaceOrder: profileId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11176a(String str, int i10, String str2, AbstractC7841a abstractC7841a) {
        mo11178a(str, i10, str2, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11178a(final String str, final int i10, final String str2, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str3;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (str != null && !str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onPlaceOrder called --> orderId: ");
                sb2.append(str);
                sb2.append(" ,amount: ");
                sb2.append(i10);
                sb2.append(" ,currencyType: ");
                sb2.append(str2);
                if (map == null || map.isEmpty()) {
                    str3 = "";
                } else {
                    str3 = ", eventValue: " + map.toString();
                }
                sb2.append(str3);
                C7896ca.iForDeveloper(sb2.toString());
                if (str2 != null && str2.trim().length() == 3) {
                    C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.20
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a aVar = new a();
                                aVar.paraMap.put("apiType", 8);
                                aVar.paraMap.put("service", abstractC7841a);
                                aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                                aVar.paraMap.put("action", "placeOrder");
                                TreeMap treeMap = new TreeMap();
                                treeMap.put("orderId", str);
                                treeMap.put("amount", Integer.valueOf(i10));
                                treeMap.put("currencyType", str2);
                                Map map2 = map;
                                if (map2 != null && !map2.isEmpty()) {
                                    treeMap.put("eventValue", map);
                                }
                                aVar.paraMap.put("data", treeMap);
                                Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                C7896ca.eForDeveloper("currencyType length must be 3 likes CNY so so");
                return;
            }
            C7896ca.eForDeveloper("onPlaceOrder: orderId could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11168a(TalkingDataOrder talkingDataOrder, String str, AbstractC7841a abstractC7841a) {
        mo11170a(talkingDataOrder, str, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11170a(final TalkingDataOrder talkingDataOrder, final String str, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str2;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString("keyOrderId").isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onPlaceOrder called --> order: ");
                sb2.append(talkingDataOrder.toString());
                sb2.append(", profileId: ");
                sb2.append(str);
                if (map == null || map.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", eventValue: " + map.toString();
                }
                sb2.append(str2);
                C7896ca.iForDeveloper(sb2.toString());
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.21
                    @Override // java.lang.Runnable
                    public void run() {
                        JSONArray jSONArray;
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC7841a);
                            aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                            aVar.paraMap.put("action", "placeOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("accountId", str);
                            treeMap.put("orderId", talkingDataOrder.getString("keyOrderId"));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt("keyTotalPrice")));
                            String strOptString = talkingDataOrder.optString("keyCurrencyType");
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = "CNY";
                            }
                            treeMap.put("currencyType", strOptString);
                            if (talkingDataOrder.has("keyOrderDetail") && (jSONArray = talkingDataOrder.getJSONArray("keyOrderDetail")) != null && jSONArray.length() > 0) {
                                treeMap.put("items", jSONArray);
                            }
                            Map map2 = map;
                            if (map2 != null && !map2.isEmpty()) {
                                treeMap.put("eventValue", map);
                            }
                            aVar.paraMap.put("data", treeMap);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C7896ca.eForDeveloper("onPlaceOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11167a(final TalkingDataOrder talkingDataOrder, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (talkingDataOrder != null && !talkingDataOrder.optString("keyOrderId").isEmpty()) {
                C7896ca.iForDeveloper("onCancelOrder called --> order: " + talkingDataOrder.toString());
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.24
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC7841a);
                            aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                            aVar.paraMap.put("action", "cancelOrder");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("orderId", talkingDataOrder.getString("keyOrderId"));
                            treeMap.put("amount", Integer.valueOf(talkingDataOrder.optInt("keyTotalPrice")));
                            String strOptString = talkingDataOrder.optString("keyCurrencyType");
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = "CNY";
                            }
                            treeMap.put("currencyType", strOptString);
                            aVar.paraMap.put("data", treeMap);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C7896ca.eForDeveloper("onCancelOrder: order or orderID could not be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11196a(String str, String str2, String str3, int i10, AbstractC7841a abstractC7841a) {
        mo11197a(str, str2, str3, i10, new HashMap(), abstractC7841a);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11197a(final String str, final String str2, final String str3, final int i10, final Map<String, Object> map, final AbstractC7841a abstractC7841a) {
        String str4;
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onViewItem called --> itemId: ");
            sb2.append(str);
            sb2.append(" ,category: ");
            sb2.append(str2);
            sb2.append(" ,name: ");
            sb2.append(str3);
            sb2.append(" ,unitPrice: ");
            sb2.append(i10);
            if (map == null || map.isEmpty()) {
                str4 = "";
            } else {
                str4 = ", eventValue: " + map.toString();
            }
            sb2.append(str4);
            C7896ca.iForDeveloper(sb2.toString());
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.25
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 8);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                        aVar.paraMap.put("action", "viewItem");
                        TreeMap treeMap = new TreeMap();
                        if (abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
                            if (!TextUtils.isEmpty(str)) {
                                treeMap.put(AgooConstants.MESSAGE_ID, str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                treeMap.put("category", str2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                treeMap.put(HintConstants.AUTOFILL_HINT_NAME, str3);
                            }
                            treeMap.put("unitPrice", Integer.valueOf(i10));
                        } else {
                            treeMap.put(AgooConstants.MESSAGE_ID, str);
                            treeMap.put("category", str2);
                            treeMap.put(HintConstants.AUTOFILL_HINT_NAME, str3);
                            treeMap.put("unitPrice", Integer.valueOf(i10));
                        }
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty()) {
                            treeMap.put("eventValue", map);
                        }
                        aVar.paraMap.put("data", treeMap);
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11174a(final C8001fy c8001fy, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            C7896ca.iForDeveloper("onViewShoppingCart called --> shoppingCart: " + c8001fy);
            if (c8001fy != null && c8001fy.length() > 0) {
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.26
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC7841a);
                            aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                            aVar.paraMap.put("action", "viewItems");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("items", c8001fy);
                            aVar.paraMap.put("data", treeMap);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C7896ca.eForDeveloper("viewShoppingCart# shoppingCart can't be null or empty");
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11173a(final TalkingDataShoppingCart talkingDataShoppingCart, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            C7896ca.iForDeveloper("onViewShoppingCart called --> shoppingCart: " + talkingDataShoppingCart);
            if (talkingDataShoppingCart != null && talkingDataShoppingCart.length() > 0) {
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.27
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            a aVar = new a();
                            aVar.paraMap.put("apiType", 8);
                            aVar.paraMap.put("service", abstractC7841a);
                            aVar.paraMap.put(DispatchConstants.DOMAIN, "iap");
                            aVar.paraMap.put("action", "viewItems");
                            TreeMap treeMap = new TreeMap();
                            treeMap.put("items", talkingDataShoppingCart);
                            aVar.paraMap.put("data", treeMap);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            C7896ca.eForDeveloper("viewShoppingCart# shoppingCart can't be null or empty");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m12131a(final Context context) {
        Application application;
        if (C7912cq.m11595a(14)) {
            try {
                Context context2 = C7843ab.f14307g;
                if (context2 instanceof Activity) {
                    application = ((Activity) context2).getApplication();
                } else {
                    application = context2 instanceof Application ? (Application) context2 : null;
                }
                if (application == null || f15150k) {
                    return;
                }
                C7868b c7868b = new C7868b();
                f15144e = c7868b;
                application.registerActivityLifecycleCallbacks(c7868b);
                f15150k = true;
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            C7912cq.m11593a(Class.forName("android.app.ActivityManagerNative"), new InterfaceC7909cn() { // from class: com.tendcloud.tenddata.zz.28
                @Override // com.tendcloud.tenddata.InterfaceC7909cn
                public void afterMethodInvoked(Object obj, Method method, Object[] objArr, Object obj2) {
                }

                @Override // com.tendcloud.tenddata.InterfaceC7909cn
                public void beforeMethodInvoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (context instanceof Activity) {
                        if (name.equalsIgnoreCase("activityPaused")) {
                            C7895c.m11367b((Activity) context, AbstractC7841a.UNIVERSAL);
                        } else if (name.equalsIgnoreCase("activityIdle")) {
                            C7895c.m11363a((Activity) context, AbstractC7841a.UNIVERSAL);
                        }
                    }
                }
            }, "gDefault", "android.app.IActivityManager");
            f15150k = true;
        } catch (Throwable th) {
            C7896ca.eForDeveloper("registerActivityLifecycleListener " + th.getMessage());
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11175a(final C8002fz c8002fz, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (c8002fz == null) {
                C7896ca.eForDeveloper("TDSearch cannot be null ");
                return;
            }
            C7896ca.iForDeveloper("onSearch called --> search: " + c8002fz);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.30
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "ad");
                        aVar.paraMap.put("action", "search");
                        aVar.paraMap.put("data", C7912cq.m11591a(c8002fz));
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11172a(final TalkingDataSearch talkingDataSearch, final AbstractC7841a abstractC7841a) {
        try {
            if (!f15141b) {
                C7896ca.eForDeveloper("SDK have not been initialized");
                return;
            }
            if (talkingDataSearch == null) {
                C7896ca.eForDeveloper("TDSearch cannot be null ");
                return;
            }
            C7896ca.iForDeveloper("onSearch called --> search: " + talkingDataSearch);
            C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.zz.31
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a aVar = new a();
                        aVar.paraMap.put("apiType", 17);
                        aVar.paraMap.put("service", abstractC7841a);
                        aVar.paraMap.put(DispatchConstants.DOMAIN, "ad");
                        aVar.paraMap.put("action", "search");
                        aVar.paraMap.put("data", C7912cq.m11591a(talkingDataSearch));
                        Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7856ao
    /* renamed from: a */
    public void mo11201a(Map<String, Object> map, TDGenerateUrl tDGenerateUrl) {
        C7938dp.m11749a().m11753a(map).getShortUrl(tDGenerateUrl);
    }
}
