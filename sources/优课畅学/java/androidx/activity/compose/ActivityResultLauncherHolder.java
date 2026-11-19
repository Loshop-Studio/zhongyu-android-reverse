package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import p123h7.C8736p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;
    private ActivityResultLauncher<I> launcher;

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i10, ActivityOptionsCompat activityOptionsCompat) {
        C8736p c8736p;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i10, activityOptionsCompat);
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        C8736p c8736p;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
