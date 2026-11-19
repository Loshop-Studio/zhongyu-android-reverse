package p034c4;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$drawable;

/* renamed from: c4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5116a {
    /* renamed from: a */
    public static int m2728a(Context context, int i10) {
        return ContextCompat.getColor(context, i10);
    }

    /* renamed from: b */
    public static Drawable m2729b(Context context, int i10) {
        return AppCompatResources.getDrawable(context, i10);
    }

    /* renamed from: c */
    public static void m2730c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m2731d(Context context, int i10) {
        return m2732e((NinePatchDrawable) m2729b(context, R$drawable.xtoast_frame), i10);
    }

    /* renamed from: e */
    public static Drawable m2732e(Drawable drawable, int i10) {
        drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
