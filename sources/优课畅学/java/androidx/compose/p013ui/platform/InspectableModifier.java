package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(InterfaceC10570l interfaceC10570l) {
        super(interfaceC10570l);
        this.end = new End();
    }

    public final End getEnd() {
        return this.end;
    }
}
