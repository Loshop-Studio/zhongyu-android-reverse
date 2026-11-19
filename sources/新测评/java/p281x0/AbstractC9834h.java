package p281x0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: x0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC9834h {

    /* renamed from: a */
    public static volatile boolean f17392a = true;

    /* renamed from: a */
    public static Drawable m16466a(Context context, int i10, Resources.Theme theme) {
        return m16468c(context, context, i10, theme);
    }

    /* renamed from: b */
    public static Drawable m16467b(Context context, Context context2, int i10) {
        return m16468c(context, context2, i10, null);
    }

    /* renamed from: c */
    public static Drawable m16468c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f17392a) {
                return m16470e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return ContextCompat.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f17392a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m16469d(context2, i10, theme);
    }

    /* renamed from: d */
    public static Drawable m16469d(Context context, int i10, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i10, theme);
    }

    /* renamed from: e */
    public static Drawable m16470e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i10);
    }
}
