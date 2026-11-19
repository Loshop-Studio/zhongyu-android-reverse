package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {

    @VisibleForTesting
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void ensureMinDurationAfterOnEnableSession() throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j11 = jElapsedRealtime - j10;
            if (j11 >= MIN_DURATION_FOR_ENABLE_DISABLE_SESSION) {
                return;
            }
            long j12 = MIN_DURATION_FOR_ENABLE_DISABLE_SESSION - j11;
            try {
                Logger.m479d(TAG, "onDisableSession too soon, wait " + j12 + " ms");
                Thread.sleep(j12);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j10 = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.m481e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() throws InterruptedException {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }

    @VisibleForTesting
    public OnEnableDisableSessionDurationCheck(boolean z10) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z10;
    }
}
