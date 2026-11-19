package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.support.v4.media.AbstractC0037f;
import androidx.camera.camera2.interop.RunnableC0303c;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.listener.ErrorListener;
import com.zykj.blackboard.listener.PageListener;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.query.QueryBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0013d;
import p009a8.RunnableC0023a;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b'\u0010\u0016J%\u0010(\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020+02H\u0016¢\u0006\u0004\b3\u00104JG\u0010:\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016¢\u0006\u0004\b:\u0010;J7\u0010<\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016¢\u0006\u0004\b<\u0010=JE\u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000b0?2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\t¢\u0006\u0004\bG\u0010\rJ\r\u0010H\u001a\u00020\u000b¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010RR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR#\u0010[\u001a\n V*\u0004\u0018\u00010U0U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010\\\u001a\u0004\u0018\u00010C8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/BoardControl;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "", "width", "height", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "<init>", "(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V", "", "path", "Ld6/s;", "initDir", "(Ljava/lang/String;)V", "pageIndex", "Lcom/zykj/blackboard/core/edit/IEditPageControl;", "getPage", "(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;", "Lkotlin/Function0;", "callback", "", "renderPage", "(ILr6/a;)Z", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "boardEntity", "initPageControl", "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V", "getBoardDirPath", "()Ljava/lang/String;", "Lcom/zykj/blackboard/bean/BoardConfig;", "getConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/listener/PageListener;", "pageListener", "setPageListener", "(Lcom/zykj/blackboard/listener/PageListener;)V", "getPageListener", "()Lcom/zykj/blackboard/listener/PageListener;", "renderCallback", "currentPage", "deletePage", "(ILr6/a;)V", "isSwitch", "Lcom/zykj/blackboard/core/edit/IPageControl;", "createPage", "(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;", "getCurrentPage", "()Lcom/zykj/blackboard/core/edit/IPageControl;", "getCurrentPageIndex", "()I", "", "getPages", "()Ljava/util/List;", "needClear", "isContentThumbnail", "Lkotlin/Function1;", "", "error", "save", "(ZZLr6/c;Lr6/c;)V", "drop", "(Lr6/c;Lr6/c;)V", "dirPath", "Lkotlin/Function2;", "", "loadDir", "(Ljava/lang/String;Lr6/e;Lr6/c;)V", "Lcom/zykj/blackboard/listener/ErrorListener;", "errorListener", "setErrorListener", "(Lcom/zykj/blackboard/listener/ErrorListener;)V", "loadPathForTest", "release", "()V", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "", "pageList", "Ljava/util/List;", "boardConfig", "Lcom/zykj/blackboard/bean/BoardConfig;", "currentPageIndex", "I", "Lcom/zykj/blackboard/listener/PageListener;", "boardDirPath", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "singleExecutor$delegate", "Ld6/e;", "getSingleExecutor", "()Ljava/util/concurrent/ExecutorService;", "singleExecutor", "<set-?>", "Lcom/zykj/blackboard/listener/ErrorListener;", "getErrorListener", "()Lcom/zykj/blackboard/listener/ErrorListener;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardControl implements IBoardControl {

    @NotNull
    private BoardConfig boardConfig;

    @NotNull
    private String boardDirPath;
    private int currentPageIndex;

    @Nullable
    private ErrorListener errorListener;

    @NotNull
    private final List<IEditPageControl> pageList;

    @Nullable
    private PageListener pageListener;

    @NotNull
    private final RenderLayer renderLayer;

    /* renamed from: singleExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e singleExecutor;

    public BoardControl(int i, int i8, @NotNull RenderLayer renderLayer) {
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.pageList = new ArrayList();
        this.boardConfig = new BoardConfig(i, i8);
        this.currentPageIndex = -1;
        this.boardDirPath = "";
        this.singleExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.BoardControl$singleExecutor$2
            @Override // p152r6.InterfaceC6469a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drop$lambda-10, reason: not valid java name */
    public static final void m13764drop$lambda10(BoardControl this$0, InterfaceC6471c callback) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callback, "$callback");
        BoardBox.clearLocalData$default(BoardBox.INSTANCE, this$0.getBoardDirPath(), null, 2, null);
        callback.invoke(this$0.getBoardDirPath());
    }

    private final IEditPageControl getPage(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= this.pageList.size()) {
            return null;
        }
        return this.pageList.get(pageIndex);
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor.getValue();
    }

    private final void initDir(String path) {
        this.boardDirPath = path;
    }

    private final void initPageControl(BlackBoardEntity boardEntity) {
        Iterator<PageEntity> it = boardEntity.getPages().iterator();
        while (it.hasNext()) {
            PageControl pageControl = new PageControl(this, this.renderLayer, it.next());
            this.pageList.add(pageControl);
            PageListener pageListener = this.pageListener;
            if (pageListener != null) {
                pageListener.addPage(pageControl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDir$lambda-14, reason: not valid java name */
    public static final void m13765loadDir$lambda14(String dirPath, BoardControl this$0, final InterfaceC6473e callback, InterfaceC6471c error) {
        IEditPageControl iEditPageControl;
        AbstractC5830k.m5330g(dirPath, "$dirPath");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callback, "$callback");
        AbstractC5830k.m5330g(error, "$error");
        try {
            AbstractC3387g.m2338a("页面BoardControl:loadDir -> dirPath:" + dirPath + " 线程开始");
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class).m5036g();
            queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, dirPath);
            BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryBuilderM5036g.m5063a().m5062c();
            final boolean z8 = true;
            if (blackBoardEntity != null) {
                AbstractC3387g.m2338a("页面BoardControl:loadDir -> 从数据库加载数据");
                this$0.initPageControl(blackBoardEntity);
            } else if (new File(dirPath).exists() && new File(dirPath, SourceSave.PAGE_ROUTER_FILE_NAME).exists()) {
                AbstractC3387g.m2338a("页面BoardControl:loadDir -> 从本地文件加载数据");
                this$0.initPageControl(SourceLoad.INSTANCE.loadRecord(dirPath));
            } else {
                AbstractC3387g.m2338a("页面BoardControl:loadDir -> 新建board空白画板");
                BlackBoardEntity blackBoardEntity2 = new BlackBoardEntity(0L, dirPath);
                blackBoardEntity2.put();
                this$0.initPageControl(blackBoardEntity2);
                z8 = false;
            }
            synchronized (this$0) {
                try {
                    if (this$0.pageList.isEmpty()) {
                        iEditPageControl = null;
                    } else {
                        Iterator it = AbstractC5805t.m5226f0(this$0.pageList).iterator();
                        while (it.hasNext()) {
                            AbstractC3387g.m2338a("页面BoardControl:loadDir -> 删除了一个 " + ((IEditPageControl) it.next()).getFileName());
                        }
                        iEditPageControl = (IEditPageControl) AbstractC5805t.m5235o0(this$0.pageList);
                        AbstractC3387g.m2342e("页面BoardControl:loadDir -> 保留页: " + iEditPageControl.getFileName());
                        this$0.pageList.retainAll(AbstractC5806u.m5286y(iEditPageControl));
                    }
                } finally {
                }
            }
            if (iEditPageControl == null) {
                AbstractC3387g.m2342e("页面BoardControl:loadDir -> 数据加载完毕, 数据空");
                callback.invoke(Boolean.FALSE, 0L);
            } else {
                final long jDuration = iEditPageControl.duration();
                this$0.currentPage(0, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.BoardControl$loadDir$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13769invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13769invoke() {
                        callback.invoke(Boolean.valueOf(z8), Long.valueOf(jDuration));
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC3387g.m2339b("页面BoardControl:loadDir -> 数据加载失败，e: " + th.getMessage());
            error.invoke(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: release$lambda-17, reason: not valid java name */
    public static final void m13766release$lambda17(BoardControl this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        Iterator<T> it = this$0.pageList.iterator();
        while (it.hasNext()) {
            ((IEditPageControl) it.next()).release();
        }
        this$0.pageList.clear();
        this$0.pageListener = null;
        this$0.errorListener = null;
    }

    private final boolean renderPage(int pageIndex, InterfaceC6469a callback) {
        IEditPageControl iEditPageControl = this.pageList.get(pageIndex);
        this.currentPageIndex = pageIndex;
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.changPage(iEditPageControl);
        }
        iEditPageControl.show(callback);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: save$lambda-9, reason: not valid java name */
    public static final void m13767save$lambda9(ArrayList pagesSnapshot, String boardDirPath, BoardControl this$0, InterfaceC6471c error, boolean z8, InterfaceC6471c callback, boolean z9) {
        AbstractC5830k.m5330g(pagesSnapshot, "$pagesSnapshot");
        AbstractC5830k.m5330g(boardDirPath, "$boardDirPath");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(error, "$error");
        AbstractC5830k.m5330g(callback, "$callback");
        if (pagesSnapshot.isEmpty()) {
            AbstractC3387g.m2342e(AbstractC0037f.m86k("页面BoardControl:save() -> [", boardDirPath, "]数据保存失败，该页面已经被回收,数据不完整"));
            return;
        }
        QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class).m5036g();
        queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, boardDirPath);
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryBuilderM5036g.m5063a().m5062c();
        if (blackBoardEntity == null) {
            AbstractC3387g.m2342e(AbstractC0037f.m86k("页面BoardControl:save() -> [", boardDirPath, "]数据保存失败，该页面数据库已被清理"));
            return;
        }
        int i = 0;
        if (!pagesSnapshot.isEmpty()) {
            int size = pagesSnapshot.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = pagesSnapshot.get(i8);
                i8++;
                if (!((IEditPageControl) obj).canSave()) {
                    AbstractC3387g.m2342e(AbstractC0037f.m86k("页面BoardControl:save() -> [", boardDirPath, "]数据保存失败，有数据正在保存到数据库"));
                    error.invoke(new Exception("正在保存数据，请稍后再试"));
                    return;
                }
            }
        }
        AbstractC3387g.m2342e(AbstractC0037f.m86k("页面BoardControl:save() -> [", boardDirPath, "]开始"));
        try {
            BoardBox.INSTANCE.getBoxStore().m5021h(new RunnableC0303c(pagesSnapshot, z9, 3));
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pagesSnapshot, 10));
            int size2 = pagesSnapshot.size();
            while (i < size2) {
                Object obj2 = pagesSnapshot.get(i);
                i++;
                arrayList.add(((IEditPageControl) obj2).getFileName());
            }
            SourceSave.INSTANCE.saveRecord(blackBoardEntity, arrayList);
            if (z8) {
                AbstractC3387g.m2342e("页面BoardControl:save() -> [" + boardDirPath + "]开始清除数据库");
                BoardBox.clearLocalData$default(BoardBox.INSTANCE, boardDirPath, null, 2, null);
            }
            AbstractC3387g.m2342e("页面BoardControl:save() -> [" + boardDirPath + "]保存结束");
            callback.invoke(boardDirPath);
        } catch (Exception e) {
            AbstractC3387g.m2342e("页面BoardControl:save() ->数据保存失败 -> error: " + e);
            error.invoke(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: save$lambda-9$lambda-7, reason: not valid java name */
    public static final void m13768save$lambda9$lambda7(ArrayList pagesSnapshot, boolean z8) {
        AbstractC5830k.m5330g(pagesSnapshot, "$pagesSnapshot");
        int size = pagesSnapshot.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = pagesSnapshot.get(i8);
            i8++;
            int i9 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            IEditPageControl iEditPageControl = (IEditPageControl) obj;
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "页面BoardControl:save() -> [", "][");
            sbM94s.append(iEditPageControl.getFileName());
            sbM94s.append("]准备保存");
            AbstractC3387g.m2342e(sbM94s.toString());
            if (z8) {
                iEditPageControl.saveWithContentThumbnail();
            } else {
                iEditPageControl.save();
            }
            i = i9;
        }
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @NotNull
    public IPageControl createPage(boolean isSwitch, @NotNull InterfaceC6469a renderCallback) {
        AbstractC5830k.m5330g(renderCallback, "renderCallback");
        if (!this.pageList.isEmpty() && isSwitch) {
            AbstractC3387g.m2338a("页面BoardControl隐藏之前第" + this.currentPageIndex);
            this.pageList.get(this.currentPageIndex).hide();
        }
        PageControl pageControl = new PageControl(this, this.renderLayer, null, 4, null);
        this.pageList.add(pageControl);
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.addPage(pageControl);
        }
        if (isSwitch) {
            renderPage(this.pageList.indexOf(pageControl), renderCallback);
        }
        return pageControl;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public boolean currentPage(int pageIndex, @NotNull InterfaceC6469a renderCallback) {
        AbstractC5830k.m5330g(renderCallback, "renderCallback");
        int i = this.currentPageIndex;
        if (i == pageIndex) {
            return false;
        }
        if (i >= 0 && i < this.pageList.size()) {
            this.pageList.get(this.currentPageIndex).hide();
        }
        if (getPage(pageIndex) != null) {
            return renderPage(pageIndex, renderCallback);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void deletePage(int pageIndex, @NotNull InterfaceC6469a renderCallback) {
        AbstractC5830k.m5330g(renderCallback, "renderCallback");
        IEditPageControl page = getPage(pageIndex);
        if (page == null) {
            return;
        }
        IEditPageControl page2 = getPage(pageIndex + 1);
        if (page2 == null) {
            page2 = getPage(pageIndex - 1);
        }
        page.onDelete();
        page.release();
        this.pageList.remove(pageIndex);
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.removePage(page);
        }
        if (this.currentPageIndex == pageIndex && page2 != null) {
            renderPage(this.pageList.indexOf(page2), renderCallback);
        }
        List<IEditPageControl> list = this.pageList;
        AbstractC5830k.m5330g(list, "<this>");
        this.currentPageIndex = list.indexOf(page2);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void drop(@NotNull InterfaceC6471c callback, @NotNull InterfaceC6471c error) {
        AbstractC5830k.m5330g(callback, "callback");
        AbstractC5830k.m5330g(error, "error");
        new Thread(new RunnableC0377a(10, this, callback)).start();
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @NotNull
    public String getBoardDirPath() {
        return this.boardDirPath;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @NotNull
    /* renamed from: getConfig, reason: from getter */
    public BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @Nullable
    public IPageControl getCurrentPage() {
        return getPage(this.currentPageIndex);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    @Nullable
    public final ErrorListener getErrorListener() {
        return this.errorListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @Nullable
    public PageListener getPageListener() {
        return this.pageListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    @NotNull
    public List<IPageControl> getPages() {
        return this.pageList;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void loadDir(@NotNull String dirPath, @NotNull InterfaceC6473e callback, @NotNull InterfaceC6471c error) {
        AbstractC5830k.m5330g(dirPath, "dirPath");
        AbstractC5830k.m5330g(callback, "callback");
        AbstractC5830k.m5330g(error, "error");
        AbstractC3387g.m2338a("页面BoardControl:loadDir的路径 -> dirPath:".concat(dirPath));
        initDir(dirPath);
        getSingleExecutor().submit(new RunnableC0013d(dirPath, this, callback, error, 5));
    }

    public final void loadPathForTest(@NotNull String dirPath) {
        AbstractC5830k.m5330g(dirPath, "dirPath");
        initDir(dirPath);
    }

    public final void release() {
        getSingleExecutor().submit(new RunnableC0023a(this, 18));
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void save(final boolean needClear, final boolean isContentThumbnail, @NotNull final InterfaceC6471c callback, @NotNull final InterfaceC6471c error) {
        AbstractC5830k.m5330g(callback, "callback");
        AbstractC5830k.m5330g(error, "error");
        final ArrayList arrayList = new ArrayList(this.pageList);
        final String boardDirPath = getBoardDirPath();
        getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.edit.a
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m13767save$lambda9(arrayList, boardDirPath, this, error, needClear, callback, isContentThumbnail);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void setErrorListener(@Nullable ErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void setPageListener(@NotNull PageListener pageListener) {
        AbstractC5830k.m5330g(pageListener, "pageListener");
        this.pageListener = pageListener;
    }
}
