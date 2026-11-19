package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static Interpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        public static Interpolator createPathInterpolator(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        public static Interpolator createPathInterpolator(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }
    }

    private PathInterpolatorCompat() {
    }

    public static Interpolator create(Path path) {
        return Api21Impl.createPathInterpolator(path);
    }

    public static Interpolator create(float f10, float f11) {
        return Api21Impl.createPathInterpolator(f10, f11);
    }

    public static Interpolator create(float f10, float f11, float f12, float f13) {
        return Api21Impl.createPathInterpolator(f10, f11, f12, f13);
    }
}
