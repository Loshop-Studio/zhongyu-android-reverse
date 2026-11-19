package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    public static class Api14Impl {
        private Api14Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i10;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i11 = realSizeForDisplay.x;
            if (i11 == 0 || (i10 = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i11;
            rect.bottom = i10;
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException e10) {
                Log.w(WindowUtils.TAG, e10);
                return point;
            } catch (NoSuchMethodException e11) {
                Log.w(WindowUtils.TAG, e11);
                return point;
            } catch (InvocationTargetException e12) {
                Log.w(WindowUtils.TAG, e12);
                return point;
            }
        }
    }

    @RequiresApi(api = 17)
    public static class Api17Impl {
        private Api17Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @RequiresApi(api = 30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private WindowUtils() {
    }

    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.getCurrentWindowBounds(windowManager) : Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
