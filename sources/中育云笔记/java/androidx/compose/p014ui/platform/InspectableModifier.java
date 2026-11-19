package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(InterfaceC9540l interfaceC9540l) {
        super(interfaceC9540l);
        this.end = new End();
    }

    public final End getEnd() {
        return this.end;
    }
}
