package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor;
import androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    CaptureOutputSurfaceForCaptureProcessor mCaptureOutputSurface;

    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;

    @NonNull
    final CaptureResultImageMatcher mCaptureResultImageMatcher = new CaptureResultImageMatcher();
    final Object mLock = new Object();

    @NonNull
    @GuardedBy("mLock")
    HashMap<Integer, Pair<ImageReference, TotalCaptureResult>> mCaptureResults = new HashMap<>();

    @GuardedBy("mLock")
    OnCaptureResultCallback mOnCaptureResultCallback = null;

    @GuardedBy("mLock")
    TotalCaptureResult mSourceCaptureResult = null;

    @GuardedBy("mLock")
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j10, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i10);

        void onError(@NonNull Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, @Nullable OutputSurface outputSurface, boolean z10) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor = new CaptureOutputSurfaceForCaptureProcessor(surface, size, z10);
        this.mCaptureOutputSurface = captureOutputSurfaceForCaptureProcessor;
        captureProcessorImpl.onOutputSurface(captureOutputSurfaceForCaptureProcessor.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = outputSurface != null;
        if (outputSurface != null) {
            Version version = Version.VERSION_1_4;
            if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
                Preconditions.checkArgument(outputSurface.getImageFormat() == 35);
                captureProcessorImpl.onResolutionUpdate(size, outputSurface.getSize());
                captureProcessorImpl.onPostviewOutputSurface(outputSurface.getSurface());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* renamed from: a */
    public static /* synthetic */ void m659a(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, boolean z10, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (stillCaptureProcessor.mLock) {
            try {
                if (stillCaptureProcessor.mIsClosed) {
                    imageReference.decrement();
                    Logger.m479d(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.m479d(TAG, "onImageReferenceIncoming  captureStageId=" + i10);
                stillCaptureProcessor.mCaptureResults.put(Integer.valueOf(i10), new Pair<>(imageReference, totalCaptureResult));
                Logger.m479d(TAG, "mCaptureResult has capture stage Id: " + stillCaptureProcessor.mCaptureResults.keySet());
                if (stillCaptureProcessor.mCaptureResults.keySet().containsAll(list)) {
                    stillCaptureProcessor.process(stillCaptureProcessor.mCaptureResults, onCaptureResultCallback, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z10, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e10) {
                        Logger.m482e(TAG, "mCaptureProcessorImpl.process exception ", e10);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e10);
                        }
                        Logger.m479d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                    if (this.mIsClosed) {
                        Logger.m479d(TAG, "Ignore process() in closed state.");
                        Logger.m479d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    Logger.m479d(TAG, "CaptureProcessorImpl.process() begin");
                    Version version = Version.VERSION_1_4;
                    if (ExtensionVersion.isMinimumCompatibleVersion(version) && ClientVersion.isMinimumCompatibleVersion(version) && z10 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j10, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j10, list);
                            }

                            public void onCaptureProcessProgressed(int i10) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i10);
                            }
                        }, CameraXExecutors.directExecutor());
                    } else {
                        Version version2 = Version.VERSION_1_3;
                        if (ExtensionVersion.isMinimumCompatibleVersion(version2) && ClientVersion.isMinimumCompatibleVersion(version2)) {
                            this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j10, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j10, list);
                                }

                                public void onCaptureProcessProgressed(int i10) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i10);
                                }
                            }, CameraXExecutors.directExecutor());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    }
                    Logger.m479d(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                Logger.m479d(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th2;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<ImageReference, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((ImageReference) it.next().first).decrement();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            Logger.m479d(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureOutputSurface.close();
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i10) {
        Long l10;
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult, i10);
        if (this.mTimeStampForOutputImage == -1 && (l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l10.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            this.mCaptureOutputSurface.setOutputImageTimestamp(jLongValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void process(@NonNull Map<Integer, Pair<ImageReference, TotalCaptureResult>> map, @NonNull final OnCaptureResultCallback onCaptureResultCallback, final boolean z10) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<ImageReference, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((ImageReference) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        CameraXExecutors.ioExecutor().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f862a.lambda$process$1(z10, map2, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z10, @NonNull final List<Integer> list, @NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        Logger.m479d(TAG, "Start the capture: enablePostview=" + z10);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.clear();
        this.mCaptureResultImageMatcher.setImageReferenceListener(new CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.g
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i10) {
                StillCaptureProcessor.m659a(this.f866a, list, onCaptureResultCallback, z10, imageReference, totalCaptureResult, i10);
            }
        });
    }
}
