package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.Modifier;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class InspectableValueKt {
    private static final InterfaceC10570l NoInspectorInfo = new InterfaceC10570l() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(InspectorInfo inspectorInfo) {
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return C8736p.f16368a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final InterfaceC10570l debugInspectorInfo(final InterfaceC10570l interfaceC10570l) {
        return isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                interfaceC10570l.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    public static final InterfaceC10570l getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @InterfaceC8721a
    public static final Modifier inspectable(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return inspectableWrapper(modifier, interfaceC10570l, (Modifier) interfaceC10570l2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, InterfaceC10570l interfaceC10570l, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(interfaceC10570l);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        isDebugInspectorInfoEnabled = z10;
    }
}
