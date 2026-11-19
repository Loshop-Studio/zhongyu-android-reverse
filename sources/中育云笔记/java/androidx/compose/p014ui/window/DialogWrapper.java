package androidx.compose.p014ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.platform.AbstractComposeView;
import androidx.compose.p014ui.platform.ViewRootForInspector;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.CompositionContext;
import androidx.core.view.WindowCompat;
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

/* loaded from: classes2.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private InterfaceC9529a onDismissRequest;
    private DialogProperties properties;

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

    public DialogWrapper(InterfaceC9529a interfaceC9529a, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.getDecorFitsSystemWindows() ? C2638R.style.DialogWindowTheme : C2638R.style.FloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = interfaceC9529a;
        this.properties = dialogProperties;
        this.composeView = view;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(8);
        this.maxSupportedElevation = fM33501constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(C2638R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo27099toPx0680j_4(fM33501constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout, ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new InterfaceC9540l() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OnBackPressedCallback) obj);
                return C10786q.f26013a;
            }

            public final void invoke(OnBackPressedCallback onBackPressedCallback) {
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i11);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean zShouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
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

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress() || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.isInsideContent(motionEvent)) {
            return zOnTouchEvent;
        }
        this.onDismissRequest.invoke();
        return true;
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
        this.dialogLayout.setContent(compositionContext, interfaceC9544p);
    }

    public final void updateParameters(InterfaceC9529a interfaceC9529a, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        this.onDismissRequest = interfaceC9529a;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = dialogProperties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(dialogProperties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(dialogProperties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(decorFitsSystemWindows ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }
}
