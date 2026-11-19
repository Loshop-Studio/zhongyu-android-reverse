package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.graphics.drawable.C0115c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p156u.C3403a;
import p156u.InterfaceC3405c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public class C0231q {

    /* renamed from: a */
    private static final int[] f1190a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f1191b = new int[0];

    /* renamed from: c */
    public static final Rect f1192c = new Rect();

    /* renamed from: d */
    private static Class<?> f1193d;

    static {
        try {
            f1193d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m980a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC3405c) {
                return m980a(((InterfaceC3405c) drawable).mo10403b());
            }
            if (drawable instanceof C0115c) {
                return m980a(((C0115c) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return m980a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m980a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m981b(Drawable drawable) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static Rect m982c(Drawable drawable) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1193d != null) {
            try {
                Drawable drawableM10400q = C3403a.m10400q(drawable);
                Object objInvoke = drawableM10400q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawableM10400q, new Object[0]);
                if (objInvoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1193d.getFields()) {
                        String name = field.getName();
                        char c4 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c4 == 0) {
                            rect2.left = field.getInt(objInvoke);
                        } else if (c4 == 1) {
                            rect2.top = field.getInt(objInvoke);
                        } else if (c4 == 2) {
                            rect2.right = field.getInt(objInvoke);
                        } else if (c4 == 3) {
                            rect2.bottom = field.getInt(objInvoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1192c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m983d(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
