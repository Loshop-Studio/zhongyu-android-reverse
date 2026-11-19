package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    default ListenableFuture<Void> snapshot(@IntRange(from = 0, m338to = 100) int i10, @IntRange(from = 0, m338to = 359) int i11) {
        return Futures.immediateFuture(null);
    }
}
