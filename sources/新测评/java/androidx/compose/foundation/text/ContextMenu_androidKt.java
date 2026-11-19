package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(m13557d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\f\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\b\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0080@¢\u0006\u0002\u0010\u0018\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\rH\u0080@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m13558d2 = {"ContextMenuArea", "", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "enabled", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextItem", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "label", "Landroidx/compose/foundation/text/TextContextMenuItems;", "operation", "getContextMenuItemsAvailability", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,216:1\n1247#2,6:217\n1247#2,3:230\n1250#2,3:234\n1247#2,6:237\n1247#2,6:243\n1247#2,6:249\n1247#2,6:255\n1247#2,3:268\n1250#2,3:272\n1247#2,6:275\n1247#2,6:281\n1247#2,6:287\n1247#2,6:293\n1247#2,6:299\n1247#2,6:305\n557#3:223\n554#3,6:224\n557#3:261\n554#3,6:262\n555#4:233\n555#4:271\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n45#1:217,6\n46#1:230,3\n46#1:234,3\n47#1:237,6\n51#1:243,6\n54#1:249,6\n69#1:255,6\n70#1:268,3\n70#1:272,3\n71#1:275,6\n76#1:281,6\n91#1:287,6\n94#1:293,6\n105#1:299,6\n108#1:305,6\n46#1:223\n46#1:224,6\n70#1:261\n70#1:262,6\n46#1:233\n70#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 176)
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1 */
    public static final class C16451 extends Lambda implements Function2<Composer, Integer, String> {
        final /* synthetic */ TextContextMenuItems $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16451(TextContextMenuItems textContextMenuItems) {
            super(2);
            this.$label = textContextMenuItems;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
            return invoke(composer, num.intValue());
        }

        @Composable
        public final String invoke(Composer composer, int i10) throws Resources.NotFoundException {
            composer.startReplaceGroup(-1744780674);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744780674, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
            }
            String strResolvedString = this.$label.resolvedString(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strResolvedString;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.ContextMenu_androidKt", m13596f = "ContextMenu.android.kt", m13597i = {0}, m13598l = {154}, m13599m = "getContextMenuItemsAvailability", m13600n = {"$this$getContextMenuItemsAvailability"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 */
    public static final class C16471 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16471(Continuation<? super C16471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability((TextFieldSelectionState) null, this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.ContextMenu_androidKt", m13596f = "ContextMenu.android.kt", m13597i = {0, 0, 0}, m13598l = {167}, m13599m = "getContextMenuItemsAvailability", m13600n = {"$this$getContextMenuItemsAvailability", "isPassword", "hasSelection"}, m13601s = {"L$0", "I$0", "I$1"})
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 */
    public static final class C16482 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16482(Continuation<? super C16482> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability((TextFieldSelectionManager) null, this);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m18063boximpl(MenuItemsAvailability.INSTANCE.m18076getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            Function1<ContextMenuScope, Unit> function1ContextMenuBuilder = TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
            boolean enabled = textFieldSelectionManager.getEnabled();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                    @DebugMetadata(m13595c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", m13596f = "ContextMenu.android.kt", m13597i = {}, m13598l = {56}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1 */
                    public static final class C16391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C16391(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C16391> continuation) {
                            super(2, continuation);
                            this.$menuItemsAvailability = mutableState;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C16391(this.$menuItemsAvailability, this.$manager, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
                                if (contextMenuItemsAvailability == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                ResultKt.throwOnFailure(obj);
                            }
                            mutableState.setValue(obj);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C16391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C16391(mutableState, textFieldSelectionManager, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            function22 = function2;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, function0, function1ContextMenuBuilder, null, enabled, (Function0) objRememberedValue5, function22, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function22 = function2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.3
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
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final void TextItem(ContextMenuScope contextMenuScope, final ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z9, final Function0<Unit> function0) {
        if (z9) {
            ContextMenuScope.item$default(contextMenuScope, new C16451(textContextMenuItems), null, false, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0.invoke();
                    ContextMenuState_androidKt.close(contextMenuState);
                }
            }, 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.MenuItemsAvailability> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text.ContextMenu_androidKt.C16471
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt.C16471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.canCopy()
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r0 = r5.canPaste(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r1 = r0.canCut()
            boolean r2 = r0.canSelectAll()
            boolean r0 = r0.canAutofill()
            int r5 = androidx.compose.foundation.text.MenuItemsAvailability.m18065constructorimpl(r5, r6, r1, r2, r0)
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.m18063boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[PHI: r2 r5 r7 r8
      0x0093: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v3 int) = (r5v1 int), (r5v11 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r7v3 androidx.compose.foundation.text.selection.TextFieldSelectionManager) = 
      (r7v0 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
      (r7v9 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
     binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.MenuItemsAvailability> r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(final TextFieldSelectionState textFieldSelectionState, boolean z9, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(2103477555);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103477555, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m18063boximpl(MenuItemsAvailability.INSTANCE.m18076getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2<TextFieldSelectionState, TextContextMenuItems, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                    @DebugMetadata(m13595c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", m13596f = "ContextMenu.android.kt", m13597i = {}, m13598l = {79, 80, 81}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1 */
                    public static final class C16441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TextContextMenuItems $item;
                        final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
                        int label;

                        @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                        /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[TextContextMenuItems.values().length];
                                try {
                                    iArr[TextContextMenuItems.Cut.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Copy.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Paste.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[TextContextMenuItems.SelectAll.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[TextContextMenuItems.Autofill.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C16441(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, Continuation<? super C16441> continuation) {
                            super(2, continuation);
                            this.$item = textContextMenuItems;
                            this.$this_contextMenuBuilder = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C16441(this.$item, this.$this_contextMenuBuilder, continuation);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
                        
                            if (r6.paste(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
                        
                            if (r6.copy(false, r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
                        
                            if (r6.cut(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
                        
                            return r0;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                            /*
                                r5 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r5.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L1d
                                if (r1 == r4) goto L11
                                if (r1 == r3) goto L11
                                if (r1 != r2) goto L15
                            L11:
                                kotlin.ResultKt.throwOnFailure(r6)
                                goto L65
                            L15:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r0)
                                throw r6
                            L1d:
                                kotlin.ResultKt.throwOnFailure(r6)
                                androidx.compose.foundation.text.TextContextMenuItems r6 = r5.$item
                                int[] r1 = androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C16441.WhenMappings.$EnumSwitchMapping$0
                                int r6 = r6.ordinal()
                                r6 = r1[r6]
                                if (r6 == r4) goto L5a
                                if (r6 == r3) goto L4e
                                if (r6 == r2) goto L43
                                r0 = 4
                                if (r6 == r0) goto L3d
                                r0 = 5
                                if (r6 == r0) goto L37
                                goto L65
                            L37:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.autofill()
                                goto L65
                            L3d:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.selectAll()
                                goto L65
                            L43:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r2
                                java.lang.Object r6 = r6.paste(r5)
                                if (r6 != r0) goto L65
                                goto L64
                            L4e:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r3
                                r1 = 0
                                java.lang.Object r6 = r6.copy(r1, r5)
                                if (r6 != r0) goto L65
                                goto L64
                            L5a:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r4
                                java.lang.Object r6 = r6.cut(r5)
                                if (r6 != r0) goto L65
                            L64:
                                return r0
                            L65:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C16441.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C16441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        invoke2(textFieldSelectionState2, textContextMenuItems);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C16441(textContextMenuItems, textFieldSelectionState2, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1<ContextMenuScope, Unit> function1ContextMenuBuilder = TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState, (Function2) objRememberedValue4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function0 = (Function0) objRememberedValue5;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(textFieldSelectionState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                    @DebugMetadata(m13595c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", m13596f = "ContextMenu.android.kt", m13597i = {}, m13598l = {96}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1 */
                    public static final class C16411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        final /* synthetic */ TextFieldSelectionState $selectionState;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C16411(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionState textFieldSelectionState, Continuation<? super C16411> continuation) {
                            super(2, continuation);
                            this.$menuItemsAvailability = mutableState;
                            this.$selectionState = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C16411(this.$menuItemsAvailability, this.$selectionState, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i10 = this.label;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionState, this);
                                if (contextMenuItemsAvailability == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                ResultKt.throwOnFailure(obj);
                            }
                            mutableState.setValue(obj);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C16411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C16411(mutableState, textFieldSelectionState, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            function22 = function2;
            z10 = z9;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, function0, function1ContextMenuBuilder, null, z10, (Function0) objRememberedValue6, function22, composerStartRestartGroup, ((i11 << 9) & 57344) | 54 | ((i11 << 12) & 3670016), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z10 = z9;
            function22 = function2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.6
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
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z10, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(final SelectionManager selectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        int i11;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(605522716);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            function22 = function2;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (Function0) objRememberedValue2, SelectionManager_androidKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, function22, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function22 = function2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.8
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
                    ContextMenu_androidKt.ContextMenuArea(selectionManager, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
