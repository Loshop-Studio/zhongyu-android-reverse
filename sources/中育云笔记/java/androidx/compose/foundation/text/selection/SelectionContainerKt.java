package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.platform.ClipEntry;
import androidx.compose.p014ui.platform.Clipboard;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.TextToolbar;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class SelectionContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableSelection(final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(336063542);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:69)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), interfaceC9544p, composerStartRestartGroup, ((i11 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.DisableSelection.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    SelectionContainerKt.DisableSelection(interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(final Modifier modifier, InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        final InterfaceC9544p interfaceC9544p2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1075498320);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075498320, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            int i14 = i12;
            Selection selectionSelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Selection) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Selection selection) {
                        mutableState.setValue(selection);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i15 = (i14 & 14) | 384 | ((i14 << 6) & 7168);
            Modifier modifier2 = modifier;
            interfaceC9544p2 = interfaceC9544p;
            SelectionContainer(modifier2, selectionSelectionContainer$lambda$1, (InterfaceC9540l) objRememberedValue2, interfaceC9544p2, composerStartRestartGroup, i15, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            interfaceC9544p2 = interfaceC9544p;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i16) {
                    SelectionContainerKt.SelectionContainer(modifier, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(Modifier modifier, final Selection selection, final InterfaceC9540l interfaceC9540l, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(2078139907);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078139907, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
            }
            final SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) SelectionRegistrarImpl.Companion.getSaver(), (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$registrarImpl$1
                @Override // p181hd.InterfaceC9529a
                public final SelectionRegistrarImpl invoke() {
                    return new SelectionRegistrarImpl();
                }
            }, composerStartRestartGroup, 3072, 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SelectionManager(selectionRegistrarImpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SelectionManager selectionManager = (SelectionManager) objRememberedValue;
            final Clipboard clipboard = (Clipboard) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) objRememberedValue2;
            selectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            boolean zChanged = composerStartRestartGroup.changed(interfaceC11122i0) | composerStartRestartGroup.changed(clipboard);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", m26211f = "SelectionContainer.kt", m26212l = {103}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1 */
                    public static final class C19571 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ Clipboard $clipboard;
                        final /* synthetic */ AnnotatedString $textToCopy;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C19571(Clipboard clipboard, AnnotatedString annotatedString, InterfaceC11588c<? super C19571> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$clipboard = clipboard;
                            this.$textToCopy = annotatedString;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C19571(this.$clipboard, this.$textToCopy, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                Clipboard clipboard = this.$clipboard;
                                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(this.$textToCopy);
                                this.label = 1;
                                if (clipboard.setClipEntry(clipEntry, this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C19571) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AnnotatedString) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(AnnotatedString annotatedString) {
                        AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new C19571(clipboard, annotatedString, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            selectionManager.setOnCopyHandler((InterfaceC9540l) objRememberedValue3);
            selectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(interfaceC9540l);
            selectionManager.setSelection(selection);
            SimpleLayoutKt.SimpleLayout(modifier.then(selectionManager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1869667463, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i14) {
                    if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1869667463, i14, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:118)");
                    }
                    final SelectionManager selectionManager2 = selectionManager;
                    final SelectionRegistrarImpl selectionRegistrarImpl2 = selectionRegistrarImpl;
                    final InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    ContextMenu_androidKt.ContextMenuArea(selectionManager2, ComposableLambdaKt.rememberComposableLambda(577209674, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer3, int i15) {
                            if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(577209674, i15, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:119)");
                            }
                            ProvidedValue<SelectionRegistrar> providedValueProvides = SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl2);
                            final InterfaceC9544p interfaceC9544p3 = interfaceC9544p2;
                            final SelectionManager selectionManager3 = selectionManager2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-272381430, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p181hd.InterfaceC9544p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C10786q.f26013a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(Composer composer4, int i16) {
                                    if (!composer4.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-272381430, i16, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:120)");
                                    }
                                    interfaceC9544p3.invoke(composer4, 0);
                                    if (selectionManager3.isInTouchMode() && selectionManager3.getHasFocus() && !selectionManager3.isTriviallyCollapsedSelection$foundation_release()) {
                                        composer4.startReplaceGroup(-881553831);
                                        Selection selection2 = selectionManager3.getSelection();
                                        if (selection2 == null) {
                                            composer4.startReplaceGroup(-881514989);
                                        } else {
                                            composer4.startReplaceGroup(-881514988);
                                            final SelectionManager selectionManager4 = selectionManager3;
                                            composer4.startReplaceGroup(1495586214);
                                            List listM24139q = AbstractC10978w.m24139q(Boolean.TRUE, Boolean.FALSE);
                                            int size = listM24139q.size();
                                            int i17 = 0;
                                            while (i17 < size) {
                                                boolean zBooleanValue = ((Boolean) listM24139q.get(i17)).booleanValue();
                                                boolean zChanged2 = composer4.changed(zBooleanValue);
                                                Object objRememberedValue4 = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue4 = selectionManager4.handleDragObserver(zBooleanValue);
                                                    composer4.updateRememberedValue(objRememberedValue4);
                                                }
                                                final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue4;
                                                boolean zChanged3 = composer4.changed(zBooleanValue);
                                                Object objRememberedValue5 = composer4.rememberedValue();
                                                if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue5 = zBooleanValue ? new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // p181hd.InterfaceC9529a
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            return Offset.m30626boximpl(m28220invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m28220invokeF1C5BW0() {
                                                            Offset offsetM28255getStartHandlePosition_m7T9E = selectionManager4.m28255getStartHandlePosition_m7T9E();
                                                            return offsetM28255getStartHandlePosition_m7T9E != null ? offsetM28255getStartHandlePosition_m7T9E.m30647unboximpl() : Offset.Companion.m30652getUnspecifiedF1C5BW0();
                                                        }
                                                    } : new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$2
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // p181hd.InterfaceC9529a
                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                            return Offset.m30626boximpl(m28221invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m28221invokeF1C5BW0() {
                                                            Offset offsetM28254getEndHandlePosition_m7T9E = selectionManager4.m28254getEndHandlePosition_m7T9E();
                                                            return offsetM28254getEndHandlePosition_m7T9E != null ? offsetM28254getEndHandlePosition_m7T9E.m30647unboximpl() : Offset.Companion.m30652getUnspecifiedF1C5BW0();
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue5);
                                                }
                                                InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue5;
                                                ResolvedTextDirection direction = zBooleanValue ? selection2.getStart().getDirection() : selection2.getEnd().getDirection();
                                                float startHandleLineHeight = zBooleanValue ? selectionManager4.getStartHandleLineHeight() : selectionManager4.getEndHandleLineHeight();
                                                int i18 = i17;
                                                C1962xf8ffea21 c1962xf8ffea21 = new C1962xf8ffea21(interfaceC9529a);
                                                boolean handlesCrossed = selection2.getHandlesCrossed();
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                boolean zChangedInstance = composer4.changedInstance(textDragObserver);
                                                Object objRememberedValue6 = composer4.rememberedValue();
                                                if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1
                                                        @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                                                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                                            Object objDetectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, interfaceC11588c);
                                                            return objDetectDownAndDragGesturesWithObserver == AbstractC11725a.m25952f() ? objDetectDownAndDragGesturesWithObserver : C10786q.f26013a;
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue6);
                                                }
                                                AndroidSelectionHandles_androidKt.m28208SelectionHandlewLIcFTc(c1962xf8ffea21, zBooleanValue, direction, handlesCrossed, 0L, startHandleLineHeight, SuspendingPointerInputFilterKt.pointerInput(companion2, textDragObserver, (PointerInputEventHandler) objRememberedValue6), composer4, 0, 16);
                                                i17 = i18 + 1;
                                            }
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4.startReplaceGroup(-879541497);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionManager);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final SelectionManager selectionManager2 = selectionManager;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                selectionManager2.onRelease();
                                selectionManager2.setHasFocus(false);
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.DisposableEffect(selectionManager, (InterfaceC9540l) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SelectionContainerKt.SelectionContainer(modifier2, selection, interfaceC9540l, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }
}
