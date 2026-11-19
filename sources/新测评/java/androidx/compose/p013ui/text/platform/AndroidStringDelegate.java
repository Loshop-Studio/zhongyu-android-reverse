package androidx.compose.p013ui.text.platform;

import androidx.compose.p013ui.text.PlatformStringDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\f"}, m13558d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", TypedValues.Custom.S_STRING, "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String capitalize(String string, Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = string.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.titlecase(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String decapitalize(String string, Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) CharsKt.lowercase(string.charAt(0), locale));
        String strSubstring = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String toLowerCase(String string, Locale locale) {
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.p013ui.text.PlatformStringDelegate
    public String toUpperCase(String string, Locale locale) {
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
