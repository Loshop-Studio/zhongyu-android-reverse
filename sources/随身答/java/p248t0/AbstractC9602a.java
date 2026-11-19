package p248t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: t0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9602a {

    /* renamed from: a */
    public static volatile boolean f16822a = true;

    /* renamed from: a */
    public static Drawable m15826a(Context context, int i9, Resources.Theme theme) {
        return m15828c(context, context, i9, theme);
    }

    /* renamed from: b */
    public static Drawable m15827b(Context context, Context context2, int i9) {
        return m15828c(context, context2, i9, null);
    }

    /* renamed from: c */
    public static Drawable m15828c(Context context, Context context2, int i9, Resources.Theme theme) {
        try {
            if (f16822a) {
                return m15830e(context2, i9, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return ContextCompat.getDrawable(context2, i9);
        } catch (NoClassDefFoundError unused2) {
            f16822a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m15829d(context2, i9, theme);
    }

    /* renamed from: d */
    public static Drawable m15829d(Context context, int i9, Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i9, theme);
    }

    /* renamed from: e */
    public static Drawable m15830e(Context context, int i9, Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i9);
    }
}
