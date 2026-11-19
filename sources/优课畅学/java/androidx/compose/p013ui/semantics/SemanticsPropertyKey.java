package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p089e8.InterfaceC8383k;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final InterfaceC10574p mergePolicy;
    private final String name;

    public SemanticsPropertyKey(String str, InterfaceC10574p interfaceC10574p) {
        this.name = str;
        this.mergePolicy = interfaceC10574p;
    }

    public final InterfaceC10574p getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, InterfaceC8383k interfaceC8383k) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t10, T t11) {
        return (T) this.mergePolicy.invoke(t10, t11);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, InterfaceC8383k interfaceC8383k, T t10) {
        semanticsPropertyReceiver.set(this, t10);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, InterfaceC10574p interfaceC10574p, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // p300x7.InterfaceC10574p
            public final T invoke(T t10, T t11) {
                return t10 == null ? t11 : t10;
            }
        } : interfaceC10574p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z10;
    }

    public SemanticsPropertyKey(String str, boolean z10, InterfaceC10574p interfaceC10574p) {
        this(str, interfaceC10574p);
        this.isImportantForAccessibility = z10;
    }
}
