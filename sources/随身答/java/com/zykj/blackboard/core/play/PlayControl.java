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
import p023b5.C5120j;
import p034c5.C5230b;
import p179m5.InterfaceC8976l;
import p179m5.InterfaceC8977m;

/* loaded from: classes4.dex */
public final class PlayControl implements InterfaceC8976l {

    /* renamed from: a */
    public final C5120j f9013a;

    /* renamed from: b */
    public final ArrayList f9014b;

    /* renamed from: c */
    public int f9015c;

    /* renamed from: d */
    public String f9016d;

    /* renamed from: e */
    public final Lazy f9017e;

    public PlayControl(C5120j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f9013a = renderLayer;
        this.f9014b = new ArrayList();
        this.f9015c = -1;
        this.f9016d = "";
        this.f9017e = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.play.PlayControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: j */
    public static final void m7903j(final PlayControl this$0, String path, final Function1 failCallBack, final Function1 successCallBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(successCallBack, "$successCallBack");
        LogUtils.m2956i("PlayControl:loadPath 加载播放微课");
        try {
            this$0.f9016d = path;
            List<EzyPageRouter.PageRouter.PageInfo> listM8906q = C5230b.f2464a.m2363k(path).m8906q();
            Intrinsics.checkNotNullExpressionValue(listM8906q, "SourceLoad.getPageRouter(path).pageInfoList");
            for (EzyPageRouter.PageRouter.PageInfo pageInfo : listM8906q) {
                PlayPageControl playPageControl = new PlayPageControl(this$0, this$0.f9013a);
                try {
                    String name = pageInfo.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "info.name");
                    playPageControl.mo14309h(name);
                    this$0.f9014b.add(playPageControl);
                } catch (Exception e10) {
                    this$0.m7913o(new Runnable() { // from class: m5.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlayControl.m7904k(failCallBack, e10);
                        }
                    });
                    return;
                }
            }
            this$0.m7913o(new Runnable() { // from class: m5.p
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m7905l(successCallBack, this$0);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            this$0.m7913o(new Runnable() { // from class: m5.q
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m7906m(failCallBack, e11);
                }
            });
        }
    }

    /* renamed from: k */
    public static final void m7904k(Function1 failCallBack, Exception e10) {
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(e10, "$e");
        failCallBack.invoke(e10);
    }

    /* renamed from: l */
    public static final void m7905l(Function1 successCallBack, PlayControl this$0) {
        Intrinsics.checkNotNullParameter(successCallBack, "$successCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        successCallBack.invoke(this$0.f9014b);
    }

    /* renamed from: m */
    public static final void m7906m(Function1 failCallBack, Exception e10) {
        Intrinsics.checkNotNullParameter(failCallBack, "$failCallBack");
        Intrinsics.checkNotNullParameter(e10, "$e");
        failCallBack.invoke(e10);
    }

    @Override // p179m5.InterfaceC8976l
    /* renamed from: a */
    public InterfaceC8977m mo7907a() {
        int i9 = this.f9015c;
        if (i9 < 0 || i9 >= this.f9014b.size()) {
            return null;
        }
        return (InterfaceC8977m) this.f9014b.get(this.f9015c);
    }

    @Override // p179m5.InterfaceC8976l
    /* renamed from: b */
    public String mo7908b() {
        return this.f9016d;
    }

    @Override // p179m5.InterfaceC8976l
    /* renamed from: c */
    public boolean mo7909c(int i9, Function0 callback, Function0 onError) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i9 < 0 || i9 >= this.f9014b.size()) {
            onError.invoke();
            return false;
        }
        int i10 = this.f9015c;
        if (i10 != -1) {
            ((InterfaceC8977m) this.f9014b.get(i10)).hide();
        }
        this.f9015c = i9;
        ((InterfaceC8977m) this.f9014b.get(i9)).mo14307b(callback);
        return true;
    }

    @Override // p179m5.InterfaceC8976l
    /* renamed from: d */
    public void mo7910d(final String path, final Function1 successCallBack, final Function1 failCallBack) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(successCallBack, "successCallBack");
        Intrinsics.checkNotNullParameter(failCallBack, "failCallBack");
        if (new File(path).exists()) {
            m7911i().submit(new Runnable() { // from class: m5.n
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m7903j(this.f15080a, path, failCallBack, successCallBack);
                }
            });
        } else {
            failCallBack.invoke(new FileNotFoundException(path));
        }
    }

    /* renamed from: i */
    public final ExecutorService m7911i() {
        return (ExecutorService) this.f9017e.getValue();
    }

    /* renamed from: n */
    public void m7912n() {
        ArrayList arrayList = this.f9014b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((InterfaceC8977m) obj).release();
        }
        this.f9014b.clear();
    }

    /* renamed from: o */
    public final void m7913o(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
