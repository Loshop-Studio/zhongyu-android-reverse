package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    default InterfaceFutureC5453a snapshot(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = 100) int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = 359) int i8) {
        return Futures.immediateFuture(null);
    }
}
