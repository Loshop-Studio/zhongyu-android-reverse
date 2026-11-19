package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 35)
/* loaded from: classes2.dex */
public final class StackSamplingRequestBuilder extends ProfilingRequestBuilder<StackSamplingRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int getProfilingType() {
        return 3;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public StackSamplingRequestBuilder getThis() {
        return this;
    }

    public final StackSamplingRequestBuilder setBufferSizeKb(int i10) {
        this.mParams.putInt("KEY_SIZE_KB", i10);
        return this;
    }

    public final StackSamplingRequestBuilder setDurationMs(int i10) {
        this.mParams.putInt("KEY_DURATION_MS", i10);
        return this;
    }

    public final StackSamplingRequestBuilder setSamplingFrequencyHz(int i10) {
        this.mParams.putInt("KEY_FREQUENCY_HZ", i10);
        return this;
    }
}
