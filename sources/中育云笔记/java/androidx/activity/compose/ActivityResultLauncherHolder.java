package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;
    private ActivityResultLauncher<I> launcher;

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i10, ActivityOptionsCompat activityOptionsCompat) {
        C10786q c10786q;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i10, activityOptionsCompat);
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        C10786q c10786q;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
