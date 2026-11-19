package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.AbstractC0089i;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\b\u000b*\u0002\u0018\u001b\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001$B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u00020\u0003*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, m5110d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "<init>", "(ZZ)V", "enabled", "Ld6/s;", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "am", "register", "(Landroid/view/accessibility/AccessibilityManager;)V", "unregister", "<set-?>", "accessibilityEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "getAccessibilityEnabled", "()Z", "setAccessibilityEnabled", "accessibilityEnabled", "androidx/compose/material3/internal/Listener$touchExplorationListener$1", "touchExplorationListener", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "androidx/compose/material3/internal/Listener$switchAccessListener$1", "switchAccessListener", "Landroidx/compose/material3/internal/Listener$switchAccessListener$1;", "getSwitchAccessEnabled", "(Landroid/view/accessibility/AccessibilityManager;)Z", "switchAccessEnabled", "getValue", "()Ljava/lang/Boolean;", "value", "Api33Impl", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n81#2:184\n107#2,2:185\n101#3,2:187\n33#3,6:189\n103#3:195\n1#4:196\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/Listener\n*L\n91#1:184\n91#1:185,2\n121#1:187,2\n121#1:189,6\n121#1:195\n*E\n"})
/* loaded from: classes.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {

    /* renamed from: accessibilityEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState accessibilityEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Nullable
    private final Listener$switchAccessListener$1 switchAccessListener;

    @Nullable
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    @RequiresApi(33)
    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m5110d2 = {"Landroidx/compose/material3/internal/Listener$Api33Impl;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "am", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "listener", "Ld6/s;", "addAccessibilityServicesStateChangeListener", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "removeAccessibilityServicesStateChangeListener", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Api33Impl {

        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        @DoNotInline
        public static final void addAccessibilityServicesStateChangeListener(@NotNull AccessibilityManager am, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.addAccessibilityServicesStateChangeListener(listener);
        }

        @JvmStatic
        @DoNotInline
        public static final void removeAccessibilityServicesStateChangeListener(@NotNull AccessibilityManager am, @NotNull AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    public Listener(boolean z8, boolean z9) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1 = null;
        this.touchExplorationListener = z8 ? new Listener$touchExplorationListener$1() : null;
        if (z9 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$1 = new Listener$switchAccessListener$1(this);
        }
        this.switchAccessListener = listener$switchAccessListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC5855p.m5372F(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z8) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z8));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        setAccessibilityEnabled(enabled);
    }

    public final void register(@NotNull AccessibilityManager am) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        setAccessibilityEnabled(am.isEnabled());
        am.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.setEnabled(am.isTouchExplorationEnabled());
            am.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
            return;
        }
        listener$switchAccessListener$1.setEnabled(getSwitchAccessEnabled(am));
        Api33Impl.addAccessibilityServicesStateChangeListener(am, AbstractC0089i.m164h(listener$switchAccessListener$1));
    }

    public final void unregister(@NotNull AccessibilityManager am) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        am.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            am.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
            return;
        }
        Api33Impl.removeAccessibilityServicesStateChangeListener(am, AbstractC0089i.m164h(listener$switchAccessListener$1));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    @Override // androidx.compose.runtime.State
    @org.jetbrains.annotations.NotNull
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
