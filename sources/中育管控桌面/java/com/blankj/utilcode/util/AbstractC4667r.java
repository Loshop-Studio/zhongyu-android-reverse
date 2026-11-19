package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: com.blankj.utilcode.util.r */
/* loaded from: classes3.dex */
public abstract class AbstractC4667r {
    /* renamed from: a */
    public static void m2352a(Activity activity) {
        String strM2161d = AbstractC4663o0.m2338w().m2161d("KEY_LOCALE");
        if (TextUtils.isEmpty(strM2161d)) {
            return;
        }
        Locale localeM2353b = "VALUE_FOLLOW_SYSTEM".equals(strM2161d) ? m2353b(Resources.getSystem().getConfiguration()) : m2356e(strM2161d);
        if (localeM2353b == null) {
            return;
        }
        m2358g(activity, localeM2353b);
        m2358g(AbstractC4657l0.m2250a(), localeM2353b);
    }

    /* renamed from: b */
    public static Locale m2353b(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    /* renamed from: c */
    public static boolean m2354c(String str) {
        int i6 = 0;
        for (char c7 : str.toCharArray()) {
            if (c7 == '$') {
                if (i6 >= 1) {
                    return false;
                }
                i6++;
            }
        }
        return i6 == 1;
    }

    /* renamed from: d */
    public static void m2355d(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    /* renamed from: e */
    public static Locale m2356e(String str) {
        Locale localeM2357f = m2357f(str);
        if (localeM2357f == null) {
            Log.e("LanguageUtils", "The string of " + str + " is not in the correct format.");
            AbstractC4663o0.m2338w().m2165i("KEY_LOCALE");
        }
        return localeM2357f;
    }

    /* renamed from: f */
    public static Locale m2357f(String str) {
        if (!m2354c(str)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf("$");
            return new Locale(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m2358g(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        m2355d(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
