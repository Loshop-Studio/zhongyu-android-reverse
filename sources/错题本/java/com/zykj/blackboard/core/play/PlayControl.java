package com.zykj.blackboard.core.play;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.listener.PageListener;
import com.zykj.board.EzyPageRouter$PageRouter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0013d;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJE\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\b0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u000f0,j\b\u0012\u0004\u0012\u00020\u000f`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00102R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R#\u0010;\u001a\n 6*\u0004\u0018\u000105058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/PlayControl;", "Lcom/zykj/blackboard/core/play/IPlayControl;", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "<init>", "(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V", "Ljava/lang/Runnable;", "runnable", "Ld6/s;", "runOnMainThread", "(Ljava/lang/Runnable;)V", "", "path", "Lkotlin/Function1;", "", "Lcom/zykj/blackboard/core/play/IPlayPageControl;", "successCallBack", "", "failCallBack", "loadPath", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "Lcom/zykj/blackboard/listener/PageListener;", "pageListener", "setPageListener", "(Lcom/zykj/blackboard/listener/PageListener;)V", "", "pageIndex", "Lkotlin/Function0;", "callback", "onError", "", "switchCurrentPlayPage", "(ILr6/a;Lr6/a;)Z", "getPlayPageControlList", "()Ljava/util/List;", "getCurrentPlayPageControl", "()Lcom/zykj/blackboard/core/play/IPlayPageControl;", "getCurrentPlayPageIndex", "()I", "getRootPath", "()Ljava/lang/String;", "release", "()V", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pageList", "Ljava/util/ArrayList;", "currentPageIndex", "I", "Lcom/zykj/blackboard/listener/PageListener;", "rootPath", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "singleExecutor$delegate", "Ld6/e;", "getSingleExecutor", "()Ljava/util/concurrent/ExecutorService;", "singleExecutor", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlayControl implements IPlayControl {
    private int currentPageIndex;

    @NotNull
    private final ArrayList<IPlayPageControl> pageList;

    @Nullable
    private PageListener pageListener;

    @NotNull
    private final RenderLayer renderLayer;

    @NotNull
    private String rootPath;

    /* renamed from: singleExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e singleExecutor;

    public PlayControl(@NotNull RenderLayer renderLayer) {
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.pageList = new ArrayList<>();
        this.currentPageIndex = -1;
        this.rootPath = "";
        this.singleExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.play.PlayControl$singleExecutor$2
            @Override // p152r6.InterfaceC6469a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4, reason: not valid java name */
    public static final void m13786loadPath$lambda4(PlayControl this$0, String path, final InterfaceC6471c failCallBack, InterfaceC6471c successCallBack) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(failCallBack, "$failCallBack");
        AbstractC5830k.m5330g(successCallBack, "$successCallBack");
        AbstractC3387g.m2342e("PlayControl:loadPath 加载播放微课");
        try {
            this$0.rootPath = path;
            List<EzyPageRouter$PageRouter.PageInfo> pageInfoList = SourceLoad.INSTANCE.getPageRouter(path).getPageInfoList();
            AbstractC5830k.m5329f(pageInfoList, "SourceLoad.getPageRouter(path).pageInfoList");
            for (EzyPageRouter$PageRouter.PageInfo pageInfo : pageInfoList) {
                PlayPageControl playPageControl = new PlayPageControl(this$0, this$0.renderLayer);
                try {
                    String name = pageInfo.getName();
                    AbstractC5830k.m5329f(name, "info.name");
                    playPageControl.loadPath(name);
                    this$0.pageList.add(playPageControl);
                } catch (Exception e) {
                    final int i = 0;
                    this$0.runOnMainThread(new Runnable() { // from class: com.zykj.blackboard.core.play.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    PlayControl.m13787loadPath$lambda4$lambda1$lambda0(failCallBack, e);
                                    break;
                                default:
                                    PlayControl.m13789loadPath$lambda4$lambda3(failCallBack, e);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
            this$0.runOnMainThread(new RunnableC4335f(2, successCallBack, this$0));
        } catch (Exception e4) {
            e4.printStackTrace();
            final int i8 = 1;
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.blackboard.core.play.d
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i8) {
                        case 0:
                            PlayControl.m13787loadPath$lambda4$lambda1$lambda0(failCallBack, e4);
                            break;
                        default:
                            PlayControl.m13789loadPath$lambda4$lambda3(failCallBack, e4);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final void m13787loadPath$lambda4$lambda1$lambda0(InterfaceC6471c failCallBack, Exception e) {
        AbstractC5830k.m5330g(failCallBack, "$failCallBack");
        AbstractC5830k.m5330g(e, "$e");
        failCallBack.invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-2, reason: not valid java name */
    public static final void m13788loadPath$lambda4$lambda2(InterfaceC6471c successCallBack, PlayControl this$0) {
        AbstractC5830k.m5330g(successCallBack, "$successCallBack");
        AbstractC5830k.m5330g(this$0, "this$0");
        successCallBack.invoke(this$0.pageList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadPath$lambda-4$lambda-3, reason: not valid java name */
    public static final void m13789loadPath$lambda4$lambda3(InterfaceC6471c failCallBack, Exception e) {
        AbstractC5830k.m5330g(failCallBack, "$failCallBack");
        AbstractC5830k.m5330g(e, "$e");
        failCallBack.invoke(e);
    }

    private final void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    @Nullable
    public IPlayPageControl getCurrentPlayPageControl() {
        int i = this.currentPageIndex;
        if (i < 0 || i >= this.pageList.size()) {
            return null;
        }
        return this.pageList.get(this.currentPageIndex);
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    /* renamed from: getCurrentPlayPageIndex, reason: from getter */
    public int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    @NotNull
    public List<IPlayPageControl> getPlayPageControlList() {
        return this.pageList;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    @NotNull
    public String getRootPath() {
        return this.rootPath;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void loadPath(@NotNull String path, @NotNull InterfaceC6471c successCallBack, @NotNull InterfaceC6471c failCallBack) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(successCallBack, "successCallBack");
        AbstractC5830k.m5330g(failCallBack, "failCallBack");
        if (new File(path).exists()) {
            getSingleExecutor().submit(new RunnableC0013d(this, path, failCallBack, successCallBack, 6));
        } else {
            failCallBack.invoke(new FileNotFoundException(path));
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void release() {
        ArrayList<IPlayPageControl> arrayList = this.pageList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            IPlayPageControl iPlayPageControl = arrayList.get(i);
            i++;
            iPlayPageControl.release();
        }
        this.pageList.clear();
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public void setPageListener(@NotNull PageListener pageListener) {
        AbstractC5830k.m5330g(pageListener, "pageListener");
        this.pageListener = pageListener;
    }

    @Override // com.zykj.blackboard.core.play.IPlayControl
    public boolean switchCurrentPlayPage(int pageIndex, @NotNull InterfaceC6469a callback, @NotNull InterfaceC6469a onError) {
        AbstractC5830k.m5330g(callback, "callback");
        AbstractC5830k.m5330g(onError, "onError");
        if (pageIndex < 0 || pageIndex >= this.pageList.size()) {
            onError.invoke();
            return false;
        }
        int i = this.currentPageIndex;
        if (i != -1) {
            this.pageList.get(i).hide();
        }
        this.currentPageIndex = pageIndex;
        this.pageList.get(pageIndex).show(callback);
        return true;
    }
}
