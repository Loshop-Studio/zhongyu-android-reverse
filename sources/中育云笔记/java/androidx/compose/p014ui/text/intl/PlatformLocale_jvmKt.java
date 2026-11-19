package androidx.compose.p014ui.text.intl;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class PlatformLocale_jvmKt {
    public static final String getLanguage(Locale locale) {
        return locale.getLanguage();
    }

    public static final String getLanguageTag(Locale locale) {
        return locale.toLanguageTag();
    }

    public static final String getRegion(Locale locale) {
        return locale.getCountry();
    }

    public static final String getScript(Locale locale) {
        return locale.getScript();
    }
}
