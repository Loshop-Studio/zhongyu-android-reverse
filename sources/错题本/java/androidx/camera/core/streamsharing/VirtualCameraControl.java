package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(@NonNull CameraControlInternal cameraControlInternal, @NonNull StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceFutureC5453a lambda$submitStillCaptureRequests$0(InterfaceFutureC5453a interfaceFutureC5453a, CameraCapturePipeline cameraCapturePipeline) throws Exception {
        return ((CameraCapturePipeline) interfaceFutureC5453a.get()).invokePreCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceFutureC5453a lambda$submitStillCaptureRequests$1(List list, Void r42) throws Exception {
        return this.mStreamSharingControl.jpegSnapshot(getJpegQuality((CaptureConfig) list.get(0)), getRotationDegrees((CaptureConfig) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceFutureC5453a lambda$submitStillCaptureRequests$2(InterfaceFutureC5453a interfaceFutureC5453a, Void r1) throws Exception {
        return ((CameraCapturePipeline) interfaceFutureC5453a.get()).invokePostCapture();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public InterfaceFutureC5453a submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, int i, int i8) {
        Preconditions.checkArgument(list.size() == 1, "Only support one capture config.");
        final InterfaceFutureC5453a cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i, i8);
        final int i9 = 0;
        final int i10 = 1;
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final InterfaceFutureC5453a apply(Object obj) {
                switch (i9) {
                    case 0:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$0(cameraCapturePipelineAsync, (CameraCapturePipeline) obj);
                    default:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$2(cameraCapturePipelineAsync, (Void) obj);
                }
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.d
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final InterfaceFutureC5453a apply(Object obj) {
                return this.f566a.lambda$submitStillCaptureRequests$1(list, (Void) obj);
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.c
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final InterfaceFutureC5453a apply(Object obj) {
                switch (i10) {
                    case 0:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$0(cameraCapturePipelineAsync, (CameraCapturePipeline) obj);
                    default:
                        return VirtualCameraControl.lambda$submitStillCaptureRequests$2(cameraCapturePipelineAsync, (Void) obj);
                }
            }
        }, CameraXExecutors.directExecutor())));
    }
}
