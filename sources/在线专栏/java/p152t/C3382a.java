package p152t;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: t.a */
/* loaded from: classes.dex */
public class C3382a {
    /* renamed from: a */
    public static ColorFilter m10297a(int i4, EnumC3383b enumC3383b) {
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode blendModeM10298a = C3384c.m10298a(enumC3383b);
            if (blendModeM10298a != null) {
                return new BlendModeColorFilter(i4, blendModeM10298a);
            }
            return null;
        }
        PorterDuff.Mode modeM10299b = C3384c.m10299b(enumC3383b);
        if (modeM10299b != null) {
            return new PorterDuffColorFilter(i4, modeM10299b);
        }
        return null;
    }
}
