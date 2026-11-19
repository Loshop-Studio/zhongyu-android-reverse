package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.Velocity;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@RequiresApi(30)
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private InterfaceC10045g animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private InterfaceC11125j continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f10) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(f10)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        InterfaceC11125j interfaceC11125j = this.continuation;
        if (interfaceC11125j != null) {
            interfaceC11125j.mo20520c(null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                public final void invoke(Throwable th) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }
            });
        }
        this.continuation = null;
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(new WindowInsetsAnimationCancelledException());
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
    public final java.lang.Object m27533flinghuYlsQE(long r26, float r28, boolean r29, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m27533flinghuYlsQE(long, float, boolean, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(InterfaceC11588c<? super WindowInsetsAnimationController> interfaceC11588c) {
        Object objM20538x = this.animationController;
        if (objM20538x == null) {
            C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
            c9997c.m20503F();
            this.continuation = c9997c;
            requestAnimationController();
            objM20538x = c9997c.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
        }
        return objM20538x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, AbstractC1484e.m918a(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m27534scroll8S9VItk(long j10, float f10) {
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f10 != 0.0f) {
            if (this.windowInsets.isVisible() != (f10 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo27486consumedOffsetsMKHz9U(j10);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (f10 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m30653getZeroF1C5BW0();
                }
                float f11 = iValueOf3 + f10 + this.partialConsumption;
                int iM21761n = AbstractC10410o.m21761n(Math.round(f11), iValueOf, iValueOf2);
                this.partialConsumption = f11 - Math.round(f11);
                if (iM21761n != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iM21761n), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo27486consumedOffsetsMKHz9U(j10);
            }
        }
        return Offset.Companion.m30653getZeroF1C5BW0();
    }

    public final void dispose() {
        InterfaceC11125j interfaceC11125j = this.continuation;
        if (interfaceC11125j != null) {
            interfaceC11125j.mo20520c(null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                public final void invoke(Throwable th) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }
            });
        }
        InterfaceC10045g interfaceC10045g = this.animationJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!AbstractC9979u.m20289b(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo27229onPostFlingRZ2iAVY(long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return m27533flinghuYlsQE(j11, this.sideCalculator.showMotion(Velocity.m33739getXimpl(j11), Velocity.m33740getYimpl(j11)), true, interfaceC11588c);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return m27534scroll8S9VItk(j11, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11))));
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo27535onPreFlingQWom1Mo(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return m27533flinghuYlsQE(j10, this.sideCalculator.hideMotion(Velocity.m33739getXimpl(j10), Velocity.m33740getYimpl(j10)), false, interfaceC11588c);
    }

    @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo27536onPreScrollOzD1aCk(long j10, int i10) {
        return m27534scroll8S9VItk(j10, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (4294967295L & j10))));
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        InterfaceC11125j interfaceC11125j = this.continuation;
        if (interfaceC11125j != null) {
            interfaceC11125j.mo20520c(windowInsetsAnimationController, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                public final void invoke(Throwable th) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }
            });
        }
        this.continuation = null;
    }
}
