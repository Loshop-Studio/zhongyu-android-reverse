package com.efs.sdk.base.p020a.p027e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p020a.p023c.C2920c;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.b */
/* loaded from: classes2.dex */
public class HandlerC2924b extends Handler {

    /* renamed from: a */
    private static final Map<String, Long> f1089a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.1
        {
            put("flow_5min", 300000L);
            put("flow_hour", 3600000L);
            put("flow_day", 86400000L);
        }
    };

    /* renamed from: b */
    private static final Map<String, Long> f1090b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.2
        {
            Long lValueOf = Long.valueOf(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            put("flow_5min", lValueOf);
            put("flow_hour", lValueOf);
            put("flow_day", Long.valueOf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
        }
    };

    /* renamed from: c */
    private Map<String, AtomicInteger> f1091c;

    /* renamed from: d */
    private volatile SharedPreferences f1092d;

    /* renamed from: e */
    private volatile SharedPreferences.Editor f1093e;

    /* renamed from: f */
    private Context f1094f;

    /* renamed from: g */
    private String f1095g;

    /* renamed from: com.efs.sdk.base.a.e.b$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC2924b f1096a = new HandlerC2924b(0);
    }

    public /* synthetic */ HandlerC2924b(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC2924b m2136a() {
        return a.f1096a;
    }

    /* renamed from: b */
    private void m2140b() {
        try {
            m2141c();
        } catch (Throwable th) {
            C2957d.m2214b("efs.flow", "init sharedpreferences error", th);
        }
    }

    /* renamed from: c */
    private void m2141c() {
        if (this.f1092d == null) {
            synchronized (HandlerC2924b.class) {
                if (this.f1092d == null) {
                    this.f1092d = SharedPreferencesUtils.getSharedPreferences(this.f1094f, this.f1095g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f1093e == null) {
            synchronized (HandlerC2924b.class) {
                if (this.f1093e == null) {
                    this.f1093e = this.f1092d.edit();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        int i4 = message.what;
        if (i4 == 0) {
            m2140b();
            if (this.f1092d == null) {
                C2957d.m2213a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
                return;
            }
            if (this.f1093e == null) {
                C2957d.m2213a("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat", null);
                return;
            }
            String strValueOf = String.valueOf(message.obj);
            long j4 = message.arg1;
            String strM2126a = C2920c.a.f1077a.m2126a();
            for (String str : f1089a.keySet()) {
                String strConcat = "curr_time_".concat(String.valueOf(str));
                if (!this.f1092d.contains(strConcat)) {
                    this.f1093e.putLong(strConcat, System.currentTimeMillis());
                }
                for (String str2 : m2137a(str, strValueOf, strM2126a)) {
                    this.f1093e.putLong(str2, this.f1092d.getLong(str2, 0L) + j4);
                }
            }
            this.f1093e.apply();
            return;
        }
        if (i4 != 1) {
            C2957d.m2213a("efs.flow", "flow stat listener not support action '" + message.what + "'", null);
            return;
        }
        String strValueOf2 = String.valueOf(message.obj);
        long j5 = message.arg1;
        m2140b();
        if (this.f1092d == null) {
            C2957d.m2213a("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp", null);
            return;
        }
        if (this.f1093e == null) {
            C2957d.m2213a("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp", null);
            return;
        }
        String strConcat2 = "curr_time_".concat(strValueOf2);
        if (Math.abs(System.currentTimeMillis() - this.f1092d.getLong(strConcat2, System.currentTimeMillis())) >= j5) {
            for (String str3 : this.f1092d.getAll().keySet()) {
                if (str3.startsWith(strValueOf2)) {
                    this.f1093e.putLong(str3, 0L);
                }
            }
            this.f1093e.putLong(strConcat2, System.currentTimeMillis());
            this.f1093e.apply();
            this.f1091c.clear();
        }
    }

    private HandlerC2924b() {
        super(C2944a.f1135a.getLooper());
        this.f1091c = new ConcurrentHashMap(5);
        this.f1094f = C2921a.m2128a().f1040c;
        this.f1095g = C2921a.m2128a().f1038a;
        m2140b();
        File fileM2171c = C2943a.m2171c(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a);
        if (fileM2171c.exists()) {
            C2949b.m2188b(fileM2171c);
        }
    }

    /* renamed from: a */
    private boolean m2139a(@NonNull String str, long j4, @NonNull String str2, @NonNull String str3, long j5) {
        m2140b();
        if (this.f1092d == null) {
            C2957d.m2213a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
            return false;
        }
        List<String> listM2137a = m2137a(str, str2, str3);
        Map<String, String> mapM2110c = C2916c.m2097a().m2110c();
        for (String str4 : listM2137a) {
            if (Math.abs(System.currentTimeMillis() - this.f1092d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j4) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = str;
                messageObtain.arg1 = Long.valueOf(j4).intValue();
                sendMessage(messageObtain);
            }
            long jM2135a = m2135a(mapM2110c, str, str4);
            long j6 = this.f1092d.getLong(str4, 0L);
            if (j6 + j5 > jM2135a) {
                C2957d.m2212a("efs.flow", "flow limit, key: " + str4 + ", max: " + jM2135a + ", now: " + j6 + ", size: " + j5);
                m2138a(str4);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m2138a(String str) {
        if (!this.f1091c.containsKey(str) || this.f1091c.get(str) == null || this.f1091c.get(str).get() <= 10) {
            C2967f.a.f1173a.m2236a(C2916c.m2097a().f1065d.f1056a, str);
            if (str.equals("flow_day")) {
                C2967f.a.f1173a.m2235a(C2916c.m2097a().f1065d.f1056a);
            }
            if (!this.f1091c.containsKey(str)) {
                this.f1091c.put(str, new AtomicInteger());
            }
            this.f1091c.get(str).incrementAndGet();
        }
    }

    /* renamed from: a */
    private static long m2135a(Map<String, String> map, @NonNull String str, @NonNull String str2) {
        long jLongValue = f1090b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return jLongValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th) {
            C2957d.m2213a("efs.flow", "get max flow error", th);
            return jLongValue;
        }
    }

    /* renamed from: a */
    private static List<String> m2137a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + "_" + str2);
        }
        if (!TextUtils.isEmpty(str3) && !EnvironmentCompat.MEDIA_UNKNOWN.equalsIgnoreCase(str3)) {
            arrayList.add(str + "_" + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + "_" + str2 + "_" + str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean m2142a(@NonNull String str, long j4) {
        String strM2126a = C2920c.a.f1077a.m2126a();
        boolean zM2139a = true;
        for (Map.Entry<String, Long> entry : f1089a.entrySet()) {
            zM2139a = m2139a(entry.getKey(), entry.getValue().longValue(), str, strM2126a, j4);
            if (!zM2139a) {
                break;
            }
        }
        return zM2139a;
    }
}
