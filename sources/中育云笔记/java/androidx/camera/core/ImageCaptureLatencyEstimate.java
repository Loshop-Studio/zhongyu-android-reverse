package androidx.camera.core;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;

    @NonNull
    public static final ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long mCaptureLatencyMillis;
    private final long mProcessingLatencyMillis;
    private final long mTotalCaptureLatencyMillis;

    public ImageCaptureLatencyEstimate(long j10, long j11) {
        this.mCaptureLatencyMillis = j10;
        this.mProcessingLatencyMillis = j11;
        this.mTotalCaptureLatencyMillis = computeTotalCaptureLatencyMillis(j10, j11);
    }

    private long computeTotalCaptureLatencyMillis(long j10, long j11) {
        if (j10 == -1 || j11 == -1) {
            return -1L;
        }
        return j10 + j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureLatencyEstimate)) {
            return false;
        }
        ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (ImageCaptureLatencyEstimate) obj;
        return this.mCaptureLatencyMillis == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.mProcessingLatencyMillis == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.mTotalCaptureLatencyMillis == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    public long getCaptureLatencyMillis() {
        return this.mCaptureLatencyMillis;
    }

    public long getProcessingLatencyMillis() {
        return this.mProcessingLatencyMillis;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.mTotalCaptureLatencyMillis;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mCaptureLatencyMillis), Long.valueOf(this.mProcessingLatencyMillis), Long.valueOf(this.mTotalCaptureLatencyMillis));
    }

    @NonNull
    public String toString() {
        return "captureLatencyMillis=" + this.mCaptureLatencyMillis + ", processingLatencyMillis=" + this.mProcessingLatencyMillis + ", totalCaptureLatencyMillis=" + this.mTotalCaptureLatencyMillis;
    }
}
