package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import p211jd.AbstractC9719c;

/* loaded from: classes2.dex */
public final class DynamicTonalPaletteKt {
    private static final int delinearized(float f10) {
        double d10 = f10 / 100;
        return MathUtils.clamp(AbstractC9719c.m19281c((d10 <= 0.0031308d ? d10 * 12.92d : (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicDarkColorScheme34(context) : dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long jM29421getPrimary800d7_KjU = tonalPalette.m29421getPrimary800d7_KjU();
        long jM29415getPrimary200d7_KjU = tonalPalette.m29415getPrimary200d7_KjU();
        long jM29416getPrimary300d7_KjU = tonalPalette.m29416getPrimary300d7_KjU();
        long jM29422getPrimary900d7_KjU = tonalPalette.m29422getPrimary900d7_KjU();
        long jM29417getPrimary400d7_KjU = tonalPalette.m29417getPrimary400d7_KjU();
        long jM29434getSecondary800d7_KjU = tonalPalette.m29434getSecondary800d7_KjU();
        long jM29428getSecondary200d7_KjU = tonalPalette.m29428getSecondary200d7_KjU();
        long jM29429getSecondary300d7_KjU = tonalPalette.m29429getSecondary300d7_KjU();
        long jM29435getSecondary900d7_KjU = tonalPalette.m29435getSecondary900d7_KjU();
        long jM29447getTertiary800d7_KjU = tonalPalette.m29447getTertiary800d7_KjU();
        long jM29441getTertiary200d7_KjU = tonalPalette.m29441getTertiary200d7_KjU();
        long jM29442getTertiary300d7_KjU = tonalPalette.m29442getTertiary300d7_KjU();
        long jM29448getTertiary900d7_KjU = tonalPalette.m29448getTertiary900d7_KjU();
        long jM29400getNeutralVariant60d7_KjU = tonalPalette.m29400getNeutralVariant60d7_KjU();
        long jM29405getNeutralVariant900d7_KjU = tonalPalette.m29405getNeutralVariant900d7_KjU();
        long jM29400getNeutralVariant60d7_KjU2 = tonalPalette.m29400getNeutralVariant60d7_KjU();
        long jM29405getNeutralVariant900d7_KjU2 = tonalPalette.m29405getNeutralVariant900d7_KjU();
        long jM29396getNeutralVariant300d7_KjU = tonalPalette.m29396getNeutralVariant300d7_KjU();
        long jM29403getNeutralVariant800d7_KjU = tonalPalette.m29403getNeutralVariant800d7_KjU();
        long jM29405getNeutralVariant900d7_KjU3 = tonalPalette.m29405getNeutralVariant900d7_KjU();
        long jM29393getNeutralVariant200d7_KjU = tonalPalette.m29393getNeutralVariant200d7_KjU();
        long jM29401getNeutralVariant600d7_KjU = tonalPalette.m29401getNeutralVariant600d7_KjU();
        long jM29396getNeutralVariant300d7_KjU2 = tonalPalette.m29396getNeutralVariant300d7_KjU();
        long jM29388getNeutralVariant00d7_KjU = tonalPalette.m29388getNeutralVariant00d7_KjU();
        long jM29395getNeutralVariant240d7_KjU = tonalPalette.m29395getNeutralVariant240d7_KjU();
        long jM29400getNeutralVariant60d7_KjU3 = tonalPalette.m29400getNeutralVariant60d7_KjU();
        return ColorSchemeKt.m28514darkColorSchemeCXl9yA$default(jM29421getPrimary800d7_KjU, jM29415getPrimary200d7_KjU, jM29416getPrimary300d7_KjU, jM29422getPrimary900d7_KjU, jM29417getPrimary400d7_KjU, jM29434getSecondary800d7_KjU, jM29428getSecondary200d7_KjU, jM29429getSecondary300d7_KjU, jM29435getSecondary900d7_KjU, jM29447getTertiary800d7_KjU, jM29441getTertiary200d7_KjU, jM29442getTertiary300d7_KjU, jM29448getTertiary900d7_KjU, jM29400getNeutralVariant60d7_KjU, jM29405getNeutralVariant900d7_KjU, jM29400getNeutralVariant60d7_KjU2, jM29405getNeutralVariant900d7_KjU2, jM29396getNeutralVariant300d7_KjU, jM29403getNeutralVariant800d7_KjU, tonalPalette.m29421getPrimary800d7_KjU(), jM29405getNeutralVariant900d7_KjU3, jM29393getNeutralVariant200d7_KjU, 0L, 0L, 0L, 0L, jM29401getNeutralVariant600d7_KjU, jM29396getNeutralVariant300d7_KjU2, jM29388getNeutralVariant00d7_KjU, jM29395getNeutralVariant240d7_KjU, tonalPalette.m29391getNeutralVariant120d7_KjU(), tonalPalette.m29392getNeutralVariant170d7_KjU(), tonalPalette.m29394getNeutralVariant220d7_KjU(), tonalPalette.m29389getNeutralVariant100d7_KjU(), tonalPalette.m29397getNeutralVariant40d7_KjU(), jM29400getNeutralVariant60d7_KjU3, 62914560, 0, null);
    }

    @RequiresApi(34)
    public static final ColorScheme dynamicDarkColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM28469getColorWaAFU9c = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM28469getColorWaAFU9c2 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long jM28469getColorWaAFU9c3 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long jM28469getColorWaAFU9c4 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long jM28469getColorWaAFU9c5 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM28469getColorWaAFU9c6 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long jM28469getColorWaAFU9c7 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long jM28469getColorWaAFU9c8 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long jM28469getColorWaAFU9c9 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long jM28469getColorWaAFU9c10 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long jM28469getColorWaAFU9c11 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long jM28469getColorWaAFU9c12 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long jM28469getColorWaAFU9c13 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long jM28469getColorWaAFU9c14 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_background_dark);
        long jM28469getColorWaAFU9c15 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long jM28469getColorWaAFU9c16 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM28469getColorWaAFU9c17 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM28469getColorWaAFU9c18 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long jM28469getColorWaAFU9c19 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long jM28469getColorWaAFU9c20 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM28469getColorWaAFU9c21 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM28469getColorWaAFU9c22 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long jM28469getColorWaAFU9c23 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long jM28469getColorWaAFU9c24 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long jM28469getColorWaAFU9c25 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m28514darkColorSchemeCXl9yA$default(jM28469getColorWaAFU9c, jM28469getColorWaAFU9c2, jM28469getColorWaAFU9c3, jM28469getColorWaAFU9c4, jM28469getColorWaAFU9c5, jM28469getColorWaAFU9c6, jM28469getColorWaAFU9c7, jM28469getColorWaAFU9c8, jM28469getColorWaAFU9c9, jM28469getColorWaAFU9c10, jM28469getColorWaAFU9c11, jM28469getColorWaAFU9c12, jM28469getColorWaAFU9c13, jM28469getColorWaAFU9c14, jM28469getColorWaAFU9c15, jM28469getColorWaAFU9c16, jM28469getColorWaAFU9c17, jM28469getColorWaAFU9c18, jM28469getColorWaAFU9c19, colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_dark), jM28469getColorWaAFU9c20, jM28469getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM28469getColorWaAFU9c22, jM28469getColorWaAFU9c23, 0L, jM28469getColorWaAFU9c24, colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_dark), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), jM28469getColorWaAFU9c25, 331350016, 0, null);
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? dynamicLightColorScheme34(context) : dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long jM29417getPrimary400d7_KjU = tonalPalette.m29417getPrimary400d7_KjU();
        long jM29414getPrimary1000d7_KjU = tonalPalette.m29414getPrimary1000d7_KjU();
        long jM29422getPrimary900d7_KjU = tonalPalette.m29422getPrimary900d7_KjU();
        long jM29413getPrimary100d7_KjU = tonalPalette.m29413getPrimary100d7_KjU();
        long jM29421getPrimary800d7_KjU = tonalPalette.m29421getPrimary800d7_KjU();
        long jM29430getSecondary400d7_KjU = tonalPalette.m29430getSecondary400d7_KjU();
        long jM29427getSecondary1000d7_KjU = tonalPalette.m29427getSecondary1000d7_KjU();
        long jM29435getSecondary900d7_KjU = tonalPalette.m29435getSecondary900d7_KjU();
        long jM29426getSecondary100d7_KjU = tonalPalette.m29426getSecondary100d7_KjU();
        long jM29443getTertiary400d7_KjU = tonalPalette.m29443getTertiary400d7_KjU();
        long jM29440getTertiary1000d7_KjU = tonalPalette.m29440getTertiary1000d7_KjU();
        long jM29448getTertiary900d7_KjU = tonalPalette.m29448getTertiary900d7_KjU();
        long jM29439getTertiary100d7_KjU = tonalPalette.m29439getTertiary100d7_KjU();
        long jM29410getNeutralVariant980d7_KjU = tonalPalette.m29410getNeutralVariant980d7_KjU();
        long jM29389getNeutralVariant100d7_KjU = tonalPalette.m29389getNeutralVariant100d7_KjU();
        long jM29410getNeutralVariant980d7_KjU2 = tonalPalette.m29410getNeutralVariant980d7_KjU();
        long jM29389getNeutralVariant100d7_KjU2 = tonalPalette.m29389getNeutralVariant100d7_KjU();
        long jM29405getNeutralVariant900d7_KjU = tonalPalette.m29405getNeutralVariant900d7_KjU();
        long jM29396getNeutralVariant300d7_KjU = tonalPalette.m29396getNeutralVariant300d7_KjU();
        long jM29393getNeutralVariant200d7_KjU = tonalPalette.m29393getNeutralVariant200d7_KjU();
        long jM29408getNeutralVariant950d7_KjU = tonalPalette.m29408getNeutralVariant950d7_KjU();
        long jM29399getNeutralVariant500d7_KjU = tonalPalette.m29399getNeutralVariant500d7_KjU();
        long jM29403getNeutralVariant800d7_KjU = tonalPalette.m29403getNeutralVariant800d7_KjU();
        long jM29388getNeutralVariant00d7_KjU = tonalPalette.m29388getNeutralVariant00d7_KjU();
        long jM29410getNeutralVariant980d7_KjU3 = tonalPalette.m29410getNeutralVariant980d7_KjU();
        long jM29404getNeutralVariant870d7_KjU = tonalPalette.m29404getNeutralVariant870d7_KjU();
        return ColorSchemeKt.m28518lightColorSchemeCXl9yA$default(jM29417getPrimary400d7_KjU, jM29414getPrimary1000d7_KjU, jM29422getPrimary900d7_KjU, jM29413getPrimary100d7_KjU, jM29421getPrimary800d7_KjU, jM29430getSecondary400d7_KjU, jM29427getSecondary1000d7_KjU, jM29435getSecondary900d7_KjU, jM29426getSecondary100d7_KjU, jM29443getTertiary400d7_KjU, jM29440getTertiary1000d7_KjU, jM29448getTertiary900d7_KjU, jM29439getTertiary100d7_KjU, jM29410getNeutralVariant980d7_KjU, jM29389getNeutralVariant100d7_KjU, jM29410getNeutralVariant980d7_KjU2, jM29389getNeutralVariant100d7_KjU2, jM29405getNeutralVariant900d7_KjU, jM29396getNeutralVariant300d7_KjU, tonalPalette.m29417getPrimary400d7_KjU(), jM29393getNeutralVariant200d7_KjU, jM29408getNeutralVariant950d7_KjU, 0L, 0L, 0L, 0L, jM29399getNeutralVariant500d7_KjU, jM29403getNeutralVariant800d7_KjU, jM29388getNeutralVariant00d7_KjU, jM29410getNeutralVariant980d7_KjU3, tonalPalette.m29407getNeutralVariant940d7_KjU(), tonalPalette.m29406getNeutralVariant920d7_KjU(), tonalPalette.m29405getNeutralVariant900d7_KjU(), tonalPalette.m29409getNeutralVariant960d7_KjU(), tonalPalette.m29390getNeutralVariant1000d7_KjU(), jM29404getNeutralVariant870d7_KjU, 62914560, 0, null);
    }

    @RequiresApi(34)
    public static final ColorScheme dynamicLightColorScheme34(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long jM28469getColorWaAFU9c = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM28469getColorWaAFU9c2 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long jM28469getColorWaAFU9c3 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long jM28469getColorWaAFU9c4 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long jM28469getColorWaAFU9c5 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM28469getColorWaAFU9c6 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long jM28469getColorWaAFU9c7 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long jM28469getColorWaAFU9c8 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long jM28469getColorWaAFU9c9 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long jM28469getColorWaAFU9c10 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long jM28469getColorWaAFU9c11 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long jM28469getColorWaAFU9c12 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long jM28469getColorWaAFU9c13 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long jM28469getColorWaAFU9c14 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_background_light);
        long jM28469getColorWaAFU9c15 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long jM28469getColorWaAFU9c16 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM28469getColorWaAFU9c17 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM28469getColorWaAFU9c18 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long jM28469getColorWaAFU9c19 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long jM28469getColorWaAFU9c20 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM28469getColorWaAFU9c21 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM28469getColorWaAFU9c22 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_outline_light);
        long jM28469getColorWaAFU9c23 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long jM28469getColorWaAFU9c24 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long jM28469getColorWaAFU9c25 = colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m28518lightColorSchemeCXl9yA$default(jM28469getColorWaAFU9c, jM28469getColorWaAFU9c2, jM28469getColorWaAFU9c3, jM28469getColorWaAFU9c4, jM28469getColorWaAFU9c5, jM28469getColorWaAFU9c6, jM28469getColorWaAFU9c7, jM28469getColorWaAFU9c8, jM28469getColorWaAFU9c9, jM28469getColorWaAFU9c10, jM28469getColorWaAFU9c11, jM28469getColorWaAFU9c12, jM28469getColorWaAFU9c13, jM28469getColorWaAFU9c14, jM28469getColorWaAFU9c15, jM28469getColorWaAFU9c16, jM28469getColorWaAFU9c17, jM28469getColorWaAFU9c18, jM28469getColorWaAFU9c19, colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_primary_light), jM28469getColorWaAFU9c20, jM28469getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM28469getColorWaAFU9c22, jM28469getColorWaAFU9c23, 0L, jM28469getColorWaAFU9c24, colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_light), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), jM28469getColorWaAFU9c25, 331350016, 0, null);
    }

    @RequiresApi(31)
    public static final TonalPalette dynamicTonalPalette(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_0), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_10), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_50), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_100), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_200), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_300), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_400), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_500), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_700), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_800), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_900), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral1_1000), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_0), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_10), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_50), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_100), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_200), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_300), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_400), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_500), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_700), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_800), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_900), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m28669setLuminanceDxMtmZc(colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_neutral2_1000), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_0), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_10), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_50), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_100), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_200), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_300), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_400), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_500), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_600), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_700), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_800), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_900), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent1_1000), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_0), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_10), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_50), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_100), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_200), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_300), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_400), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_500), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_600), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_700), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_800), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_900), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent2_1000), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_0), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_10), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_50), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_100), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_200), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_300), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_400), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_500), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_600), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_700), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_800), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_900), colorResourceHelper.m28469getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    private static final float labInvf(float f10) {
        float f11 = f10 * f10 * f10;
        return f11 > 0.008856452f ? f11 : ((116 * f10) - 16) / 903.2963f;
    }

    /* renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m28669setLuminanceDxMtmZc(long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = MotionTokens.DurationShort2) float f10) {
        double d10 = f10;
        if ((d10 < 1.0E-4d) || (d10 > 99.9999d)) {
            int iDelinearized = delinearized(100 * labInvf((f10 + 16) / 116));
            return ColorKt.Color$default(iDelinearized, iDelinearized, iDelinearized, 0, 8, null);
        }
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        long jM30875convertvNxB06k = Color.m30875convertvNxB06k(j10, colorSpaces.getCieLab());
        return Color.m30875convertvNxB06k(ColorKt.Color$default(f10, Color.m30883getGreenimpl(jM30875convertvNxB06k), Color.m30881getBlueimpl(jM30875convertvNxB06k), 0.0f, colorSpaces.getCieLab(), 8, null), colorSpaces.getSrgb());
    }
}
