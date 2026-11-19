package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(api = 35)
/* loaded from: classes2.dex */
public final class SystemTraceRequestBuilder extends ProfilingRequestBuilder<SystemTraceRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int getProfilingType() {
        return 4;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public SystemTraceRequestBuilder getThis() {
        return this;
    }

    public final SystemTraceRequestBuilder setBufferFillPolicy(BufferFillPolicy bufferFillPolicy) {
        AbstractC9979u.m20294g(bufferFillPolicy, "bufferFillPolicy");
        this.mParams.putInt("KEY_BUFFER_FILL_POLICY", bufferFillPolicy.getValue$core_release());
        return this;
    }

    public final SystemTraceRequestBuilder setBufferSizeKb(int i10) {
        this.mParams.putInt("KEY_SIZE_KB", i10);
        return this;
    }

    public final SystemTraceRequestBuilder setDurationMs(int i10) {
        this.mParams.putInt("KEY_DURATION_MS", i10);
        return this;
    }
}
