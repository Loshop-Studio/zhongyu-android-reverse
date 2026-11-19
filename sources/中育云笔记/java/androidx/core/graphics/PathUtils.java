package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class PathUtils {

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static float[] approximate(Path path, float f10) {
            return path.approximate(f10);
        }
    }

    private PathUtils() {
    }

    @RequiresApi(26)
    public static Collection<PathSegment> flatten(Path path) {
        return flatten(path, 0.5f);
    }

    @RequiresApi(26)
    public static Collection<PathSegment> flatten(Path path, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10) {
        float[] fArrApproximate = Api26Impl.approximate(path, f10);
        int length = fArrApproximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f11 = fArrApproximate[i11];
            float f12 = fArrApproximate[i11 + 1];
            float f13 = fArrApproximate[i11 + 2];
            float f14 = fArrApproximate[i12];
            float f15 = fArrApproximate[i12 + 1];
            float f16 = fArrApproximate[i12 + 2];
            if (f11 != f14 && (f12 != f15 || f13 != f16)) {
                arrayList.add(new PathSegment(new PointF(f15, f16), f14, new PointF(f12, f13), f11));
            }
        }
        return arrayList;
    }
}
