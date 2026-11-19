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
import com.google.android.material.C5733R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes3.dex */
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
    public static int compositeARGBWithAlpha(@ColorInt int i9, @IntRange(from = 0, m266to = ScatterMapKt.Sentinel) int i10) {
        return ColorUtils.setAlphaComponent(i9, (Color.alpha(i9) * i10) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i9) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i9));
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i9) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i9);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i9, @IntRange(from = 0, m266to = 100) int i10) {
        Hct hctFromInt = Hct.fromInt(i9);
        hctFromInt.setTone(i10);
        return hctFromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i9) {
        return getColorRoles(i9, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i9, @NonNull ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i9);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i9) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i9);
        if (typedValueResolve == null) {
            return null;
        }
        int i10 = typedValueResolve.resourceId;
        if (i10 != 0) {
            return ContextCompat.getColorStateList(context, i10);
        }
        int i11 = typedValueResolve.data;
        if (i11 != 0) {
            return ColorStateList.valueOf(i11);
        }
        return null;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i9) {
        return getColorRole(i9, isLightTheme(context) ? TONE_SURFACE_CONTAINER_LIGHT : 12, 6);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i9) {
        return getColorRole(i9, isLightTheme(context) ? TONE_SURFACE_CONTAINER_HIGH_LIGHT : 17, 6);
    }

    @ColorInt
    public static int harmonize(@ColorInt int i9, @ColorInt int i10) {
        return Blend.harmonize(i9, i10);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i9) {
        return harmonize(i9, getColor(context, C5733R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i9) {
        return i9 != 0 && ColorUtils.calculateLuminance(i9) > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, C5733R.attr.isLightTheme, true);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i9, @AttrRes int i10) {
        return layer(view, i9, i10, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i9 = typedValue.resourceId;
        return i9 != 0 ? ContextCompat.getColor(context, i9) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i9 = typedValue.resourceId;
        return i9 != 0 ? ContextCompat.getColorStateList(context, i9) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i9, boolean z9) {
        return z9 ? new ColorRoles(getColorRole(i9, 40), getColorRole(i9, 100), getColorRole(i9, 90), getColorRole(i9, 10)) : new ColorRoles(getColorRole(i9, 80), getColorRole(i9, 20), getColorRole(i9, 30), getColorRole(i9, 90));
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i9, @AttrRes int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return layer(getColor(view, i9), getColor(view, i10), f10);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i9, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i9, str));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i9, @IntRange(from = 0, m266to = 100) int i10, int i11) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i9, i10));
        hctFromInt.setChroma(i11);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int layer(@ColorInt int i9, @ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return layer(i9, ColorUtils.setAlphaComponent(i10, Math.round(Color.alpha(i10) * f10)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i9, @ColorInt int i10) {
        return getColor(view.getContext(), i9, i10);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i9, @ColorInt int i10) {
        Integer colorOrNull = getColorOrNull(context, i9);
        return colorOrNull != null ? colorOrNull.intValue() : i10;
    }

    @ColorInt
    public static int layer(@ColorInt int i9, @ColorInt int i10) {
        return ColorUtils.compositeColors(i10, i9);
    }
}
