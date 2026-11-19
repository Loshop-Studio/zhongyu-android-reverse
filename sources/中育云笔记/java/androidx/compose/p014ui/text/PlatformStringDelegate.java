package androidx.compose.p014ui.text;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface PlatformStringDelegate {
    String capitalize(String str, Locale locale);

    String decapitalize(String str, Locale locale);

    String toLowerCase(String str, Locale locale);

    String toUpperCase(String str, Locale locale);
}
