package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10478l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final InterfaceC9544p mergePolicy;
    private final String name;

    public SemanticsPropertyKey(String str, InterfaceC9544p interfaceC9544p) {
        this.name = str;
        this.mergePolicy = interfaceC9544p;
    }

    public final InterfaceC9544p getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, InterfaceC10478l interfaceC10478l) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t10, T t11) {
        return (T) this.mergePolicy.invoke(t10, t11);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, InterfaceC10478l interfaceC10478l, T t10) {
        semanticsPropertyReceiver.set(this, t10);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, InterfaceC9544p interfaceC9544p, int i10, AbstractC9972n abstractC9972n) {
        this(str, (i10 & 2) != 0 ? new InterfaceC9544p() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // p181hd.InterfaceC9544p
            public final T invoke(T t10, T t11) {
                return t10 == null ? t11 : t10;
            }
        } : interfaceC9544p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z10;
    }

    public SemanticsPropertyKey(String str, boolean z10, InterfaceC9544p interfaceC9544p) {
        this(str, interfaceC9544p);
        this.isImportantForAccessibility = z10;
    }
}
