package p295x2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$drawable;

/* renamed from: x2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC10491a {
    /* renamed from: a */
    public static int m19694a(Context context, int i10) {
        return ContextCompat.getColor(context, i10);
    }

    /* renamed from: b */
    public static Drawable m19695b(Context context, int i10) {
        return AppCompatResources.getDrawable(context, i10);
    }

    /* renamed from: c */
    public static void m19696c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m19697d(Context context, int i10) {
        return m19698e((NinePatchDrawable) m19695b(context, R$drawable.xtoast_frame), i10);
    }

    /* renamed from: e */
    public static Drawable m19698e(Drawable drawable, int i10) {
        drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
