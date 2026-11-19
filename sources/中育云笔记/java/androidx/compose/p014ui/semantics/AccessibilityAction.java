package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10772c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AccessibilityAction<T extends InterfaceC10772c> {
    public static final int $stable = 0;
    private final T action;
    private final String label;

    public AccessibilityAction(String str, T t10) {
        this.label = str;
        this.action = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return AbstractC9979u.m20289b(this.label, accessibilityAction.label) && AbstractC9979u.m20289b(this.action, accessibilityAction.action);
    }

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.action;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
