package com.tendcloud.tenddata;

import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.request.Request;
import java.net.URLEncoder;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.m */
/* loaded from: classes5.dex */
class C8009m {

    /* renamed from: a */
    private volatile LruCache<String, String> f15047a;

    /* renamed from: b */
    private String f15048b;

    /* renamed from: com.tendcloud.tenddata.m$a */
    public static class a {
        private static final C8009m INSTANCE = new C8009m();

        private a() {
        }
    }

    /* renamed from: c */
    private String m12049c(String str) {
        String strM12064a = "";
        try {
            String strEncode = URLEncoder.encode(m12051d(str), Request.DEFAULT_CHARSET);
            C8011o.m12058a().m12066b();
            strM12064a = C8011o.m12058a().m12064a(strEncode, C8011o.f15050b);
            C8011o.m12058a().m12067c();
            return strM12064a;
        } catch (Throwable unused) {
            return strM12064a;
        }
    }

    /* renamed from: d */
    private String m12050d() {
        try {
            C8011o.m12058a().m12066b();
            String strM12064a = C8011o.m12058a().m12064a(C8011o.f15053e, C8011o.f15051c);
            C8011o.m12058a().m12067c();
            return strM12064a;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public synchronized String m12053a(String str) {
        String strM12051d = m12051d(str);
        String str2 = this.f15047a.get(strM12051d);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String strM12049c = m12049c(strM12051d);
        if (TextUtils.isEmpty(strM12049c)) {
            return "";
        }
        m12054a(strM12051d, strM12049c);
        return strM12049c;
    }

    /* renamed from: b */
    public synchronized void m12056b(String str) {
        this.f15048b = str;
    }

    private C8009m() {
        this.f15047a = new LruCache<>(32);
    }

    /* renamed from: b */
    public synchronized void m12055b() {
        if (this.f15047a.size() > 0) {
            this.f15047a.evictAll();
        }
    }

    /* renamed from: d */
    private static String m12051d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        return str.endsWith(MqttTopic.MULTI_LEVEL_WILDCARD) ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: c */
    public static C8009m m12048c() {
        return a.INSTANCE;
    }

    /* renamed from: a */
    public synchronized void m12054a(String str, String str2) {
        String strM12051d = m12051d(str);
        if (!TextUtils.isEmpty(strM12051d) && !TextUtils.isEmpty(str2)) {
            this.f15047a.put(strM12051d, str2);
        }
    }

    /* renamed from: a */
    public synchronized String m12052a() {
        try {
            if (TextUtils.isEmpty(this.f15048b)) {
                this.f15048b = m12050d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15048b;
    }
}
