package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.platform.AbstractComposeView;
import androidx.compose.p014ui.platform.ViewRootForInspector;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.SecureFlagPolicy;
import androidx.compose.runtime.CompositionContext;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.InterfaceC11122i0;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final ModalBottomSheetDialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private InterfaceC9529a onDismissRequest;
    private ModalBottomSheetProperties properties;

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

    public ModalBottomSheetDialogWrapper(InterfaceC9529a interfaceC9529a, ModalBottomSheetProperties modalBottomSheetProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable<Float, AnimationVector1D> animatable, InterfaceC11122i0 interfaceC11122i0, boolean z10) {
        super(new ContextThemeWrapper(view.getContext(), C2296R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = interfaceC9529a;
        this.properties = modalBottomSheetProperties;
        this.composeView = view;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(8);
        this.maxSupportedElevation = fM33501constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.properties.getShouldDismissOnBackPress(), this.onDismissRequest, animatable, interfaceC11122i0);
        modalBottomSheetDialogLayout.setTag(C2638R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.mo27099toPx0680j_4(fM33501constructorimpl));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        ViewTreeLifecycleOwner.set(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(modalBottomSheetDialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setAppearanceLightStatusBars(!z10);
        insetsController.setAppearanceLightNavigationBars(!z10);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OnBackPressedCallback) obj);
                return C10786q.f26013a;
            }

            public final void invoke(OnBackPressedCallback onBackPressedCallback) {
                if (ModalBottomSheetDialogWrapper.this.properties.getShouldDismissOnBackPress()) {
                    ModalBottomSheetDialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.dialogLayout;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i11);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean zShouldApplySecureFlag = ModalBottomSheet_androidKt.shouldApplySecureFlag(secureFlagPolicy, ModalBottomSheet_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        AbstractC9979u.m20291d(window);
        window.setFlags(zShouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
        this.dialogLayout.setContent(compositionContext, interfaceC9544p);
    }

    public final void updateParameters(InterfaceC9529a interfaceC9529a, ModalBottomSheetProperties modalBottomSheetProperties, LayoutDirection layoutDirection) {
        this.onDismissRequest = interfaceC9529a;
        this.properties = modalBottomSheetProperties;
        setSecurePolicy(modalBottomSheetProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }
}
