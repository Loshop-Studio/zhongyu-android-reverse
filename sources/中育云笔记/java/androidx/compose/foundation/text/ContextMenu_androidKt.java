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
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ContextMenu_androidKt {

    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1 */
    public static final class C17041 extends Lambda implements InterfaceC9544p {
        final /* synthetic */ TextContextMenuItems $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17041(TextContextMenuItems textContextMenuItems) {
            super(2);
            this.$label = textContextMenuItems;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Composer) obj, ((Number) obj2).intValue());
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

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.ContextMenu_androidKt", m26211f = "ContextMenu.android.kt", m26212l = {Opcodes.IFNE}, m26213m = "getContextMenuItemsAvailability")
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 */
    public static final class C17061 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C17061(InterfaceC11588c<? super C17061> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability((TextFieldSelectionState) null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.ContextMenu_androidKt", m26211f = "ContextMenu.android.kt", m26212l = {Opcodes.GOTO}, m26213m = "getContextMenuItemsAvailability")
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 */
    public static final class C17072 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C17072(InterfaceC11588c<? super C17072> interfaceC11588c) {
            super(interfaceC11588c);
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
    public static final void ContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        final InterfaceC9544p interfaceC9544p2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m27863boximpl(MenuItemsAvailability.Companion.m27876getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27791invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27791invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue4;
            InterfaceC9540l interfaceC9540lContextMenuBuilder = TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
            boolean enabled = textFieldSelectionManager.getEnabled();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC11122i0) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", m26211f = "ContextMenu.android.kt", m26212l = {Opcodes.FSTORE}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1 */
                    public static final class C16981 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C16981(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionManager textFieldSelectionManager, InterfaceC11588c<? super C16981> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$menuItemsAvailability = mutableState;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C16981(this.$menuItemsAvailability, this.$manager, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            MutableState mutableState;
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
                                if (contextMenuItemsAvailability == objM25952f) {
                                    return objM25952f;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                AbstractC9924b.m20071b(obj);
                            }
                            mutableState.setValue(obj);
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C16981) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27792invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27792invoke() {
                        AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new C16981(mutableState, textFieldSelectionManager, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            interfaceC9544p2 = interfaceC9544p;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, interfaceC9529a, interfaceC9540lContextMenuBuilder, null, enabled, (InterfaceC9529a) objRememberedValue5, interfaceC9544p2, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC9544p2 = interfaceC9544p;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.3
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
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final void TextItem(ContextMenuScope contextMenuScope, final ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z10, final InterfaceC9529a interfaceC9529a) {
        if (z10) {
            ContextMenuScope.item$default(contextMenuScope, new C17041(textContextMenuItems), null, false, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.TextItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27796invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27796invoke() {
                    interfaceC9529a.invoke();
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
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, vc.InterfaceC11588c<? super androidx.compose.foundation.text.MenuItemsAvailability> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text.ContextMenu_androidKt.C17061
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt.C17061) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9924b.m20071b(r6)
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
            int r5 = androidx.compose.foundation.text.MenuItemsAvailability.m27865constructorimpl(r5, r6, r1, r2, r0)
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.m27863boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, vc.c):java.lang.Object");
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
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, vc.InterfaceC11588c<? super androidx.compose.foundation.text.MenuItemsAvailability> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager, vc.c):java.lang.Object");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(final TextFieldSelectionState textFieldSelectionState, boolean z10, InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        final boolean z11;
        final InterfaceC9544p interfaceC9544p2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2103477555);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103477555, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m27863boximpl(MenuItemsAvailability.Companion.m27876getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC11122i0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9544p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", m26211f = "ContextMenu.android.kt", m26212l = {79, 80, PatchStatus.CODE_LOAD_HANDLE_DEX}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1 */
                    public static final class C17031 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ TextContextMenuItems $item;
                        final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
                        int label;

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
                        public C17031(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, InterfaceC11588c<? super C17031> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$item = textContextMenuItems;
                            this.$this_contextMenuBuilder = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C17031(this.$item, this.$this_contextMenuBuilder, interfaceC11588c);
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
                        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                            /*
                                r5 = this;
                                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                                int r1 = r5.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L1d
                                if (r1 == r4) goto L11
                                if (r1 == r3) goto L11
                                if (r1 != r2) goto L15
                            L11:
                                kotlin.AbstractC9924b.m20071b(r6)
                                goto L65
                            L15:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r0)
                                throw r6
                            L1d:
                                kotlin.AbstractC9924b.m20071b(r6)
                                androidx.compose.foundation.text.TextContextMenuItems r6 = r5.$item
                                int[] r1 = androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C17031.WhenMappings.$EnumSwitchMapping$0
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
                                qc.q r6 = p309qc.C10786q.f26013a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.C17031.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C17031) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(TextFieldSelectionState textFieldSelectionState2, TextContextMenuItems textContextMenuItems) {
                        AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new C17031(textContextMenuItems, textFieldSelectionState2, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InterfaceC9540l interfaceC9540lContextMenuBuilder = TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState, (InterfaceC9544p) objRememberedValue4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27793invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27793invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue5;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(interfaceC11122i0) | composerStartRestartGroup.changedInstance(textFieldSelectionState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", m26211f = "ContextMenu.android.kt", m26212l = {Opcodes.IADD}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1 */
                    public static final class C17001 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ MutableState<MenuItemsAvailability> $menuItemsAvailability;
                        final /* synthetic */ TextFieldSelectionState $selectionState;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C17001(MutableState<MenuItemsAvailability> mutableState, TextFieldSelectionState textFieldSelectionState, InterfaceC11588c<? super C17001> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$menuItemsAvailability = mutableState;
                            this.$selectionState = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C17001(this.$menuItemsAvailability, this.$selectionState, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            MutableState mutableState;
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                MutableState<MenuItemsAvailability> mutableState2 = this.$menuItemsAvailability;
                                TextFieldSelectionState textFieldSelectionState = this.$selectionState;
                                this.L$0 = mutableState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionState, this);
                                if (contextMenuItemsAvailability == objM25952f) {
                                    return objM25952f;
                                }
                                mutableState = mutableState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = (MutableState) this.L$0;
                                AbstractC9924b.m20071b(obj);
                            }
                            mutableState.setValue(obj);
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C17001) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27794invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27794invoke() {
                        AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new C17001(mutableState, textFieldSelectionState, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            interfaceC9544p2 = interfaceC9544p;
            z11 = z10;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, interfaceC9529a, interfaceC9540lContextMenuBuilder, null, z11, (InterfaceC9529a) objRememberedValue6, interfaceC9544p2, composerStartRestartGroup, ((i11 << 9) & 57344) | 54 | ((i11 << 12) & 3670016), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z11 = z10;
            interfaceC9544p2 = interfaceC9544p;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.6
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
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z11, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(final SelectionManager selectionManager, InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        final InterfaceC9544p interfaceC9544p2;
        Composer composerStartRestartGroup = composer.startRestartGroup(605522716);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27795invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27795invoke() {
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            interfaceC9544p2 = interfaceC9544p;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (InterfaceC9529a) objRememberedValue2, SelectionManager_androidKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, interfaceC9544p2, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            interfaceC9544p2 = interfaceC9544p;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.8
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
                    ContextMenu_androidKt.ContextMenuArea(selectionManager, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
