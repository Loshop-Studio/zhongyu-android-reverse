package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import com.google.android.material.C5493R;
import com.google.android.material.color.MaterialColors;

/* loaded from: classes3.dex */
public enum SurfaceColors {
    SURFACE_0(C5493R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C5493R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C5493R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C5493R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C5493R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C5493R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(@DimenRes int i10) {
        this.elevationResId = i10;
    }

    @ColorInt
    public static int getColorForElevation(@NonNull Context context, @Dimension float f10) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C5493R.attr.colorSurface, 0), f10);
    }

    @ColorInt
    public int getColor(@NonNull Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
