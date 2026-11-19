package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class PlayPageControl$seekTo$1 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ PlayPageControl f7736a;

    /* renamed from: b */
    public final /* synthetic */ long f7737b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f7738c;

    /* renamed from: d */
    public final /* synthetic */ Function1 f7739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl$seekTo$1(PlayPageControl playPageControl, long j10, Function0 function0, Function1 function1) {
        super(0);
        this.f7736a = playPageControl;
        this.f7737b = j10;
        this.f7738c = function0;
        this.f7739d = function1;
    }

    /* renamed from: j */
    public static final void m6813j(Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke();
    }

    /* renamed from: k */
    public static final void m6814k(Function1 onError, Throwable it) {
        Intrinsics.checkNotNullParameter(onError, "$onError");
        Intrinsics.checkNotNullParameter(it, "$it");
        onError.invoke(it);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object objM24299constructorimpl;
        final PlayPageControl playPageControl = this.f7736a;
        final long j10 = this.f7737b;
        try {
            Result.Companion companion = Result.INSTANCE;
            System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " seekTo"));
            playPageControl.m16320o().mo6781k();
            playPageControl.m16318m().mo6781k();
            Thread.sleep(100L);
            playPageControl.m16321p().mo13444i(false);
            playPageControl.m16323r().m13195i();
            playPageControl.m16321p().m13427N();
            Thread.sleep(100L);
            playPageControl.m16318m().m6775F(j10, new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException, IOException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws InterruptedException, IOException {
                    playPageControl.m16320o().m16336C(j10);
                    if (!playPageControl.m16321p().mo13421H()) {
                        playPageControl.m16321p().mo13444i(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        System.out.println((Object) ("快进结束后渲染开始 " + System.currentTimeMillis()));
                        playPageControl.m16321p().mo13440e();
                        System.out.println((Object) ("快进结束后渲染结束 " + (System.currentTimeMillis() - jCurrentTimeMillis)));
                    }
                    Thread.sleep(50L);
                }
            });
            objM24299constructorimpl = Result.m24299constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        final Function0 function0 = this.f7738c;
        if (Result.m24306isSuccessimpl(objM24299constructorimpl)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m6813j(function0);
                }
            });
        }
        final Function1 function1 = this.f7739d;
        final Throwable thM24302exceptionOrNullimpl = Result.m24302exceptionOrNullimpl(objM24299constructorimpl);
        if (thM24302exceptionOrNullimpl != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.b
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m6814k(function1, thM24302exceptionOrNullimpl);
                }
            });
        }
    }
}
