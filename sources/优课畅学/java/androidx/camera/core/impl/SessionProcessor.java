package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface SessionProcessor {

    public interface CaptureCallback {
        default void onCaptureCompleted(long j10, int i10, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(int i10) {
        }

        default void onCaptureProcessProgressed(int i10) {
        }

        default void onCaptureProcessStarted(int i10) {
        }

        default void onCaptureSequenceAborted(int i10) {
        }

        default void onCaptureSequenceCompleted(int i10) {
        }

        default void onCaptureStarted(int i10, long j10) {
        }
    }

    void abortCapture(int i10);

    void deInitSession();

    @Nullable
    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    @NonNull
    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    default Map<Integer, List<Size>> getSupportedPostviewSize(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    @NonNull
    SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(boolean z10, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback);

    default int startTrigger(@NonNull Config config, @NonNull TagBundle tagBundle, @NonNull CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();
}
