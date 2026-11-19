package p319r6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p008a7.AbstractC0081n;

/* renamed from: r6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10910b {
    /* renamed from: a */
    public static void m23748a(Context context, Locale locale) {
        m23749b(context, locale, false);
    }

    /* renamed from: b */
    public static void m23749b(Context context, Locale locale, boolean z10) {
        if (z10) {
            AbstractC0081n.m225c(context, "KEY_LOCALE", "VALUE_FOLLOW_SYSTEM");
        } else {
            AbstractC0081n.m225c(context, "KEY_LOCALE", locale.getLanguage() + "$" + locale.getCountry());
        }
        m23753f(context, locale);
    }

    /* renamed from: c */
    public static boolean m23750c(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m23751d(Context context, int i10) {
        WeakReference weakReference = new WeakReference(context);
        if (i10 >= 0) {
            m23748a((Context) weakReference.get(), AbstractC10909a.m23747a(i10));
        } else {
            m23752e((Context) weakReference.get());
        }
    }

    /* renamed from: e */
    public static void m23752e(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(Locale.getDefault());
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    /* renamed from: f */
    public static void m23753f(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (m23750c(locale2.getLanguage(), locale.getLanguage()) && m23750c(locale2.getCountry(), locale.getCountry())) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
