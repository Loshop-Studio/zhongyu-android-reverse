package androidx.compose.p014ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class Api29Impl {
    public static final int $stable = 0;
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
