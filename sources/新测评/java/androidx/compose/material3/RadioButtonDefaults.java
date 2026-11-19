package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJ:\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/material3/RadioButtonDefaults;", "", "()V", "defaultRadioButtonColors", "Landroidx/compose/material3/RadioButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRadioButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RadioButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "colors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RadioButtonColors;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
/* loaded from: classes2.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @Composable
    public final RadioButtonColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1191566130, i10, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:140)");
        }
        RadioButtonColors defaultRadioButtonColors$material3_release = getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRadioButtonColors$material3_release;
    }

    @Composable
    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final RadioButtonColors m19131colorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-351083046, i10, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:160)");
        }
        long j14 = j10;
        RadioButtonColors radioButtonColorsM19126copyjRlVdoo = getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m19126copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return radioButtonColorsM19126copyjRlVdoo;
    }

    public final RadioButtonColors getDefaultRadioButtonColors$material3_release(ColorScheme colorScheme) {
        RadioButtonColors defaultRadioButtonColorsCached = colorScheme.getDefaultRadioButtonColorsCached();
        if (defaultRadioButtonColorsCached != null) {
            return defaultRadioButtonColorsCached;
        }
        RadioButtonTokens radioButtonTokens = RadioButtonTokens.INSTANCE;
        RadioButtonColors radioButtonColors = new RadioButtonColors(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getUnselectedIconColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultRadioButtonColorsCached$material3_release(radioButtonColors);
        return radioButtonColors;
    }
}
