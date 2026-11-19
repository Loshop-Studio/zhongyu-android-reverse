package com.xuexiang.xui.widget.toast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import p073d.C2443a;

/* loaded from: classes.dex */
final class Utils {
    private Utils() {
    }

    static int getColor(Context context, int i4) {
        return C0332a.m1804b(context, i4);
    }

    static Drawable getDrawable(Context context, int i4) {
        return C2443a.m8169d(context, i4);
    }

    static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    static Drawable tint9PatchDrawableFrame(Context context, int i4) {
        return tintIcon((NinePatchDrawable) getDrawable(context, C2042R.drawable.xtoast_frame), i4);
    }

    static Drawable tintIcon(Drawable drawable, int i4) {
        drawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}
