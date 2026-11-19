package androidx.compose.p011ui.text.platform;

import androidx.compose.p011ui.text.PlatformStringDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\f"}, m5110d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", TypedValues.Custom.S_STRING, "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.text.PlatformStringDelegate
    @NotNull
    public String capitalize(@NotNull String string, @NotNull Locale locale) {
        String strValueOf;
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = string.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            AbstractC5830k.m5330g(locale, "locale");
            String strValueOf2 = String.valueOf(cCharAt);
            AbstractC5830k.m5328e(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            strValueOf = strValueOf2.toUpperCase(locale);
            AbstractC5830k.m5329f(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                AbstractC5830k.m5328e(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                AbstractC5830k.m5329f(upperCase, "toUpperCase(...)");
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = string.substring(1);
        AbstractC5830k.m5329f(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @Override // androidx.compose.p011ui.text.PlatformStringDelegate
    @NotNull
    public String decapitalize(@NotNull String string, @NotNull Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = string.charAt(0);
        AbstractC5830k.m5330g(locale, "locale");
        String strValueOf = String.valueOf(cCharAt);
        AbstractC5830k.m5328e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
        sb.append((Object) lowerCase);
        String strSubstring = string.substring(1);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.p011ui.text.PlatformStringDelegate
    @NotNull
    public String toLowerCase(@NotNull String string, @NotNull Locale locale) {
        String lowerCase = string.toLowerCase(locale);
        AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // androidx.compose.p011ui.text.PlatformStringDelegate
    @NotNull
    public String toUpperCase(@NotNull String string, @NotNull Locale locale) {
        String upperCase = string.toUpperCase(locale);
        AbstractC5830k.m5329f(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
