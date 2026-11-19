package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.AbstractC0089i;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.p011ui.window.DialogWindowProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u000256BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)RA\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u00192\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\u001b\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00103\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&¨\u00067"}, m5110d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "", "shouldDismissOnBackPress", "Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/v;", "scope", "<init>", "(Landroid/content/Context;Landroid/view/Window;ZLr6/a;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/v;)V", "maybeRegisterBackCallback", "()V", "maybeUnregisterBackCallback", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lr6/e;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "Z", "getShouldDismissOnBackPress", "()Z", "Lr6/a;", "Landroidx/compose/animation/core/Animatable;", "Lkotlinx/coroutines/v;", "<set-?>", "content$delegate", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lr6/e;", "(Lr6/e;)V", "", "backCallback", "Ljava/lang/Object;", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "Api33Impl", "Api34Impl", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,640:1\n81#2:641\n107#2,2:642\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n*L\n336#1:641\n336#1:642,2\n*E\n"})
/* loaded from: classes.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {

    @Nullable
    private Object backCallback;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState content;

    @NotNull
    private final InterfaceC6469a onDismissRequest;

    @NotNull
    private final Animatable<Float, AnimationVector1D> predictiveBackProgress;

    @NotNull
    private final InterfaceC6009v scope;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;

    @NotNull
    private final Window window;

    @RequiresApi(33)
    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;", "", "<init>", "()V", "Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "createBackCallback", "(Lr6/a;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "maybeRegisterBackCallback", "(Landroid/view/View;Ljava/lang/Object;)V", "maybeUnregisterBackCallback", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Api33Impl {

        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        @DoNotInline
        @NotNull
        public static final OnBackInvokedCallback createBackCallback(@NotNull final InterfaceC6469a onDismissRequest) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.d
                public final void onBackInvoked() {
                    onDismissRequest.invoke();
                }
            };
        }

        @JvmStatic
        @DoNotInline
        public static final void maybeRegisterBackCallback(@NotNull View view, @Nullable Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) backCallback);
        }

        @JvmStatic
        @DoNotInline
        public static final void maybeUnregisterBackCallback(@NotNull View view, @Nullable Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        }
    }

    @RequiresApi(34)
    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api34Impl;", "", "<init>", "()V", "Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/v;", "scope", "Landroid/window/OnBackAnimationCallback;", "createBackCallback", "(Lr6/a;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/v;)Landroid/window/OnBackAnimationCallback;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @JvmStatic
        @DoNotInline
        @NotNull
        public static final OnBackAnimationCallback createBackCallback(@NotNull final InterfaceC6469a onDismissRequest, @NotNull final Animatable<Float, AnimationVector1D> predictiveBackProgress, @NotNull final InterfaceC6009v scope) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    AbstractC6014x.m5651v(scope, null, null, new C1712x164d357d(predictiveBackProgress, null), 3);
                }

                public void onBackInvoked() {
                    onDismissRequest.invoke();
                }

                public void onBackProgressed(@NotNull BackEvent backEvent) {
                    AbstractC6014x.m5651v(scope, null, null, new C1713x20c62d1a(predictiveBackProgress, backEvent, null), 3);
                }

                public void onBackStarted(@NotNull BackEvent backEvent) {
                    AbstractC6014x.m5651v(scope, null, null, new C1714x9979ac6d(predictiveBackProgress, backEvent, null), 3);
                }
            };
        }
    }

    public ModalBottomSheetDialogLayout(@NotNull Context context, @NotNull Window window, boolean z8, @NotNull InterfaceC6469a interfaceC6469a, @NotNull Animatable<Float, AnimationVector1D> animatable, @NotNull InterfaceC6009v interfaceC6009v) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z8;
        this.onDismissRequest = interfaceC6469a;
        this.predictiveBackProgress = animatable;
        this.scope = interfaceC6009v;
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m8359getLambda2$material3_release(), null, 2, null);
    }

    private final InterfaceC6473e getContent() {
        return (InterfaceC6473e) this.content.getValue();
    }

    private final void maybeRegisterBackCallback() {
        int i;
        if (!this.shouldDismissOnBackPress || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = i >= 34 ? AbstractC0089i.m169m(Api34Impl.createBackCallback(this.onDismissRequest, this.predictiveBackProgress, this.scope)) : Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setContent(InterfaceC6473e interfaceC6473e) {
        this.content.setValue(interfaceC6473e);
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    @Composable
    public void Content(@Nullable Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(576708319);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576708319, i8, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ModalBottomSheetDialogLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    @Override // androidx.compose.p011ui.window.DialogWindowProvider
    @NotNull
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull InterfaceC6473e content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
