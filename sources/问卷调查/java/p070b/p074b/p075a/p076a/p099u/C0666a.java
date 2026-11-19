package p070b.p074b.p075a.p076a.p099u;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: b.b.a.a.u.a */
/* loaded from: classes.dex */
public class C0666a {

    /* renamed from: a */
    public static final int[] f3979a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f3980b = C0666a.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m2276a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3979a, 0)) != 0) {
            Log.w(f3980b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m2277b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
