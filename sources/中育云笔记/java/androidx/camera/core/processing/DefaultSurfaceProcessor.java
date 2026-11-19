package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* loaded from: classes.dex */
public class DefaultSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DefaultSurfaceProcessor";
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final OpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private final List<PendingSnapshot> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    public static class Factory {
        private static Function<DynamicRange, SurfaceProcessorInternal> sSupplier = new Function() { // from class: androidx.camera.core.processing.p
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            }
        };

        private Factory() {
        }

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange) {
            return sSupplier.apply(dynamicRange);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull Function<DynamicRange, SurfaceProcessorInternal> function) {
            sSupplier = function;
        }
    }

    @AutoValue
    public static abstract class PendingSnapshot {
        @NonNull
        /* renamed from: of */
        public static AutoValue_DefaultSurfaceProcessor_PendingSnapshot m695of(@IntRange(from = 0, m338to = 100) int i10, @IntRange(from = 0, m338to = 359) int i11, @NonNull CallbackToFutureAdapter.Completer<Void> completer) {
            return new AutoValue_DefaultSurfaceProcessor_PendingSnapshot(i10, i11, completer);
        }

        @NonNull
        public abstract CallbackToFutureAdapter.Completer<Void> getCompleter();

        @IntRange(from = 0, m338to = 100)
        public abstract int getJpegQuality();

        @IntRange(from = 0, m338to = 359)
        public abstract int getRotationDegrees();
    }

    public DefaultSurfaceProcessor(@NonNull DynamicRange dynamicRange) {
        this(dynamicRange, Collections.EMPTY_MAP);
    }

    /* renamed from: b */
    public static /* synthetic */ void m683b(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceRequest surfaceRequest, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        defaultSurfaceProcessor.getClass();
        surfaceRequest.clearTransformationInfoListener();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        defaultSurfaceProcessor.mInputSurfaceCount--;
        defaultSurfaceProcessor.checkReadyToRelease();
    }

    /* renamed from: c */
    public static /* synthetic */ void m684c(DefaultSurfaceProcessor defaultSurfaceProcessor) {
        defaultSurfaceProcessor.mIsReleased = true;
        defaultSurfaceProcessor.checkReadyToRelease();
    }

    @WorkerThread
    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<PendingSnapshot> it2 = this.mPendingSnapshots.iterator();
            while (it2.hasNext()) {
                it2.next().getCompleter().setException(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m685d(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, Map map, CallbackToFutureAdapter.Completer completer) throws Throwable {
        defaultSurfaceProcessor.getClass();
        try {
            defaultSurfaceProcessor.mGlRenderer.init(dynamicRange, map);
            completer.set(null);
        } catch (RuntimeException e10) {
            completer.setException(e10);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m686e(final DefaultSurfaceProcessor defaultSurfaceProcessor, int i10, int i11, final CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.getClass();
        final AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshotM695of = PendingSnapshot.m695of(i10, i11, completer);
        defaultSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f681c.mPendingSnapshots.add(autoValue_DefaultSurfaceProcessor_PendingSnapshotM695of);
            }
        }, new Runnable() { // from class: androidx.camera.core.processing.g
            @Override // java.lang.Runnable
            public final void run() {
                completer.setException(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void executeSafely(@NonNull Runnable runnable) {
        executeSafely(runnable, new Runnable() { // from class: androidx.camera.core.processing.o
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m691j();
            }
        });
    }

    /* renamed from: f */
    public static /* synthetic */ void m687f(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
        defaultSurfaceProcessor.getClass();
        GLUtils.InputFormat inputFormat = GLUtils.InputFormat.DEFAULT;
        if (surfaceRequest.getDynamicRange().is10BitHdr() && transformationInfo.hasCameraTransform()) {
            inputFormat = GLUtils.InputFormat.YUV;
        }
        defaultSurfaceProcessor.mGlRenderer.setInputFormat(inputFormat);
    }

    private void failAllPendingSnapshots(@NonNull Throwable th) {
        Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
        while (it.hasNext()) {
            it.next().getCompleter().setException(th);
        }
        this.mPendingSnapshots.clear();
    }

    /* renamed from: g */
    public static /* synthetic */ void m688g(final DefaultSurfaceProcessor defaultSurfaceProcessor, final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(defaultSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.h
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.m689h(this.f731c, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        defaultSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
        defaultSurfaceProcessor.mOutputSurfaces.put(surfaceOutput, surface);
    }

    @NonNull
    private Bitmap getBitmap(@NonNull Size size, @NonNull float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        MatrixExt.preRotate(fArr2, i10, 0.5f, 0.5f);
        MatrixExt.preVerticalFlip(fArr2, 0.5f);
        return this.mGlRenderer.snapshot(TransformUtils.rotateSize(size, i10), fArr2);
    }

    /* renamed from: h */
    public static /* synthetic */ void m689h(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        defaultSurfaceProcessor.getClass();
        surfaceOutput.close();
        Surface surfaceRemove = defaultSurfaceProcessor.mOutputSurfaces.remove(surfaceOutput);
        if (surfaceRemove != null) {
            defaultSurfaceProcessor.mGlRenderer.unregisterOutputSurface(surfaceRemove);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ Object m690i(final DefaultSurfaceProcessor defaultSurfaceProcessor, final DynamicRange dynamicRange, final Map map, final CallbackToFutureAdapter.Completer completer) {
        defaultSurfaceProcessor.getClass();
        defaultSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.l
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DefaultSurfaceProcessor.m685d(this.f746c, dynamicRange, map, completer);
            }
        });
        return "Init GlRenderer";
    }

    private void initGlRenderer(@NonNull final DynamicRange dynamicRange, @NonNull final Map<GLUtils.InputFormat, ShaderProvider> map) throws ExecutionException, InterruptedException {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.k
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DefaultSurfaceProcessor.m690i(this.f743a, dynamicRange, map, completer);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m691j() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m693l(final DefaultSurfaceProcessor defaultSurfaceProcessor, final SurfaceRequest surfaceRequest) throws ExecutionException, InterruptedException {
        defaultSurfaceProcessor.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(defaultSurfaceProcessor.mGlRenderer.getTextureName());
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.setTransformationInfoListener(defaultSurfaceProcessor.mGlExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.i
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                DefaultSurfaceProcessor.m687f(this.f735a, surfaceRequest, transformationInfo);
            }
        });
        surfaceRequest.provideSurface(surface, defaultSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.j
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DefaultSurfaceProcessor.m683b(this.f739c, surfaceRequest, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor, defaultSurfaceProcessor.mGlHandler);
    }

    /* renamed from: m */
    public static /* synthetic */ void m694m(DefaultSurfaceProcessor defaultSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        if (defaultSurfaceProcessor.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @WorkerThread
    private void takeSnapshotAndDrawJpeg(@Nullable Triple<Surface, Size, float[]> triple) throws IOException {
        if (this.mPendingSnapshots.isEmpty()) {
            return;
        }
        if (triple == null) {
            failAllPendingSnapshots(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<PendingSnapshot> it = this.mPendingSnapshots.iterator();
                int rotationDegrees = -1;
                int jpegQuality = -1;
                Bitmap bitmap = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    PendingSnapshot next = it.next();
                    if (rotationDegrees != next.getRotationDegrees() || bitmap == null) {
                        rotationDegrees = next.getRotationDegrees();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = getBitmap((Size) triple.m20066f(), (float[]) triple.m20067g(), rotationDegrees);
                        jpegQuality = -1;
                    }
                    if (jpegQuality != next.getJpegQuality()) {
                        byteArrayOutputStream.reset();
                        jpegQuality = next.getJpegQuality();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, jpegQuality, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) triple.m20065e();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.writeJpegBytesToSurface(surface, byteArray);
                    next.getCompleter().set(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            failAllPendingSnapshots(e10);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) throws IOException {
        if (this.mIsReleaseRequested.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.mTextureMatrix);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            key.updateTransformMatrix(this.mSurfaceOutputMatrix, this.mTextureMatrix);
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), this.mSurfaceOutputMatrix, value);
                } catch (RuntimeException e10) {
                    Logger.m576e(TAG, "Failed to render with OpenGL.", e10);
                }
            } else {
                Preconditions.checkState(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                Preconditions.checkState(triple == null, "Only one JPEG output is supported.");
                triple = new Triple<>(value, key.getSize(), (float[]) this.mSurfaceOutputMatrix.clone());
            }
        }
        try {
            takeSnapshotAndDrawJpeg(triple);
        } catch (RuntimeException e11) {
            failAllPendingSnapshots(e11);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.b
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                DefaultSurfaceProcessor.m693l(this.f684c, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new RunnableC0720c(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.m
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m688g(this.f750c, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        executeSafely(runnable, new RunnableC0752n(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.e
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSurfaceProcessor.m684c(this.f721c);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m338to = 100) final int i10, @IntRange(from = 0, m338to = 359) final int i11) {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DefaultSurfaceProcessor.m686e(this.f725a, i10, i11, completer);
            }
        }));
    }

    public DefaultSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map) throws ExecutionException, InterruptedException {
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mTextureMatrix = new float[16];
        this.mSurfaceOutputMatrix = new float[16];
        this.mOutputSurfaces = new LinkedHashMap();
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mPendingSnapshots = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new OpenGlRenderer();
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    private void executeSafely(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSurfaceProcessor.m694m(this.f716c, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            Logger.m580w(TAG, "Unable to executor runnable", e10);
            runnable2.run();
        }
    }
}
