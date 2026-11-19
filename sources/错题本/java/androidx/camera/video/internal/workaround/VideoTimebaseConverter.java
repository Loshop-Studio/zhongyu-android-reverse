package androidx.camera.video.internal.workaround;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.encoder.TimeProvider;

/* loaded from: classes.dex */
public class VideoTimebaseConverter {
    private static final String TAG = "VideoTimebaseConverter";
    private static final long UPTIME_REALTIME_DIFF_THRESHOLD_US = 3000000;
    private final CameraUseInconsistentTimebaseQuirk mCameraUseInconsistentTimebaseQuirk;
    private final Timebase mInputTimebase;

    @Nullable
    private Timebase mResolvedInputTimebase;
    private final TimeProvider mTimeProvider;
    private long mUptimeToRealtimeOffsetUs = -1;

    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1 */
    public static /* synthetic */ class C05121 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$Timebase;

        static {
            int[] iArr = new int[Timebase.values().length];
            $SwitchMap$androidx$camera$core$impl$Timebase = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$Timebase[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoTimebaseConverter(@NonNull TimeProvider timeProvider, @NonNull Timebase timebase, @Nullable CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.mTimeProvider = timeProvider;
        this.mInputTimebase = timebase;
        this.mCameraUseInconsistentTimebaseQuirk = cameraUseInconsistentTimebaseQuirk;
    }

    private long calculateUptimeToRealtimeOffsetUs() {
        long j7 = Long.MAX_VALUE;
        long j8 = 0;
        for (int i = 0; i < 3; i++) {
            long jUptimeUs = this.mTimeProvider.uptimeUs();
            long jRealtimeUs = this.mTimeProvider.realtimeUs();
            long jUptimeUs2 = this.mTimeProvider.uptimeUs();
            long j9 = jUptimeUs2 - jUptimeUs;
            if (i == 0 || j9 < j7) {
                j8 = jRealtimeUs - ((jUptimeUs + jUptimeUs2) >> 1);
                j7 = j9;
            }
        }
        return Math.max(0L, j8);
    }

    private boolean exceedUptimeRealtimeDiffThreshold() {
        return this.mTimeProvider.realtimeUs() - this.mTimeProvider.uptimeUs() > UPTIME_REALTIME_DIFF_THRESHOLD_US;
    }

    private boolean isCloseToRealtime(long j7) {
        return Math.abs(j7 - this.mTimeProvider.realtimeUs()) < Math.abs(j7 - this.mTimeProvider.uptimeUs());
    }

    @NonNull
    private Timebase resolveInputTimebase(long j7) {
        boolean z8;
        String str;
        if (this.mCameraUseInconsistentTimebaseQuirk != null) {
            Logger.m591w(TAG, "CameraUseInconsistentTimebaseQuirk is enabled");
            z8 = false;
        } else {
            if (!exceedUptimeRealtimeDiffThreshold()) {
                return this.mInputTimebase;
            }
            z8 = true;
        }
        Timebase timebase = isCloseToRealtime(j7) ? Timebase.REALTIME : Timebase.UPTIME;
        if (!z8 || timebase == this.mInputTimebase) {
            Logger.m585d(TAG, "Detect input timebase = " + timebase);
            return timebase;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = "";
        }
        Logger.m587e(TAG, String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), str, this.mInputTimebase, timebase));
        return timebase;
    }

    public long convertToUptimeUs(long j7) {
        if (this.mResolvedInputTimebase == null) {
            this.mResolvedInputTimebase = resolveInputTimebase(j7);
        }
        int i = C05121.$SwitchMap$androidx$camera$core$impl$Timebase[this.mResolvedInputTimebase.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j7;
            }
            throw new AssertionError("Unknown timebase: " + this.mResolvedInputTimebase);
        }
        if (this.mUptimeToRealtimeOffsetUs == -1) {
            this.mUptimeToRealtimeOffsetUs = calculateUptimeToRealtimeOffsetUs();
            Logger.m585d(TAG, "mUptimeToRealtimeOffsetUs = " + this.mUptimeToRealtimeOffsetUs);
        }
        return j7 - this.mUptimeToRealtimeOffsetUs;
    }
}
