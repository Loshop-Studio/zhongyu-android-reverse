package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.listener.ErrorListener;
import com.zykj.blackboard.listener.PageListener;
import com.zykj.blackboard.utils.BoardBox;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public final class BoardControl implements IBoardControl {
    private BoardConfig boardConfig;
    private String boardDirPath;
    private int currentPageIndex;
    private ErrorListener errorListener;
    private final List<IEditPageControl> pageList;
    private PageListener pageListener;
    private final RenderLayer renderLayer;
    private final InterfaceC8724d singleExecutor$delegate;

    public BoardControl(int i10, int i11, RenderLayer renderLayer) {
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.pageList = new ArrayList();
        this.boardConfig = new BoardConfig(i10, i11);
        this.currentPageIndex = -1;
        this.boardDirPath = "";
        this.singleExecutor$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.BoardControl$singleExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drop$lambda-10, reason: not valid java name */
    public static final void m27434drop$lambda10(BoardControl this$0, InterfaceC10570l callback) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callback, "$callback");
        BoardBox.clearLocalData$default(BoardBox.INSTANCE, this$0.getBoardDirPath(), null, 2, null);
        callback.invoke(this$0.getBoardDirPath());
    }

    private final IEditPageControl getPage(int i10) {
        if (i10 < 0 || i10 >= this.pageList.size()) {
            return null;
        }
        return this.pageList.get(i10);
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor$delegate.getValue();
    }

    private final void initDir(String str) {
        this.boardDirPath = str;
    }

    private final void initPageControl(BlackBoardEntity blackBoardEntity) {
        Iterator<PageEntity> it = blackBoardEntity.getPages().iterator();
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0014, B:5:0x0065, B:15:0x00b6, B:17:0x00be, B:18:0x00cf, B:20:0x00d5, B:22:0x00dd, B:23:0x00e0, B:24:0x0109, B:25:0x0116, B:27:0x011e, B:28:0x0148, B:30:0x0151, B:9:0x0076, B:11:0x0081, B:13:0x008e, B:14:0x00a1), top: B:34:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0014, B:5:0x0065, B:15:0x00b6, B:17:0x00be, B:18:0x00cf, B:20:0x00d5, B:22:0x00dd, B:23:0x00e0, B:24:0x0109, B:25:0x0116, B:27:0x011e, B:28:0x0148, B:30:0x0151, B:9:0x0076, B:11:0x0081, B:13:0x008e, B:14:0x00a1), top: B:34:0x0014 }] */
    /* renamed from: loadDir$lambda-14, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27435loadDir$lambda14(java.lang.String r9, final com.zykj.blackboard.core.edit.BoardControl r10, final p300x7.InterfaceC10574p r11, p300x7.InterfaceC10570l r12) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BoardControl.m27435loadDir$lambda14(java.lang.String, com.zykj.blackboard.core.edit.BoardControl, x7.p, x7.l):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali:399
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: release$lambda-17, reason: not valid java name */
    public static final void m27436release$lambda17(BoardControl this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        Iterator<T> it = this$0.pageList.iterator();
        while (it.hasNext()) {
            ((IEditPageControl) it.next()).release();
        }
        this$0.pageList.clear();
        this$0.pageListener = null;
        this$0.errorListener = null;
    }

    private final boolean renderPage(int i10, InterfaceC10559a interfaceC10559a) {
        IEditPageControl iEditPageControl = this.pageList.get(i10);
        this.currentPageIndex = i10;
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.changPage(iEditPageControl);
        }
        iEditPageControl.show(interfaceC10559a);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: save$lambda-9, reason: not valid java name */
    public static final void m27437save$lambda9(BoardControl this$0, InterfaceC10570l error, boolean z10, InterfaceC10570l callback, boolean z11) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(error, "$error");
        AbstractC9133u.m16133g(callback, "$callback");
        List<IEditPageControl> list = this$0.pageList;
        if (list.isEmpty()) {
            AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]数据保存失败，该页面已经被回收");
            return;
        }
        C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(BlackBoardEntity.class);
        AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c8957aM15370d.m15416n();
        AbstractC9133u.m16132f(builder, "builder");
        builder.m15488c(BlackBoardEntity_.dir, this$0.getBoardDirPath());
        Query queryM15486a = builder.m15486a();
        AbstractC9133u.m16132f(queryM15486a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM15486a.m15480l();
        if (blackBoardEntity == null) {
            AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]数据保存失败，该页面数据库已被清理");
            return;
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((IEditPageControl) it.next()).canSave()) {
                    AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]数据保存失败，有数据正在保存到数据库");
                    error.invoke(new Exception("正在保存数据，请稍后再试"));
                    return;
                }
            }
        }
        AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]正在保存");
        try {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
                }
                IEditPageControl iEditPageControl = (IEditPageControl) obj;
                AbstractC5380q.m2623s("[BoardControl]:save -> [" + i10 + "][" + iEditPageControl.getFileName() + "]准备保存");
                if (z11) {
                    iEditPageControl.saveWithContentThumbnail();
                } else {
                    iEditPageControl.save();
                }
                i10 = i11;
            }
            SourceSave sourceSave = SourceSave.INSTANCE;
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IEditPageControl) it2.next()).getFileName());
            }
            sourceSave.saveRecord(blackBoardEntity, arrayList);
            if (z10) {
                AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]清除数据库");
                BoardBox.clearLocalData$default(BoardBox.INSTANCE, this$0.getBoardDirPath(), null, 2, null);
            }
            AbstractC5380q.m2623s("[BoardControl]:save -> [" + this$0.getBoardDirPath() + "]保存结束");
            callback.invoke(this$0.getBoardDirPath());
        } catch (Exception e10) {
            AbstractC5380q.m2623s("数据保存失败 -> error: " + e10);
            error.invoke(e10);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public IPageControl createPage(boolean z10, InterfaceC10559a renderCallback) {
        AbstractC9133u.m16133g(renderCallback, "renderCallback");
        if (!this.pageList.isEmpty() && z10) {
            this.pageList.get(this.currentPageIndex).hide();
        }
        PageControl pageControl = new PageControl(this, this.renderLayer, null, 4, null);
        this.pageList.add(pageControl);
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.addPage(pageControl);
        }
        if (z10) {
            renderPage(this.pageList.indexOf(pageControl), renderCallback);
        }
        return pageControl;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public boolean currentPage(int i10, InterfaceC10559a renderCallback) {
        AbstractC9133u.m16133g(renderCallback, "renderCallback");
        int i11 = this.currentPageIndex;
        if (i11 == i10) {
            return false;
        }
        if (i11 >= 0 && i11 < this.pageList.size()) {
            this.pageList.get(this.currentPageIndex).hide();
        }
        if (getPage(i10) != null) {
            return renderPage(i10, renderCallback);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void deletePage(int i10, InterfaceC10559a renderCallback) {
        AbstractC9133u.m16133g(renderCallback, "renderCallback");
        IEditPageControl page = getPage(i10);
        if (page == null) {
            return;
        }
        IEditPageControl page2 = getPage(i10 + 1);
        if (page2 == null) {
            page2 = getPage(i10 - 1);
        }
        page.onDelete();
        page.release();
        this.pageList.remove(i10);
        PageListener pageListener = this.pageListener;
        if (pageListener != null) {
            pageListener.removePage(page);
        }
        if (this.currentPageIndex == i10 && page2 != null) {
            renderPage(this.pageList.indexOf(page2), renderCallback);
        }
        this.currentPageIndex = AbstractC8778f0.m14571q0(this.pageList, page2);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void drop(final InterfaceC10570l callback, InterfaceC10570l error) {
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(error, "error");
        new Thread(new Runnable() { // from class: com.zykj.blackboard.core.edit.f
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m27434drop$lambda10(this.f8777a, callback);
            }
        }).start();
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public String getBoardDirPath() {
        return this.boardDirPath;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public BoardConfig getConfig() {
        return this.boardConfig;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public IPageControl getCurrentPage() {
        return getPage(this.currentPageIndex);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public final ErrorListener getErrorListener() {
        return this.errorListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public PageListener getPageListener() {
        return this.pageListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public List<IPageControl> getPages() {
        return this.pageList;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void loadDir(final String dirPath, final InterfaceC10574p callback, final InterfaceC10570l error) {
        AbstractC9133u.m16133g(dirPath, "dirPath");
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(error, "error");
        AbstractC5380q.m2623s("[BoardControl]:loadDir -> dirPath:" + dirPath);
        initDir(dirPath);
        getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.edit.d
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m27435loadDir$lambda14(dirPath, this, callback, error);
            }
        });
    }

    public final void loadPathForTest(String dirPath) {
        AbstractC9133u.m16133g(dirPath, "dirPath");
        initDir(dirPath);
    }

    public final void release() {
        getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.edit.e
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m27436release$lambda17(this.f8776a);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void save(final boolean z10, final boolean z11, final InterfaceC10570l callback, final InterfaceC10570l error) {
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(error, "error");
        getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.edit.c
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m27437save$lambda9(this.f8767a, error, z10, callback, z11);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void setErrorListener(ErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public void setPageListener(PageListener pageListener) {
        AbstractC9133u.m16133g(pageListener, "pageListener");
        this.pageListener = pageListener;
    }
}
