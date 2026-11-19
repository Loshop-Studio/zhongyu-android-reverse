package androidx.compose.p013ui.text.intl;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface PlatformLocaleDelegate {
    LocaleList getCurrent();

    Locale parseLanguageTag(String str);
}
