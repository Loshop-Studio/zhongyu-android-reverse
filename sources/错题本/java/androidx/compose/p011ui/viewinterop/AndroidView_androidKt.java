package androidx.compose.p011ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LifecycleOwner;
import android.view.SavedStateRegistryOwner;
import android.view.View;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.UiComposable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\r\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a^\u0010!\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$\"(\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m5110d2 = {"Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "Ld6/s;", "update", "AndroidView", "(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "createAndroidViewNodeFactory", "(Lr6/c;Landroidx/compose/runtime/Composer;I)Lr6/a;", "Landroidx/compose/runtime/Updater;", "", "compositeKeyHash", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "updateViewHolderParams", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "requireViewFactoryHolder", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Lkotlin/ExtensionFunctionType;", "NoOpUpdate", "Lr6/c;", "getNoOpUpdate", "()Lr6/c;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,392:1\n75#2:393\n75#2:394\n75#2:395\n75#2:396\n75#2:419\n75#2:420\n75#2:421\n272#3,11:397\n238#3,11:408\n1247#4,6:422\n4206#5,6:428\n89#6,7:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n203#1:393\n204#1:394\n211#1:395\n212#1:396\n255#1:419\n257#1:420\n258#1:421\n215#1:397,11\n233#1:408,11\n260#1:422,6\n294#1:428,6\n300#1:434,7\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidView_androidKt {

    @NotNull
    private static final InterfaceC6471c NoOpUpdate = new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void invoke(View view) {
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return C5443s.f8405a;
        }
    };

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@NotNull final InterfaceC6471c interfaceC6471c, @Nullable Modifier modifier, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        final Modifier modifier2;
        final InterfaceC6471c interfaceC6471c3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i8 & 1) != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(interfaceC6471c) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i11 = i8 & 4;
        if (i11 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6471c2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            InterfaceC6471c interfaceC6471c4 = i11 != 0 ? NoOpUpdate : interfaceC6471c2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i9, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            AndroidView(interfaceC6471c, modifier3, null, NoOpUpdate, interfaceC6471c4, composerStartRestartGroup, (i9 & 14) | 3072 | (i9 & 112) | (57344 & (i9 << 6)), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            interfaceC6471c3 = interfaceC6471c4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            interfaceC6471c3 = interfaceC6471c2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i12) {
                    AndroidView_androidKt.AndroidView(interfaceC6471c, modifier2, interfaceC6471c3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    @Composable
    private static final <T extends View> InterfaceC6469a createAndroidViewNodeFactory(final InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        final int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zChangedInstance = composer.changedInstance(context) | ((((i & 14) ^ 6) > 4 && composer.changed(interfaceC6471c)) || (i & 6) == 4) | composer.changedInstance(compositionContextRememberCompositionContext) | composer.changedInstance(saveableStateRegistry) | composer.changed(currentCompositeKeyHash) | composer.changedInstance(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new InterfaceC6469a() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final LayoutNode invoke() {
                    Context context2 = context;
                    InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                    CompositionContext compositionContext = compositionContextRememberCompositionContext;
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    int i8 = currentCompositeKeyHash;
                    KeyEvent.Callback callback = view;
                    AbstractC5830k.m5328e(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context2, interfaceC6471c2, compositionContext, saveableStateRegistry2, i8, (Owner) callback).getLayoutNode();
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6469a;
    }

    @NotNull
    public static final InterfaceC6471c getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder;
        }
        throw AbstractC1923c.m1053q("Required value was null.");
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m13560updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.m10116setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m10116setimpl(composer, modifier, new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Modifier) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutNode layoutNode, Modifier modifier2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setModifier(modifier2);
            }
        });
        Updater.m10116setimpl(composer, density, new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Density) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutNode layoutNode, Density density2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setDensity(density2);
            }
        });
        Updater.m10116setimpl(composer, lifecycleOwner, new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LifecycleOwner) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setLifecycleOwner(lifecycleOwner2);
            }
        });
        Updater.m10116setimpl(composer, savedStateRegistryOwner, new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setSavedStateRegistryOwner(savedStateRegistryOwner2);
            }
        });
        Updater.m10116setimpl(composer, layoutDirection, new InterfaceC6473e() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LayoutDirection) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                ViewFactoryHolder viewFactoryHolderRequireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i9 = 1;
                if (i8 == 1) {
                    i9 = 0;
                } else if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolderRequireViewFactoryHolder.setLayoutDirection(i9);
            }
        });
        InterfaceC6473e setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !AbstractC5830k.m5325b(composer.rememberedValue(), Integer.valueOf(i))) {
            AbstractC0584a.m918s(i, composer, i, setCompositeKeyHash);
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
    @androidx.compose.p011ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void AndroidView(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r26, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.viewinterop.AndroidView_androidKt.AndroidView(r6.c, androidx.compose.ui.Modifier, r6.c, r6.c, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }
}
