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
import p023b5.C5120j;
import p179m5.AbstractC8970f;
import p179m5.InterfaceC8976l;
import p243s5.InterfaceC9476d;
import p272v4.C9765d;
import p282w4.C9824d;
import p282w4.InterfaceC9823c;

/* loaded from: classes4.dex */
public final class PlayPageControl extends AbstractC8970f {

    /* renamed from: s */
    public final Lazy f9019s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl(InterfaceC8976l playControl, C5120j renderLayer) {
        super(playControl, renderLayer);
        Intrinsics.checkNotNullParameter(playControl, "playControl");
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f9019s = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.play.PlayPageControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: A */
    public static final void m7914A(PlayPageControl this$0, Function0 callBack) throws IllegalStateException, InterruptedException, IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        if (this$0.status() != PlayStatus.RECORD_END) {
            callBack.invoke();
            return;
        }
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " initCommandThread"));
        this$0.m14314o().mo7894l();
        this$0.m14312m().mo7894l();
        this$0.m14317r().m17351i();
        this$0.m14315p().m189P();
        Thread.sleep(50L);
        this$0.m14314o().m12319n(this$0.m14315p());
        this$0.m14314o().m12323r(this$0.m14313n());
        this$0.m14314o().m12320o(this$0.m14317r());
        this$0.m14314o().m14332E(this$0.m14316q());
        this$0.m14314o().m14331D(this$0.m14319t());
        this$0.m14312m().m12319n(this$0.m14315p());
        this$0.m14312m().m12323r(this$0.m14313n());
        this$0.m14312m().m7889H(this$0.m14316q());
        this$0.m14312m().m7888G(this$0.m14319t());
        Thread.sleep(50L);
        this$0.m14320u();
        callBack.invoke();
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: a */
    public void mo7916a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        m14311l().m16704w(motionEvent);
    }

    @Override // p179m5.InterfaceC8977m
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC9823c interfaceC9823cM16700s = m14311l().m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            ((C9824d) interfaceC9823cM16700s).m16727n(f10, f11);
        }
    }

    @Override // p179m5.InterfaceC8977m
    public void areaMoveStart() {
        InterfaceC9823c interfaceC9823cM16700s = m14311l().m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            ((C9824d) interfaceC9823cM16700s).m16728o();
        }
    }

    @Override // p179m5.InterfaceC8977m
    public void areaMoving(Float f10, Float f11) {
        InterfaceC9823c interfaceC9823cM16700s = m14311l().m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            ((C9824d) interfaceC9823cM16700s).m16729p(f10, f11);
        }
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: c */
    public Bitmap mo7917c() {
        return m14315p().m191R();
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: d */
    public void mo7918d(long j9, Function0 onSuccess, Function1 onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        m7922z(new PlayPageControl$seekTo$1(this, j9, onSuccess, onError));
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: e */
    public String mo7919e() {
        return m14316q();
    }

    @Override // p179m5.InterfaceC8977m
    /* renamed from: g */
    public void mo7920g(float f10) throws IllegalStateException {
        if (f10 > 0.0f) {
            m14318s().m16538b(f10);
            m14312m().m7890I(f10);
        }
    }

    @Override // p179m5.InterfaceC8977m
    public long getDuration() {
        return m14319t();
    }

    @Override // p179m5.InterfaceC8977m
    public float getMoveHorizontalProgress() {
        InterfaceC9823c interfaceC9823cM16700s = m14311l().m16700s();
        if (interfaceC9823cM16700s instanceof C9824d) {
            return ((C9824d) interfaceC9823cM16700s).m16732u();
        }
        return 0.0f;
    }

    @Override // p179m5.InterfaceC8977m
    public int getMoveMaxHeightTimes() {
        return m14311l().mo16692k().m16519z().m16523b();
    }

    @Override // p179m5.InterfaceC8977m
    public int getMoveMaxWidthTimes() {
        return m14311l().mo16692k().m16519z().m16524c();
    }

    @Override // p179m5.InterfaceC8977m
    public float getMoveVerticalProgress() {
        InterfaceC9823c interfaceC9823cM16700s = m14311l().m16700s();
        Log.i("MoveProgress", String.valueOf(interfaceC9823cM16700s));
        if (interfaceC9823cM16700s instanceof C9824d) {
            return ((C9824d) interfaceC9823cM16700s).m16733w();
        }
        return 0.0f;
    }

    @Override // p179m5.InterfaceC8977m
    public void pause() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_START || status() == PlayStatus.RECORD_RESUME) {
            m14314o().mo7893k();
            m14312m().mo7893k();
        }
    }

    @Override // p179m5.InterfaceC8977m
    public void resume() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_PAUSE) {
            m14314o().mo7895m();
            m14312m().mo7895m();
            m14320u();
        }
    }

    @Override // p179m5.InterfaceC8977m
    public void setAreaMoveListener(InterfaceC9476d interfaceC9476d) {
        m14311l().m16705x(interfaceC9476d);
    }

    @Override // p179m5.InterfaceC8977m
    public void setScaleEnable(boolean z9) {
        C9765d c9765dM16519z = m14311l().mo16692k().m16519z();
        c9765dM16519z.m16533l(true);
        c9765dM16519z.m16530i(z9);
        c9765dM16519z.m16536o(z9);
        c9765dM16519z.m16535n(z9);
    }

    @Override // p179m5.InterfaceC8977m
    public void setTranslateEnable(boolean z9) {
        C9765d c9765dM16519z = m14311l().mo16692k().m16519z();
        c9765dM16519z.m16533l(true);
        c9765dM16519z.m16530i(z9);
        c9765dM16519z.m16536o(z9);
    }

    @Override // p179m5.InterfaceC8977m
    public void start() {
        m7922z(new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.PlayPageControl.start.1
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
                PlayPageControl.this.m14314o().mo12324t();
                PlayPageControl.this.m14312m().mo12324t();
            }
        });
    }

    /* renamed from: y */
    public final ExecutorService m7921y() {
        return (ExecutorService) this.f9019s.getValue();
    }

    /* renamed from: z */
    public final void m7922z(final Function0 function0) {
        m7921y().submit(new Runnable() { // from class: m5.r
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, InterruptedException, IOException {
                PlayPageControl.m7914A(this.f15090a, function0);
            }
        });
    }
}
