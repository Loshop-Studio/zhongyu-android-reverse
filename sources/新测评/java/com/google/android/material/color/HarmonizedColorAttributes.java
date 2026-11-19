package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.C5442R;

/* loaded from: classes3.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C5442R.attr.colorError, C5442R.attr.colorOnError, C5442R.attr.colorErrorContainer, C5442R.attr.colorOnErrorContainer};
    private final int[] attributes;

    @StyleRes
    private final int themeOverlay;

    private HarmonizedColorAttributes(@AttrRes @NonNull int[] iArr, @StyleRes int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i10;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C5442R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.attributes;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr, @StyleRes int i10) {
        return new HarmonizedColorAttributes(iArr, i10);
    }
}
