package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
public final class DynamicTonalPaletteKt {
    private static final int delinearized(float f10) {
        double d10 = f10 / 100;
        return MathUtils.clamp(AbstractC10729c.m20034c((d10 <= 0.0031308d ? d10 * 12.92d : (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicDarkColorScheme34(context) : dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long jM22819getPrimary800d7_KjU = tonalPalette.m22819getPrimary800d7_KjU();
        long jM22813getPrimary200d7_KjU = tonalPalette.m22813getPrimary200d7_KjU();
        long jM22814getPrimary300d7_KjU = tonalPalette.m22814getPrimary300d7_KjU();
        long jM22820getPrimary900d7_KjU = tonalPalette.m22820getPrimary900d7_KjU();
        long jM22815getPrimary400d7_KjU = tonalPalette.m22815getPrimary400d7_KjU();
        long jM22832getSecondary800d7_KjU = tonalPalette.m22832getSecondary800d7_KjU();
        long jM22826getSecondary200d7_KjU = tonalPalette.m22826getSecondary200d7_KjU();
        long jM22827getSecondary300d7_KjU = tonalPalette.m22827getSecondary300d7_KjU();
        long jM22833getSecondary900d7_KjU = tonalPalette.m22833getSecondary900d7_KjU();
        long jM22845getTertiary800d7_KjU = tonalPalette.m22845getTertiary800d7_KjU();
        long jM22839getTertiary200d7_KjU = tonalPalette.m22839getTertiary200d7_KjU();
        long jM22840getTertiary300d7_KjU = tonalPalette.m22840getTertiary300d7_KjU();
        long jM22846getTertiary900d7_KjU = tonalPalette.m22846getTertiary900d7_KjU();
        long jM22798getNeutralVariant60d7_KjU = tonalPalette.m22798getNeutralVariant60d7_KjU();
        long jM22803getNeutralVariant900d7_KjU = tonalPalette.m22803getNeutralVariant900d7_KjU();
        long jM22798getNeutralVariant60d7_KjU2 = tonalPalette.m22798getNeutralVariant60d7_KjU();
        long jM22803getNeutralVariant900d7_KjU2 = tonalPalette.m22803getNeutralVariant900d7_KjU();
        long jM22794getNeutralVariant300d7_KjU = tonalPalette.m22794getNeutralVariant300d7_KjU();
        long jM22801getNeutralVariant800d7_KjU = tonalPalette.m22801getNeutralVariant800d7_KjU();
        long jM22803getNeutralVariant900d7_KjU3 = tonalPalette.m22803getNeutralVariant900d7_KjU();
        long jM22791getNeutralVariant200d7_KjU = tonalPalette.m22791getNeutralVariant200d7_KjU();
        long jM22799getNeutralVariant600d7_KjU = tonalPalette.m22799getNeutralVariant600d7_KjU();
        long jM22794getNeutralVariant300d7_KjU2 = tonalPalette.m22794getNeutralVariant300d7_KjU();
        long jM22786getNeutralVariant00d7_KjU = tonalPalette.m22786getNeutralVariant00d7_KjU();
        long jM22793getNeutralVariant240d7_KjU = tonalPalette.m22793getNeutralVariant240d7_KjU();
        long jM22798getNeutralVariant60d7_KjU3 = tonalPalette.m22798getNeutralVariant60d7_KjU();
        return ColorSchemeKt.m21912darkColorSchemeCXl9yA$default(jM22819getPrimary800d7_KjU, jM22813getPrimary200d7_KjU, jM22814getPrimary300d7_KjU, jM22820getPrimary900d7_KjU, jM22815getPrimary400d7_KjU, jM22832getSecondary800d7_KjU, jM22826getSecondary200d7_KjU, jM22827getSecondary300d7_KjU, jM22833getSecondary900d7_KjU, jM22845getTertiary800d7_KjU, jM22839getTertiary200d7_KjU, jM22840getTertiary300d7_KjU, jM22846getTertiary900d7_KjU, jM22798getNeutralVariant60d7_KjU, jM22803getNeutralVariant900d7_KjU, jM22798getNeutralVariant60d7_KjU2, jM22803getNeutralVariant900d7_KjU2, jM22794getNeutralVariant300d7_KjU, jM22801getNeutralVariant800d7_KjU, tonalPalette.m22819getPrimary800d7_KjU(), jM22803getNeutralVariant900d7_KjU3, jM22791getNeutralVariant200d7_KjU, 0L, 0L, 0L, 0L, jM22799getNeutralVariant600d7_KjU, jM22794getNeutralVariant300d7_KjU2, jM22786getNeutralVariant00d7_KjU, jM22793getNeutralVariant240d7_KjU, tonalPalette.m22789getNeutralVariant120d7_KjU(), tonalPalette.m22790getNeutralVariant170d7_KjU(), tonalPalette.m22792getNeutralVariant220d7_KjU(), tonalPalette.m22787getNeutralVariant100d7_KjU(), tonalPalette.m22795getNeutralVariant40d7_KjU(), jM22798getNeutralVariant60d7_KjU3, 62914560, 0, null);
    }

    @RequiresApi(34)
    public static final ColorScheme dynamicDarkColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM21867getColorWaAFU9c = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM21867getColorWaAFU9c2 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long jM21867getColorWaAFU9c3 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long jM21867getColorWaAFU9c4 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long jM21867getColorWaAFU9c5 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM21867getColorWaAFU9c6 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long jM21867getColorWaAFU9c7 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long jM21867getColorWaAFU9c8 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long jM21867getColorWaAFU9c9 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long jM21867getColorWaAFU9c10 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long jM21867getColorWaAFU9c11 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long jM21867getColorWaAFU9c12 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long jM21867getColorWaAFU9c13 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long jM21867getColorWaAFU9c14 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_background_dark);
        long jM21867getColorWaAFU9c15 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long jM21867getColorWaAFU9c16 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM21867getColorWaAFU9c17 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM21867getColorWaAFU9c18 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long jM21867getColorWaAFU9c19 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long jM21867getColorWaAFU9c20 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM21867getColorWaAFU9c21 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM21867getColorWaAFU9c22 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long jM21867getColorWaAFU9c23 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long jM21867getColorWaAFU9c24 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long jM21867getColorWaAFU9c25 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m21912darkColorSchemeCXl9yA$default(jM21867getColorWaAFU9c, jM21867getColorWaAFU9c2, jM21867getColorWaAFU9c3, jM21867getColorWaAFU9c4, jM21867getColorWaAFU9c5, jM21867getColorWaAFU9c6, jM21867getColorWaAFU9c7, jM21867getColorWaAFU9c8, jM21867getColorWaAFU9c9, jM21867getColorWaAFU9c10, jM21867getColorWaAFU9c11, jM21867getColorWaAFU9c12, jM21867getColorWaAFU9c13, jM21867getColorWaAFU9c14, jM21867getColorWaAFU9c15, jM21867getColorWaAFU9c16, jM21867getColorWaAFU9c17, jM21867getColorWaAFU9c18, jM21867getColorWaAFU9c19, colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_dark), jM21867getColorWaAFU9c20, jM21867getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM21867getColorWaAFU9c22, jM21867getColorWaAFU9c23, 0L, jM21867getColorWaAFU9c24, colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_dark), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), jM21867getColorWaAFU9c25, 331350016, 0, null);
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicLightColorScheme34(context) : dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long jM22815getPrimary400d7_KjU = tonalPalette.m22815getPrimary400d7_KjU();
        long jM22812getPrimary1000d7_KjU = tonalPalette.m22812getPrimary1000d7_KjU();
        long jM22820getPrimary900d7_KjU = tonalPalette.m22820getPrimary900d7_KjU();
        long jM22811getPrimary100d7_KjU = tonalPalette.m22811getPrimary100d7_KjU();
        long jM22819getPrimary800d7_KjU = tonalPalette.m22819getPrimary800d7_KjU();
        long jM22828getSecondary400d7_KjU = tonalPalette.m22828getSecondary400d7_KjU();
        long jM22825getSecondary1000d7_KjU = tonalPalette.m22825getSecondary1000d7_KjU();
        long jM22833getSecondary900d7_KjU = tonalPalette.m22833getSecondary900d7_KjU();
        long jM22824getSecondary100d7_KjU = tonalPalette.m22824getSecondary100d7_KjU();
        long jM22841getTertiary400d7_KjU = tonalPalette.m22841getTertiary400d7_KjU();
        long jM22838getTertiary1000d7_KjU = tonalPalette.m22838getTertiary1000d7_KjU();
        long jM22846getTertiary900d7_KjU = tonalPalette.m22846getTertiary900d7_KjU();
        long jM22837getTertiary100d7_KjU = tonalPalette.m22837getTertiary100d7_KjU();
        long jM22808getNeutralVariant980d7_KjU = tonalPalette.m22808getNeutralVariant980d7_KjU();
        long jM22787getNeutralVariant100d7_KjU = tonalPalette.m22787getNeutralVariant100d7_KjU();
        long jM22808getNeutralVariant980d7_KjU2 = tonalPalette.m22808getNeutralVariant980d7_KjU();
        long jM22787getNeutralVariant100d7_KjU2 = tonalPalette.m22787getNeutralVariant100d7_KjU();
        long jM22803getNeutralVariant900d7_KjU = tonalPalette.m22803getNeutralVariant900d7_KjU();
        long jM22794getNeutralVariant300d7_KjU = tonalPalette.m22794getNeutralVariant300d7_KjU();
        long jM22791getNeutralVariant200d7_KjU = tonalPalette.m22791getNeutralVariant200d7_KjU();
        long jM22806getNeutralVariant950d7_KjU = tonalPalette.m22806getNeutralVariant950d7_KjU();
        long jM22797getNeutralVariant500d7_KjU = tonalPalette.m22797getNeutralVariant500d7_KjU();
        long jM22801getNeutralVariant800d7_KjU = tonalPalette.m22801getNeutralVariant800d7_KjU();
        long jM22786getNeutralVariant00d7_KjU = tonalPalette.m22786getNeutralVariant00d7_KjU();
        long jM22808getNeutralVariant980d7_KjU3 = tonalPalette.m22808getNeutralVariant980d7_KjU();
        long jM22802getNeutralVariant870d7_KjU = tonalPalette.m22802getNeutralVariant870d7_KjU();
        return ColorSchemeKt.m21916lightColorSchemeCXl9yA$default(jM22815getPrimary400d7_KjU, jM22812getPrimary1000d7_KjU, jM22820getPrimary900d7_KjU, jM22811getPrimary100d7_KjU, jM22819getPrimary800d7_KjU, jM22828getSecondary400d7_KjU, jM22825getSecondary1000d7_KjU, jM22833getSecondary900d7_KjU, jM22824getSecondary100d7_KjU, jM22841getTertiary400d7_KjU, jM22838getTertiary1000d7_KjU, jM22846getTertiary900d7_KjU, jM22837getTertiary100d7_KjU, jM22808getNeutralVariant980d7_KjU, jM22787getNeutralVariant100d7_KjU, jM22808getNeutralVariant980d7_KjU2, jM22787getNeutralVariant100d7_KjU2, jM22803getNeutralVariant900d7_KjU, jM22794getNeutralVariant300d7_KjU, tonalPalette.m22815getPrimary400d7_KjU(), jM22791getNeutralVariant200d7_KjU, jM22806getNeutralVariant950d7_KjU, 0L, 0L, 0L, 0L, jM22797getNeutralVariant500d7_KjU, jM22801getNeutralVariant800d7_KjU, jM22786getNeutralVariant00d7_KjU, jM22808getNeutralVariant980d7_KjU3, tonalPalette.m22805getNeutralVariant940d7_KjU(), tonalPalette.m22804getNeutralVariant920d7_KjU(), tonalPalette.m22803getNeutralVariant900d7_KjU(), tonalPalette.m22807getNeutralVariant960d7_KjU(), tonalPalette.m22788getNeutralVariant1000d7_KjU(), jM22802getNeutralVariant870d7_KjU, 62914560, 0, null);
    }

    @RequiresApi(34)
    public static final ColorScheme dynamicLightColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM21867getColorWaAFU9c = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM21867getColorWaAFU9c2 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long jM21867getColorWaAFU9c3 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long jM21867getColorWaAFU9c4 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long jM21867getColorWaAFU9c5 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM21867getColorWaAFU9c6 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long jM21867getColorWaAFU9c7 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long jM21867getColorWaAFU9c8 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long jM21867getColorWaAFU9c9 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long jM21867getColorWaAFU9c10 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long jM21867getColorWaAFU9c11 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long jM21867getColorWaAFU9c12 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long jM21867getColorWaAFU9c13 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long jM21867getColorWaAFU9c14 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_background_light);
        long jM21867getColorWaAFU9c15 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long jM21867getColorWaAFU9c16 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM21867getColorWaAFU9c17 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM21867getColorWaAFU9c18 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long jM21867getColorWaAFU9c19 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long jM21867getColorWaAFU9c20 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM21867getColorWaAFU9c21 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM21867getColorWaAFU9c22 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_outline_light);
        long jM21867getColorWaAFU9c23 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long jM21867getColorWaAFU9c24 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long jM21867getColorWaAFU9c25 = colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m21916lightColorSchemeCXl9yA$default(jM21867getColorWaAFU9c, jM21867getColorWaAFU9c2, jM21867getColorWaAFU9c3, jM21867getColorWaAFU9c4, jM21867getColorWaAFU9c5, jM21867getColorWaAFU9c6, jM21867getColorWaAFU9c7, jM21867getColorWaAFU9c8, jM21867getColorWaAFU9c9, jM21867getColorWaAFU9c10, jM21867getColorWaAFU9c11, jM21867getColorWaAFU9c12, jM21867getColorWaAFU9c13, jM21867getColorWaAFU9c14, jM21867getColorWaAFU9c15, jM21867getColorWaAFU9c16, jM21867getColorWaAFU9c17, jM21867getColorWaAFU9c18, jM21867getColorWaAFU9c19, colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_primary_light), jM21867getColorWaAFU9c20, jM21867getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM21867getColorWaAFU9c22, jM21867getColorWaAFU9c23, 0L, jM21867getColorWaAFU9c24, colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_light), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), jM21867getColorWaAFU9c25, 331350016, 0, null);
    }

    @RequiresApi(31)
    public static final TonalPalette dynamicTonalPalette(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_0), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_10), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_50), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_100), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_200), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_300), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_400), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_500), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_700), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_800), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_900), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral1_1000), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_0), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_10), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_50), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_100), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_200), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_300), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_400), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_500), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_700), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_800), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_900), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m22067setLuminanceDxMtmZc(colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_neutral2_1000), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_0), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_10), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_50), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_100), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_200), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_300), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_400), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_500), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_600), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_700), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_800), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_900), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent1_1000), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_0), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_10), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_50), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_100), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_200), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_300), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_400), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_500), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_600), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_700), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_800), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_900), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent2_1000), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_0), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_10), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_50), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_100), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_200), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_300), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_400), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_500), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_600), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_700), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_800), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_900), colorResourceHelper.m21867getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    private static final float labInvf(float f10) {
        float f11 = f10 * f10 * f10;
        return f11 > 0.008856452f ? f11 : ((116 * f10) - 16) / 903.2963f;
    }

    /* renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m22067setLuminanceDxMtmZc(long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = MotionTokens.DurationShort2) float f10) {
        double d10 = f10;
        if ((d10 < 1.0E-4d) || (d10 > 99.9999d)) {
            int iDelinearized = delinearized(100 * labInvf((f10 + 16) / 116));
            return ColorKt.Color$default(iDelinearized, iDelinearized, iDelinearized, 0, 8, null);
        }
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        long jM24273convertvNxB06k = Color.m24273convertvNxB06k(j10, colorSpaces.getCieLab());
        return Color.m24273convertvNxB06k(ColorKt.Color$default(f10, Color.m24281getGreenimpl(jM24273convertvNxB06k), Color.m24279getBlueimpl(jM24273convertvNxB06k), 0.0f, colorSpaces.getCieLab(), 8, null), colorSpaces.getSrgb());
    }
}
