package p132q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: q0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7613h {

    /* renamed from: a */
    public static volatile boolean f10072a = true;

    /* renamed from: a */
    public static Drawable m9040a(Context context, int i6, Resources.Theme theme) {
        return m9042c(context, context, i6, theme);
    }

    /* renamed from: b */
    public static Drawable m9041b(Context context, Context context2, int i6) {
        return m9042c(context, context2, i6, null);
    }

    /* renamed from: c */
    public static Drawable m9042c(Context context, Context context2, int i6, Resources.Theme theme) {
        try {
            if (f10072a) {
                return m9044e(context2, i6, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            return ContextCompat.getDrawable(context2, i6);
        } catch (NoClassDefFoundError unused2) {
            f10072a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m9043d(context2, i6, theme);
    }

    /* renamed from: d */
    public static Drawable m9043d(Context context, int i6, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i6, theme);
    }

    /* renamed from: e */
    public static Drawable m9044e(Context context, int i6, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i6);
    }
}
