package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i10, long j10, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i10) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j10 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j10 - audioTimestamp.framePosition, i10);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j10, int i10) {
        long j11 = i10;
        Preconditions.checkArgument(j11 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j10) / j11;
    }

    public static long frameCountToSize(long j10, int i10) {
        long j11 = i10;
        Preconditions.checkArgument(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 * j11;
    }

    public static int getBytesPerFrame(int i10, int i11) {
        Preconditions.checkArgument(i11 > 0, "Invalid channel count: " + i11);
        if (i10 == 2) {
            return i11 * 2;
        }
        if (i10 == 3) {
            return i11;
        }
        if (i10 != 4) {
            if (i10 == 21) {
                return i11 * 3;
            }
            if (i10 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i10);
            }
        }
        return i11 * 4;
    }

    public static long sizeToFrameCount(long j10, int i10) {
        long j11 = i10;
        Preconditions.checkArgument(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 / j11;
    }
}
