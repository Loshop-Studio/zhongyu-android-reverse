package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AbstractC0185f;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p013ui.platform.AbstractComposeView;
import androidx.compose.p013ui.window.DialogWindowProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private Object backCallback;
    private final MutableState content$delegate;
    private final InterfaceC10559a onDismissRequest;
    private final Animatable<Float, AnimationVector1D> predictiveBackProgress;
    private final InterfaceC8822b0 scope;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;
    private final Window window;

    @RequiresApi(33)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @DoNotInline
        public static final OnBackInvokedCallback createBackCallback(final InterfaceC10559a interfaceC10559a) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.d
                public final void onBackInvoked() {
                    interfaceC10559a.invoke();
                }
            };
        }

        @DoNotInline
        public static final void maybeRegisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        @DoNotInline
        public static final void maybeUnregisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    @RequiresApi(34)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public static final OnBackAnimationCallback createBackCallback(final InterfaceC10559a interfaceC10559a, final Animatable<Float, AnimationVector1D> animatable, final InterfaceC8822b0 interfaceC8822b0) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C2202x164d357d(animatable, null), 3, null);
                }

                public void onBackInvoked() {
                    interfaceC10559a.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C2203x20c62d1a(animatable, backEvent, null), 3, null);
                }

                public void onBackStarted(BackEvent backEvent) {
                    AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C2204x9979ac6d(animatable, backEvent, null), 3, null);
                }
            };
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z10, InterfaceC10559a interfaceC10559a, Animatable<Float, AnimationVector1D> animatable, InterfaceC8822b0 interfaceC8822b0) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z10;
        this.onDismissRequest = interfaceC10559a;
        this.predictiveBackProgress = animatable;
        this.scope = interfaceC8822b0;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m21953getLambda2$material3_release(), null, 2, null);
    }

    private final InterfaceC10574p getContent() {
        return (InterfaceC10574p) this.content$delegate.getValue();
    }

    private final void maybeRegisterBackCallback() {
        int i10;
        if (!this.shouldDismissOnBackPress || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = i10 >= 34 ? AbstractC0185f.m250a(Api34Impl.createBackCallback(this.onDismissRequest, this.predictiveBackProgress, this.scope)) : Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setContent(InterfaceC10574p interfaceC10574p) {
        this.content$delegate.setValue(interfaceC10574p);
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView
    @Composable
    public void Content(Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(576708319);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576708319, i11, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i12) {
                    ModalBottomSheetDialogLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    @Override // androidx.compose.p013ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC10574p interfaceC10574p) {
        setParentCompositionContext(compositionContext);
        setContent(interfaceC10574p);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
