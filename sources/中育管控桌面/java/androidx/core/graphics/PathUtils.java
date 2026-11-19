package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class PathUtils {

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static float[] approximate(Path path, float f6) {
            return path.approximate(f6);
        }
    }

    private PathUtils() {
    }

    @RequiresApi(26)
    public static Collection<PathSegment> flatten(Path path) {
        return flatten(path, 0.5f);
    }

    @RequiresApi(26)
    public static Collection<PathSegment> flatten(Path path, @FloatRange(from = 0.0d) float f6) {
        float[] fArrApproximate = Api26Impl.approximate(path, f6);
        int length = fArrApproximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 1; i6 < length; i6++) {
            int i7 = i6 * 3;
            int i8 = (i6 - 1) * 3;
            float f7 = fArrApproximate[i7];
            float f8 = fArrApproximate[i7 + 1];
            float f9 = fArrApproximate[i7 + 2];
            float f10 = fArrApproximate[i8];
            float f11 = fArrApproximate[i8 + 1];
            float f12 = fArrApproximate[i8 + 2];
            if (f7 != f10 && (f8 != f11 || f9 != f12)) {
                arrayList.add(new PathSegment(new PointF(f11, f12), f10, new PointF(f8, f9), f7));
            }
        }
        return arrayList;
    }
}
