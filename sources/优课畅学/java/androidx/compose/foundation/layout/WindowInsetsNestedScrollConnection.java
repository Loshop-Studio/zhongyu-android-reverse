package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.InterfaceC9212n;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

@RequiresApi(30)
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private InterfaceC9212n animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private InterfaceC8845j continuation;
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
        InterfaceC8845j interfaceC8845j = this.continuation;
        if (interfaceC8845j != null) {
            interfaceC8845j.mo14870g(null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                public final void invoke(Throwable th) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }
            });
        }
        this.continuation = null;
        InterfaceC9212n interfaceC9212n = this.animationJob;
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(new WindowInsetsAnimationCancelledException());
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
    public final java.lang.Object m20931flinghuYlsQE(long r26, float r28, boolean r29, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.unit.Velocity> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m20931flinghuYlsQE(long, float, boolean, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(InterfaceC9324c<? super WindowInsetsAnimationController> interfaceC9324c) {
        Object objM16372x = this.animationController;
        if (objM16372x == null) {
            C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
            c9155c.m16343D();
            this.continuation = c9155c;
            requestAnimationController();
            objM16372x = c9155c.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
        }
        return objM16372x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, AbstractC1454e.m841a(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m20932scroll8S9VItk(long j10, float f10) {
        InterfaceC9212n interfaceC9212n = this.animationJob;
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f10 != 0.0f) {
            if (this.windowInsets.isVisible() != (f10 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo20884consumedOffsetsMKHz9U(j10);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (f10 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m24051getZeroF1C5BW0();
                }
                float f11 = iValueOf3 + f10 + this.partialConsumption;
                int iM13518m = AbstractC8323h.m13518m(Math.round(f11), iValueOf, iValueOf2);
                this.partialConsumption = f11 - Math.round(f11);
                if (iM13518m != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iM13518m), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo20884consumedOffsetsMKHz9U(j10);
            }
        }
        return Offset.Companion.m24051getZeroF1C5BW0();
    }

    public final void dispose() {
        InterfaceC8845j interfaceC8845j = this.continuation;
        if (interfaceC8845j != null) {
            interfaceC8845j.mo14870g(null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                public final void invoke(Throwable th) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }
            });
        }
        InterfaceC9212n interfaceC9212n = this.animationJob;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!AbstractC9133u.m16128b(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
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

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo20627onPostFlingRZ2iAVY(long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return m20931flinghuYlsQE(j11, this.sideCalculator.showMotion(Velocity.m27137getXimpl(j11), Velocity.m27138getYimpl(j11)), true, interfaceC9324c);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return m20932scroll8S9VItk(j11, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (4294967295L & j11))));
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo20933onPreFlingQWom1Mo(long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return m20931flinghuYlsQE(j10, this.sideCalculator.hideMotion(Velocity.m27137getXimpl(j10), Velocity.m27138getYimpl(j10)), false, interfaceC9324c);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo20934onPreScrollOzD1aCk(long j10, int i10) {
        return m20932scroll8S9VItk(j10, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (4294967295L & j10))));
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        InterfaceC8845j interfaceC8845j = this.continuation;
        if (interfaceC8845j != null) {
            interfaceC8845j.mo14870g(windowInsetsAnimationController, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                public final void invoke(Throwable th) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }
            });
        }
        this.continuation = null;
    }
}
