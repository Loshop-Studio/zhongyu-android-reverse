package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.l0 */
/* loaded from: classes.dex */
class C0737l0 {

    /* renamed from: a */
    private static Field f4442a;

    /* renamed from: b */
    private static boolean f4443b;

    C0737l0() {
    }

    /* renamed from: a */
    public void mo3877a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo3878b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo3879c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo3886d(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: e */
    public void mo3896e(View view, int i4, int i5, int i6, int i7) {
        throw null;
    }

    /* renamed from: f */
    public void mo3880f(View view, float f4) {
        throw null;
    }

    /* renamed from: g */
    public void mo3899g(View view, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f4443b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4442a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4443b = true;
        }
        Field field = f4442a;
        if (field != null) {
            try {
                f4442a.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo3887h(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: i */
    public void mo3888i(View view, Matrix matrix) {
        throw null;
    }
}
