package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class SurfaceProcessorNode implements Node<AbstractC0715In, Out> {
    private static final String TAG = "SurfaceProcessorNode";

    @NonNull
    final CameraInternal mCameraInternal;

    @Nullable
    private AbstractC0715In mInput;

    @Nullable
    private Out mOutput;

    @NonNull
    final SurfaceProcessorInternal mSurfaceProcessor;

    @AutoValue
    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    public static abstract class AbstractC0715In {
        @NonNull
        /* renamed from: of */
        public static AbstractC0715In m713of(@NonNull SurfaceEdge surfaceEdge, @NonNull List<OutConfig> list) {
            return new AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }

        @NonNull
        public abstract List<OutConfig> getOutConfigs();

        @NonNull
        public abstract SurfaceEdge getSurfaceEdge();
    }

    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    public SurfaceProcessorNode(@NonNull CameraInternal cameraInternal, @NonNull SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mCameraInternal = cameraInternal;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    /* renamed from: b */
    public static /* synthetic */ void m711b(Map map, SurfaceRequest.TransformationInfo transformationInfo) {
        for (Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((OutConfig) entry.getKey()).getRotationDegrees();
            if (((OutConfig) entry.getKey()).isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((SurfaceEdge) entry.getValue()).updateTransformation(TransformUtils.within360(rotationDegrees), -1);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m712c(SurfaceProcessorNode surfaceProcessorNode) {
        Out out = surfaceProcessorNode.mOutput;
        if (out != null) {
            Iterator<SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndSendSurfaceOutput(@NonNull SurfaceEdge surfaceEdge, Map.Entry<OutConfig, SurfaceEdge> entry) {
        final SurfaceEdge value = entry.getValue();
        Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getFormat(), SurfaceOutput.CameraInputInfo.m589of(surfaceEdge.getStreamSpec().getResolution(), entry.getKey().getCropRect(), surfaceEdge.hasCameraTransform() ? this.mCameraInternal : null, entry.getKey().getRotationDegrees(), entry.getKey().isMirroring()), null), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                if (value.getTargets() == 2 && (th instanceof CancellationException)) {
                    Logger.m573d(SurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.m580w(SurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(value.getTargets()), th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable SurfaceOutput surfaceOutput) {
                Preconditions.checkNotNull(surfaceOutput);
                try {
                    SurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (ProcessingException e10) {
                    Logger.m576e(SurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e10);
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private void sendSurfaceOutputs(@NonNull final SurfaceEdge surfaceEdge, @NonNull Map<OutConfig, SurfaceEdge> map) {
        for (final Map.Entry<OutConfig, SurfaceEdge> entry : map.entrySet()) {
            createAndSendSurfaceOutput(surfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.processing.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f722c.createAndSendSurfaceOutput(surfaceEdge, entry);
                }
            });
        }
    }

    private void sendSurfaceRequest(@NonNull SurfaceEdge surfaceEdge) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(this.mCameraInternal));
        } catch (ProcessingException e10) {
            Logger.m576e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e10);
        }
    }

    @NonNull
    private SurfaceEdge transformSingleOutput(@NonNull SurfaceEdge surfaceEdge, @NonNull OutConfig outConfig) {
        Rect rectSizeToRect;
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean zIsMirroring = outConfig.isMirroring();
        Matrix matrix = new Matrix(surfaceEdge.getSensorToBufferTransform());
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(cropRect), TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, zIsMirroring);
        matrix.postConcat(rectToRect);
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        if (outConfig.shouldRespectInputCropRect()) {
            Preconditions.checkArgument(outConfig.getCropRect().contains(surfaceEdge.getCropRect()), String.format("Output crop rect %s must contain input crop rect %s", outConfig.getCropRect(), surfaceEdge.getCropRect()));
            rectSizeToRect = new Rect();
            RectF rectF = new RectF(surfaceEdge.getCropRect());
            rectToRect.mapRect(rectF);
            rectF.round(rectSizeToRect);
        } else {
            rectSizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        }
        Rect rect = rectSizeToRect;
        return new SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build(), matrix, false, rect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != zIsMirroring);
    }

    @NonNull
    public SurfaceProcessorInternal getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.g0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNode.m712c(this.f730c);
            }
        });
    }

    public void setUpRotationUpdates(@NonNull SurfaceEdge surfaceEdge, @NonNull final Map<OutConfig, SurfaceEdge> map) {
        surfaceEdge.addTransformationUpdateListener(new Consumer() { // from class: androidx.camera.core.processing.f0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                SurfaceProcessorNode.m711b(map, (SurfaceRequest.TransformationInfo) obj);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    @MainThread
    public Out transform(@NonNull AbstractC0715In abstractC0715In) {
        Threads.checkMainThread();
        this.mInput = abstractC0715In;
        this.mOutput = new Out();
        SurfaceEdge surfaceEdge = abstractC0715In.getSurfaceEdge();
        for (OutConfig outConfig : abstractC0715In.getOutConfigs()) {
            this.mOutput.put(outConfig, transformSingleOutput(surfaceEdge, outConfig));
        }
        sendSurfaceRequest(surfaceEdge);
        sendSurfaceOutputs(surfaceEdge, this.mOutput);
        setUpRotationUpdates(surfaceEdge, this.mOutput);
        return this.mOutput;
    }
}
