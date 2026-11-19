package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11);
    }
}
