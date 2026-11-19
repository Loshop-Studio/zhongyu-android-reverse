package androidx.compose.p014ui.text.intl;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface PlatformLocaleDelegate {
    LocaleList getCurrent();

    Locale parseLanguageTag(String str);
}
