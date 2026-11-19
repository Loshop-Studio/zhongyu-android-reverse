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
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p178ha.InterfaceC9515l;
import p178ha.InterfaceC9516m;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10773d;
import p390w9.C11719h;
import p406x9.C11814b;

/* loaded from: classes5.dex */
public final class PlayControl implements InterfaceC9515l {

    /* renamed from: a */
    public final C11719h f18571a;

    /* renamed from: b */
    public final ArrayList f18572b;

    /* renamed from: c */
    public int f18573c;

    /* renamed from: d */
    public String f18574d;

    /* renamed from: e */
    public final InterfaceC10773d f18575e;

    public PlayControl(C11719h renderLayer) {
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f18571a = renderLayer;
        this.f18572b = new ArrayList();
        this.f18573c = -1;
        this.f18574d = "";
        this.f18575e = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.play.PlayControl$singleExecutor$2
            @Override // p181hd.InterfaceC9529a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: j */
    public static final void m14527j(final PlayControl this$0, String path, final InterfaceC9540l failCallBack, final InterfaceC9540l successCallBack) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(path, "$path");
        AbstractC9979u.m20294g(failCallBack, "$failCallBack");
        AbstractC9979u.m20294g(successCallBack, "$successCallBack");
        LogUtils.m3888i("PlayControl:loadPath 加载播放微课");
        try {
            this$0.f18574d = path;
            List<EzyPageRouter.PageRouter.PageInfo> listM15521g = C11814b.f28049a.m26153l(path).m15521g();
            AbstractC9979u.m20293f(listM15521g, "SourceLoad.getPageRouter(path).pageInfoList");
            for (EzyPageRouter.PageRouter.PageInfo pageInfo : listM15521g) {
                PlayPageControl playPageControl = new PlayPageControl(this$0, this$0.f18571a);
                try {
                    String name = pageInfo.getName();
                    AbstractC9979u.m20293f(name, "info.name");
                    playPageControl.mo18735h(name);
                    this$0.f18572b.add(playPageControl);
                } catch (Exception e10) {
                    this$0.m14537o(new Runnable() { // from class: ha.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlayControl.m14528k(failCallBack, e10);
                        }
                    });
                    return;
                }
            }
            this$0.m14537o(new Runnable() { // from class: ha.p
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m14529l(successCallBack, this$0);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            this$0.m14537o(new Runnable() { // from class: ha.q
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m14530m(failCallBack, e11);
                }
            });
        }
    }

    /* renamed from: k */
    public static final void m14528k(InterfaceC9540l failCallBack, Exception e10) {
        AbstractC9979u.m20294g(failCallBack, "$failCallBack");
        AbstractC9979u.m20294g(e10, "$e");
        failCallBack.invoke(e10);
    }

    /* renamed from: l */
    public static final void m14529l(InterfaceC9540l successCallBack, PlayControl this$0) {
        AbstractC9979u.m20294g(successCallBack, "$successCallBack");
        AbstractC9979u.m20294g(this$0, "this$0");
        successCallBack.invoke(this$0.f18572b);
    }

    /* renamed from: m */
    public static final void m14530m(InterfaceC9540l failCallBack, Exception e10) {
        AbstractC9979u.m20294g(failCallBack, "$failCallBack");
        AbstractC9979u.m20294g(e10, "$e");
        failCallBack.invoke(e10);
    }

    @Override // p178ha.InterfaceC9515l
    /* renamed from: a */
    public InterfaceC9516m mo14531a() {
        int i10 = this.f18573c;
        if (i10 < 0 || i10 >= this.f18572b.size()) {
            return null;
        }
        return (InterfaceC9516m) this.f18572b.get(this.f18573c);
    }

    @Override // p178ha.InterfaceC9515l
    /* renamed from: b */
    public String mo14532b() {
        return this.f18574d;
    }

    @Override // p178ha.InterfaceC9515l
    /* renamed from: c */
    public void mo14533c(final String path, final InterfaceC9540l successCallBack, final InterfaceC9540l failCallBack) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(successCallBack, "successCallBack");
        AbstractC9979u.m20294g(failCallBack, "failCallBack");
        if (new File(path).exists()) {
            m14535i().submit(new Runnable() { // from class: ha.n
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m14527j(this.f22034c, path, failCallBack, successCallBack);
                }
            });
        } else {
            failCallBack.invoke(new FileNotFoundException(path));
        }
    }

    @Override // p178ha.InterfaceC9515l
    /* renamed from: d */
    public boolean mo14534d(int i10, InterfaceC9529a callback, InterfaceC9529a onError) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(onError, "onError");
        if (i10 < 0 || i10 >= this.f18572b.size()) {
            onError.invoke();
            return false;
        }
        int i11 = this.f18573c;
        if (i11 != -1) {
            ((InterfaceC9516m) this.f18572b.get(i11)).hide();
        }
        this.f18573c = i10;
        ((InterfaceC9516m) this.f18572b.get(i10)).mo18733b(callback);
        return true;
    }

    /* renamed from: i */
    public final ExecutorService m14535i() {
        return (ExecutorService) this.f18575e.getValue();
    }

    /* renamed from: n */
    public void m14536n() {
        ArrayList arrayList = this.f18572b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC9516m) obj).release();
        }
        this.f18572b.clear();
    }

    /* renamed from: o */
    public final void m14537o(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
