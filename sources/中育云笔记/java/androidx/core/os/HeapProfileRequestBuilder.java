package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 35)
/* loaded from: classes2.dex */
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int getProfilingType() {
        return 2;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public HeapProfileRequestBuilder getThis() {
        return this;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int i10) {
        this.mParams.putInt("KEY_SIZE_KB", i10);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int i10) {
        this.mParams.putInt("KEY_DURATION_MS", i10);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long j10) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", j10);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean z10) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z10);
        return this;
    }
}
