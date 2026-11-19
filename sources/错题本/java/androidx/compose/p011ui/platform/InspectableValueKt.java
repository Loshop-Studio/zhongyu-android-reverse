package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a<\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aH\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0019\b\b\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0002\b\u0003H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\"(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "definitions", "debugInspectorInfo", "(Lr6/c;)Lr6/c;", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "(Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;)Landroidx/compose/ui/Modifier;", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "NoInspectorInfo", "Lr6/c;", "getNoInspectorInfo", "()Lr6/c;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class InspectableValueKt {

    @NotNull
    private static final InterfaceC6471c NoInspectorInfo = new InterfaceC6471c() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void invoke(InspectorInfo inspectorInfo) {
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return C5443s.f8405a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    @NotNull
    public static final InterfaceC6471c debugInspectorInfo(@NotNull final InterfaceC6471c interfaceC6471c) {
        return isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                interfaceC6471c.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @NotNull
    public static final InterfaceC6471c getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        return inspectableWrapper(modifier, interfaceC6471c, (Modifier) interfaceC6471c2.invoke(Modifier.INSTANCE));
    }

    @PublishedApi
    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(interfaceC6471c);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z8) {
        isDebugInspectorInfoEnabled = z8;
    }
}
