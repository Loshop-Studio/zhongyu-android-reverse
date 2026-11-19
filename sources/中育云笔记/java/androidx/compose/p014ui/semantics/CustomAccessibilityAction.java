package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final InterfaceC9529a action;
    private final String label;

    public CustomAccessibilityAction(String str, InterfaceC9529a interfaceC9529a) {
        this.label = str;
        this.action = interfaceC9529a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return AbstractC9979u.m20289b(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    public final InterfaceC9529a getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
