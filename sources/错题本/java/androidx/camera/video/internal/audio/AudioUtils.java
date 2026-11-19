package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i, long j7, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j7 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j7 - audioTimestamp.framePosition, i);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j7, int i) {
        long j8 = i;
        Preconditions.checkArgument(j8 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j7) / j8;
    }

    public static long frameCountToSize(long j7, int i) {
        long j8 = i;
        Preconditions.checkArgument(j8 > 0, "bytesPerFrame must be greater than 0.");
        return j7 * j8;
    }

    public static int getBytesPerFrame(int i, int i8) {
        Preconditions.checkArgument(i8 > 0, "Invalid channel count: " + i8);
        if (i == 2) {
            return i8 * 2;
        }
        if (i == 3) {
            return i8;
        }
        if (i != 4) {
            if (i == 21) {
                return i8 * 3;
            }
            if (i != 22) {
                throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Invalid audio encoding: "));
            }
        }
        return i8 * 4;
    }

    public static long sizeToFrameCount(long j7, int i) {
        long j8 = i;
        Preconditions.checkArgument(j8 > 0, "bytesPerFrame must be greater than 0.");
        return j7 / j8;
    }
}
