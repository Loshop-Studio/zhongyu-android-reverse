package p130v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: v.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4613a {

    /* renamed from: a */
    public static volatile boolean f5824a = true;

    /* renamed from: a */
    public static Drawable m6373a(Context context, int i4, Resources.Theme theme) {
        return m6375c(context, context, i4, theme);
    }

    /* renamed from: b */
    public static Drawable m6374b(Context context, Context context2, int i4) {
        return m6375c(context, context2, i4, null);
    }

    /* renamed from: c */
    public static Drawable m6375c(Context context, Context context2, int i4, Resources.Theme theme) {
        try {
            if (f5824a) {
                return m6377e(context2, i4, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e4;
            }
            return ContextCompat.getDrawable(context2, i4);
        } catch (NoClassDefFoundError unused2) {
            f5824a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m6376d(context2, i4, theme);
    }

    /* renamed from: d */
    public static Drawable m6376d(Context context, int i4, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i4, theme);
    }

    /* renamed from: e */
    public static Drawable m6377e(Context context, int i4, Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i4);
    }
}
