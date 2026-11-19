package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* loaded from: classes2.dex */
public final class Listener$switchAccessListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    private final MutableState enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    final /* synthetic */ Listener this$0;

    public Listener$switchAccessListener$1(Listener listener) {
        this.this$0 = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        setEnabled(this.this$0.getSwitchAccessEnabled(accessibilityManager));
    }

    public final void setEnabled(boolean z10) {
        this.enabled$delegate.setValue(Boolean.valueOf(z10));
    }
}
