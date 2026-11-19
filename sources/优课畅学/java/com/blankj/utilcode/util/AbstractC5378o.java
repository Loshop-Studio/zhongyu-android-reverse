package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: com.blankj.utilcode.util.o */
/* loaded from: classes3.dex */
public abstract class AbstractC5378o {
    /* renamed from: a */
    public static void m2589a(Activity activity) {
        String strM2697l = AbstractC5372k0.m2564t().m2697l("KEY_LOCALE");
        if (TextUtils.isEmpty(strM2697l)) {
            return;
        }
        Locale localeM2590b = "VALUE_FOLLOW_SYSTEM".equals(strM2697l) ? m2590b(Resources.getSystem().getConfiguration()) : m2593e(strM2697l);
        if (localeM2590b == null) {
            return;
        }
        m2595g(activity, localeM2590b);
        m2595g(AbstractC5366h0.m2478a(), localeM2590b);
    }

    /* renamed from: b */
    public static Locale m2590b(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    /* renamed from: c */
    public static boolean m2591c(String str) {
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            if (c10 == '$') {
                if (i10 >= 1) {
                    return false;
                }
                i10++;
            }
        }
        return i10 == 1;
    }

    /* renamed from: d */
    public static void m2592d(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    /* renamed from: e */
    public static Locale m2593e(String str) {
        Locale localeM2594f = m2594f(str);
        if (localeM2594f == null) {
            Log.e("LanguageUtils", "The string of " + str + " is not in the correct format.");
            AbstractC5372k0.m2564t().m2707w("KEY_LOCALE");
        }
        return localeM2594f;
    }

    /* renamed from: f */
    public static Locale m2594f(String str) {
        if (!m2591c(str)) {
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
    public static void m2595g(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        m2592d(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
