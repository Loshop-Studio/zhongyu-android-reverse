package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.Objects;

/* loaded from: classes.dex */
class CaptureNode implements Node<AbstractC0332In, ProcessingNode.AbstractC0335In> {

    @VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";

    @Nullable
    private AbstractC0332In mInputEdge;

    @Nullable
    private ProcessingNode.AbstractC0335In mOutputEdge;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;

    @Nullable
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1 */
    public class C03301 extends CameraCaptureCallback {
        public C03301() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProcessProgressed$1(int i) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0() {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i, int i8) {
            CameraXExecutors.mainThreadExecutor().execute(new RunnableC0342d(this, i8, 0));
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i) {
            CameraXExecutors.mainThreadExecutor().execute(new RunnableC0341c(this, 2));
        }
    }

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$In */
    public static abstract class AbstractC0332In {

        @NonNull
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };

        @Nullable
        private DeferrableSurface mPostviewSurface = null;

        @Nullable
        private DeferrableSurface mSurface;

        @NonNull
        /* renamed from: of */
        public static AbstractC0332In m622of(Size size, int i, int i8, boolean z8, @Nullable ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i, i8, z8, imageReaderProxyProvider, null, 35, new Edge(), new Edge());
        }

        @NonNull
        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        @NonNull
        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        @Nullable
        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract int getPostviewImageFormat();

        @Nullable
        public abstract Size getPostviewSize();

        @Nullable
        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        @NonNull
        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        @NonNull
        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(@NonNull Surface surface, @NonNull Size size, int i) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i);
        }

        public void setSurface(@NonNull Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        @NonNull
        /* renamed from: of */
        public static AbstractC0332In m623of(Size size, int i, int i8, boolean z8, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i9) {
            return new AutoValue_CaptureNode_In(size, i, i8, z8, imageReaderProxyProvider, size2, i9, new Edge(), new Edge());
        }
    }

    @NonNull
    private static ImageReaderProxy createImageReaderProxy(@Nullable ImageReaderProxyProvider imageReaderProxyProvider, int i, int i8, int i9) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i, i8, i9, 4, 0L) : ImageReaderProxys.createIsolatedReader(i, i8, i9, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$4(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        this.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = this.mCurrentRequest;
            if (processingRequest != null) {
                sendCaptureError(TakePictureManager.CaptureError.m641of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            ProcessingRequest processingRequest2 = this.mCurrentRequest;
            if (processingRequest2 != null) {
                sendCaptureError(TakePictureManager.CaptureError.m641of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$2(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e) {
            Logger.m588e(TAG, "Failed to acquire latest image of postview", e);
        }
    }

    @MainThread
    private void matchAndPropagateImage(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        ProcessingNode.AbstractC0335In abstractC0335In = this.mOutputEdge;
        Objects.requireNonNull(abstractC0335In);
        abstractC0335In.getEdge().accept(ProcessingNode.InputPacket.m636of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(@NonNull ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.m591w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.AbstractC0335In abstractC0335In = this.mOutputEdge;
            Objects.requireNonNull(abstractC0335In);
            abstractC0335In.getPostviewEdge().accept(ProcessingNode.InputPacket.m636of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(@NonNull AbstractC0332In abstractC0332In, @NonNull SafeCloseImageReaderProxy safeCloseImageReaderProxy, @Nullable SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        abstractC0332In.getSurface().close();
        abstractC0332In.getSurface().getTerminationFuture().addListener(new RunnableC0341c(safeCloseImageReaderProxy, 0), CameraXExecutors.mainThreadExecutor());
        if (abstractC0332In.getPostviewSurface() != null) {
            abstractC0332In.getPostviewSurface().close();
            abstractC0332In.getPostviewSurface().getTerminationFuture().addListener(new RunnableC0341c(safeCloseImageReaderProxy2, 1), CameraXExecutors.mainThreadExecutor());
        }
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    @NonNull
    @VisibleForTesting
    public AbstractC0332In getInputEdge() {
        AbstractC0332In abstractC0332In = this.mInputEdge;
        Objects.requireNonNull(abstractC0332In);
        return abstractC0332In;
    }

    @NonNull
    @VisibleForTesting
    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    @MainThread
    @VisibleForTesting
    public void onImageProxyAvailable(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.m591w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            Logger.m591w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        }
    }

    @MainThread
    @VisibleForTesting
    public void onRequestAvailable(@NonNull final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        Preconditions.checkState(processingRequest.getStageIds().size() == 1, "only one capture stage is supported.");
        Preconditions.checkState(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.m591w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r1) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public void release() {
        Threads.checkMainThread();
        AbstractC0332In abstractC0332In = this.mInputEdge;
        Objects.requireNonNull(abstractC0332In);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(abstractC0332In, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    @MainThread
    public void sendCaptureError(@NonNull TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    @MainThread
    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    @NonNull
    public ProcessingNode.AbstractC0335In transform(@NonNull AbstractC0332In abstractC0332In) {
        Consumer<ProcessingRequest> consumer;
        NoMetadataImageReader noMetadataImageReader;
        final int i = 0;
        final int i8 = 1;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = abstractC0332In;
        Size size = abstractC0332In.getSize();
        int inputFormat = abstractC0332In.getInputFormat();
        boolean zIsVirtualCamera = abstractC0332In.isVirtualCamera();
        CameraCaptureCallback c03301 = new C03301();
        final int i9 = 2;
        if (zIsVirtualCamera || abstractC0332In.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(createImageReaderProxy(abstractC0332In.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader2;
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

                /* renamed from: b */
                public final /* synthetic */ CaptureNode f418b;

                {
                    this.f418b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i8) {
                        case 0:
                            this.f418b.onRequestAvailable((ProcessingRequest) obj);
                            break;
                        case 1:
                            this.f418b.lambda$transform$0((ProcessingRequest) obj);
                            break;
                        default:
                            this.f418b.sendCaptureError((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            c03301 = CameraCaptureCallbacks.createComboCallback(c03301, metadataImageReader.getCameraCaptureCallback());
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

                /* renamed from: b */
                public final /* synthetic */ CaptureNode f418b;

                {
                    this.f418b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i) {
                        case 0:
                            this.f418b.onRequestAvailable((ProcessingRequest) obj);
                            break;
                        case 1:
                            this.f418b.lambda$transform$0((ProcessingRequest) obj);
                            break;
                        default:
                            this.f418b.sendCaptureError((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            noMetadataImageReader = metadataImageReader;
        }
        abstractC0332In.setCameraCaptureCallback(c03301);
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        abstractC0332In.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.b

            /* renamed from: b */
            public final /* synthetic */ CaptureNode f420b;

            {
                this.f420b = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                switch (i) {
                    case 0:
                        this.f420b.lambda$transform$1(imageReaderProxy);
                        break;
                    default:
                        this.f420b.lambda$transform$2(imageReaderProxy);
                        break;
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (abstractC0332In.getPostviewSize() != null) {
            ImageReaderProxy imageReaderProxyCreateImageReaderProxy = createImageReaderProxy(abstractC0332In.getImageReaderProxyProvider(), abstractC0332In.getPostviewSize().getWidth(), abstractC0332In.getPostviewSize().getHeight(), abstractC0332In.getPostviewImageFormat());
            imageReaderProxyCreateImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.b

                /* renamed from: b */
                public final /* synthetic */ CaptureNode f420b;

                {
                    this.f420b = this;
                }

                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    switch (i8) {
                        case 0:
                            this.f420b.lambda$transform$1(imageReaderProxy);
                            break;
                        default:
                            this.f420b.lambda$transform$2(imageReaderProxy);
                            break;
                    }
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(imageReaderProxyCreateImageReaderProxy);
            abstractC0332In.setPostviewSurface(imageReaderProxyCreateImageReaderProxy.getSurface(), abstractC0332In.getPostviewSize(), abstractC0332In.getPostviewImageFormat());
        }
        abstractC0332In.getRequestEdge().setListener(consumer);
        abstractC0332In.getErrorEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

            /* renamed from: b */
            public final /* synthetic */ CaptureNode f418b;

            {
                this.f418b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.f418b.onRequestAvailable((ProcessingRequest) obj);
                        break;
                    case 1:
                        this.f418b.lambda$transform$0((ProcessingRequest) obj);
                        break;
                    default:
                        this.f418b.sendCaptureError((TakePictureManager.CaptureError) obj);
                        break;
                }
            }
        });
        ProcessingNode.AbstractC0335In abstractC0335InM635of = ProcessingNode.AbstractC0335In.m635of(abstractC0332In.getInputFormat(), abstractC0332In.getOutputFormat());
        this.mOutputEdge = abstractC0335InM635of;
        return abstractC0335InM635of;
    }
}
