package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJN\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m13558d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "()V", "defaultCheckboxColors", "Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCheckboxColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,607:1\n1#2:608\n*E\n"})
/* loaded from: classes2.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    public final CheckboxColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors$material3_release;
    }

    @Composable
    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m18585colors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU6 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i10, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:219)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.INSTANCE;
        CheckboxColors checkboxColorsM18572copy2qZNXz8 = defaultCheckboxColors$material3_release.m18572copy2qZNXz8(jM21012getUnspecified0d7_KjU3, companion.m21011getTransparent0d7_KjU(), jM21012getUnspecified0d7_KjU, companion.m21011getTransparent0d7_KjU(), jM21012getUnspecified0d7_KjU4, companion.m21011getTransparent0d7_KjU(), jM21012getUnspecified0d7_KjU6, jM21012getUnspecified0d7_KjU, jM21012getUnspecified0d7_KjU2, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM21012getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColorsM18572copy2qZNXz8;
    }

    public final CheckboxColors getDefaultCheckboxColors$material3_release(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached = colorScheme.getDefaultCheckboxColorsCached();
        if (defaultCheckboxColorsCached != null) {
            return defaultCheckboxColorsCached;
        }
        CheckboxTokens checkboxTokens = CheckboxTokens.INSTANCE;
        long jFromToken = ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedIconColor());
        Color.Companion companion = Color.INSTANCE;
        CheckboxColors checkboxColors = new CheckboxColors(jFromToken, companion.m21011getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedOutlineColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCheckboxColorsCached$material3_release(checkboxColors);
        return checkboxColors;
    }
}
