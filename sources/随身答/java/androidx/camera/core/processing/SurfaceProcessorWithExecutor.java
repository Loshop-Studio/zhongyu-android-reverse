package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class SurfaceProcessorWithExecutor implements SurfaceProcessorInternal {
    private static final String TAG = "SurfaceProcessor";

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final SurfaceProcessor mSurfaceProcessor;

    public SurfaceProcessorWithExecutor(@NonNull CameraEffect cameraEffect) {
        SurfaceProcessor surfaceProcessor = cameraEffect.getSurfaceProcessor();
        Objects.requireNonNull(surfaceProcessor);
        this.mSurfaceProcessor = surfaceProcessor;
        this.mExecutor = cameraEffect.getExecutor();
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* renamed from: a */
    public static /* synthetic */ void m642a(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceOutput surfaceOutput) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onOutputSurface(surfaceOutput);
        } catch (ProcessingException e10) {
            Logger.m504e(TAG, "Failed to setup SurfaceProcessor output.", e10);
            surfaceProcessorWithExecutor.mErrorListener.accept(e10);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m643b(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceRequest surfaceRequest) {
        surfaceProcessorWithExecutor.getClass();
        try {
            surfaceProcessorWithExecutor.mSurfaceProcessor.onInputSurface(surfaceRequest);
        } catch (ProcessingException e10) {
            Logger.m504e(TAG, "Failed to setup SurfaceProcessor input.", e10);
            surfaceProcessorWithExecutor.mErrorListener.accept(e10);
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @NonNull
    @VisibleForTesting
    public SurfaceProcessor getProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.m643b(this.f718a, surfaceRequest);
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.i0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.m642a(this.f722a, surfaceOutput);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m266to = 100) int i9, @IntRange(from = 0, m266to = 359) int i10) {
        return Futures.immediateFailedFuture(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }
}
