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
import androidx.camera.core.imagecapture.CaptureNode;
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
class CaptureNode implements Node<AbstractC0519In, ProcessingNode.AbstractC0522In> {

    @VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";

    @Nullable
    private AbstractC0519In mInputEdge;

    @Nullable
    private ProcessingNode.AbstractC0522In mOutputEdge;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;

    @Nullable
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1 */
    public class C05171 extends CameraCaptureCallback {
        public C05171() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m537a(C05171 c05171) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m538b(C05171 c05171, int i9) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i9);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i9, final int i10) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.h
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.C05171.m538b(this.f543a, i10);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i9) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.i
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.C05171.m537a(this.f545a);
                }
            });
        }
    }

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$In */
    public static abstract class AbstractC0519In {

        @NonNull
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };

        @Nullable
        private DeferrableSurface mPostviewSurface = null;

        @Nullable
        private DeferrableSurface mSurface;

        @NonNull
        /* renamed from: of */
        public static AbstractC0519In m539of(Size size, int i9, int i10, boolean z9, @Nullable ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i9, i10, z9, imageReaderProxyProvider, null, 35, new Edge(), new Edge());
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

        public void setPostviewSurface(@NonNull Surface surface, @NonNull Size size, int i9) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i9);
        }

        public void setSurface(@NonNull Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        @NonNull
        /* renamed from: of */
        public static AbstractC0519In m540of(Size size, int i9, int i10, boolean z9, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i11) {
            return new AutoValue_CaptureNode_In(size, i9, i10, z9, imageReaderProxyProvider, size2, i11, new Edge(), new Edge());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m532a(CaptureNode captureNode, ProcessingRequest processingRequest) {
        captureNode.onRequestAvailable(processingRequest);
        captureNode.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* renamed from: b */
    public static /* synthetic */ void m533b(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                captureNode.propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e10) {
            Logger.m504e(TAG, "Failed to acquire latest image of postview", e10);
        }
    }

    @NonNull
    private static ImageReaderProxy createImageReaderProxy(@Nullable ImageReaderProxyProvider imageReaderProxyProvider, int i9, int i10, int i11) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i9, i10, i11, 4, 0L) : ImageReaderProxys.createIsolatedReader(i9, i10, i11, 4);
    }

    /* renamed from: d */
    public static /* synthetic */ void m535d(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                captureNode.onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = captureNode.mCurrentRequest;
            if (processingRequest != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.m558of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            ProcessingRequest processingRequest2 = captureNode.mCurrentRequest;
            if (processingRequest2 != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.m558of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m536e(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    @MainThread
    private void matchAndPropagateImage(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        ProcessingNode.AbstractC0522In abstractC0522In = this.mOutputEdge;
        Objects.requireNonNull(abstractC0522In);
        abstractC0522In.getEdge().accept(ProcessingNode.InputPacket.m553of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(@NonNull ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.m507w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.AbstractC0522In abstractC0522In = this.mOutputEdge;
            Objects.requireNonNull(abstractC0522In);
            abstractC0522In.getPostviewEdge().accept(ProcessingNode.InputPacket.m553of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(@NonNull AbstractC0519In abstractC0519In, @NonNull final SafeCloseImageReaderProxy safeCloseImageReaderProxy, @Nullable final SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        abstractC0519In.getSurface().close();
        abstractC0519In.getSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.f
            @Override // java.lang.Runnable
            public final void run() {
                safeCloseImageReaderProxy.safeClose();
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (abstractC0519In.getPostviewSurface() != null) {
            abstractC0519In.getPostviewSurface().close();
            abstractC0519In.getPostviewSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.g
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.m536e(safeCloseImageReaderProxy2);
                }
            }, CameraXExecutors.mainThreadExecutor());
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
    public AbstractC0519In getInputEdge() {
        AbstractC0519In abstractC0519In = this.mInputEdge;
        Objects.requireNonNull(abstractC0519In);
        return abstractC0519In;
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
            Logger.m507w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            Logger.m507w(TAG, "Discarding ImageProxy which was acquired for aborted request");
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
                    Logger.m507w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r12) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public void release() {
        Threads.checkMainThread();
        AbstractC0519In abstractC0519In = this.mInputEdge;
        Objects.requireNonNull(abstractC0519In);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(abstractC0519In, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
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
    public ProcessingNode.AbstractC0522In transform(@NonNull AbstractC0519In abstractC0519In) {
        Consumer<ProcessingRequest> consumer;
        NoMetadataImageReader noMetadataImageReader;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = abstractC0519In;
        Size size = abstractC0519In.getSize();
        int inputFormat = abstractC0519In.getInputFormat();
        boolean zIsVirtualCamera = abstractC0519In.isVirtualCamera();
        CameraCaptureCallback c05171 = new C05171();
        if (zIsVirtualCamera || abstractC0519In.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(createImageReaderProxy(abstractC0519In.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader2;
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    CaptureNode.m532a(this.f535a, (ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            c05171 = CameraCaptureCallbacks.createComboCallback(c05171, metadataImageReader.getCameraCaptureCallback());
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.a
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f532a.onRequestAvailable((ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = metadataImageReader;
        }
        abstractC0519In.setCameraCaptureCallback(c05171);
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        abstractC0519In.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                CaptureNode.m535d(this.f538a, imageReaderProxy);
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (abstractC0519In.getPostviewSize() != null) {
            ImageReaderProxy imageReaderProxyCreateImageReaderProxy = createImageReaderProxy(abstractC0519In.getImageReaderProxyProvider(), abstractC0519In.getPostviewSize().getWidth(), abstractC0519In.getPostviewSize().getHeight(), abstractC0519In.getPostviewImageFormat());
            imageReaderProxyCreateImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.d
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    CaptureNode.m533b(this.f539a, imageReaderProxy);
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(imageReaderProxyCreateImageReaderProxy);
            abstractC0519In.setPostviewSurface(imageReaderProxyCreateImageReaderProxy.getSurface(), abstractC0519In.getPostviewSize(), abstractC0519In.getPostviewImageFormat());
        }
        abstractC0519In.getRequestEdge().setListener(consumer);
        abstractC0519In.getErrorEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f540a.sendCaptureError((TakePictureManager.CaptureError) obj);
            }
        });
        ProcessingNode.AbstractC0522In abstractC0522InM552of = ProcessingNode.AbstractC0522In.m552of(abstractC0519In.getInputFormat(), abstractC0519In.getOutputFormat());
        this.mOutputEdge = abstractC0522InM552of;
        return abstractC0522InM552of;
    }
}
