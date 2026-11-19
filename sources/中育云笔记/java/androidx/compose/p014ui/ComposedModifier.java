package androidx.compose.p014ui;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectorValueInfo;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final InterfaceC9545q factory;

    public ComposedModifier(InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        super(interfaceC9540l);
        this.factory = interfaceC9545q;
    }

    public final InterfaceC9545q getFactory() {
        return this.factory;
    }
}
