package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.RunnableC0649c;
import androidx.camera.core.processing.RunnableC0681n;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DualSurfaceProcessor";
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final DualOpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;

    @Nullable
    private SurfaceTexture mPrimarySurfaceTexture;

    @Nullable
    private SurfaceTexture mSecondarySurfaceTexture;

    public static class Factory {
        private static Function3<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> sSupplier = new Function3() { // from class: androidx.camera.core.processing.concurrent.j
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new DualSurfaceProcessor((DynamicRange) obj, (LayoutSettings) obj2, (LayoutSettings) obj3);
            }
        };

        private Factory() {
        }

        @NonNull
        public static SurfaceProcessorInternal newInstance(@NonNull DynamicRange dynamicRange, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
            return sSupplier.invoke(dynamicRange, layoutSettings, layoutSettings2);
        }

        @VisibleForTesting
        public static void setSupplier(@NonNull Function3<DynamicRange, LayoutSettings, LayoutSettings, SurfaceProcessorInternal> function3) {
            sSupplier = function3;
        }
    }

    public DualSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
        this(dynamicRange, Collections.EMPTY_MAP, layoutSettings, layoutSettings2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m645a(DualSurfaceProcessor dualSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        if (dualSurfaceProcessor.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m646b() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m647c(DualSurfaceProcessor dualSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        dualSurfaceProcessor.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        dualSurfaceProcessor.mInputSurfaceCount--;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    @WorkerThread
    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m648d(DualSurfaceProcessor dualSurfaceProcessor) {
        dualSurfaceProcessor.mIsReleased = true;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    /* renamed from: e */
    public static /* synthetic */ void m649e(DualSurfaceProcessor dualSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        dualSurfaceProcessor.getClass();
        surfaceOutput.close();
        Surface surfaceRemove = dualSurfaceProcessor.mOutputSurfaces.remove(surfaceOutput);
        if (surfaceRemove != null) {
            dualSurfaceProcessor.mGlRenderer.unregisterOutputSurface(surfaceRemove);
        }
    }

    private void executeSafely(@NonNull Runnable runnable) {
        executeSafely(runnable, new Runnable() { // from class: androidx.camera.core.processing.concurrent.h
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m646b();
            }
        });
    }

    /* renamed from: f */
    public static /* synthetic */ void m650f(final DualSurfaceProcessor dualSurfaceProcessor, final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.f
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.m649e(this.f686a, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        dualSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
        dualSurfaceProcessor.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* renamed from: g */
    public static /* synthetic */ void m651g(final DualSurfaceProcessor dualSurfaceProcessor, SurfaceRequest surfaceRequest) throws ExecutionException, InterruptedException {
        dualSurfaceProcessor.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(dualSurfaceProcessor.mGlRenderer.getTextureName(surfaceRequest.isPrimary()));
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.i
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.m647c(this.f691a, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        if (surfaceRequest.isPrimary()) {
            dualSurfaceProcessor.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            dualSurfaceProcessor.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(dualSurfaceProcessor, dualSurfaceProcessor.mGlHandler);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m652h(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange, Map map, CallbackToFutureAdapter.Completer completer) throws Throwable {
        dualSurfaceProcessor.getClass();
        try {
            dualSurfaceProcessor.mGlRenderer.init(dynamicRange, map);
            completer.set(null);
        } catch (RuntimeException e10) {
            completer.setException(e10);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ Object m653i(final DualSurfaceProcessor dualSurfaceProcessor, final DynamicRange dynamicRange, final Map map, final CallbackToFutureAdapter.Completer completer) {
        dualSurfaceProcessor.getClass();
        dualSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DualSurfaceProcessor.m652h(this.f680a, dynamicRange, map, completer);
            }
        });
        return "Init GlRenderer";
    }

    private void initGlRenderer(@NonNull final DynamicRange dynamicRange, @NonNull final Map<GLUtils.InputFormat, ShaderProvider> map) throws ExecutionException, InterruptedException {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.concurrent.c
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DualSurfaceProcessor.m653i(this.f677a, dynamicRange, map, completer);
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e10) {
                    Logger.m504e(TAG, "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.b
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                DualSurfaceProcessor.m651g(this.f675a, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new RunnableC0649c(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m650f(this.f684a, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        executeSafely(runnable, new RunnableC0681n(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m648d(this.f674a);
            }
        });
    }

    public DualSurfaceProcessor(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) throws ExecutionException, InterruptedException {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new DualOpenGlRenderer(layoutSettings, layoutSettings2);
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    private void executeSafely(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.concurrent.g
                @Override // java.lang.Runnable
                public final void run() {
                    DualSurfaceProcessor.m645a(this.f688a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            Logger.m508w(TAG, "Unable to executor runnable", e10);
            runnable2.run();
        }
    }
}
