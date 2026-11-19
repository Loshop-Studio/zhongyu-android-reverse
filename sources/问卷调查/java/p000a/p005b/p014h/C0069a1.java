package p000a.p005b.p014h;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.a1 */
/* loaded from: classes.dex */
public class C0069a1 {

    /* renamed from: a */
    public static Method f552a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f552a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f552a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m280a(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f552a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    /* renamed from: b */
    public static boolean m281b(View view) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return view.getLayoutDirection() == 1;
    }
}
