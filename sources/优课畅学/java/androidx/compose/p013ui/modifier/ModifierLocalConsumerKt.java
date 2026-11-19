package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    public static final Modifier modifierLocalConsumer(Modifier modifier, final InterfaceC10570l interfaceC10570l) {
        return modifier.then(new ModifierLocalConsumerImpl(interfaceC10570l, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalConsumer");
                inspectorInfo.getProperties().set("consumer", interfaceC10570l);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
