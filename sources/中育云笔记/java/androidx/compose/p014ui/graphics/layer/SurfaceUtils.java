package androidx.compose.p014ui.graphics.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class SurfaceUtils {
    public static final SurfaceUtils INSTANCE = new SurfaceUtils();
    private static boolean hasRetrievedMethod;
    private static Method lockHardwareCanvasMethod;

    private SurfaceUtils() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final Canvas lockCanvasFallback(Surface surface) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodResolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (methodResolveLockHardwareCanvasMethod == null) {
            return surface.lockCanvas(null);
        }
        Object objInvoke = methodResolveLockHardwareCanvasMethod.invoke(surface, null);
        AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) objInvoke;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final Method resolveLockHardwareCanvasMethod() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = lockHardwareCanvasMethod;
                if (hasRetrievedMethod) {
                    method = method2;
                } else {
                    hasRetrievedMethod = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    lockHardwareCanvasMethod = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                lockHardwareCanvasMethod = null;
            }
        }
        return method;
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    @RequiresApi(22)
    public final Canvas lockCanvas(Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }
}
