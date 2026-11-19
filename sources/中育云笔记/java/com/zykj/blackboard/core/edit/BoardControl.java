package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.content.Context;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.edit.BoardControl;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10213a;
import na.C10338a;
import na.C10341d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p210jc.C9710a;
import p307q9.C10762b;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p390w9.C11719h;
import p406x9.C11814b;
import p406x9.C11815c;
import p422y9.InterfaceC11934m;
import p422y9.InterfaceC11935n;

/* loaded from: classes5.dex */
public final class BoardControl implements IBoardControl {

    /* renamed from: a */
    public final C11719h f18527a;

    /* renamed from: b */
    public final List f18528b;

    /* renamed from: c */
    public C10762b f18529c;

    /* renamed from: d */
    public int f18530d;

    /* renamed from: e */
    public String f18531e;

    /* renamed from: f */
    public final InterfaceC10773d f18532f;

    public BoardControl(int i10, int i11, C11719h renderLayer) {
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f18527a = renderLayer;
        this.f18528b = new ArrayList();
        this.f18529c = new C10762b(i10, i11);
        this.f18530d = -1;
        this.f18531e = "";
        this.f18532f = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.BoardControl$singleExecutor$2
            @Override // p181hd.InterfaceC9529a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: A */
    public static final void m14415A(final ArrayList pagesSnapshot, String boardDirPath, BoardControl this$0, InterfaceC9540l error, boolean z10, InterfaceC9540l callback, final boolean z11) {
        AbstractC9979u.m20294g(pagesSnapshot, "$pagesSnapshot");
        AbstractC9979u.m20294g(boardDirPath, "$boardDirPath");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(error, "$error");
        AbstractC9979u.m20294g(callback, "$callback");
        if (pagesSnapshot.isEmpty()) {
            LogUtils.m3888i("页面 BoardControl.kt -> save，数据保存失败，目录=" + boardDirPath + "，原因=页面已被回收或数据不完整");
            return;
        }
        C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(BlackBoardEntity.class);
        AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c9710aM18954g.m19229o();
        AbstractC9979u.m20293f(builder, "builder");
        builder.m19013g(BlackBoardEntity_.f18099h, boardDirPath);
        Query queryM19011e = builder.m19011e();
        AbstractC9979u.m20293f(queryM19011e, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM19011e.m19005n();
        if (blackBoardEntity == null) {
            LogUtils.m3888i("页面 BoardControl.kt -> save，数据保存失败，目录=" + boardDirPath + "，原因=页面数据库已被清理");
            return;
        }
        int i10 = 0;
        if (!pagesSnapshot.isEmpty()) {
            int size = pagesSnapshot.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = pagesSnapshot.get(i11);
                i11++;
                if (!((InterfaceC11934m) obj).mo14478t()) {
                    LogUtils.m3888i("页面 BoardControl.kt -> save，数据保存失败，目录=" + boardDirPath + "，原因=有数据正在保存到数据库");
                    error.invoke(new Exception("正在保存数据，请稍后再试"));
                    return;
                }
            }
        }
        LogUtils.m3888i("页面 BoardControl.kt -> save，开始查询数据库，目录=" + boardDirPath);
        try {
            C10341d.f24644a.m21626f().m18946I(new Runnable() { // from class: y9.h
                @Override // java.lang.Runnable
                public final void run() {
                    BoardControl.m14416B(pagesSnapshot, z11);
                }
            });
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(pagesSnapshot, 10));
            int size2 = pagesSnapshot.size();
            while (i10 < size2) {
                Object obj2 = pagesSnapshot.get(i10);
                i10++;
                arrayList.add(((InterfaceC11934m) obj2).getFileName());
            }
            C11815c.f28051a.m26177j(blackBoardEntity, arrayList);
            if (z10) {
                LogUtils.m3886d("页面 BoardControl.kt -> save，开始清除数据库，目录=" + boardDirPath);
                C10341d.m21622c(C10341d.f24644a, boardDirPath, null, 2, null);
            }
            LogUtils.m3886d("页面 BoardControl.kt -> save，保存结束，目录=" + boardDirPath);
            callback.invoke(boardDirPath);
        } catch (Exception e10) {
            LogUtils.m3886d("页面 BoardControl.kt -> save，数据保存失败，异常=" + e10);
            error.invoke(e10);
        }
    }

