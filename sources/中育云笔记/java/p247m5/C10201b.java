package p247m5;

import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import java.util.concurrent.Future;

/* renamed from: m5.b */
/* loaded from: classes5.dex */
public class C10201b {

    /* renamed from: a */
    public final Future f24291a;

    /* renamed from: b */
    public final long f24292b = SystemClock.elapsedRealtime();

    public C10201b(Future future) {
        this.f24291a = future;
    }

    /* renamed from: a */
    public Future m21305a() {
        return this.f24291a;
    }

    /* renamed from: b */
    public boolean m21306b() {
        return SystemClock.elapsedRealtime() - this.f24292b <= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }
}
