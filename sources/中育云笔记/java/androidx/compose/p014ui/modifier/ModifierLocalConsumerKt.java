package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    public static final Modifier modifierLocalConsumer(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return modifier.then(new ModifierLocalConsumerImpl(interfaceC9540l, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalConsumer");
                inspectorInfo.getProperties().set("consumer", interfaceC9540l);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
