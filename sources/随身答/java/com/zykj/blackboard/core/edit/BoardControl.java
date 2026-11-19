package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.edit.BoardControl;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p023b5.C5120j;
import p026b8.C5206a;
import p034c5.C5231c;
import p084d5.InterfaceC7750j;
import p084d5.InterfaceC7751k;
import p243s5.InterfaceC9473a;
import p263u5.C9685d;
import p272v4.C9763b;

/* loaded from: classes4.dex */
public final class BoardControl implements IBoardControl {

    /* renamed from: a */
    public final C5120j f8966a;

    /* renamed from: b */
    public final List f8967b;

    /* renamed from: c */
    public C9763b f8968c;

    /* renamed from: d */
    public int f8969d;

    /* renamed from: e */
    public String f8970e;

    /* renamed from: f */
    public final Lazy f8971f;

    public BoardControl(int i9, int i10, C5120j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f8966a = renderLayer;
        this.f8967b = new ArrayList();
        this.f8968c = new C9763b(i9, i10);
        this.f8969d = -1;
        this.f8970e = "";
        this.f8971f = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.edit.BoardControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7790r(java.lang.String r7, com.zykj.blackboard.core.edit.BoardControl r8, final kotlin.jvm.functions.Function2 r9, kotlin.jvm.functions.Function1 r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BoardControl.m7790r(java.lang.String, com.zykj.blackboard.core.edit.BoardControl, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali:143
    }

    /* renamed from: t */
    public static final void m7791t(BoardControl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.f8967b.iterator();
        while (it.hasNext()) {
            ((InterfaceC7750j) it.next()).release();
        }
        this$0.f8967b.clear();
    }

    /* renamed from: v */
    public static final void m7792v(final ArrayList pagesSnapshot, String boardDirPath, BoardControl this$0, Function1 error, boolean z9, Function1 callback, final boolean z10) {
        Intrinsics.checkNotNullParameter(pagesSnapshot, "$pagesSnapshot");
        Intrinsics.checkNotNullParameter(boardDirPath, "$boardDirPath");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (pagesSnapshot.isEmpty()) {
            LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]数据保存失败，该页面已经被回收,数据不完整");
            return;
        }
        C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(BlackBoardEntity.class);
        Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c5206aM13101h.m2257n();
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        builder.m13160g(BlackBoardEntity_.f8538f, boardDirPath);
        Query queryM13158a = builder.m13158a();
        Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM13158a.m13152p();
        if (blackBoardEntity == null) {
            LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]数据保存失败，该页面数据库已被清理");
            return;
        }
        int i9 = 0;
        if (!pagesSnapshot.isEmpty()) {
            int size = pagesSnapshot.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = pagesSnapshot.get(i10);
                i10++;
                if (!((InterfaceC7750j) obj).mo7843v()) {
                    LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]数据保存失败，有数据正在保存到数据库");
                    error.invoke(new Exception("正在保存数据，请稍后再试"));
                    return;
                }
            }
        }
        LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]开始");
        try {
            C9685d.f17121a.m16165f().m13093G(new Runnable() { // from class: d5.g
                @Override // java.lang.Runnable
                public final void run() {
                    BoardControl.m7793w(pagesSnapshot, z10);
                }
            });
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pagesSnapshot, 10));
            int size2 = pagesSnapshot.size();
            while (i9 < size2) {
                Object obj2 = pagesSnapshot.get(i9);
                i9++;
                arrayList.add(((InterfaceC7750j) obj2).getFileName());
            }
            C5231c.f2465a.m2388j(blackBoardEntity, arrayList);
            if (z9) {
                LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]开始清除数据库");
                C9685d.m16161c(C9685d.f17121a, boardDirPath, null, 2, null);
            }
            LogUtils.m2956i("页面BoardControl:save() -> [" + boardDirPath + "]保存结束");
            callback.invoke(boardDirPath);
        } catch (Exception e10) {
            LogUtils.m2956i("页面BoardControl:save() ->数据保存失败 -> error: " + e10);
            error.invoke(e10);
        }
    }

    /* renamed from: w */
    public static final void m7793w(ArrayList pagesSnapshot, boolean z9) {
        Intrinsics.checkNotNullParameter(pagesSnapshot, "$pagesSnapshot");
        int size = pagesSnapshot.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = pagesSnapshot.get(i10);
            i10++;
            int i11 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            InterfaceC7750j interfaceC7750j = (InterfaceC7750j) obj;
            LogUtils.m2956i("页面BoardControl:save() -> [" + i9 + "][" + interfaceC7750j.getFileName() + "]准备保存");
            if (z9) {
                interfaceC7750j.mo7842u();
            } else {
                interfaceC7750j.save();
            }
            i9 = i11;
        }
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: a */
    public InterfaceC7751k mo7794a() {
        return m7802m(this.f8969d);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: b */
    public InterfaceC7751k mo7795b(boolean z9, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        if (!this.f8967b.isEmpty() && z9) {
            LogUtils.m2954d("页面BoardControl隐藏之前第" + this.f8969d);
            ((InterfaceC7750j) this.f8967b.get(this.f8969d)).hide();
        }
        PageControl pageControl = new PageControl(this, this.f8966a, null, 4, null);
        this.f8967b.add(pageControl);
        if (z9) {
            m7808u(this.f8967b.indexOf(pageControl), renderCallback);
        }
        return pageControl;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: c */
    public void mo7796c(int i9, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        InterfaceC7750j interfaceC7750jM7802m = m7802m(i9);
        if (interfaceC7750jM7802m == null) {
            return;
        }
        InterfaceC7750j interfaceC7750jM7802m2 = m7802m(i9 + 1);
        if (interfaceC7750jM7802m2 == null) {
            interfaceC7750jM7802m2 = m7802m(i9 - 1);
        }
        interfaceC7750jM7802m.onDelete();
        interfaceC7750jM7802m.release();
        this.f8967b.remove(i9);
        if (this.f8969d == i9 && interfaceC7750jM7802m2 != null) {
            m7808u(this.f8967b.indexOf(interfaceC7750jM7802m2), renderCallback);
        }
        this.f8969d = CollectionsKt.indexOf((List<? extends InterfaceC7750j>) this.f8967b, interfaceC7750jM7802m2);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: d */
    public List mo7797d() {
        return this.f8967b;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: e */
    public void mo7798e(final boolean z9, final boolean z10, final Function1 callback, final Function1 error) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        final ArrayList arrayList = new ArrayList(this.f8967b);
        final String strM7800k = m7800k();
        m7803n().submit(new Runnable() { // from class: d5.d
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m7792v(arrayList, strM7800k, this, error, z9, callback, z10);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public C9763b getConfig() {
        return this.f8968c;
    }

    /* renamed from: j */
    public boolean m7799j(int i9, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        int i10 = this.f8969d;
        if (i10 == i9) {
            return false;
        }
        if (i10 >= 0 && i10 < this.f8967b.size()) {
            ((InterfaceC7750j) this.f8967b.get(this.f8969d)).hide();
        }
        if (m7802m(i9) != null) {
            return m7808u(i9, renderCallback);
        }
        return false;
    }

    /* renamed from: k */
    public String m7800k() {
        return this.f8970e;
    }

    /* renamed from: l */
    public final InterfaceC9473a m7801l() {
        return null;
    }

    /* renamed from: m */
    public final InterfaceC7750j m7802m(int i9) {
        if (i9 < 0 || i9 >= this.f8967b.size()) {
            return null;
        }
        return (InterfaceC7750j) this.f8967b.get(i9);
    }

    /* renamed from: n */
    public final ExecutorService m7803n() {
        return (ExecutorService) this.f8971f.getValue();
    }

    /* renamed from: o */
    public final void m7804o(String str) {
        this.f8970e = str;
    }

    /* renamed from: p */
    public final void m7805p(BlackBoardEntity blackBoardEntity) {
        Iterator<TARGET> it = blackBoardEntity.m7415c().iterator();
        while (it.hasNext()) {
            this.f8967b.add(new PageControl(this, this.f8966a, (PageEntity) it.next()));
        }
    }

    /* renamed from: q */
    public void m7806q(final String dirPath, final Function2 callback, final Function1 error) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        LogUtils.m2954d("页面BoardControl:loadDir的路径 -> dirPath:" + dirPath);
        m7804o(dirPath);
        m7803n().submit(new Runnable() { // from class: d5.e
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m7790r(dirPath, this, callback, error);
            }
        });
    }

    /* renamed from: s */
    public final void m7807s() {
        m7803n().submit(new Runnable() { // from class: d5.f
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m7791t(this.f13059a);
            }
        });
    }

    /* renamed from: u */
    public final boolean m7808u(int i9, Function0 function0) {
        InterfaceC7750j interfaceC7750j = (InterfaceC7750j) this.f8967b.get(i9);
        this.f8969d = i9;
        interfaceC7750j.mo7777b(function0);
        return true;
    }
}
