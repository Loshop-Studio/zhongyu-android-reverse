package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.play.PlayControl;
import com.zykj.board.EzyPageRouter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p155l4.C8505j;
import p166m4.C8550b;
import p275w4.InterfaceC9747l;
import p275w4.InterfaceC9748m;

/* loaded from: classes4.dex */
public final class PlayControl implements InterfaceC9747l {

    /* renamed from: a */
    public final C8505j f7729a;

    /* renamed from: b */
    public final ArrayList f7730b;

    /* renamed from: c */
    public int f7731c;

    /* renamed from: d */
    public String f7732d;

    /* renamed from: e */
    public final Lazy f7733e;

    public PlayControl(C8505j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f7729a = renderLayer;
        this.f7730b = new ArrayList();
        this.f7731c = -1;
        this.f7732d = "";
        this.f7733e = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.play.PlayControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: j */
    public static final void m6791j(final PlayControl this$0, String path, final Function1 failCallBack, final Function1 successCallBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(successCallBack, "$successCallBack");
        LogUtils.m3239i("PlayControl:loadPath 加载播放微课");
        try {
            this$0.f7732d = path;
            List<EzyPageRouter.PageRouter.PageInfo> listM7777o = C8550b.f14183a.m14081k(path).m7777o();
            Intrinsics.checkNotNullExpressionValue(listM7777o, "SourceLoad.getPageRouter(path).pageInfoList");
            for (EzyPageRouter.PageRouter.PageInfo pageInfo : listM7777o) {
                PlayPageControl playPageControl = new PlayPageControl(this$0, this$0.f7729a);
                try {
                    String name = pageInfo.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "info.name");
                    playPageControl.mo16315h(name);
                    this$0.f7730b.add(playPageControl);
                } catch (Exception e10) {
                    this$0.m6801o(new Runnable() { // from class: w4.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlayControl.m6792k(failCallBack, e10);
                        }
                    });
                    return;
                }
            }
            this$0.m6801o(new Runnable() { // from class: w4.p
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m6793l(successCallBack, this$0);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            this$0.m6801o(new Runnable() { // from class: w4.q
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m6794m(failCallBack, e11);
                }
            });
        }
    }

    /* renamed from: k */
    public static final void m6792k(Function1 failCallBack, Exception e10) {
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(e10, "$e");
        failCallBack.invoke(e10);
    }

    /* renamed from: l */
    public static final void m6793l(Function1 successCallBack, PlayControl this$0) {
        Intrinsics.checkNotNullParameter(successCallBack, "$successCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        successCallBack.invoke(this$0.f7730b);
    }

    /* renamed from: m */
    public static final void m6794m(Function1 failCallBack, Exception e10) {
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(e10, "$e");
        failCallBack.invoke(e10);
    }

    @Override // p275w4.InterfaceC9747l
    /* renamed from: a */
    public InterfaceC9748m mo6795a() {
        int i10 = this.f7731c;
        if (i10 < 0 || i10 >= this.f7730b.size()) {
            return null;
        }
        return (InterfaceC9748m) this.f7730b.get(this.f7731c);
    }

    @Override // p275w4.InterfaceC9747l
    /* renamed from: b */
    public String mo6796b() {
        return this.f7732d;
    }

    @Override // p275w4.InterfaceC9747l
    /* renamed from: c */
    public boolean mo6797c(int i10, Function0 callback, Function0 onError) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i10 < 0 || i10 >= this.f7730b.size()) {
            onError.invoke();
            return false;
        }
        int i11 = this.f7731c;
        if (i11 != -1) {
            ((InterfaceC9748m) this.f7730b.get(i11)).hide();
        }
        this.f7731c = i10;
        ((InterfaceC9748m) this.f7730b.get(i10)).mo16313b(callback);
        return true;
    }

    @Override // p275w4.InterfaceC9747l
    /* renamed from: d */
    public void mo6798d(final String path, final Function1 successCallBack, final Function1 failCallBack) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(successCallBack, "successCallBack");
        Intrinsics.checkNotNullParameter(failCallBack, "failCallBack");
        if (new File(path).exists()) {
            m6799i().submit(new Runnable() { // from class: w4.n
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m6791j(this.f17162a, path, failCallBack, successCallBack);
                }
            });
        } else {
            failCallBack.invoke(new FileNotFoundException(path));
        }
    }

    /* renamed from: i */
    public final ExecutorService m6799i() {
        return (ExecutorService) this.f7733e.getValue();
    }

    /* renamed from: n */
    public void m6800n() {
        ArrayList arrayList = this.f7730b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC9748m) obj).release();
        }
        this.f7730b.clear();
    }

    /* renamed from: o */
    public final void m6801o(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
