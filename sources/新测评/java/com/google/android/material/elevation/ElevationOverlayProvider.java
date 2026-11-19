package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C5442R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes3.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, C5442R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, C5442R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, C5442R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, C5442R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@ColorInt int i10) {
        return ColorUtils.setAlphaComponent(i10, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        if (this.displayDensity <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f10, @NonNull View view) {
        return compositeOverlay(i10, f10 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f10, @NonNull View view) {
        return compositeOverlayIfNeeded(i10, f10 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f10 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f10) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i10);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i10, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i11 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i11, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f10) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i10)) ? compositeOverlay(i10, f10) : i10;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.colorSurface, f10);
    }

    public ElevationOverlayProvider(boolean z9, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12, float f10) {
        this.elevationOverlayEnabled = z9;
        this.elevationOverlayColor = i10;
        this.elevationOverlayAccentColor = i11;
        this.colorSurface = i12;
        this.displayDensity = f10;
    }
}
