package androidx.compose.foundation.layout;

import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier captionBarPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("captionBarPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getCaptionBar());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier displayCutoutPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("displayCutoutPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getDisplayCutout());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier imePadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imePadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getIme());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("mandatorySystemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getMandatorySystemGestures());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("navigationBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getNavigationBars());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier safeContentPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeContentPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeContent());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier safeDrawingPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeDrawingPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeDrawing());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier safeGesturesPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeGestures());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("statusBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getStatusBars());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSystemBars());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier systemGesturesPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSystemGestures());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier waterfallPadding(Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("waterfallPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getWaterfall());
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @Stable
    private static final Modifier windowInsetsPadding(Modifier modifier, InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        return ComposedModifierKt.composed(modifier, interfaceC9540l, new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.windowInsetsPadding.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.Companion.current(composer, 6);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                InterfaceC9540l interfaceC9540l3 = interfaceC9540l2;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier((WindowInsets) interfaceC9540l3.invoke(windowInsetsHolderCurrent));
                    composer.updateRememberedValue(objRememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }
}
