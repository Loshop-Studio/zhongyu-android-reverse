package androidx.work;

import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.PeriodicWorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j10, TimeUnit repeatIntervalTimeUnit) {
        AbstractC9133u.m16133g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        AbstractC9133u.m16139m(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j10, repeatIntervalTimeUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        AbstractC9133u.m16133g(repeatInterval, "repeatInterval");
        AbstractC9133u.m16139m(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, repeatInterval);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexTimeIntervalUnit) {
        AbstractC9133u.m16133g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        AbstractC9133u.m16133g(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        AbstractC9133u.m16139m(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j10, repeatIntervalTimeUnit, j11, flexTimeIntervalUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        AbstractC9133u.m16133g(repeatInterval, "repeatInterval");
        AbstractC9133u.m16133g(flexTimeInterval, "flexTimeInterval");
        AbstractC9133u.m16139m(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, repeatInterval, flexTimeInterval);
    }
}
