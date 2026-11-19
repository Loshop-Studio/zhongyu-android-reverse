package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i9) {
        return i9 == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i9) {
        return i9 == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i9, long j9, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i9) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j9 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j9 - audioTimestamp.framePosition, i9);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j9, int i9) {
        long j10 = i9;
        Preconditions.checkArgument(j10 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j9) / j10;
    }

    public static long frameCountToSize(long j9, int i9) {
        long j10 = i9;
        Preconditions.checkArgument(j10 > 0, "bytesPerFrame must be greater than 0.");
        return j9 * j10;
    }

    public static int getBytesPerFrame(int i9, int i10) {
        Preconditions.checkArgument(i10 > 0, "Invalid channel count: " + i10);
        if (i9 == 2) {
            return i10 * 2;
        }
        if (i9 == 3) {
            return i10;
        }
        if (i9 != 4) {
            if (i9 == 21) {
                return i10 * 3;
            }
            if (i9 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i9);
            }
        }
        return i10 * 4;
    }

    public static long sizeToFrameCount(long j9, int i9) {
        long j10 = i9;
        Preconditions.checkArgument(j10 > 0, "bytesPerFrame must be greater than 0.");
        return j9 / j10;
    }
}
