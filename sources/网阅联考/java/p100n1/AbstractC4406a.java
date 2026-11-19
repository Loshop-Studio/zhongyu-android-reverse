package p100n1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$drawable;

/* renamed from: n1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4406a {
    /* renamed from: a */
    public static int m5452a(Context context, int i4) {
        return ContextCompat.getColor(context, i4);
    }

    /* renamed from: b */
    public static Drawable m5453b(Context context, int i4) {
        return AppCompatResources.getDrawable(context, i4);
    }

    /* renamed from: c */
    public static void m5454c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: d */
    public static Drawable m5455d(Context context, int i4) {
        return m5456e((NinePatchDrawable) m5453b(context, R$drawable.xtoast_frame), i4);
    }

    /* renamed from: e */
    public static Drawable m5456e(Drawable drawable, int i4) {
        drawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
