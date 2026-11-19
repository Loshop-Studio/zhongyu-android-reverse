package p281w;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: w.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10266h {

    /* renamed from: a */
    public static volatile boolean f20496a = true;

    /* renamed from: a */
    public static Drawable m19233a(Context context, int i10, Resources.Theme theme) {
        return m19235c(context, context, i10, theme);
    }

    /* renamed from: b */
    public static Drawable m19234b(Context context, Context context2, int i10) {
        return m19235c(context, context2, i10, null);
    }

    /* renamed from: c */
    public static Drawable m19235c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f20496a) {
                return m19237e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return ContextCompat.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f20496a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m19236d(context2, i10, theme);
    }

    /* renamed from: d */
    public static Drawable m19236d(Context context, int i10, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i10, theme);
    }

    /* renamed from: e */
    public static Drawable m19237e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i10);
    }
}
