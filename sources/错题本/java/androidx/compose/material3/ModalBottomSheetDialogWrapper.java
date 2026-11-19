package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.C6892ViewTreeLifecycleOwner;
import android.view.C6893ViewTreeViewModelStoreOwner;
import android.view.C6895ViewTreeSavedStateRegistryOwner;
import android.view.ComponentDialog;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.OnBackPressedCallback;
import android.view.OnBackPressedDispatcherKt;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p011ui.C2075R;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.p011ui.platform.ViewRootForInspector;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.SecureFlagPolicy;
import androidx.compose.runtime.CompositionContext;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\"¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5110d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogWrapper;", "Landroidx/activity/ComponentDialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Lkotlin/Function0;", "Ld6/s;", "onDismissRequest", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Ljava/util/UUID;", "dialogId", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/v;", "scope", "", "darkThemeEnabled", "<init>", "(Lr6/a;Landroidx/compose/material3/ModalBottomSheetProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/v;Z)V", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "Landroidx/compose/runtime/CompositionContext;", "parentComposition", "Landroidx/compose/runtime/Composable;", "children", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lr6/e;)V", "updateParameters", "(Lr6/a;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/ui/unit/LayoutDirection;)V", "disposeComposition", "()V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "Lr6/a;", "Landroidx/compose/material3/ModalBottomSheetProperties;", "Landroid/view/View;", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "dialogLayout", "Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/unit/Dp;", "maxSupportedElevation", "F", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n148#2:641\n1#3:642\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogWrapper\n*L\n481#1:641\n*E\n"})
/* loaded from: classes.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {

    @NotNull
    private final View composeView;

    @NotNull
    private final ModalBottomSheetDialogLayout dialogLayout;
    private final float maxSupportedElevation;

    @NotNull
    private InterfaceC6469a onDismissRequest;

    @NotNull
    private ModalBottomSheetProperties properties;

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public ModalBottomSheetDialogWrapper(@NotNull InterfaceC6469a interfaceC6469a, @NotNull ModalBottomSheetProperties modalBottomSheetProperties, @NotNull View view, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull UUID uuid, @NotNull Animatable<Float, AnimationVector1D> animatable, @NotNull InterfaceC6009v interfaceC6009v, boolean z8) {
        super(new ContextThemeWrapper(view.getContext(), C1776R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.onDismissRequest = interfaceC6469a;
        this.properties = modalBottomSheetProperties;
        this.composeView = view;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(8);
        this.maxSupportedElevation = fM13305constructorimpl;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.properties.getShouldDismissOnBackPress(), this.onDismissRequest, animatable, interfaceC6009v);
        modalBottomSheetDialogLayout.setTag(C2075R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.mo6903toPx0680j_4(fM13305constructorimpl));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view2, @NotNull Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        C6892ViewTreeLifecycleOwner.set(modalBottomSheetDialogLayout, C6892ViewTreeLifecycleOwner.get(view));
        C6893ViewTreeViewModelStoreOwner.set(modalBottomSheetDialogLayout, C6893ViewTreeViewModelStoreOwner.get(view));
        C6895ViewTreeSavedStateRegistryOwner.set(modalBottomSheetDialogLayout, C6895ViewTreeSavedStateRegistryOwner.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setAppearanceLightStatusBars(!z8);
        insetsController.setAppearanceLightNavigationBars(!z8);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new InterfaceC6471c() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper.3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OnBackPressedCallback) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull OnBackPressedCallback onBackPressedCallback) {
                if (ModalBottomSheetDialogWrapper.this.properties.getShouldDismissOnBackPress()) {
                    ModalBottomSheetDialogWrapper.this.onDismissRequest.invoke();
                }
            }
        }, 2, null);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i8 = 1;
        if (i == 1) {
            i8 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i8);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean zShouldApplySecureFlag = ModalBottomSheet_androidKt.shouldApplySecureFlag(securePolicy, ModalBottomSheet_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        AbstractC5830k.m5327d(window);
        window.setFlags(zShouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.p011ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    public final void setContent(@NotNull CompositionContext parentComposition, @NotNull InterfaceC6473e children) {
        this.dialogLayout.setContent(parentComposition, children);
    }

    public final void updateParameters(@NotNull InterfaceC6469a onDismissRequest, @NotNull ModalBottomSheetProperties properties, @NotNull LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        setSecurePolicy(properties.getSecurePolicy());
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
