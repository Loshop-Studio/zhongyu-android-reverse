package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C3457R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* loaded from: classes2.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i8) {
        return ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i8) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = 100) int i8) {
        Hct hctFromInt = Hct.fromInt(i);
        hctFromInt.setTone(i8);
        return hctFromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i) {
        return getColorRoles(i, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i, @NonNull ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve == null) {
            return null;
        }
        int i8 = typedValueResolve.resourceId;
        if (i8 != 0) {
            return ContextCompat.getColorStateList(context, i8);
        }
        int i9 = typedValueResolve.data;
        if (i9 != 0) {
            return ColorStateList.valueOf(i9);
        }
        return null;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i) {
        return getColorRole(i, isLightTheme(context) ? TONE_SURFACE_CONTAINER_LIGHT : 12, 6);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i) {
        return getColorRole(i, isLightTheme(context) ? TONE_SURFACE_CONTAINER_HIGH_LIGHT : 17, 6);
    }

    @ColorInt
    public static int harmonize(@ColorInt int i, @ColorInt int i8) {
        return Blend.harmonize(i, i8);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i) {
        return harmonize(i, getColor(context, C3457R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i) {
        return i != 0 && ColorUtils.calculateLuminance(i) > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, C3457R.attr.isLightTheme, true);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i8) {
        return layer(view, i, i8, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? ContextCompat.getColor(context, i) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? ContextCompat.getColorStateList(context, i) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i, boolean z8) {
        return z8 ? new ColorRoles(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10)) : new ColorRoles(getColorRole(i, TONE_ACCENT_DARK), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i8, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f) {
        return layer(getColor(view, i), getColor(view, i8), f);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = 100) int i8, int i9) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i, i8));
        hctFromInt.setChroma(i9);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i8, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f) {
        return layer(i, ColorUtils.setAlphaComponent(i8, Math.round(Color.alpha(i8) * f)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i, @ColorInt int i8) {
        return getColor(view.getContext(), i, i8);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i, @ColorInt int i8) {
        Integer colorOrNull = getColorOrNull(context, i);
        return colorOrNull != null ? colorOrNull.intValue() : i8;
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i8) {
        return ColorUtils.compositeColors(i8, i);
    }
}
