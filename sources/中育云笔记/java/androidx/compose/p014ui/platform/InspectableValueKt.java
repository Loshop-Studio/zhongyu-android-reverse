package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class InspectableValueKt {
    private static final InterfaceC9540l NoInspectorInfo = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(InspectorInfo inspectorInfo) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return C10786q.f26013a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final InterfaceC9540l debugInspectorInfo(final InterfaceC9540l interfaceC9540l) {
        return isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                interfaceC9540l.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    public static final InterfaceC9540l getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @InterfaceC10770a
    public static final Modifier inspectable(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return inspectableWrapper(modifier, interfaceC9540l, (Modifier) interfaceC9540l2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, InterfaceC9540l interfaceC9540l, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(interfaceC9540l);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        isDebugInspectorInfoEnabled = z10;
    }
}
