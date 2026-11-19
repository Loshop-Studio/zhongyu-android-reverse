package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class VelocityTrackerCompat {
    private static Map<VelocityTracker, VelocityTrackerFallback> sFallbackTrackers = Collections.synchronizedMap(new WeakHashMap());

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static float getAxisVelocity(VelocityTracker velocityTracker, int i9, int i10) {
            return velocityTracker.getAxisVelocity(i9, i10);
        }

        public static boolean isAxisSupported(VelocityTracker velocityTracker, int i9) {
            return velocityTracker.isAxisSupported(i9);
        }

        public static float getAxisVelocity(VelocityTracker velocityTracker, int i9) {
            return velocityTracker.getAxisVelocity(i9);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface VelocityTrackableMotionEventAxis {
    }

    private VelocityTrackerCompat() {
    }

    public static void addMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!sFallbackTrackers.containsKey(velocityTracker)) {
                sFallbackTrackers.put(velocityTracker, new VelocityTrackerFallback());
            }
            sFallbackTrackers.get(velocityTracker).addMovement(motionEvent);
        }
    }

    public static void clear(VelocityTracker velocityTracker) {
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i9, float f10) {
        velocityTracker.computeCurrentVelocity(i9, f10);
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.computeCurrentVelocity(i9, f10);
        }
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i9);
        }
        if (i9 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i9 == 1) {
            return velocityTracker.getYVelocity();
        }
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.getAxisVelocity(i9);
        }
        return 0.0f;
    }

    private static VelocityTrackerFallback getFallbackTrackerOrNull(VelocityTracker velocityTracker) {
        return sFallbackTrackers.get(velocityTracker);
    }

    @ReplaceWith(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.getXVelocity(i9);
    }

    @ReplaceWith(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.getYVelocity(i9);
    }

    public static boolean isAxisSupported(VelocityTracker velocityTracker, int i9) {
        return Build.VERSION.SDK_INT >= 34 ? Api34Impl.isAxisSupported(velocityTracker, i9) : i9 == 26 || i9 == 0 || i9 == 1;
    }

    public static void recycle(VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    private static void removeFallbackForTracker(VelocityTracker velocityTracker) {
        sFallbackTrackers.remove(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i9) {
        computeCurrentVelocity(velocityTracker, i9, Float.MAX_VALUE);
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i9, i10);
        }
        if (i9 == 0) {
            return velocityTracker.getXVelocity(i10);
        }
        if (i9 == 1) {
            return velocityTracker.getYVelocity(i10);
        }
        return 0.0f;
    }
}
