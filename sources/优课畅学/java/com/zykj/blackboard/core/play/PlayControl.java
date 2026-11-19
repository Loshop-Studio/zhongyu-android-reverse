package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.listener.PageListener;
import com.zykj.board.EzyPageRouter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class PlayControl implements IPlayControl {
    private int currentPageIndex;
    private final ArrayList<IPlayPageControl> pageList;
    private PageListener pageListener;
    private final RenderLayer renderLayer;
    private String rootPath;
    private final InterfaceC8724d singleExecutor$delegate;

    public PlayControl(RenderLayer renderLayer) {
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.pageList = new ArrayList<>();
        this.currentPageIndex = -1;
        this.rootPath = "";
        this.singleExecutor$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.play.PlayControl$singleExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4, reason: not valid java name */
    public static final void m27450loadPath$lambda4(final PlayControl this$0, String path, final InterfaceC10570l failCallBack, final InterfaceC10570l successCallBack) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(failCallBack, "$failCallBack");
        AbstractC9133u.m16133g(successCallBack, "$successCallBack");
        AbstractC5380q.m2623s("PlayControl:loadPath 加载播放微课");
        try {
            this$0.rootPath = path;
            List<EzyPageRouter.PageRouter.PageInfo> listM8281g = SourceLoad.INSTANCE.getPageRouter(path).m8281g();
            AbstractC9133u.m16132f(listM8281g, "SourceLoad.getPageRouter(path).pageInfoList");
            for (EzyPageRouter.PageRouter.PageInfo pageInfo : listM8281g) {
                PlayPageControl playPageControl = new PlayPageControl(this$0, this$0.renderLayer);
                try {
                    String name = pageInfo.getName();
                    AbstractC9133u.m16132f(name, "info.name");
                    playPageControl.loadPath(name);
                    this$0.pageList.add(playPageControl);
                } catch (Exception e10) {
                    this$0.runOnMainThread(new Runnable() { // from class: com.zykj.blackboard.core.play.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlayControl.m27451loadPath$lambda4$lambda1$lambda0(failCallBack, e10);
                        }
                    });
                    return;
                }
            }
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.blackboard.core.play.h
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m27452loadPath$lambda4$lambda2(successCallBack, this$0);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.blackboard.core.play.i
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m27453loadPath$lambda4$lambda3(failCallBack, e11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final void m27451loadPath$lambda4$lambda1$lambda0(InterfaceC10570l failCallBack, Exception e10) {
        AbstractC9133u.m16133g(failCallBack, "$failCallBack");
        AbstractC9133u.m16133g(e10, "$e");
        failCallBack.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-2, reason: not valid java name */
    public static final void m27452loadPath$lambda4$lambda2(InterfaceC10570l successCallBack, PlayControl this$0) {
        AbstractC9133u.m16133g(successCallBack, "$successCallBack");
        AbstractC9133u.m16133g(this$0, "this$0");
        successCallBack.invoke(this$0.pageList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-3, reason: not valid java name */
    public static final void m27453loadPath$lambda4$lambda3(InterfaceC10570l failCallBack, Exception e10) {
        AbstractC9133u.m16133g(failCallBack, "$failCallBack");
        AbstractC9133u.m16133g(e10, "$e");
        failCallBack.invoke(e10);
    }

    private final void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public IPlayPageControl getCurrentPlayPageControl() {
        int i10 = this.currentPageIndex;
        if (i10 < 0 || i10 >= this.pageList.size()) {
            return null;
        }
        return this.pageList.get(this.currentPageIndex);
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public int getCurrentPlayPageIndex() {
        return this.currentPageIndex;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public List<IPlayPageControl> getPlayPageControlList() {
        return this.pageList;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public String getRootPath() {
        return this.rootPath;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void loadPath(final String path, final InterfaceC10570l successCallBack, final InterfaceC10570l failCallBack) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(successCallBack, "successCallBack");
        AbstractC9133u.m16133g(failCallBack, "failCallBack");
        if (new File(path).exists()) {
            getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.play.f
                @Override // java.lang.Runnable
                public final void run() {
                    PlayControl.m27450loadPath$lambda4(this.f8787a, path, failCallBack, successCallBack);
                }
            });
        } else {
            failCallBack.invoke(new FileNotFoundException(path));
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void release() {
        Iterator<T> it = this.pageList.iterator();
        while (it.hasNext()) {
            ((IPlayPageControl) it.next()).release();
        }
        this.pageList.clear();
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void setPageListener(PageListener pageListener) {
        AbstractC9133u.m16133g(pageListener, "pageListener");
        this.pageListener = pageListener;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public boolean switchCurrentPlayPage(int i10, InterfaceC10559a callback, InterfaceC10559a onError) {
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(onError, "onError");
        if (i10 < 0 || i10 >= this.pageList.size()) {
            onError.invoke();
            return false;
        }
        int i11 = this.currentPageIndex;
        if (i11 != -1) {
            this.pageList.get(i11).hide();
        }
        this.currentPageIndex = i10;
        this.pageList.get(i10).show(callback);
        return true;
    }
}
