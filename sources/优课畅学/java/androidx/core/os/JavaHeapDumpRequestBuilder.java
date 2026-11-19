package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 35)
/* loaded from: classes2.dex */
public final class JavaHeapDumpRequestBuilder extends ProfilingRequestBuilder<JavaHeapDumpRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int getProfilingType() {
        return 1;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public JavaHeapDumpRequestBuilder getThis() {
        return this;
    }

    public final JavaHeapDumpRequestBuilder setBufferSizeKb(int i10) {
        this.mParams.putInt("KEY_SIZE_KB", i10);
        return this;
    }
}
