package androidx.compose.p014ui.text.platform;

import androidx.compose.p014ui.text.PlatformStringDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.p014ui.text.PlatformStringDelegate
    public String capitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC10788a.m23077e(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // androidx.compose.p014ui.text.PlatformStringDelegate
    public String decapitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) AbstractC10788a.m23076d(str.charAt(0), locale));
        String strSubstring = str.substring(1);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // androidx.compose.p014ui.text.PlatformStringDelegate
    public String toLowerCase(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.p014ui.text.PlatformStringDelegate
    public String toUpperCase(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale);
        AbstractC9979u.m20293f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
