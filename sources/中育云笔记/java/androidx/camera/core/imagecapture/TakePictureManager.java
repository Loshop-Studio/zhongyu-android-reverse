package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.RetryControl {
    private static final String TAG = "TakePictureManager";

    @Nullable
    private RequestWithCallback mCapturingRequest;
    final ImageCaptureControl mImageCaptureControl;
    ImagePipeline mImagePipeline;
    private final List<RequestWithCallback> mIncompleteRequests;

    @VisibleForTesting
    final Deque<TakePictureRequest> mNewRequests = new ArrayDeque();
    boolean mPaused = false;

    @AutoValue
    public static abstract class CaptureError {
        /* renamed from: of */
        public static CaptureError m630of(int i10, @NonNull ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i10, imageCaptureException);
        }

        @NonNull
        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    @MainThread
    public TakePictureManager(@NonNull ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.mImageCaptureControl = imageCaptureControl;
        this.mIncompleteRequests = new ArrayList();
    }

    /* renamed from: a */
    public static /* synthetic */ void m628a(TakePictureManager takePictureManager) {
        takePictureManager.mCapturingRequest = null;
        takePictureManager.issueNextRequest();
    }

    @MainThread
    private ListenableFuture<Void> submitCameraRequest(@NonNull final CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.mImageCaptureControl.lockFlashMode();
        ListenableFuture<Void> listenableFutureSubmitStillCaptureRequests = this.mImageCaptureControl.submitStillCaptureRequests(cameraRequest.getCaptureConfigs());
        Futures.addCallback(listenableFutureSubmitStillCaptureRequests, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                if (cameraRequest.isAborted()) {
                    return;
                }
                int id2 = cameraRequest.getCaptureConfigs().get(0).getId();
                if (th instanceof ImageCaptureException) {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.m630of(id2, (ImageCaptureException) th));
                } else {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.m630of(id2, new ImageCaptureException(2, "Failed to submit capture request", th)));
                }
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r12) {
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }
        }, CameraXExecutors.mainThreadExecutor());
        return listenableFutureSubmitStillCaptureRequests;
    }

    private void trackCurrentRequests(@NonNull final RequestWithCallback requestWithCallback) {
        Preconditions.checkState(!hasCapturingRequest());
        this.mCapturingRequest = requestWithCallback;
        requestWithCallback.getCaptureFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.u
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManager.m628a(this.f579c);
            }
        }, CameraXExecutors.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        requestWithCallback.getCompleteFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f580c.mIncompleteRequests.remove(requestWithCallback);
            }
        }, CameraXExecutors.directExecutor());
    }

    @MainThread
    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<TakePictureRequest> it = this.mNewRequests.iterator();
        while (it.hasNext()) {
            it.next().onError(imageCaptureException);
        }
        this.mNewRequests.clear();
        ArrayList arrayList = new ArrayList(this.mIncompleteRequests);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((RequestWithCallback) obj).abortAndSendErrorToApp(imageCaptureException);
        }
    }

    @Nullable
    @VisibleForTesting
    public RequestWithCallback getCapturingRequest() {
        return this.mCapturingRequest;
    }

    @NonNull
    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    @VisibleForTesting
    public List<RequestWithCallback> getIncompleteRequests() {
        return this.mIncompleteRequests;
    }

    @VisibleForTesting
    public boolean hasCapturingRequest() {
        return this.mCapturingRequest != null;
    }

    @MainThread
    public void issueNextRequest() {
        TakePictureRequest takePictureRequestPoll;
        Threads.checkMainThread();
        if (hasCapturingRequest() || this.mPaused || this.mImagePipeline.getCapacity() == 0 || (takePictureRequestPoll = this.mNewRequests.poll()) == null) {
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(takePictureRequestPoll, this);
        trackCurrentRequests(requestWithCallback);
        Pair<CameraRequest, ProcessingRequest> pairCreateRequests = this.mImagePipeline.createRequests(takePictureRequestPoll, requestWithCallback, requestWithCallback.getCaptureFuture());
        CameraRequest cameraRequest = pairCreateRequests.first;
        Objects.requireNonNull(cameraRequest);
        ProcessingRequest processingRequest = pairCreateRequests.second;
        Objects.requireNonNull(processingRequest);
        this.mImagePipeline.submitProcessingRequest(processingRequest);
        requestWithCallback.setCaptureRequestFuture(submitCameraRequest(cameraRequest));
    }

    @MainThread
    public void offerRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.mNewRequests.offer(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@NonNull ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f582c.issueNextRequest();
            }
        });
    }

    @MainThread
    public void pause() {
        Threads.checkMainThread();
        this.mPaused = true;
        RequestWithCallback requestWithCallback = this.mCapturingRequest;
        if (requestWithCallback != null) {
            requestWithCallback.abortSilentlyAndRetry();
        }
    }

    @MainThread
    public void resume() {
        Threads.checkMainThread();
        this.mPaused = false;
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    @MainThread
    public void retryRequest(@NonNull TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.m573d(TAG, "Add a new request for retrying.");
        this.mNewRequests.addFirst(takePictureRequest);
        issueNextRequest();
    }

    @MainThread
    public void setImagePipeline(@NonNull ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.mImagePipeline = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
