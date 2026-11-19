package androidx.compose.p014ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE = new CanvasUtils();
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(Canvas canvas, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas, z10);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (z10) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    AbstractC9979u.m20291d(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = inorderBarrierMethod) == null) {
            return;
        }
        AbstractC9979u.m20291d(method);
        method.invoke(canvas, null);
    }
}
