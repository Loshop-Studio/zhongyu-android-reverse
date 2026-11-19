package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final InterfaceC10559a action;
    private final String label;

    public CustomAccessibilityAction(String str, InterfaceC10559a interfaceC10559a) {
        this.label = str;
        this.action = interfaceC10559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return AbstractC9133u.m16128b(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    public final InterfaceC10559a getAction() {
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
