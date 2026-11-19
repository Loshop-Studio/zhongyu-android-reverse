package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.platform.InspectorValueInfo;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ModifierLocalProviderKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1 */
    public static final class C28961<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
        private final ProvidableModifierLocal<T> key;
        private final State value$delegate;

        public C28961(ProvidableModifierLocal<T> providableModifierLocal, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l) {
            super(interfaceC10570l);
            this.key = providableModifierLocal;
            this.value$delegate = SnapshotStateKt.derivedStateOf(interfaceC10559a);
        }

        @Override // androidx.compose.p013ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.p013ui.modifier.ModifierLocalProvider
        public T getValue() {
            return (T) this.value$delegate.getValue();
        }
    }

    public static final <T> Modifier modifierLocalProvider(Modifier modifier, final ProvidableModifierLocal<T> providableModifierLocal, final InterfaceC10559a interfaceC10559a) {
        return modifier.then(new C28961(providableModifierLocal, interfaceC10559a, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalProvider");
                inspectorInfo.getProperties().set("key", providableModifierLocal);
                inspectorInfo.getProperties().set("value", interfaceC10559a);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
