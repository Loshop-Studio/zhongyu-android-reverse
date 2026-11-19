package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class RecordingStats {
    @NonNull
    /* renamed from: of */
    public static RecordingStats m705of(long j9, long j10, @NonNull AudioStats audioStats) {
        Preconditions.checkArgument(j9 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j10 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j9, j10, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
