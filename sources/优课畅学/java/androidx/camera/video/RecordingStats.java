package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class RecordingStats {
    @NonNull
    /* renamed from: of */
    public static RecordingStats m700of(long j10, long j11, @NonNull AudioStats audioStats) {
        Preconditions.checkArgument(j10 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j11 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j10, j11, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
