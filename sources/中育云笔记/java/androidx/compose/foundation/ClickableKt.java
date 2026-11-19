package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.key.Key;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class ClickableKt {
    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m26983clickableO2vRcR0(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z10, final String str, final Role role, final InterfaceC9529a interfaceC9529a) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z10, str, role, interfaceC9529a, null);
        } else if (indication == null) {
            modifierComposed$default = new ClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a, null);
        } else if (mutableInteractionSource != null) {
            modifierComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a, null));
        } else {
            modifierComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ClickableElement(mutableInteractionSource2, null, z10, str, role, interfaceC9529a, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26984clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m26983clickableO2vRcR0(modifier, mutableInteractionSource, indication, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : role, interfaceC9529a);
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m26985clickableXHw0xAI(Modifier modifier, final boolean z10, final String str, final Role role, final InterfaceC9529a interfaceC9529a) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", interfaceC9529a);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
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
                composer.startReplaceGroup(-756081143);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(617653824);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(617786442);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM26983clickableO2vRcR0 = ClickableKt.m26983clickableO2vRcR0(Modifier.Companion, mutableInteractionSource, indication, z10, str, role, interfaceC9529a);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM26983clickableO2vRcR0;
            }
        });
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26986clickableXHw0xAI$default(Modifier modifier, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m26985clickableXHw0xAI(modifier, z10, str, role, interfaceC9529a);
    }

    public static final Modifier clickableWithIndicationIfNeeded(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final InterfaceC9544p interfaceC9544p) {
        return modifier.then(indication instanceof IndicationNodeFactory ? (Modifier) interfaceC9544p.invoke(mutableInteractionSource, indication) : indication == null ? (Modifier) interfaceC9544p.invoke(mutableInteractionSource, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then((Modifier) interfaceC9544p.invoke(mutableInteractionSource, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt.clickableWithIndicationIfNeeded.1
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
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then((Modifier) interfaceC9544p.invoke(mutableInteractionSource2, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null));
    }

    @InterfaceC10770a
    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m26987combinedClickableXVZzFYc(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z10, final String str, final Role role, final String str2, final InterfaceC9529a interfaceC9529a, final InterfaceC9529a interfaceC9529a2, final InterfaceC9529a interfaceC9529a3) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, true, null);
        } else if (indication == null) {
            modifierComposed$default = new CombinedClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, true, null);
        } else if (mutableInteractionSource != null) {
            modifierComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, true, null));
        } else {
            modifierComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new CombinedClickableElement(mutableInteractionSource2, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, true, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    /* renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26988combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, String str2, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        InterfaceC9529a interfaceC9529a4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        InterfaceC9529a interfaceC9529a5;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        String str3 = (i10 & 8) != 0 ? null : str;
        Role role2 = (i10 & 16) != 0 ? null : role;
        String str4 = (i10 & 32) != 0 ? null : str2;
        InterfaceC9529a interfaceC9529a6 = (i10 & 64) != 0 ? null : interfaceC9529a;
        if ((i10 & 128) != 0) {
            interfaceC9529a4 = null;
            modifier2 = modifier;
            indication2 = indication;
            interfaceC9529a5 = interfaceC9529a3;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            interfaceC9529a4 = interfaceC9529a2;
            modifier2 = modifier;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            interfaceC9529a5 = interfaceC9529a3;
        }
        return m26987combinedClickableXVZzFYc(modifier2, mutableInteractionSource2, indication2, z11, str3, role2, str4, interfaceC9529a6, interfaceC9529a4, interfaceC9529a5);
    }

    /* renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m26989combinedClickableauXiCPI(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z10, final String str, final Role role, final String str2, final InterfaceC9529a interfaceC9529a, final InterfaceC9529a interfaceC9529a2, final boolean z11, final InterfaceC9529a interfaceC9529a3) {
        Modifier modifierComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            modifierComposed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, z11, null);
        } else if (indication == null) {
            modifierComposed$default = new CombinedClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, z11, null);
        } else if (mutableInteractionSource != null) {
            modifierComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, z11, null));
        } else {
            modifierComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new CombinedClickableElement(mutableInteractionSource2, null, z10, str, role, interfaceC9529a3, str2, interfaceC9529a, interfaceC9529a2, z11, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifierThen;
                }
            }, 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26990combinedClickableauXiCPI$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, String str2, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z11, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            role = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 128) != 0) {
            interfaceC9529a2 = null;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        return m26989combinedClickableauXiCPI(modifier, mutableInteractionSource, indication, z10, str, role, str2, interfaceC9529a, interfaceC9529a2, z11, interfaceC9529a3);
    }

    @InterfaceC10770a
    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m26991combinedClickablecJG_KMw(Modifier modifier, final boolean z10, final String str, final Role role, final String str2, final InterfaceC9529a interfaceC9529a, final InterfaceC9529a interfaceC9529a2, final InterfaceC9529a interfaceC9529a3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", interfaceC9529a3);
                inspectorInfo.getProperties().set("onDoubleClick", interfaceC9529a2);
                inspectorInfo.getProperties().set("onLongClick", interfaceC9529a);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
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
                composer.startReplaceGroup(1969174843);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:312)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1724200443);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1724067825);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM26989combinedClickableauXiCPI = ClickableKt.m26989combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z10, str, role, str2, interfaceC9529a, interfaceC9529a2, true, interfaceC9529a3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM26989combinedClickableauXiCPI;
            }
        });
    }

    /* renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26992combinedClickablecJG_KMw$default(Modifier modifier, boolean z10, String str, Role role, String str2, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        InterfaceC9529a interfaceC9529a4;
        InterfaceC9529a interfaceC9529a5;
        String str3;
        InterfaceC9529a interfaceC9529a6;
        String str4;
        Role role2;
        Modifier modifier2;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC9529a4 = null;
            str3 = str2;
            interfaceC9529a5 = interfaceC9529a3;
            str4 = str;
            interfaceC9529a6 = interfaceC9529a;
            modifier2 = modifier;
            role2 = role;
        } else {
            interfaceC9529a4 = interfaceC9529a2;
            interfaceC9529a5 = interfaceC9529a3;
            str3 = str2;
            interfaceC9529a6 = interfaceC9529a;
            str4 = str;
            role2 = role;
            modifier2 = modifier;
        }
        return m26991combinedClickablecJG_KMw(modifier2, z10, str4, role2, str3, interfaceC9529a6, interfaceC9529a4, interfaceC9529a5);
    }

    /* renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final Modifier m26993combinedClickablef5TDLPQ(Modifier modifier, final boolean z10, final String str, final Role role, final String str2, final InterfaceC9529a interfaceC9529a, final InterfaceC9529a interfaceC9529a2, final boolean z11, final InterfaceC9529a interfaceC9529a3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", interfaceC9529a3);
                inspectorInfo.getProperties().set("onDoubleClick", interfaceC9529a2);
                inspectorInfo.getProperties().set("onLongClick", interfaceC9529a);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(z11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
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
                composer.startReplaceGroup(-1534186401);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534186401, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:264)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1726068379);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1725935761);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier modifierM26989combinedClickableauXiCPI = ClickableKt.m26989combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z10, str, role, str2, interfaceC9529a, interfaceC9529a2, z11, interfaceC9529a3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM26989combinedClickableauXiCPI;
            }
        });
    }

    /* renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26994combinedClickablef5TDLPQ$default(Modifier modifier, boolean z10, String str, Role role, String str2, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z11, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC9529a2 = null;
        }
        if ((i10 & 64) != 0) {
            z11 = true;
        }
        return m26993combinedClickablef5TDLPQ(modifier, z10, str, role, str2, interfaceC9529a, interfaceC9529a2, z11, interfaceC9529a3);
    }

    public static final boolean hasScrollableContainer(TraversableNode traversableNode) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        TraversableNodeKt.traverseAncestors(traversableNode, ScrollableContainerNode.TraverseKey, new InterfaceC9540l() { // from class: androidx.compose.foundation.ClickableKt.hasScrollableContainer.1
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
            @Override // p181hd.InterfaceC9540l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(androidx.compose.p014ui.node.TraversableNode r4) {
                /*
                    r3 = this;
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r1
                    boolean r1 = r0.f23398c
                    r2 = 1
                    if (r1 != 0) goto L17
                    java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                    kotlin.jvm.internal.AbstractC9979u.m20292e(r4, r1)
                    androidx.compose.foundation.gestures.ScrollableContainerNode r4 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r4
                    boolean r4 = r4.getEnabled()
                    if (r4 == 0) goto L15
                    goto L17
                L15:
                    r4 = 0
                    goto L18
                L17:
                    r4 = r2
                L18:
                    r0.f23398c = r4
                    kotlin.jvm.internal.Ref$BooleanRef r4 = r1
                    boolean r4 = r4.f23398c
                    r4 = r4 ^ r2
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.C11971.invoke(androidx.compose.ui.node.TraversableNode):java.lang.Boolean");
            }
        });
        return ref$BooleanRef.f23398c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m26995isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31957getKeyUpCS__XNY()) && m26996isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m26996isEnterZmokQxo(KeyEvent keyEvent) {
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31723getDirectionCenterEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31737getEnterEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31829getNumPadEnterEK5gGoQ())) {
            return true;
        }
        return Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31875getSpacebarEK5gGoQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m26997isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) && m26996isEnterZmokQxo(keyEvent);
    }
}
