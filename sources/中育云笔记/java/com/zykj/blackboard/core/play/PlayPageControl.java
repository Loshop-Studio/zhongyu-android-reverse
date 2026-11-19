package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.blackboard.core.play.PlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10216d;
import p178ha.AbstractC9509f;
import p178ha.InterfaceC9515l;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p307q9.C10764d;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p322r9.C10920d;
import p322r9.InterfaceC10919c;
import p390w9.C11719h;

/* loaded from: classes5.dex */
public final class PlayPageControl extends AbstractC9509f {

    /* renamed from: s */
    public final InterfaceC10773d f18577s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl(InterfaceC9515l playControl, C11719h renderLayer) {
        super(playControl, renderLayer);
        AbstractC9979u.m20294g(playControl, "playControl");
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f18577s = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$singleExecutor$2
            @Override // p181hd.InterfaceC9529a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: A */
    public static final void m14538A(PlayPageControl this$0, InterfaceC9529a callBack) throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callBack, "$callBack");
        if (this$0.status() != PlayStatus.RECORD_END) {
            callBack.invoke();
            return;
        }
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " initCommandThread"));
        this$0.m18740o().mo14518l();
        this$0.m18738m().mo14518l();
        this$0.m18743r().m25318i();
        this$0.m18741p().m25432R();
        Thread.sleep(50L);
        this$0.m18740o().m26652n(this$0.m18741p());
        this$0.m18740o().m26656r(this$0.m18739n());
        this$0.m18740o().m26653o(this$0.m18743r());
        this$0.m18740o().m18760E(this$0.m18742q());
        this$0.m18740o().m18759D(this$0.m18745t());
        this$0.m18738m().m26652n(this$0.m18741p());
        this$0.m18738m().m26656r(this$0.m18739n());
        this$0.m18738m().m14513H(this$0.m18742q());
        this$0.m18738m().m14512G(this$0.m18745t());
        Thread.sleep(50L);
        this$0.m18746u();
        callBack.invoke();
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: a */
    public void mo14540a(MotionEvent motionEvent) {
        AbstractC9979u.m20294g(motionEvent, "motionEvent");
        m18737l().m23781u(motionEvent);
    }

    @Override // p178ha.InterfaceC9516m
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC10919c interfaceC10919cM23778r = m18737l().m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            ((C10920d) interfaceC10919cM23778r).m23804n(f10, f11);
        }
    }

    @Override // p178ha.InterfaceC9516m
    public void areaMoveStart() {
        InterfaceC10919c interfaceC10919cM23778r = m18737l().m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            ((C10920d) interfaceC10919cM23778r).m23805o();
        }
    }

    @Override // p178ha.InterfaceC9516m
    public void areaMoving(Float f10, Float f11) {
        InterfaceC10919c interfaceC10919cM23778r = m18737l().m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            ((C10920d) interfaceC10919cM23778r).m23806p(f10, f11);
        }
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: c */
    public Bitmap mo14541c() {
        return m18741p().m25434T();
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: e */
    public void mo14542e(long j10, InterfaceC9529a onSuccess, InterfaceC9540l onError) {
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onError, "onError");
        m14546z(new PlayPageControl$seekTo$1(this, j10, onSuccess, onError));
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: f */
    public String mo14543f() {
        return m18742q();
    }

    @Override // p178ha.InterfaceC9516m
    /* renamed from: g */
    public void mo14544g(float f10) throws IllegalStateException {
        if (f10 > 0.0f) {
            m18744s().m22938b(f10);
            m18738m().m14514I(f10);
        }
    }

    @Override // p178ha.InterfaceC9516m
    public long getDuration() {
        return m18745t();
    }

    @Override // p178ha.InterfaceC9516m
    public float getMoveHorizontalProgress() {
        InterfaceC10919c interfaceC10919cM23778r = m18737l().m23778r();
        if (interfaceC10919cM23778r instanceof C10920d) {
            return ((C10920d) interfaceC10919cM23778r).m23809u();
        }
        return 0.0f;
    }

    @Override // p178ha.InterfaceC9516m
    public int getMoveMaxHeightTimes() {
        return m18737l().mo23770j().m22919z().m22923b();
    }

    @Override // p178ha.InterfaceC9516m
    public int getMoveMaxWidthTimes() {
        return m18737l().mo23770j().m22919z().m22924c();
    }

    @Override // p178ha.InterfaceC9516m
    public float getMoveVerticalProgress() {
        InterfaceC10919c interfaceC10919cM23778r = m18737l().m23778r();
        Log.i("MoveProgress", String.valueOf(interfaceC10919cM23778r));
        if (interfaceC10919cM23778r instanceof C10920d) {
            return ((C10920d) interfaceC10919cM23778r).m23810w();
        }
        return 0.0f;
    }

    @Override // p178ha.InterfaceC9516m
    public void pause() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_START || status() == PlayStatus.RECORD_RESUME) {
            m18740o().mo14517k();
            m18738m().mo14517k();
        }
    }

    @Override // p178ha.InterfaceC9516m
    public void resume() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_PAUSE) {
            m18740o().mo14519m();
            m18738m().mo14519m();
            m18746u();
        }
    }

    @Override // p178ha.InterfaceC9516m
    public void setAreaMoveListener(InterfaceC10216d interfaceC10216d) {
        m18737l().m23782v(interfaceC10216d);
    }

    @Override // p178ha.InterfaceC9516m
    public void setScaleEnable(boolean z10) {
        C10764d c10764dM22919z = m18737l().mo23770j().m22919z();
        c10764dM22919z.m22933l(true);
        c10764dM22919z.m22930i(z10);
        c10764dM22919z.m22936o(z10);
        c10764dM22919z.m22935n(z10);
    }

    @Override // p178ha.InterfaceC9516m
    public void setTranslateEnable(boolean z10) {
        C10764d c10764dM22919z = m18737l().mo23770j().m22919z();
        c10764dM22919z.m22933l(true);
        c10764dM22919z.m22930i(z10);
        c10764dM22919z.m22936o(z10);
    }

    @Override // p178ha.InterfaceC9516m
    public void start() {
        m14546z(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.play.PlayPageControl.start.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34016invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34016invoke() {
                PlayPageControl.this.m18740o().mo18762t();
                PlayPageControl.this.m18738m().mo18762t();
            }
        });
    }

    /* renamed from: y */
    public final ExecutorService m14545y() {
        return (ExecutorService) this.f18577s.getValue();
    }

    /* renamed from: z */
    public final void m14546z(final InterfaceC9529a interfaceC9529a) {
        m14545y().submit(new Runnable() { // from class: ha.r
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
                PlayPageControl.m14538A(this.f22044c, interfaceC9529a);
            }
        });
    }
}