    /* renamed from: B */
    public static final void m14416B(ArrayList pagesSnapshot, boolean z10) {
        AbstractC9979u.m20294g(pagesSnapshot, "$pagesSnapshot");
        int size = pagesSnapshot.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = pagesSnapshot.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            InterfaceC11934m interfaceC11934m = (InterfaceC11934m) obj;
            LogUtils.m3888i("页面 BoardControl.kt -> save，第" + i10 + "页快照准备保存，文件=" + interfaceC11934m.getFileName());
            if (z10) {
                interfaceC11934m.mo14477s();
            } else {
                interfaceC11934m.save();
            }
            LogUtils.m3888i("页面 BoardControl.kt -> save，第" + i10 + "页快照保存结束，文件=" + interfaceC11934m.getFileName());
            i10 = i12;
        }
    }

    /* renamed from: D */
    public static final void m14417D(final ArrayList pagesSnapshot, String boardDirPath, BoardControl this$0, InterfaceC9540l error, InterfaceC9540l callback, final boolean z10) {
        AbstractC9979u.m20294g(pagesSnapshot, "$pagesSnapshot");
        AbstractC9979u.m20294g(boardDirPath, "$boardDirPath");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(error, "$error");
        AbstractC9979u.m20294g(callback, "$callback");
        if (pagesSnapshot.isEmpty()) {
            LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，数据保存失败，目录=" + boardDirPath + "，原因=页面已被回收或数据不完整");
            return;
        }
        C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(BlackBoardEntity.class);
        AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c9710aM18954g.m19229o();
        AbstractC9979u.m20293f(builder, "builder");
        builder.m19013g(BlackBoardEntity_.f18099h, boardDirPath);
        Query queryM19011e = builder.m19011e();
        AbstractC9979u.m20293f(queryM19011e, "builder.build()");
        if (((BlackBoardEntity) queryM19011e.m19005n()) == null) {
            LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，数据保存失败，目录=" + boardDirPath + "，原因=页面数据库已被清理");
            return;
        }
        if (!pagesSnapshot.isEmpty()) {
            int size = pagesSnapshot.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = pagesSnapshot.get(i10);
                i10++;
                if (!((InterfaceC11934m) obj).mo14478t()) {
                    LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，数据保存失败，目录=" + boardDirPath + "，原因=有数据正在保存到数据库");
                    error.invoke(new Exception("正在保存数据，请稍后再试"));
                    return;
                }
            }
        }
        LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，开始查询数据库，目录=" + boardDirPath);
        try {
            C10341d.f24644a.m21626f().m18946I(new Runnable() { // from class: y9.j
                @Override // java.lang.Runnable
                public final void run() {
                    BoardControl.m14418E(pagesSnapshot, z10);
                }
            });
            LogUtils.m3886d("页面 BoardControl.kt -> saveAsMdbFmt，保存结束，目录=" + boardDirPath);
            callback.invoke(boardDirPath);
        } catch (Exception e10) {
            LogUtils.m3886d("页面 BoardControl.kt -> saveAsMdbFmt，数据保存失败，异常=" + e10);
            error.invoke(e10);
        }
    }

    /* renamed from: E */
    public static final void m14418E(ArrayList pagesSnapshot, boolean z10) {
        AbstractC9979u.m20294g(pagesSnapshot, "$pagesSnapshot");
        int size = pagesSnapshot.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = pagesSnapshot.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            InterfaceC11934m interfaceC11934m = (InterfaceC11934m) obj;
            LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，第" + i10 + "页快照准备保存，文件=" + interfaceC11934m.getFileName());
            if (z10) {
                interfaceC11934m.mo14477s();
            } else {
                interfaceC11934m.save();
            }
            LogUtils.m3888i("页面 BoardControl.kt -> saveAsMdbFmt，第" + i10 + "页快照保存结束，文件=" + interfaceC11934m.getFileName());
            i10 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14426u(java.lang.String r6, com.zykj.blackboard.core.edit.BoardControl r7, final p181hd.InterfaceC9544p r8, p181hd.InterfaceC9540l r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BoardControl.m14426u(java.lang.String, com.zykj.blackboard.core.edit.BoardControl, hd.p, hd.l):void"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/edit/BoardControl.smali:1907
    }

    /* renamed from: w */
    public static final void m14427w(String dirPath, BoardControl this$0, final InterfaceC9544p callback, InterfaceC9540l error) {
        final boolean z10;
        InterfaceC11934m interfaceC11934m;
        AbstractC9979u.m20294g(dirPath, "$dirPath");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callback, "$callback");
        AbstractC9979u.m20294g(error, "$error");
        try {
            LogUtils.m3886d("页面 BoardControl.kt -> loadDirAsMdbFmt，线程开始，目录=" + dirPath);
            String str = dirPath + "/page_mdb";
            if (new File(str).exists()) {
                C10341d c10341d = C10341d.f24644a;
                Context contextM21618a = C10338a.f24640a.m21618a();
                AbstractC9979u.m20291d(contextM21618a);
                c10341d.m21628h(contextM21618a, str);
                C9710a c9710aM18954g = c10341d.m21626f().m18954g(BlackBoardEntity.class);
                AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
                QueryBuilder builder = c9710aM18954g.m19229o();
                AbstractC9979u.m20293f(builder, "builder");
                builder.m19013g(BlackBoardEntity_.f18099h, dirPath);
                Query queryM19011e = builder.m19011e();
                AbstractC9979u.m20293f(queryM19011e, "builder.build()");
                BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM19011e.m19005n();
                if (blackBoardEntity != null) {
                    LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，从数据库加载数据");
                    this$0.m14441s(blackBoardEntity);
                    z10 = true;
                } else {
                    LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，新建空白画板");
                    BlackBoardEntity blackBoardEntity2 = new BlackBoardEntity(0L, dirPath);
                    blackBoardEntity2.m14042d();
                    this$0.m14441s(blackBoardEntity2);
                    z10 = false;
                }
            } else {
                C10341d c10341d2 = C10341d.f24644a;
                Context contextM21618a2 = C10338a.f24640a.m21618a();
                AbstractC9979u.m20291d(contextM21618a2);
                c10341d2.m21628h(contextM21618a2, str);
                if (new File(dirPath).exists() && new File(dirPath, "page_router.bin").exists()) {
                    LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，从本地文件加载数据");
                    BlackBoardEntity blackBoardEntityM26135C = C11814b.f28049a.m26135C(dirPath);
                    LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，旧bin转mdb结果，目录=" + dirPath + "，页面数=" + blackBoardEntityM26135C.m14041c().size());
                    for (PageEntity pageEntity : blackBoardEntityM26135C.m14041c()) {
                        LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，旧bin转mdb页面目录=" + pageEntity.m14239d() + "，资源文件数=" + ((RecordEntity) pageEntity.m14242g().m19036d()).m14259c().size() + "，命令文件数=" + ((RecordEntity) pageEntity.m14242g().m19036d()).m14258b().size() + "，触摸文件数=" + ((RecordEntity) pageEntity.m14242g().m19036d()).m14265i().size() + "，矩阵文件数=" + ((RecordEntity) pageEntity.m14242g().m19036d()).m14262f().size());
                    }
                    this$0.m14441s(blackBoardEntityM26135C);
                    z10 = true;
                } else {
                    LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，新建空白画板");
                    BlackBoardEntity blackBoardEntity3 = new BlackBoardEntity(0L, dirPath);
                    blackBoardEntity3.m14042d();
                    this$0.m14441s(blackBoardEntity3);
                    z10 = false;
                }
            }
            synchronized (this$0) {
                try {
                    if (this$0.f18528b.isEmpty()) {
                        interfaceC11934m = null;
                    } else {
                        while (this$0.f18528b.size() > 1) {
                            LogUtils.m3886d("页面 BoardControl.kt -> loadDirAsMdbFmt，删除多余页面，文件=" + ((InterfaceC11934m) this$0.f18528b.get(0)).getFileName());
                            this$0.f18528b.remove(0);
                        }
                        interfaceC11934m = (InterfaceC11934m) AbstractC10947g0.m23946o0(this$0.f18528b);
                    }
                } finally {
                }
            }
            if (interfaceC11934m == null) {
                LogUtils.m3888i("页面 BoardControl.kt -> loadDirAsMdbFmt，数据加载完毕，页面为空");
                callback.invoke(Boolean.FALSE, 0L);
            } else {
                final long jMo14412w = interfaceC11934m.mo14412w();
                this$0.m14435m(0, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.BoardControl$loadDirAsMdbFmt$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34008invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34008invoke() {
                        callback.invoke(Boolean.valueOf(z10), Long.valueOf(jMo14412w));
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtils.m3887e("页面 BoardControl.kt -> loadDirAsMdbFmt，数据加载失败，异常=" + th.getMessage());
            error.invoke(th);
        }
    }

    /* renamed from: y */
    public static final void m14428y(BoardControl this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        Iterator it = this$0.f18528b.iterator();
        while (it.hasNext()) {
            ((InterfaceC11934m) it.next()).release();
        }
        this$0.f18528b.clear();
    }

    /* renamed from: C */
    public final void m14429C(boolean z10, final boolean z11, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        final ArrayList arrayList = new ArrayList(this.f18528b);
        final String strM14436n = m14436n();
        m14439q().submit(new Runnable() { // from class: y9.i
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m14417D(arrayList, strM14436n, this, interfaceC9540l2, interfaceC9540l, z11);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: a */
    public void mo14430a(int i10, InterfaceC9529a renderCallback) {
        AbstractC9979u.m20294g(renderCallback, "renderCallback");
        InterfaceC11934m interfaceC11934mM14438p = m14438p(i10);
        if (interfaceC11934mM14438p == null) {
            return;
        }
        InterfaceC11934m interfaceC11934mM14438p2 = m14438p(i10 + 1);
        if (interfaceC11934mM14438p2 == null) {
            interfaceC11934mM14438p2 = m14438p(i10 - 1);
        }
        interfaceC11934mM14438p.onDelete();
        interfaceC11934mM14438p.release();
        this.f18528b.remove(i10);
        if (this.f18530d == i10 && interfaceC11934mM14438p2 != null) {
            m14445z(this.f18528b.indexOf(interfaceC11934mM14438p2), renderCallback);
        }
        this.f18530d = AbstractC10947g0.m23949r0(this.f18528b, interfaceC11934mM14438p2);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: b */
    public InterfaceC11935n mo14431b() {
        return m14438p(this.f18530d);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: c */
    public void mo14432c(final boolean z10, final boolean z11, final InterfaceC9540l callback, final InterfaceC9540l error) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(error, "error");
        if (getConfig().m22868L()) {
            m14429C(z10, z11, callback, error);
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f18528b);
        final String strM14436n = m14436n();
        m14439q().submit(new Runnable() { // from class: y9.d
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m14415A(arrayList, strM14436n, this, error, z10, callback, z11);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: d */
    public List mo14433d() {
        return this.f18528b;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: e */
    public InterfaceC11935n mo14434e(boolean z10, InterfaceC9529a renderCallback) {
        AbstractC9979u.m20294g(renderCallback, "renderCallback");
        if (!this.f18528b.isEmpty() && z10) {
            LogUtils.m3886d("页面 BoardControl.kt -> createPage，隐藏之前第" + this.f18530d + (char) 39029);
            ((InterfaceC11934m) this.f18528b.get(this.f18530d)).hide();
        }
        PageControl pageControl = new PageControl(this, this.f18527a, null, 4, null);
        this.f18528b.add(pageControl);
        if (z10) {
            m14445z(this.f18528b.indexOf(pageControl), renderCallback);
        }
        return pageControl;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public C10762b getConfig() {
        return this.f18529c;
    }

    /* renamed from: m */
    public boolean m14435m(int i10, InterfaceC9529a renderCallback) {
        AbstractC9979u.m20294g(renderCallback, "renderCallback");
        int i11 = this.f18530d;
        if (i11 == i10) {
            return false;
        }
        if (i11 >= 0 && i11 < this.f18528b.size()) {
            ((InterfaceC11934m) this.f18528b.get(this.f18530d)).hide();
        }
        if (m14438p(i10) != null) {
            return m14445z(i10, renderCallback);
        }
        return false;
    }

    /* renamed from: n */
    public String m14436n() {
        return this.f18531e;
    }

    /* renamed from: o */
    public final InterfaceC10213a m14437o() {
        return null;
    }

    /* renamed from: p */
    public final InterfaceC11934m m14438p(int i10) {
        if (i10 < 0 || i10 >= this.f18528b.size()) {
            return null;
        }
        return (InterfaceC11934m) this.f18528b.get(i10);
    }

    /* renamed from: q */
    public final ExecutorService m14439q() {
        return (ExecutorService) this.f18532f.getValue();
    }

    /* renamed from: r */
    public final void m14440r(String str) {
        this.f18531e = str;
    }

    /* renamed from: s */
    public final void m14441s(BlackBoardEntity blackBoardEntity) {
        Iterator<TARGET> it = blackBoardEntity.m14041c().iterator();
        while (it.hasNext()) {
            this.f18528b.add(new PageControl(this, this.f18527a, (PageEntity) it.next()));
        }
    }

    /* renamed from: t */
    public void m14442t(final String dirPath, final InterfaceC9544p callback, final InterfaceC9540l error) {
        AbstractC9979u.m20294g(dirPath, "dirPath");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(error, "error");
        if (getConfig().m22868L()) {
            m14443v(dirPath, callback, error);
            return;
        }
        LogUtils.m3886d("页面 BoardControl.kt -> loadDir，开始加载，目录=" + dirPath);
        m14440r(dirPath);
        m14439q().submit(new Runnable() { // from class: y9.e
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m14426u(dirPath, this, callback, error);
            }
        });
    }

    /* renamed from: v */
    public final void m14443v(final String dirPath, final InterfaceC9544p callback, final InterfaceC9540l error) {
        AbstractC9979u.m20294g(dirPath, "dirPath");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(error, "error");
        LogUtils.m3886d("页面 BoardControl.kt -> loadDirAsMdbFmt，开始加载，目录=" + dirPath);
        m14440r(dirPath);
        m14439q().submit(new Runnable() { // from class: y9.g
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m14427w(dirPath, this, callback, error);
            }
        });
    }

    /* renamed from: x */
    public final void m14444x() {
        m14439q().submit(new Runnable() { // from class: y9.f
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m14428y(this.f28276c);
            }
        });
    }

    /* renamed from: z */
    public final boolean m14445z(int i10, InterfaceC9529a interfaceC9529a) {
        InterfaceC11934m interfaceC11934m = (InterfaceC11934m) this.f18528b.get(i10);
        this.f18530d = i10;
        interfaceC11934m.mo14405b(interfaceC9529a);
        return true;
    }
}
