package p328s0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: s0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC11029h {

    /* renamed from: a */
    public static volatile boolean f26604a = true;

    /* renamed from: a */
    public static Drawable m24372a(Context context, int i10, Resources.Theme theme) {
        return m24374c(context, context, i10, theme);
    }

    /* renamed from: b */
    public static Drawable m24373b(Context context, Context context2, int i10) {
        return m24374c(context, context2, i10, null);
    }

    /* renamed from: c */
    public static Drawable m24374c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f26604a) {
                return m24376e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return ContextCompat.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f26604a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m24375d(context2, i10, theme);
    }

    /* renamed from: d */
    public static Drawable m24375d(Context context, int i10, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i10, theme);
    }

    /* renamed from: e */
    public static Drawable m24376e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i10);
    }
}
