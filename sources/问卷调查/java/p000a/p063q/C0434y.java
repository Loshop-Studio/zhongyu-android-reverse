package p000a.p063q;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: a.q.y */
/* loaded from: classes.dex */
public class C0434y {

    /* renamed from: a */
    public static Field f2471a;

    /* renamed from: b */
    public static boolean f2472b;

    /* renamed from: a */
    public void mo1479a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo1480b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo1481c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo1485d(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: e */
    public void mo1482e(View view, float f2) {
        throw null;
    }

    /* renamed from: f */
    public void mo1486f(View view, int i) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f2472b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2471a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2472b = true;
        }
        Field field = f2471a;
        if (field != null) {
            try {
                f2471a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo1483g(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: h */
    public void mo1484h(View view, Matrix matrix) {
        throw null;
    }
}
