package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C0369c {

    /* renamed from: a */
    private static Field f2818a;

    /* renamed from: b */
    private static boolean f2819b;

    /* renamed from: a */
    public static Drawable m2173a(CompoundButton compoundButton) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2819b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2818a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e4);
            }
            f2819b = true;
        }
        Field field = f2818a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e5) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e5);
                f2818a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m2174b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: c */
    public static void m2175c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m2176d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
