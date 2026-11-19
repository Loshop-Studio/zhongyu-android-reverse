package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.C1371R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p152t.C3385d;

/* loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this.elevationOverlayEnabled = MaterialAttributes.resolveBoolean(context, C1371R.attr.elevationOverlayEnabled, false);
        this.elevationOverlayColor = MaterialColors.getColor(context, C1371R.attr.elevationOverlayColor, 0);
        this.colorSurface = MaterialColors.getColor(context, C1371R.attr.colorSurface, 0);
        this.displayDensity = context.getResources().getDisplayMetrics().density;
    }

    private boolean isThemeSurfaceColor(int i4) {
        return C3385d.m10303d(i4, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f4) {
        return Math.round(calculateOverlayAlphaFraction(f4) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f4) {
        return (this.displayDensity <= IGoodView.DEFAULT_TO_ALPHA || f4 <= IGoodView.DEFAULT_TO_ALPHA) ? IGoodView.DEFAULT_TO_ALPHA : Math.min(((((float) Math.log1p(f4 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i4, float f4, View view) {
        return compositeOverlay(i4, f4 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i4, float f4, View view) {
        return compositeOverlayIfNeeded(i4, f4 + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f4, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f4 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int compositeOverlay(int i4, float f4) {
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f4);
        return C3385d.m10303d(MaterialColors.layer(C3385d.m10303d(i4, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction), Color.alpha(i4));
    }

    public int compositeOverlayIfNeeded(int i4, float f4) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i4)) ? compositeOverlay(i4, f4) : i4;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f4) {
        return compositeOverlayIfNeeded(this.colorSurface, f4);
    }
}
