package p242s4;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$drawable;

/* renamed from: s4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9471a {
    /* renamed from: a */
    public static int m15653a(Context context, int i9) {
        return ContextCompat.getColor(context, i9);
    }

    /* renamed from: b */
    public static Drawable m15654b(Context context, int i9) {
        return AppCompatResources.getDrawable(context, i9);
    }

    /* renamed from: c */
    public static void m15655c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m15656d(Context context, int i9) {
        return m15657e((NinePatchDrawable) m15654b(context, R$drawable.xtoast_frame), i9);
    }

    /* renamed from: e */
    public static Drawable m15657e(Drawable drawable, int i9) {
        drawable.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
