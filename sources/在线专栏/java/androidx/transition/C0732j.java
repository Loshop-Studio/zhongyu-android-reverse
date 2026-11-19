package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.transition.j */
/* loaded from: classes.dex */
class C0732j {
    /* renamed from: a */
    static InterfaceC0724f m3897a(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? C0728h.m3881b(view, viewGroup, matrix) : C0730i.m3889b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m3898b(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT == 28) {
            C0728h.m3885f(view);
        } else {
            C0730i.m3893f(view);
        }
    }
}
