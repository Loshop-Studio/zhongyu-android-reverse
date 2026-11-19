package com.efs.sdk.base.p035a.p042e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p035a.p038c.C1292c;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import com.efs.sdk.base.p035a.p050i.C1339f;
import com.taobao.accs.utl.UtilityImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.b */
/* loaded from: classes.dex */
public class HandlerC1296b extends Handler {

    /* renamed from: a */
    private static final Map<String, Long> f7059a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.1
        {
            put("flow_5min", 300000L);
            put("flow_hour", 3600000L);
            put("flow_day", 86400000L);
        }
    };

    /* renamed from: b */
    private static final Map<String, Long> f7060b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.2
        {
            Long lValueOf = Long.valueOf(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            put("flow_5min", lValueOf);
            put("flow_hour", lValueOf);
            put("flow_day", Long.valueOf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
        }
    };

    /* renamed from: c */
    private Map<String, AtomicInteger> f7061c;

    /* renamed from: d */
    private volatile SharedPreferences f7062d;

    /* renamed from: e */
    private volatile SharedPreferences.Editor f7063e;

    /* renamed from: f */
    private Context f7064f;

    /* renamed from: g */
    private String f7065g;

    /* renamed from: com.efs.sdk.base.a.e.b$a */
    static class a {

        /* renamed from: a */
        private static final HandlerC1296b f7066a = new HandlerC1296b(0);
    }

    /* synthetic */ HandlerC1296b(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1296b m5495a() {
        return a.f7066a;
    }

    /* renamed from: b */
    private void m5499b() {
        try {
            m5500c();
        } catch (Throwable th) {
            C1329d.m5573b("efs.flow", "init sharedpreferences error", th);
        }
    }

    /* renamed from: c */
    private void m5500c() {
        if (this.f7062d == null) {
            synchronized (HandlerC1296b.class) {
                if (this.f7062d == null) {
                    this.f7062d = SharedPreferencesUtils.getSharedPreferences(this.f7064f, this.f7065g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f7063e == null) {
            synchronized (HandlerC1296b.class) {
                if (this.f7063e == null) {
                    this.f7063e = this.f7062d.edit();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i4 = message.what;
        if (i4 == 0) {
            m5499b();
            if (this.f7062d == null) {
                C1329d.m5572a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
                return;
            }
            if (this.f7063e == null) {
                C1329d.m5572a("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat", null);
                return;
            }
            String strValueOf = String.valueOf(message.obj);
            long j4 = message.arg1;
            String strM5485a = C1292c.a.f7047a.m5485a();
            for (String str : f7059a.keySet()) {
                String strConcat = "curr_time_".concat(String.valueOf(str));
                if (!this.f7062d.contains(strConcat)) {
                    this.f7063e.putLong(strConcat, System.currentTimeMillis());
                }
                for (String str2 : m5496a(str, strValueOf, strM5485a)) {
                    this.f7063e.putLong(str2, this.f7062d.getLong(str2, 0L) + j4);
                }
            }
            this.f7063e.apply();
            return;
        }
        if (i4 != 1) {
            C1329d.m5572a("efs.flow", "flow stat listener not support action '" + message.what + "'", null);
            return;
        }
        String strValueOf2 = String.valueOf(message.obj);
        long j5 = message.arg1;
        m5499b();
        if (this.f7062d == null) {
            C1329d.m5572a("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp", null);
            return;
        }
        if (this.f7063e == null) {
            C1329d.m5572a("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp", null);
            return;
        }
        String strConcat2 = "curr_time_".concat(strValueOf2);
        if (Math.abs(System.currentTimeMillis() - this.f7062d.getLong(strConcat2, System.currentTimeMillis())) >= j5) {
            for (String str3 : this.f7062d.getAll().keySet()) {
                if (str3.startsWith(strValueOf2)) {
                    this.f7063e.putLong(str3, 0L);
                }
            }
            this.f7063e.putLong(strConcat2, System.currentTimeMillis());
            this.f7063e.apply();
            this.f7061c.clear();
        }
    }

    private HandlerC1296b() {
        super(C1316a.f7105a.getLooper());
        this.f7061c = new ConcurrentHashMap(5);
        this.f7064f = C1293a.m5487a().f7010c;
        this.f7065g = C1293a.m5487a().f7008a;
        m5499b();
        File fileM5530c = C1315a.m5530c(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a);
        if (fileM5530c.exists()) {
            C1321b.m5547b(fileM5530c);
        }
    }

    /* renamed from: a */
    private boolean m5498a(String str, long j4, String str2, String str3, long j5) {
        m5499b();
        if (this.f7062d == null) {
            C1329d.m5572a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
            return false;
        }
        List<String> listM5496a = m5496a(str, str2, str3);
        Map<String, String> mapM5469c = C1288c.m5456a().m5469c();
        for (String str4 : listM5496a) {
            if (Math.abs(System.currentTimeMillis() - this.f7062d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j4) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = str;
                messageObtain.arg1 = Long.valueOf(j4).intValue();
                sendMessage(messageObtain);
            }
            long jM5494a = m5494a(mapM5469c, str, str4);
            long j6 = this.f7062d.getLong(str4, 0L);
            if (j6 + j5 > jM5494a) {
                C1329d.m5571a("efs.flow", "flow limit, key: " + str4 + ", max: " + jM5494a + ", now: " + j6 + ", size: " + j5);
                m5497a(str4);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m5497a(String str) {
        if (!this.f7061c.containsKey(str) || this.f7061c.get(str) == null || this.f7061c.get(str).get() <= 10) {
            C1339f.a.f7143a.m5595a(C1288c.m5456a().f7035d.f7026a, str);
            if (str.equals("flow_day")) {
                C1339f.a.f7143a.m5594a(C1288c.m5456a().f7035d.f7026a);
            }
            if (!this.f7061c.containsKey(str)) {
                this.f7061c.put(str, new AtomicInteger());
            }
            this.f7061c.get(str).incrementAndGet();
        }
    }

    /* renamed from: a */
    private static long m5494a(Map<String, String> map, String str, String str2) {
        long jLongValue = f7060b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return jLongValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th) {
            C1329d.m5572a("efs.flow", "get max flow error", th);
            return jLongValue;
        }
    }

    /* renamed from: a */
    private static List<String> m5496a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + "_" + str2);
        }
        if (!TextUtils.isEmpty(str3) && !UtilityImpl.NET_TYPE_UNKNOWN.equalsIgnoreCase(str3)) {
            arrayList.add(str + "_" + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + "_" + str2 + "_" + str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean m5501a(String str, long j4) {
        String strM5485a = C1292c.a.f7047a.m5485a();
        boolean zM5498a = true;
        for (Map.Entry<String, Long> entry : f7059a.entrySet()) {
            zM5498a = m5498a(entry.getKey(), entry.getValue().longValue(), str, strM5485a, j4);
            if (!zM5498a) {
                break;
            }
        }
        return zM5498a;
    }
}
