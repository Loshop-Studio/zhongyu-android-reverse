package androidx.compose.p014ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.UiComposable;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AndroidView_androidKt {
    private static final InterfaceC9540l NoOpUpdate = new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void invoke(View view) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return C10786q.f26013a;
        }
    };

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(final InterfaceC9540l interfaceC9540l, Modifier modifier, InterfaceC9540l interfaceC9540l2, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final InterfaceC9540l interfaceC9540l3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC9540l) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            InterfaceC9540l interfaceC9540l4 = i14 != 0 ? NoOpUpdate : interfaceC9540l2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            AndroidView(interfaceC9540l, modifier3, null, NoOpUpdate, interfaceC9540l4, composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (57344 & (i12 << 6)), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            interfaceC9540l3 = interfaceC9540l4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            interfaceC9540l3 = interfaceC9540l2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidView_androidKt.AndroidView(interfaceC9540l, modifier2, interfaceC9540l3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    @Composable
    private static final <T extends View> InterfaceC9529a createAndroidViewNodeFactory(final InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        final int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zChangedInstance = composer.changedInstance(context) | ((((i10 & 14) ^ 6) > 4 && composer.changed(interfaceC9540l)) || (i10 & 6) == 4) | composer.changedInstance(compositionContextRememberCompositionContext) | composer.changedInstance(saveableStateRegistry) | composer.changed(currentCompositeKeyHash) | composer.changedInstance(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final LayoutNode invoke() {
                    Context context2 = context;
                    InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
                    CompositionContext compositionContext = compositionContextRememberCompositionContext;
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    int i11 = currentCompositeKeyHash;
                    KeyEvent.Callback callback = view;
                    AbstractC9979u.m20292e(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context2, interfaceC9540l2, compositionContext, saveableStateRegistry2, i11, (Owner) callback).getLayoutNode();
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        InterfaceC9529a interfaceC9529a = (InterfaceC9529a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9529a;
    }

    public static final InterfaceC9540l getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m33756updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i10, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m30312setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m30312setimpl(composer, modifier, new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Modifier) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, Modifier modifier2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setModifier(modifier2);
            }
        });
        Updater.m30312setimpl(composer, density, new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Density) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, Density density2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setDensity(density2);
            }
        });
        Updater.m30312setimpl(composer, lifecycleOwner, new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LifecycleOwner) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setLifecycleOwner(lifecycleOwner2);
            }
        });
        Updater.m30312setimpl(composer, savedStateRegistryOwner, new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setSavedStateRegistryOwner(savedStateRegistryOwner2);
            }
        });
        Updater.m30312setimpl(composer, layoutDirection, new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LayoutDirection) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                ViewFactoryHolder viewFactoryHolderRequireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i12 = 1;
                if (i11 == 1) {
                    i12 = 0;
                } else if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolderRequireViewFactoryHolder.setLayoutDirection(i12);
            }
        });
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !AbstractC9979u.m20289b(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            composer.apply(Integer.valueOf(i10), setCompositeKeyHash);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    @androidx.compose.runtime.Composable
    @androidx.compose.p014ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void AndroidView(final p181hd.InterfaceC9540l r24, androidx.compose.p014ui.Modifier r25, p181hd.InterfaceC9540l r26, p181hd.InterfaceC9540l r27, p181hd.InterfaceC9540l r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.viewinterop.AndroidView_androidKt.AndroidView(hd.l, androidx.compose.ui.Modifier, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
