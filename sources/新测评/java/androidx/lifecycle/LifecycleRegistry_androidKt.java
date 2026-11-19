package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001¨\u0006\u0002"}, m13558d2 = {"isMainThread", "", "lifecycle-runtime_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LifecycleRegistry_androidKt {
    @SuppressLint({"RestrictedApi"})
    public static final boolean isMainThread() {
        return ArchTaskExecutor.getInstance().isMainThread();
    }
}
