package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.AbstractC0230a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

@RequiresApi(30)
@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010 \u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\"\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u000fJ\u0017\u0010:\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b<\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR \u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006X"}, m5110d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/SideCalculator;", "sideCalculator", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "Ld6/s;", "requestAnimationController", "()V", "Landroid/view/WindowInsetsAnimationController;", "getAnimationController", "(Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "available", "", "scrollAmount", "scroll-8S9VItk", "(JF)J", "scroll", "Landroidx/compose/ui/unit/Velocity;", "flingAmount", "", "towardShown", "fling-huYlsQE", "(JFZLh6/c;)Ljava/lang/Object;", "fling", "inset", "adjustInsets", "(F)V", "animationEnded", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLh6/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLh6/c;)Ljava/lang/Object;", "onPostFling", "controller", "", "types", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "dispose", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/foundation/layout/SideCalculator;", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "animationController", "Landroid/view/WindowInsetsAnimationController;", "isControllerRequested", "Z", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "partialConsumption", "F", "Lkotlinx/coroutines/w0;", "animationJob", "Lkotlinx/coroutines/w0;", "Lkotlinx/coroutines/f;", "continuation", "Lkotlinx/coroutines/f;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n314#2,11:709\n65#3:720\n69#3:723\n65#3:725\n69#3:728\n60#4:721\n70#4:724\n60#4:726\n70#4:729\n22#5:722\n22#5:727\n26#5:730\n26#5:731\n26#5:732\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n202#1:709,11\n209#1:720\n209#1:723\n216#1:725\n216#1:728\n209#1:721\n209#1:724\n216#1:726\n216#1:729\n209#1:722\n216#1:727\n256#1:730\n257#1:731\n370#1:732\n*E\n"})
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    @Nullable
    private WindowInsetsAnimationController animationController;

    @Nullable
    private InterfaceC6013w0 animationJob;

    @NotNull
    private final CancellationSignal cancellationSignal = new CancellationSignal();

    @Nullable
    private InterfaceC5895f continuation;

    @NotNull
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;

    @NotNull
    private final SideCalculator sideCalculator;

    @NotNull
    private final View view;

    @NotNull
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(@NotNull AndroidWindowInsets androidWindowInsets, @NotNull View view, @NotNull SideCalculator sideCalculator, @NotNull Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(inset)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        InterfaceC5895f interfaceC5895f = this.continuation;
        if (interfaceC5895f != null) {
            interfaceC5895f.mo4964d(null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                public final void invoke(Throwable th) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }
            });
        }
        this.continuation = null;
        InterfaceC6013w0 interfaceC6013w0 = this.animationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7337flinghuYlsQE(long r26, float r28, boolean r29, p075h6.InterfaceC5631c<? super androidx.compose.p011ui.unit.Velocity> r30) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m7337flinghuYlsQE(long, float, boolean, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(InterfaceC5631c<? super WindowInsetsAnimationController> interfaceC5631c) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        this.continuation = c5961g;
        requestAnimationController();
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, AbstractC0230a.m448h(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m7338scroll8S9VItk(long available, float scrollAmount) {
        InterfaceC6013w0 interfaceC6013w0 = this.animationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.isVisible() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo7290consumedOffsetsMKHz9U(available);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (scrollAmount > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.INSTANCE.m10457getZeroF1C5BW0();
                }
                float f = iValueOf3 + scrollAmount + this.partialConsumption;
                int iM5274m = AbstractC5806u.m5274m(Math.round(f), iValueOf, iValueOf2);
                this.partialConsumption = f - Math.round(f);
                if (iM5274m != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iM5274m), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo7290consumedOffsetsMKHz9U(available);
            }
        }
        return Offset.INSTANCE.m10457getZeroF1C5BW0();
    }

    public final void dispose() {
        InterfaceC5895f interfaceC5895f = this.continuation;
        if (interfaceC5895f != null) {
            interfaceC5895f.mo4964d(null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                public final void invoke(Throwable th) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }
            });
        }
        InterfaceC6013w0 interfaceC6013w0 = this.animationJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!AbstractC5830k.m5325b(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(@Nullable WindowInsetsAnimationController controller) {
        animationEnded();
    }

    public void onFinished(@NotNull WindowInsetsAnimationController controller) {
        animationEnded();
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo7033onPostFlingRZ2iAVY(long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return m7337flinghuYlsQE(j8, this.sideCalculator.showMotion(Velocity.m13543getXimpl(j8), Velocity.m13544getYimpl(j8)), true, interfaceC5631c);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
        return m7338scroll8S9VItk(available, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (available >> 32)), Float.intBitsToFloat((int) (4294967295L & available))));
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo7339onPreFlingQWom1Mo(long j7, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return m7337flinghuYlsQE(j7, this.sideCalculator.hideMotion(Velocity.m13543getXimpl(j7), Velocity.m13544getYimpl(j7)), false, interfaceC5631c);
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo7340onPreScrollOzD1aCk(long available, int source) {
        return m7338scroll8S9VItk(available, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (available >> 32)), Float.intBitsToFloat((int) (4294967295L & available))));
    }

    public void onReady(@NotNull WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        InterfaceC5895f interfaceC5895f = this.continuation;
        if (interfaceC5895f != null) {
            interfaceC5895f.mo4964d(controller, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                public final void invoke(Throwable th) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }
            });
        }
        this.continuation = null;
    }
}
