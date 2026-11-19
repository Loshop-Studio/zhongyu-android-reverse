package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13413d2 = {"<anonymous>", "", "invoke"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class PlayPageControl$seekTo$1 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ PlayPageControl f9020a;

    /* renamed from: b */
    public final /* synthetic */ long f9021b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f9022c;

    /* renamed from: d */
    public final /* synthetic */ Function1 f9023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl$seekTo$1(PlayPageControl playPageControl, long j9, Function0 function0, Function1 function1) {
        super(0);
        this.f9020a = playPageControl;
        this.f9021b = j9;
        this.f9022c = function0;
        this.f9023d = function1;
    }

    /* renamed from: g */
    public static final void m7925g(Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke();
    }

    /* renamed from: k */
    public static final void m7926k(Function1 onError, Throwable it) {
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
        Object objM24758constructorimpl;
        final PlayPageControl playPageControl = this.f9020a;
        final long j9 = this.f9021b;
        try {
            Result.Companion companion = Result.INSTANCE;
            System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " seekTo"));
            playPageControl.m14314o().mo7893k();
            playPageControl.m14312m().mo7893k();
            Thread.sleep(100L);
            playPageControl.m14315p().mo207j(false);
            playPageControl.m14317r().m17351i();
            playPageControl.m14315p().m189P();
            Thread.sleep(100L);
            playPageControl.m14312m().m7887F(j9, new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1$1$1
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
                    playPageControl.m14314o().m14330C(j9);
                    if (!playPageControl.m14315p().mo181H()) {
                        playPageControl.m14315p().mo207j(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        System.out.println((Object) ("快进结束后渲染开始 " + System.currentTimeMillis()));
                        playPageControl.m14315p().mo202e();
                        System.out.println((Object) ("快进结束后渲染结束 " + (System.currentTimeMillis() - jCurrentTimeMillis)));
                    }
                    Thread.sleep(50L);
                }
            });
            objM24758constructorimpl = Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        final Function0 function0 = this.f9022c;
        if (Result.m24765isSuccessimpl(objM24758constructorimpl)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m7925g(function0);
                }
            });
        }
        final Function1 function1 = this.f9023d;
        final Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.b
                @Override // java.lang.Runnable
                public final void run() {
                    PlayPageControl$seekTo$1.m7926k(function1, thM24761exceptionOrNullimpl);
                }
            });
        }
    }
}
