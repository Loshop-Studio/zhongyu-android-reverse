package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.blackboard.core.play.PlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5121d;
import p087f4.C7438c;
import p098g4.C7524d;
import p098g4.InterfaceC7523c;
import p155l4.C8505j;
import p275w4.AbstractC9741f;
import p275w4.InterfaceC9747l;

/* loaded from: classes4.dex */
public final class PlayPageControl extends AbstractC9741f {

    /* renamed from: s */
    public final Lazy f7735s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl(InterfaceC9747l playControl, C8505j renderLayer) {
        super(playControl, renderLayer);
        Intrinsics.checkNotNullParameter(playControl, "playControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f7735s = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.play.PlayPageControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: A */
    public static final void m6802A(PlayPageControl this$0, Function0 callBack) throws IllegalStateException, InterruptedException, IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        if (this$0.status() != PlayStatus.RECORD_END) {
            callBack.invoke();
            return;
        }
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " initCommandThread"));
        this$0.m16320o().mo6782l();
        this$0.m16318m().mo6782l();
        this$0.m16323r().m13195i();
        this$0.m16321p().m13427N();
        Thread.sleep(50L);
        this$0.m16320o().m14328n(this$0.m16321p());
        this$0.m16320o().m14332r(this$0.m16319n());
        this$0.m16320o().m14329o(this$0.m16323r());
        this$0.m16320o().m16338E(this$0.m16322q());
        this$0.m16320o().m16337D(this$0.m16325t());
        this$0.m16318m().m14328n(this$0.m16321p());
        this$0.m16318m().m14332r(this$0.m16319n());
        this$0.m16318m().m6777H(this$0.m16322q());
        this$0.m16318m().m6776G(this$0.m16325t());
        Thread.sleep(50L);
        this$0.m16326u();
        callBack.invoke();
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: a */
    public void mo6804a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        m16317l().m12258w(motionEvent);
    }

    @Override // p275w4.InterfaceC9748m
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC7523c interfaceC7523cM12254s = m16317l().m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            ((C7524d) interfaceC7523cM12254s).m12281n(f10, f11);
        }
    }

    @Override // p275w4.InterfaceC9748m
    public void areaMoveStart() {
        InterfaceC7523c interfaceC7523cM12254s = m16317l().m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            ((C7524d) interfaceC7523cM12254s).m12282o();
        }
    }

    @Override // p275w4.InterfaceC9748m
    public void areaMoving(Float f10, Float f11) {
        InterfaceC7523c interfaceC7523cM12254s = m16317l().m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            ((C7524d) interfaceC7523cM12254s).m12283p(f10, f11);
        }
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: c */
    public Bitmap mo6805c() {
        return m16321p().m13429P();
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: d */
    public void mo6806d(long j10, Function0 onSuccess, Function1 onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        m6810z(new PlayPageControl$seekTo$1(this, j10, onSuccess, onError));
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: e */
    public String mo6807e() {
        return m16322q();
    }

    @Override // p275w4.InterfaceC9748m
    /* renamed from: g */
    public void mo6808g(float f10) throws IllegalStateException {
        if (f10 > 0.0f) {
            m16324s().m12009b(f10);
            m16318m().m6778I(f10);
        }
    }

    @Override // p275w4.InterfaceC9748m
    public long getDuration() {
        return m16325t();
    }

    @Override // p275w4.InterfaceC9748m
    public float getMoveHorizontalProgress() {
        InterfaceC7523c interfaceC7523cM12254s = m16317l().m12254s();
        if (interfaceC7523cM12254s instanceof C7524d) {
            return ((C7524d) interfaceC7523cM12254s).m12286u();
        }
        return 0.0f;
    }

    @Override // p275w4.InterfaceC9748m
    public int getMoveMaxHeightTimes() {
        return m16317l().mo12246k().getMoveActionConfig().m11994b();
    }

    @Override // p275w4.InterfaceC9748m
    public int getMoveMaxWidthTimes() {
        return m16317l().mo12246k().getMoveActionConfig().m11995c();
    }

    @Override // p275w4.InterfaceC9748m
    public float getMoveVerticalProgress() {
        InterfaceC7523c interfaceC7523cM12254s = m16317l().m12254s();
        Log.i("MoveProgress", String.valueOf(interfaceC7523cM12254s));
        if (interfaceC7523cM12254s instanceof C7524d) {
            return ((C7524d) interfaceC7523cM12254s).m12287w();
        }
        return 0.0f;
    }

    @Override // p275w4.InterfaceC9748m
    public void pause() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_START || status() == PlayStatus.RECORD_RESUME) {
            m16320o().mo6781k();
            m16318m().mo6781k();
        }
    }

    @Override // p275w4.InterfaceC9748m
    public void resume() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_PAUSE) {
            m16320o().mo6783m();
            m16318m().mo6783m();
            m16326u();
        }
    }

    @Override // p275w4.InterfaceC9748m
    public void setAreaMoveListener(InterfaceC5121d interfaceC5121d) {
        m16317l().m12259x(interfaceC5121d);
    }

    @Override // p275w4.InterfaceC9748m
    public void setScaleEnable(boolean z9) {
        C7438c moveActionConfig = m16317l().mo12246k().getMoveActionConfig();
        moveActionConfig.m12004l(true);
        moveActionConfig.m12001i(z9);
        moveActionConfig.m12007o(z9);
        moveActionConfig.m12006n(z9);
    }

    @Override // p275w4.InterfaceC9748m
    public void setTranslateEnable(boolean z9) {
        C7438c moveActionConfig = m16317l().mo12246k().getMoveActionConfig();
        moveActionConfig.m12004l(true);
        moveActionConfig.m12001i(z9);
        moveActionConfig.m12007o(z9);
    }

    @Override // p275w4.InterfaceC9748m
    public void start() {
        m6810z(new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.PlayPageControl.start.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PlayPageControl.this.m16320o().mo14333t();
                PlayPageControl.this.m16318m().mo14333t();
            }
        });
    }

    /* renamed from: y */
    public final ExecutorService m6809y() {
        return (ExecutorService) this.f7735s.getValue();
    }

    /* renamed from: z */
    public final void m6810z(final Function0 function0) {
        m6809y().submit(new Runnable() { // from class: w4.r
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, InterruptedException, IOException {
                PlayPageControl.m6802A(this.f17172a, function0);
            }
        });
    }
}
