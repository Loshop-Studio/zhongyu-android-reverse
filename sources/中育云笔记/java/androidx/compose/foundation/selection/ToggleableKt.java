package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m27726toggleableO2vRcR0(Modifier modifier, final boolean z10, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z11, final Role role, final InterfaceC9540l interfaceC9540l) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new ToggleableElement(z10, mutableInteractionSource, (IndicationNodeFactory) indication, z11, role, interfaceC9540l, null) : indication == null ? new ToggleableElement(z10, mutableInteractionSource, null, z11, role, interfaceC9540l, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ToggleableElement(z10, mutableInteractionSource, null, z11, role, interfaceC9540l, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-1525724089);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                }
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ToggleableElement(z10, mutableInteractionSource2, null, z11, role, interfaceC9540l, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null));
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27727toggleableO2vRcR0$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Role role, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m27726toggleableO2vRcR0(modifier, z10, mutableInteractionSource, indication, z12, role, interfaceC9540l);
    }

    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m27728toggleableXHw0xAI(Modifier modifier, final boolean z10, final boolean z11, final Role role, final InterfaceC9540l interfaceC9540l) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", interfaceC9540l);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(290332169);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(290332169, i10, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-2130062114);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-2129929496);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM27726toggleableO2vRcR0 = ToggleableKt.m27726toggleableO2vRcR0(Modifier.Companion, z10, mutableInteractionSource, indication, z11, role, interfaceC9540l);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM27726toggleableO2vRcR0;
            }
        });
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27729toggleableXHw0xAI$default(Modifier modifier, boolean z10, boolean z11, Role role, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m27728toggleableXHw0xAI(modifier, z10, z11, role, interfaceC9540l);
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m27730triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z10, final Role role, final InterfaceC9529a interfaceC9529a) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, z10, role, interfaceC9529a, null) : indication == null ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z10, role, interfaceC9529a, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z10, role, interfaceC9529a, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-1525724089);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                }
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource2, null, z10, role, interfaceC9529a, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27731triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m27730triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z11, role, interfaceC9529a);
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m27732triStateToggleableXHw0xAI(Modifier modifier, final ToggleableState toggleableState, final boolean z10, final Role role, final InterfaceC9529a interfaceC9529a) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", toggleableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", interfaceC9529a);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(-1808118329);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1808118329, i10, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:308)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1060119816);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1059987198);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM27730triStateToggleableO2vRcR0 = ToggleableKt.m27730triStateToggleableO2vRcR0(Modifier.Companion, toggleableState, mutableInteractionSource, indication, z10, role, interfaceC9529a);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM27730triStateToggleableO2vRcR0;
            }
        });
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27733triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z10, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m27732triStateToggleableXHw0xAI(modifier, toggleableState, z10, role, interfaceC9529a);
    }
}
