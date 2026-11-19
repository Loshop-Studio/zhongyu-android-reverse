package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public final class PlayPageControl$seekTo$1 extends Lambda implements InterfaceC9529a {

    /* renamed from: c */
    public final /* synthetic */ PlayPageControl f18578c;

    /* renamed from: d */
    public final /* synthetic */ long f18579d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9529a f18580e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9540l f18581f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl$seekTo$1(PlayPageControl playPageControl, long j10, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l) {
        super(0);
        this.f18578c = playPageControl;
        this.f18579d = j10;
        this.f18580e = interfaceC9529a;
        this.f18581f = interfaceC9540l;
    }

    /* renamed from: d */
    public static final void m14549d(InterfaceC9529a onSuccess) {
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        onSuccess.invoke();
    }

    /* renamed from: e */
    public static final void m14550e(InterfaceC9540l onError, Throwable it) {
        AbstractC9979u.m20294g(onError, "$onError");
        AbstractC9979u.m20294g(it, "$it");
        onError.invoke(it);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m34014invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m34014invoke() {
        Object objM20054c;
        final PlayPageControl playPageControl = this.f18578c;
        final long j10 = this.f18579d;
        try {
            Result.C9921a c9921a = Result.f23263d;
            System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " seekTo"));
            playPageControl.m18740o().mo14517k();
            playPageControl.m18738m().mo14517k();
            Thread.sleep(100L);
            playPageControl.m18741p().mo25452l(false);
            playPageControl.m18743r().m25318i();
            playPageControl.m18741p().m25432R();
            Thread.sleep(100L);
            playPageControl.m18738m().m14511F(j10, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException, IOException {
                    m34015invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m34015invoke() throws InterruptedException, IOException {
                    playPageControl.m18740o().m18758C(j10);
                    if (!playPageControl.m18741p().mo25423I()) {
                        playPageControl.m18741p().mo25452l(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        System.out.println((Object) ("快进结束后渲染开始 " + System.currentTimeMillis()));
                        playPageControl.m18741p().mo25447g();
                        System.out.println((Object) ("快进结束后渲染结束 " + (System.currentTimeMillis() - jCurrentTimeMillis)));
                    }
                    Thread.sleep(50L);
                }
            });
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        final InterfaceC9529a interfaceC9529a = this.f18580e;
        if (Result.m20059k(objM20054c)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m14549d(interfaceC9529a);
                }
            });
        }
        final InterfaceC9540l interfaceC9540l = this.f18581f;
        final Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.b
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m14550e(interfaceC9540l, thM20056e);
                }
            });
        }
    }
}
