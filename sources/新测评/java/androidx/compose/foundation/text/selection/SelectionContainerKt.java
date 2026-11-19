package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.TextToolbar;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
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
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(m13557d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m13558d2 = {"DisableSelection", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,181:1\n1247#2,6:182\n1247#2,6:188\n1247#2,6:194\n1247#2,3:208\n1250#2,3:212\n1247#2,6:216\n1247#2,6:223\n75#3:200\n75#3:215\n75#3:222\n557#4:201\n554#4,6:202\n555#5:211\n85#6:229\n113#6,2:230\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n54#1:182,6\n58#1:188,6\n94#1:194,6\n97#1:208,3\n97#1:212,3\n100#1:216,6\n174#1:223,6\n96#1:200\n98#1:215\n107#1:222\n97#1:201\n97#1:202,6\n97#1:211\n54#1:229\n54#1:230,2\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableSelection(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(336063542);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:69)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), function2, composerStartRestartGroup, ((i11 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.DisableSelection.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    SelectionContainerKt.DisableSelection(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        int i12;
        final Function2<? super Composer, ? super Integer, Unit> function22;
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
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075498320, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            int i14 = i12;
            Selection selectionSelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                        invoke2(selection);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Selection selection) {
                        mutableState.setValue(selection);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i15 = (i14 & 14) | 384 | ((i14 << 6) & 7168);
            Modifier modifier2 = modifier;
            function22 = function2;
            SelectionContainer(modifier2, selectionSelectionContainer$lambda$1, (Function1) objRememberedValue2, function22, composerStartRestartGroup, i15, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            function22 = function2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    SelectionContainerKt.SelectionContainer(modifier, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(Modifier modifier, final Selection selection, final Function1<? super Selection, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
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
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078139907, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
            }
            final SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m20533rememberSaveable(new Object[0], (Saver) SelectionRegistrarImpl.INSTANCE.getSaver(), (String) null, (Function0) new Function0<SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$registrarImpl$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SelectionRegistrarImpl invoke() {
                    return new SelectionRegistrarImpl();
                }
            }, composerStartRestartGroup, 3072, 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SelectionManager(selectionRegistrarImpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SelectionManager selectionManager = (SelectionManager) objRememberedValue;
            final Clipboard clipboard = (Clipboard) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            selectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            boolean zChanged = composerStartRestartGroup.changed(coroutineScope) | composerStartRestartGroup.changed(clipboard);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<AnnotatedString, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1

                    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                    @DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", m13596f = "SelectionContainer.kt", m13597i = {}, m13598l = {103}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1 */
                    public static final class C18981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Clipboard $clipboard;
                        final /* synthetic */ AnnotatedString $textToCopy;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C18981(Clipboard clipboard, AnnotatedString annotatedString, Continuation<? super C18981> continuation) {
                            super(2, continuation);
                            this.$clipboard = clipboard;
                            this.$textToCopy = annotatedString;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C18981(this.$clipboard, this.$textToCopy, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                Clipboard clipboard = this.$clipboard;
                                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(this.$textToCopy);
                                this.label = 1;
                                if (clipboard.setClipEntry(clipEntry, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C18981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnnotatedString annotatedString) {
                        invoke2(annotatedString);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnnotatedString annotatedString) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C18981(clipboard, annotatedString, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            selectionManager.setOnCopyHandler((Function1) objRememberedValue3);
            selectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(function1);
            selectionManager.setSelection(selection);
            SimpleLayoutKt.SimpleLayout(modifier.then(selectionManager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1869667463, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
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
                    final Function2<Composer, Integer, Unit> function22 = function2;
                    ContextMenu_androidKt.ContextMenuArea(selectionManager2, ComposableLambdaKt.rememberComposableLambda(577209674, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
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
                            final Function2<Composer, Integer, Unit> function23 = function22;
                            final SelectionManager selectionManager3 = selectionManager2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-272381430, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.4.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
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
                                    function23.invoke(composer4, 0);
                                    if (selectionManager3.isInTouchMode() && selectionManager3.getHasFocus() && !selectionManager3.isTriviallyCollapsedSelection$foundation_release()) {
                                        composer4.startReplaceGroup(-881553831);
                                        Selection selection2 = selectionManager3.getSelection();
                                        if (selection2 == null) {
                                            composer4.startReplaceGroup(-881514989);
                                        } else {
                                            composer4.startReplaceGroup(-881514988);
                                            final SelectionManager selectionManager4 = selectionManager3;
                                            composer4.startReplaceGroup(1495586214);
                                            List listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                                            int size = listListOf.size();
                                            int i17 = 0;
                                            while (i17 < size) {
                                                boolean zBooleanValue = ((Boolean) listListOf.get(i17)).booleanValue();
                                                boolean zChanged2 = composer4.changed(zBooleanValue);
                                                Object objRememberedValue4 = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue4 = selectionManager4.handleDragObserver(zBooleanValue);
                                                    composer4.updateRememberedValue(objRememberedValue4);
                                                }
                                                final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue4;
                                                boolean zChanged3 = composer4.changed(zBooleanValue);
                                                Object objRememberedValue5 = composer4.rememberedValue();
                                                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = zBooleanValue ? new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Offset invoke() {
                                                            return Offset.m20724boximpl(m18396invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m18396invokeF1C5BW0() {
                                                            Offset offsetM18431getStartHandlePosition_m7T9E = selectionManager4.m18431getStartHandlePosition_m7T9E();
                                                            return offsetM18431getStartHandlePosition_m7T9E != null ? offsetM18431getStartHandlePosition_m7T9E.m20745unboximpl() : Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
                                                        }
                                                    } : new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$2
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ Offset invoke() {
                                                            return Offset.m20724boximpl(m18397invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m18397invokeF1C5BW0() {
                                                            Offset offsetM18430getEndHandlePosition_m7T9E = selectionManager4.m18430getEndHandlePosition_m7T9E();
                                                            return offsetM18430getEndHandlePosition_m7T9E != null ? offsetM18430getEndHandlePosition_m7T9E.m20745unboximpl() : Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue5);
                                                }
                                                Function0 function0 = (Function0) objRememberedValue5;
                                                ResolvedTextDirection direction = zBooleanValue ? selection2.getStart().getDirection() : selection2.getEnd().getDirection();
                                                float startHandleLineHeight = zBooleanValue ? selectionManager4.getStartHandleLineHeight() : selectionManager4.getEndHandleLineHeight();
                                                int i18 = i17;
                                                C1903xf8ffea21 c1903xf8ffea21 = new C1903xf8ffea21(function0);
                                                boolean handlesCrossed = selection2.getHandlesCrossed();
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                boolean zChangedInstance = composer4.changedInstance(textDragObserver);
                                                Object objRememberedValue6 = composer4.rememberedValue();
                                                if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1
                                                        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                            Object objDetectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, continuation);
                                                            return objDetectDownAndDragGesturesWithObserver == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDownAndDragGesturesWithObserver : Unit.INSTANCE;
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue6);
                                                }
                                                AndroidSelectionHandles_androidKt.m18384SelectionHandlewLIcFTc(c1903xf8ffea21, zBooleanValue, direction, handlesCrossed, 0L, startHandleLineHeight, SuspendingPointerInputFilterKt.pointerInput(companion2, textDragObserver, (PointerInputEventHandler) objRememberedValue6), composer4, 0, 16);
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
                objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
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
            EffectsKt.DisposableEffect(selectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    SelectionContainerKt.SelectionContainer(modifier2, selection, function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }
}
