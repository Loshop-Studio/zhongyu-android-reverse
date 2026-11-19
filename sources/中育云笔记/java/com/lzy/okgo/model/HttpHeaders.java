package com.lzy.okgo.model;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import p033b7.C5172a;

/* loaded from: classes5.dex */
public class HttpHeaders implements Serializable {

    /* renamed from: d */
    public static final TimeZone f12688d = TimeZone.getTimeZone("GMT");

    /* renamed from: e */
    public static String f12689e;

    /* renamed from: f */
    public static String f12690f;

    /* renamed from: c */
    public LinkedHashMap f12691c;

    public HttpHeaders() {
        m9664d();
    }

    /* renamed from: a */
    public static String m9662a() {
        if (!TextUtils.isEmpty(f12689e)) {
            return f12689e;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
            sb2.append(',');
            sb2.append(language);
            sb2.append(";q=0.8");
        }
        String string = sb2.toString();
        f12689e = string;
        return string;
    }

    /* renamed from: c */
    public static String m9663c() {
        if (!TextUtils.isEmpty(f12690f)) {
            return f12690f;
        }
        String string = null;
        try {
            string = C5172a.m2692h().m2697f().getString(((Integer) Class.forName("com.android.internal.R$string").getDeclaredField("web_user_agent").get(null)).intValue());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(string)) {
            string = "okhttp-okgo/jeasonlzy";
        }
        Locale locale = Locale.getDefault();
        StringBuffer stringBuffer = new StringBuffer();
        String str = Build.VERSION.RELEASE;
        if (str.length() > 0) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; ");
        String language = locale.getLanguage();
        if (language != null) {
            stringBuffer.append(language.toLowerCase(locale));
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country)) {
                stringBuffer.append("-");
                stringBuffer.append(country.toLowerCase(locale));
            }
        } else {
            stringBuffer.append("en");
        }
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                stringBuffer.append("; ");
                stringBuffer.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            stringBuffer.append(" Build/");
            stringBuffer.append(str3);
        }
        String str4 = String.format(string, stringBuffer, "Mobile ");
        f12690f = str4;
        return str4;
    }

    /* renamed from: d */
    public final void m9664d() {
        this.f12691c = new LinkedHashMap();
    }

    /* renamed from: e */
    public void m9665e(HttpHeaders httpHeaders) {
        LinkedHashMap linkedHashMap;
        if (httpHeaders == null || (linkedHashMap = httpHeaders.f12691c) == null || linkedHashMap.isEmpty()) {
            return;
        }
        this.f12691c.putAll(httpHeaders.f12691c);
    }

    /* renamed from: f */
    public void m9666f(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f12691c.put(str, str2);
    }

    public String toString() {
        return "HttpHeaders{headersMap=" + this.f12691c + '}';
    }
}
