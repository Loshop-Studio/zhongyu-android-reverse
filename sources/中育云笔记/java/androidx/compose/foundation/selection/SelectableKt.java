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
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m27721selectableO2vRcR0(Modifier modifier, final boolean z10, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z11, final Role role, final InterfaceC9529a interfaceC9529a) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new SelectableElement(z10, mutableInteractionSource, (IndicationNodeFactory) indication, z11, role, interfaceC9529a, null) : indication == null ? new SelectableElement(z10, mutableInteractionSource, null, z11, role, interfaceC9529a, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new SelectableElement(z10, mutableInteractionSource, null, z11, role, interfaceC9529a, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new SelectableElement(z10, mutableInteractionSource2, null, z11, role, interfaceC9529a, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27722selectableO2vRcR0$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m27721selectableO2vRcR0(modifier, z10, mutableInteractionSource, indication, z12, role, interfaceC9529a);
    }

    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m27723selectableXHw0xAI(Modifier modifier, final boolean z10, final boolean z11, final Role role, final InterfaceC9529a interfaceC9529a) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("selectable");
                inspectorInfo.getProperties().set("selected", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", interfaceC9529a);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
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
                composer.startReplaceGroup(-2124609672);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1412174474);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1412041856);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM27721selectableO2vRcR0 = SelectableKt.m27721selectableO2vRcR0(Modifier.Companion, z10, mutableInteractionSource, indication, z11, role, interfaceC9529a);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM27721selectableO2vRcR0;
            }
        });
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27724selectableXHw0xAI$default(Modifier modifier, boolean z10, boolean z11, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m27723selectableXHw0xAI(modifier, z10, z11, role, interfaceC9529a);
    }
}
