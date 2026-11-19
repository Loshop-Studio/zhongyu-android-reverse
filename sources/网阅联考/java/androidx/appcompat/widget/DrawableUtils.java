package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.WrappedDrawable;

@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();
    private static final String TAG = "DrawableUtils";
    private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static Class<?> sInsetsClazz;

    static {
        try {
            sInsetsClazz = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    private DrawableUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof WrappedDrawable) {
                return canSafelyMutateDrawable(((WrappedDrawable) drawable).getWrappedDrawable());
            }
            if (drawable instanceof DrawableWrapper) {
                return canSafelyMutateDrawable(((DrawableWrapper) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return canSafelyMutateDrawable(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!canSafelyMutateDrawable(drawable2)) {
                return false;
            }
        }
        return true;
    }

    public static void fixDrawable(@NonNull Drawable drawable) {
    }

    private static void fixVectorDrawableTinting(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L28
            android.graphics.Insets r11 = androidx.appcompat.widget.AbstractC0225o.m118a(r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = androidx.appcompat.widget.AbstractC0226p.m119a(r11)
            r0.left = r1
            int r1 = androidx.appcompat.widget.AbstractC0227q.m120a(r11)
            r0.right = r1
            int r1 = androidx.appcompat.widget.AbstractC0228r.m121a(r11)
            r0.top = r1
            int r11 = androidx.appcompat.widget.AbstractC0229s.m122a(r11)
            r0.bottom = r11
            return r0
        L28:
            java.lang.Class<?> r0 = androidx.appcompat.widget.DrawableUtils.sInsetsClazz
            if (r0 == 0) goto Lbe
            android.graphics.drawable.Drawable r11 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r11)     // Catch: java.lang.Exception -> Lb7
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lb7
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lb7
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r11 = r0.invoke(r11, r1)     // Catch: java.lang.Exception -> Lb7
            if (r11 == 0) goto Lbe
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lb7
            r0.<init>()     // Catch: java.lang.Exception -> Lb7
            java.lang.Class<?> r1 = androidx.appcompat.widget.DrawableUtils.sInsetsClazz     // Catch: java.lang.Exception -> Lb7
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch: java.lang.Exception -> Lb7
            int r3 = r1.length     // Catch: java.lang.Exception -> Lb7
            r4 = r2
        L52:
            if (r4 >= r3) goto Lb6
            r5 = r1[r4]     // Catch: java.lang.Exception -> Lb7
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Lb7
            int r7 = r6.hashCode()     // Catch: java.lang.Exception -> Lb7
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1383228885: goto L84;
                case 115029: goto L79;
                case 3317767: goto L6f;
                case 108511772: goto L65;
                default: goto L64;
            }     // Catch: java.lang.Exception -> Lb7
        L64:
            goto L8e
        L65:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb7
            if (r6 == 0) goto L8e
            r6 = r9
            goto L8f
        L6f:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb7
            if (r6 == 0) goto L8e
            r6 = r2
            goto L8f
        L79:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb7
            if (r6 == 0) goto L8e
            r6 = r10
            goto L8f
        L84:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> Lb7
            if (r6 == 0) goto L8e
            r6 = r8
            goto L8f
        L8e:
            r6 = -1
        L8f:
            if (r6 == 0) goto Lad
            if (r6 == r10) goto La6
            if (r6 == r9) goto L9f
            if (r6 == r8) goto L98
            goto Lb3
        L98:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb7
            r0.bottom = r5     // Catch: java.lang.Exception -> Lb7
            goto Lb3
        L9f:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb7
            r0.right = r5     // Catch: java.lang.Exception -> Lb7
            goto Lb3
        La6:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb7
            r0.top = r5     // Catch: java.lang.Exception -> Lb7
            goto Lb3
        Lad:
            int r5 = r5.getInt(r11)     // Catch: java.lang.Exception -> Lb7
            r0.left = r5     // Catch: java.lang.Exception -> Lb7
        Lb3:
            int r4 = r4 + 1
            goto L52
        Lb6:
            return r0
        Lb7:
            java.lang.String r11 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r11, r0)
        Lbe:
            android.graphics.Rect r11 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.getOpticalBounds(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static PorterDuff.Mode parseTintMode(int i4, PorterDuff.Mode mode) {
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
