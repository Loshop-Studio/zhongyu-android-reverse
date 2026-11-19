package androidx.compose.p014ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingGestureLineMargin(this.viewConfiguration) : super.getHandwritingGestureLineMargin();
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingSlop(this.viewConfiguration) : super.getHandwritingSlop();
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.p014ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }
}
