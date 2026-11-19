package com.efs.sdk.base.p039a.p046e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.os.EnvironmentCompat;
import androidx.work.PeriodicWorkRequest;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p039a.p042c.C5660c;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.b */
/* loaded from: classes3.dex */
public class HandlerC5664b extends Handler {

    /* renamed from: a */
    private static final Map<String, Long> f4693a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.1
        {
            put("flow_5min", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS));
            put("flow_hour", 3600000L);
            put("flow_day", Long.valueOf(CalendarModelKt.MillisecondsIn24Hours));
        }
    };

    /* renamed from: b */
    private static final Map<String, Long> f4694b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.a.e.b.2
        {
            Long lValueOf = Long.valueOf(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            put("flow_5min", lValueOf);
            put("flow_hour", lValueOf);
            put("flow_day", Long.valueOf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
        }
    };

    /* renamed from: c */
    private Map<String, AtomicInteger> f4695c;

    /* renamed from: d */
    private volatile SharedPreferences f4696d;

    /* renamed from: e */
    private volatile SharedPreferences.Editor f4697e;

    /* renamed from: f */
    private Context f4698f;

    /* renamed from: g */
    private String f4699g;

    /* renamed from: com.efs.sdk.base.a.e.b$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC5664b f4700a = new HandlerC5664b(0);
    }

    public /* synthetic */ HandlerC5664b(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC5664b m4105a() {
        return a.f4700a;
    }

    /* renamed from: b */
    private void m4109b() {
        try {
            m4110c();
        } catch (Throwable th) {
            C5697d.m4183b("efs.flow", "init sharedpreferences error", th);
        }
    }

    /* renamed from: c */
    private void m4110c() {
        if (this.f4696d == null) {
            synchronized (HandlerC5664b.class) {
                try {
                    if (this.f4696d == null) {
                        this.f4696d = SharedPreferencesUtils.getSharedPreferences(this.f4698f, this.f4699g.toLowerCase() + "_flow");
                    }
                } finally {
                }
            }
        }
        if (this.f4697e == null) {
            synchronized (HandlerC5664b.class) {
                try {
                    if (this.f4697e == null) {
                        this.f4697e = this.f4696d.edit();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        int i9 = message.what;
        if (i9 == 0) {
            m4109b();
            if (this.f4696d == null) {
                C5697d.m4182a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
                return;
            }
            if (this.f4697e == null) {
                C5697d.m4182a("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat", null);
                return;
            }
            String strValueOf = String.valueOf(message.obj);
            long j9 = message.arg1;
            String strM4095a = C5660c.a.f4681a.m4095a();
            for (String str : f4693a.keySet()) {
                String strConcat = "curr_time_".concat(String.valueOf(str));
                if (!this.f4696d.contains(strConcat)) {
                    this.f4697e.putLong(strConcat, System.currentTimeMillis());
                }
                for (String str2 : m4106a(str, strValueOf, strM4095a)) {
                    this.f4697e.putLong(str2, this.f4696d.getLong(str2, 0L) + j9);
                }
            }
            this.f4697e.apply();
            return;
        }
        if (i9 != 1) {
            C5697d.m4182a("efs.flow", "flow stat listener not support action '" + message.what + "'", null);
            return;
        }
        String strValueOf2 = String.valueOf(message.obj);
        long j10 = message.arg1;
        m4109b();
        if (this.f4696d == null) {
            C5697d.m4182a("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp", null);
            return;
        }
        if (this.f4697e == null) {
            C5697d.m4182a("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp", null);
            return;
        }
        String strConcat2 = "curr_time_".concat(strValueOf2);
        if (Math.abs(System.currentTimeMillis() - this.f4696d.getLong(strConcat2, System.currentTimeMillis())) >= j10) {
            for (String str3 : this.f4696d.getAll().keySet()) {
                if (str3.startsWith(strValueOf2)) {
                    this.f4697e.putLong(str3, 0L);
                }
            }
            this.f4697e.putLong(strConcat2, System.currentTimeMillis());
            this.f4697e.apply();
            this.f4695c.clear();
        }
    }

    private HandlerC5664b() {
        super(C5684a.f4739a.getLooper());
        this.f4695c = new ConcurrentHashMap(5);
        this.f4698f = C5661a.m4097a().f4644c;
        this.f4699g = C5661a.m4097a().f4642a;
        m4109b();
        File fileM4140c = C5683a.m4140c(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a);
        if (fileM4140c.exists()) {
            C5689b.m4157b(fileM4140c);
        }
    }

    /* renamed from: a */
    private boolean m4108a(@NonNull String str, long j9, @NonNull String str2, @NonNull String str3, long j10) {
        m4109b();
        if (this.f4696d == null) {
            C5697d.m4182a("efs.flow", "sharedpreferences is null, cann't get last flow stat", null);
            return false;
        }
        List<String> listM4106a = m4106a(str, str2, str3);
        Map<String, String> mapM4079c = C5656c.m4066a().m4079c();
        for (String str4 : listM4106a) {
            if (Math.abs(System.currentTimeMillis() - this.f4696d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j9) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = str;
                messageObtain.arg1 = Long.valueOf(j9).intValue();
                sendMessage(messageObtain);
            }
            long jM4104a = m4104a(mapM4079c, str, str4);
            long j11 = this.f4696d.getLong(str4, 0L);
            if (j11 + j10 > jM4104a) {
                C5697d.m4181a("efs.flow", "flow limit, key: " + str4 + ", max: " + jM4104a + ", now: " + j11 + ", size: " + j10);
                m4107a(str4);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m4107a(String str) {
        if (!this.f4695c.containsKey(str) || this.f4695c.get(str) == null || this.f4695c.get(str).get() <= 10) {
            C5707f.a.f4777a.m4205a(C5656c.m4066a().f4669d.f4660a, str);
            if (str.equals("flow_day")) {
                C5707f.a.f4777a.m4204a(C5656c.m4066a().f4669d.f4660a);
            }
            if (!this.f4695c.containsKey(str)) {
                this.f4695c.put(str, new AtomicInteger());
            }
            this.f4695c.get(str).incrementAndGet();
        }
    }

    /* renamed from: a */
    private static long m4104a(Map<String, String> map, @NonNull String str, @NonNull String str2) {
        long jLongValue = f4694b.get(str).longValue();
        if (map != null && map.containsKey(str2) && !TextUtils.isEmpty(map.get(str2))) {
            try {
                return Long.parseLong(map.get(str2));
            } catch (Throwable th) {
                C5697d.m4182a("efs.flow", "get max flow error", th);
            }
        }
        return jLongValue;
    }

    /* renamed from: a */
    private static List<String> m4106a(String str, String str2, String str3) {
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
    public final boolean m4111a(@NonNull String str, long j9) {
        String strM4095a = C5660c.a.f4681a.m4095a();
        boolean z9 = true;
        for (Map.Entry<String, Long> entry : f4693a.entrySet()) {
            String str2 = str;
            long j10 = j9;
            boolean zM4108a = m4108a(entry.getKey(), entry.getValue().longValue(), str2, strM4095a, j10);
            if (!zM4108a) {
                return zM4108a;
            }
            z9 = zM4108a;
            str = str2;
            j9 = j10;
        }
        return z9;
    }
}
