package p183x2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$drawable;

/* renamed from: x2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7831a {
    /* renamed from: a */
    public static int m9462a(Context context, int i6) {
        return ContextCompat.getColor(context, i6);
    }

    /* renamed from: b */
    public static Drawable m9463b(Context context, int i6) {
        return AppCompatResources.getDrawable(context, i6);
    }

    /* renamed from: c */
    public static void m9464c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m9465d(Context context, int i6) {
        return m9466e((NinePatchDrawable) m9463b(context, R$drawable.xtoast_frame), i6);
    }

    /* renamed from: e */
    public static Drawable m9466e(Drawable drawable, int i6) {
        drawable.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
