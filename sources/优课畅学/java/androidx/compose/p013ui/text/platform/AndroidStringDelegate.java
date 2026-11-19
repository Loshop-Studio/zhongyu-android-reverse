package androidx.compose.p013ui.text.platform;

import androidx.compose.p013ui.text.PlatformStringDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String capitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC8656a.m13943e(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String decapitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) AbstractC8656a.m13942d(str.charAt(0), locale));
        String strSubstring = str.substring(1);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String toLowerCase(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String toUpperCase(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale);
        AbstractC9133u.m16132f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
