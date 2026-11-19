package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0332a;
import p073d.C2443a;
import p088g.C2622d;
import p148s.C3368f;

/* loaded from: classes.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    private DrawableDecoderCompat() {
    }

    public static Drawable getDrawable(Context context, Context context2, int i4) {
        return getDrawable(context, context2, i4, null);
    }

    private static Drawable loadDrawableV4(Context context, int i4, Resources.Theme theme) {
        return C3368f.m10233d(context.getResources(), i4, theme);
    }

    private static Drawable loadDrawableV7(Context context, int i4, Resources.Theme theme) {
        if (theme != null) {
            context = new C2622d(context, theme);
        }
        return C2443a.m8169d(context, i4);
    }

    public static Drawable getDrawable(Context context, int i4, Resources.Theme theme) {
        return getDrawable(context, context, i4, theme);
    }

    private static Drawable getDrawable(Context context, Context context2, int i4, Resources.Theme theme) {
        try {
            if (shouldCallAppCompatResources) {
                return loadDrawableV7(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0332a.m1806d(context2, i4);
            }
            throw e4;
        } catch (NoClassDefFoundError unused2) {
            shouldCallAppCompatResources = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return loadDrawableV4(context2, i4, theme);
    }
}
