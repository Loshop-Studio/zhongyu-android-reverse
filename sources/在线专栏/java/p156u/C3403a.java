package p156u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: u.a */
/* loaded from: classes.dex */
public final class C3403a {

    /* renamed from: a */
    private static Method f11952a;

    /* renamed from: b */
    private static boolean f11953b;

    /* renamed from: c */
    private static Method f11954c;

    /* renamed from: d */
    private static boolean f11955d;

    /* renamed from: a */
    public static void m10384a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: b */
    public static boolean m10385b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m10386c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m10386c(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC3405c) {
            m10386c(((InterfaceC3405c) drawable).mo10403b());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            Drawable child = drawableContainerState.getChild(i4);
            if (child != null) {
                m10386c(child);
            }
        }
    }

    /* renamed from: d */
    public static int m10387d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: e */
    public static ColorFilter m10388e(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: f */
    public static int m10389f(Drawable drawable) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f11955d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f11954c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e4);
            }
            f11955d = true;
        }
        Method method = f11954c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e5) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e5);
                f11954c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m10390g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m10391h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* renamed from: i */
    public static void m10392i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m10393j(Drawable drawable, boolean z3) {
        drawable.setAutoMirrored(z3);
    }

    /* renamed from: k */
    public static void m10394k(Drawable drawable, float f4, float f5) {
        drawable.setHotspot(f4, f5);
    }

    /* renamed from: l */
    public static void m10395l(Drawable drawable, int i4, int i5, int i6, int i7) {
        drawable.setHotspotBounds(i4, i5, i6, i7);
    }

    /* renamed from: m */
    public static boolean m10396m(Drawable drawable, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i4);
        }
        if (!f11953b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f11952a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e4);
            }
            f11953b = true;
        }
        Method method = f11952a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i4));
                return true;
            } catch (Exception e5) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e5);
                f11952a = null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m10397n(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    /* renamed from: o */
    public static void m10398o(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: p */
    public static void m10399p(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m10400q(Drawable drawable) {
        return drawable instanceof InterfaceC3405c ? (T) ((InterfaceC3405c) drawable).mo10403b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m10401r(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC3404b)) ? new C3407e(drawable) : drawable;
    }
}
