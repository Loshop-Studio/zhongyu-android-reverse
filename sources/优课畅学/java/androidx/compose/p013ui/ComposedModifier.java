package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectorValueInfo;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final InterfaceC10575q factory;

    public ComposedModifier(InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        super(interfaceC10570l);
        this.factory = interfaceC10575q;
    }

    public final InterfaceC10575q getFactory() {
        return this.factory;
    }
}
