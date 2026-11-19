package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.List;
import p113g8.AbstractC8661c0;

@Stable
/* loaded from: classes2.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {
    private final MutableState accessibilityEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final Listener$switchAccessListener$1 switchAccessListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    @RequiresApi(33)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @DoNotInline
        public static final void addAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        @DoNotInline
        public static final void removeAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public Listener(boolean z10, boolean z11) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1 = null;
        this.touchExplorationListener = z10 ? new Listener$touchExplorationListener$1() : null;
        if (z11 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$1 = new Listener$switchAccessListener$1(this);
        }
        this.switchAccessListener = listener$switchAccessListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC8661c0.m13973S(settingsActivityName, "SwitchAccess", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z10) {
        this.accessibilityEnabled$delegate.setValue(Boolean.valueOf(z10));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        setAccessibilityEnabled(z10);
    }

    public final void register(AccessibilityManager accessibilityManager) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        setAccessibilityEnabled(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.setEnabled(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
            return;
        }
        listener$switchAccessListener$1.setEnabled(getSwitchAccessEnabled(accessibilityManager));
        Api33Impl.addAccessibilityServicesStateChangeListener(accessibilityManager, AbstractC2489o0.m960a(listener$switchAccessListener$1));
    }

    public final void unregister(AccessibilityManager accessibilityManager) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
            return;
        }
        Api33Impl.removeAccessibilityServicesStateChangeListener(accessibilityManager, AbstractC2489o0.m960a(listener$switchAccessListener$1));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    @Override // androidx.compose.runtime.State
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean getValue() {
        /*
            r2 = this;
            boolean r0 = r2.getAccessibilityEnabled()
            r1 = 0
            if (r0 == 0) goto L20
            androidx.compose.material3.internal.Listener$touchExplorationListener$1 r0 = r2.touchExplorationListener
            if (r0 == 0) goto L10
            boolean r0 = r0.getEnabled()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L1f
            androidx.compose.material3.internal.Listener$switchAccessListener$1 r0 = r2.switchAccessListener
            if (r0 == 0) goto L1c
            boolean r0 = r0.getEnabled()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L20
        L1f:
            r1 = 1
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.Listener.getValue():java.lang.Boolean");
    }
}
