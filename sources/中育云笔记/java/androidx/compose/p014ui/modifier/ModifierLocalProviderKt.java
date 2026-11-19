package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.platform.InspectorValueInfo;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ModifierLocalProviderKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1 */
    public static final class C29261<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
        private final ProvidableModifierLocal<T> key;
        private final State value$delegate;

        public C29261(ProvidableModifierLocal<T> providableModifierLocal, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l) {
            super(interfaceC9540l);
            this.key = providableModifierLocal;
            this.value$delegate = SnapshotStateKt.derivedStateOf(interfaceC9529a);
        }

        @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.p014ui.modifier.ModifierLocalProvider
        public T getValue() {
            return (T) this.value$delegate.getValue();
        }
    }

    public static final <T> Modifier modifierLocalProvider(Modifier modifier, final ProvidableModifierLocal<T> providableModifierLocal, final InterfaceC9529a interfaceC9529a) {
        return modifier.then(new C29261(providableModifierLocal, interfaceC9529a, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalProvider");
                inspectorInfo.getProperties().set("key", providableModifierLocal);
                inspectorInfo.getProperties().set("value", interfaceC9529a);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
