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
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\f\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u000e\u001a<\u0010\u0015\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\bH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "ContextMenuArea", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "", "enabled", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Landroidx/compose/foundation/text/TextContextMenuItems;", "label", "operation", "TextItem", "(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/TextContextMenuItems;ZLr6/a;)V", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "getContextMenuItemsAvailability", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lh6/c;)Ljava/lang/Object;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lh6/c;)Ljava/lang/Object;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,216:1\n1247#2,6:217\n1247#2,3:230\n1250#2,3:234\n1247#2,6:237\n1247#2,6:243\n1247#2,6:249\n1247#2,6:255\n1247#2,3:268\n1250#2,3:272\n1247#2,6:275\n1247#2,6:281\n1247#2,6:287\n1247#2,6:293\n1247#2,6:299\n1247#2,6:305\n557#3:223\n554#3,6:224\n557#3:261\n554#3,6:262\n555#4:233\n555#4:271\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n45#1:217,6\n46#1:230,3\n46#1:234,3\n47#1:237,6\n51#1:243,6\n54#1:249,6\n69#1:255,6\n70#1:268,3\n70#1:272,3\n71#1:275,6\n76#1:281,6\n91#1:287,6\n94#1:293,6\n105#1:299,6\n108#1:305,6\n46#1:223\n46#1:224,6\n70#1:261\n70#1:262,6\n46#1:233\n70#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1 */
    public static final class C12441 extends Lambda implements InterfaceC6473e {
        final /* synthetic */ TextContextMenuItems $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12441(TextContextMenuItems textContextMenuItems) {
            super(2);
            this.$label = textContextMenuItems;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Composer) obj, ((Number) obj2).intValue());
        }

        @Composable
        public final String invoke(Composer composer, int i) throws Resources.NotFoundException {
            composer.startReplaceGroup(-1744780674);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744780674, i, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
            }
            String strResolvedString = this.$label.resolvedString(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strResolvedString;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.ContextMenu_androidKt", m5303f = "ContextMenu.android.kt", m5304i = {0}, m5305l = {154}, m5306m = "getContextMenuItemsAvailability", m5307n = {"$this$getContextMenuItemsAvailability"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 */
    public static final class C12461 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12461(InterfaceC5631c<? super C12461> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability((TextFieldSelectionState) null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.ContextMenu_androidKt", m5303f = "ContextMenu.android.kt", m5304i = {0, 0, 0}, m5305l = {167}, m5306m = "getContextMenuItemsAvailability", m5307n = {"$this$getContextMenuItemsAvailability", "isPassword", "hasSelection"}, m5308s = {"L$0", "I$0", "I$1"})
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 */
    public static final class C12472 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12472(InterfaceC5631c<? super C12472> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability((TextFieldSelectionManager) null, this);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull final TextFieldSelectionManager textFieldSelectionManager, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i) {
        int i8;
        final InterfaceC6473e interfaceC6473e2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i8, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
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
            final InterfaceC6009v interfaceC6009v = (InterfaceC6009v) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m7667boximpl(MenuItemsAvailability.INSTANCE.m7680getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m7595invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7595invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue4;
            InterfaceC6471c interfaceC6471cContextMenuBuilder = TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
            boolean enabled = textFieldSelectionManager.getEnabled();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC6009v) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", m5303f = "ContextMenu.android.kt", m5304i = {}, m5305l = {56}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1 */
                    public static final class C12381 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C12381(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionManager textFieldSelectionManager, InterfaceC5631c<? super C12381> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$menuItemsAvailability = mutableState;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C12381(this.$menuItemsAvailability, this.$manager, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
                                if (contextMenuItemsAvailability == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                AbstractC5774b.m5119b(obj);
                            }
                            mutableState.setValue(obj);
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C12381) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m7596invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7596invoke() {
                        AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new C12381(mutableState, textFieldSelectionManager, null), 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            interfaceC6473e2 = interfaceC6473e;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, interfaceC6469a, interfaceC6471cContextMenuBuilder, null, enabled, (InterfaceC6469a) objRememberedValue5, interfaceC6473e2, composerStartRestartGroup, ((i8 << 15) & 3670016) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6473e2 = interfaceC6473e;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) {
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextItem(@NotNull ContextMenuScope contextMenuScope, @NotNull final ContextMenuState contextMenuState, @NotNull TextContextMenuItems textContextMenuItems, boolean z8, @NotNull final InterfaceC6469a interfaceC6469a) {
        if (z8) {
            ContextMenuScope.item$default(contextMenuScope, new C12441(textContextMenuItems), null, false, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7600invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7600invoke() {
                    interfaceC6469a.invoke();
                    ContextMenuState_androidKt.close(contextMenuState);
                }
            }, 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(@org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.foundation.text.MenuItemsAvailability> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text.ContextMenu_androidKt.C12461
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt.C12461) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC5774b.m5119b(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC5774b.m5119b(r6)
            boolean r6 = r5.canCopy()
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r0 = r5.canPaste(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r1 = r0.canCut()
            boolean r2 = r0.canSelectAll()
            boolean r0 = r0.canAutofill()
            int r5 = androidx.compose.foundation.text.MenuItemsAvailability.m7669constructorimpl(r5, r6, r1, r2, r0)
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.m7667boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, h6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[PHI: r2 r5 r7 r8
      0x0091: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x005c, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r5v3 int) = (r5v1 int), (r5v11 int) binds: [B:20:0x005c, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r7v3 androidx.compose.foundation.text.selection.TextFieldSelectionManager) = 
      (r7v0 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
      (r7v9 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
     binds: [B:20:0x005c, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:20:0x005c, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(@org.jetbrains.annotations.NotNull androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.foundation.text.MenuItemsAvailability> r8) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager, h6.c):java.lang.Object");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull final TextFieldSelectionState textFieldSelectionState, boolean z8, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i) {
        int i8;
        final boolean z9;
        final InterfaceC6473e interfaceC6473e2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2103477555);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103477555, i8, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
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
            final InterfaceC6009v interfaceC6009v = (InterfaceC6009v) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m7667boximpl(MenuItemsAvailability.INSTANCE.m7680getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC6009v);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC6473e() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", m5303f = "ContextMenu.android.kt", m5304i = {}, m5305l = {79, 80, 81}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1 */
                    public static final class C12431 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ TextContextMenuItems $item;
                        final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
                        int label;

                        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
                        public C12431(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super C12431> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$item = textContextMenuItems;
                            this.$this_contextMenuBuilder = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C12431(this.$item, this.$this_contextMenuBuilder, interfaceC5631c);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
                        
                            if (r6.paste(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
                        
                            if (r6.copy(false, r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
                        
                            if (r6.cut(r5) == r0) goto L29;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
                        
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
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                                int r1 = r5.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L1b
                                if (r1 == r4) goto Lf
                                if (r1 == r3) goto Lf
                                if (r1 != r2) goto L13
                            Lf:
                                kotlin.AbstractC5774b.m5119b(r6)
                                goto L63
                            L13:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r0)
                                throw r6
                            L1b:
                                kotlin.AbstractC5774b.m5119b(r6)
                                androidx.compose.foundation.text.TextContextMenuItems r6 = r5.$item
                                int[] r1 = androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C12431.WhenMappings.$EnumSwitchMapping$0
                                int r6 = r6.ordinal()
                                r6 = r1[r6]
                                if (r6 == r4) goto L58
                                if (r6 == r3) goto L4c
                                if (r6 == r2) goto L41
                                r0 = 4
                                if (r6 == r0) goto L3b
                                r0 = 5
                                if (r6 == r0) goto L35
                                goto L63
                            L35:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.autofill()
                                goto L63
                            L3b:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r6.selectAll()
                                goto L63
                            L41:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r2
                                java.lang.Object r6 = r6.paste(r5)
                                if (r6 != r0) goto L63
                                goto L62
                            L4c:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r3
                                r1 = 0
                                java.lang.Object r6 = r6.copy(r1, r5)
                                if (r6 != r0) goto L63
                                goto L62
                            L58:
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
                                r5.label = r4
                                java.lang.Object r6 = r6.cut(r5)
                                if (r6 != r0) goto L63
                            L62:
                                return r0
                            L63:
                                d6.s r6 = p045d6.C5443s.f8405a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C12431.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C12431) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new C12431(textContextMenuItems, textFieldSelectionState2, null), 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InterfaceC6471c interfaceC6471cContextMenuBuilder = TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState, (InterfaceC6473e) objRememberedValue4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m7597invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7597invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue5;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(interfaceC6009v) | composerStartRestartGroup.changedInstance(textFieldSelectionState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", m5303f = "ContextMenu.android.kt", m5304i = {}, m5305l = {96}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1 */
                    public static final class C12401 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        final /* synthetic */ TextFieldSelectionState $selectionState;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C12401(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionState textFieldSelectionState, InterfaceC5631c<? super C12401> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$menuItemsAvailability = mutableState;
                            this.$selectionState = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C12401(this.$menuItemsAvailability, this.$selectionState, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionState, this);
                                if (contextMenuItemsAvailability == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                AbstractC5774b.m5119b(obj);
                            }
                            mutableState.setValue(obj);
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C12401) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m7598invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7598invoke() {
                        AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new C12401(mutableState, textFieldSelectionState, null), 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            interfaceC6473e2 = interfaceC6473e;
            z9 = z8;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, interfaceC6469a, interfaceC6471cContextMenuBuilder, null, z9, (InterfaceC6469a) objRememberedValue6, interfaceC6473e2, composerStartRestartGroup, ((i8 << 9) & 57344) | 54 | ((i8 << 12) & 3670016), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z9 = z8;
            interfaceC6473e2 = interfaceC6473e;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) {
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z9, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull final SelectionManager selectionManager, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i) {
        int i8;
        final InterfaceC6473e interfaceC6473e2;
        Composer composerStartRestartGroup = composer.startRestartGroup(605522716);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i8, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
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
                objRememberedValue2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m7599invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7599invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            interfaceC6473e2 = interfaceC6473e;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (InterfaceC6469a) objRememberedValue2, SelectionManager_androidKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, interfaceC6473e2, composerStartRestartGroup, ((i8 << 15) & 3670016) | 54, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC6473e2 = interfaceC6473e;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) {
                    ContextMenu_androidKt.ContextMenuArea(selectionManager, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
