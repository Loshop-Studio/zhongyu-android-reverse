package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.edit.BoardControl;
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
import p035c5.InterfaceC5118a;
import p155l4.C8505j;
import p177n4.InterfaceC8628h;
import p177n4.InterfaceC8629i;

/* loaded from: classes4.dex */
public final class BoardControl implements IBoardControl {

    /* renamed from: a */
    public final C8505j f7684a;

    /* renamed from: b */
    public final List f7685b;

    /* renamed from: c */
    public BoardConfig f7686c;

    /* renamed from: d */
    public int f7687d;

    /* renamed from: e */
    public String f7688e;

    /* renamed from: f */
    public final Lazy f7689f;

    public BoardControl(int i10, int i11, C8505j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f7684a = renderLayer;
        this.f7685b = new ArrayList();
        this.f7686c = new BoardConfig(i10, i11);
        this.f7687d = -1;
        this.f7688e = "";
        this.f7689f = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.blackboard.core.edit.BoardControl$singleExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6684o(java.lang.String r7, com.zykj.blackboard.core.edit.BoardControl r8, final kotlin.jvm.functions.Function2 r9, kotlin.jvm.functions.Function1 r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BoardControl.m6684o(java.lang.String, com.zykj.blackboard.core.edit.BoardControl, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali:125
    }

    /* renamed from: q */
    public static final void m6685q(BoardControl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.f7685b.iterator();
        while (it.hasNext()) {
            ((InterfaceC8628h) it.next()).release();
        }
        this$0.f7685b.clear();
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: a */
    public InterfaceC8629i mo6686a() {
        return m6693j(this.f7687d);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: b */
    public InterfaceC8629i mo6687b(boolean z9, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        if (!this.f7685b.isEmpty() && z9) {
            LogUtils.m3237d("页面BoardControl隐藏之前第" + this.f7687d);
            ((InterfaceC8628h) this.f7685b.get(this.f7687d)).hide();
        }
        PageControl pageControl = new PageControl(this, this.f7684a, null, 4, null);
        this.f7685b.add(pageControl);
        if (z9) {
            m6699r(this.f7685b.indexOf(pageControl), renderCallback);
        }
        return pageControl;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: c */
    public void mo6688c(int i10, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        InterfaceC8628h interfaceC8628hM6693j = m6693j(i10);
        if (interfaceC8628hM6693j == null) {
            return;
        }
        InterfaceC8628h interfaceC8628hM6693j2 = m6693j(i10 + 1);
        if (interfaceC8628hM6693j2 == null) {
            interfaceC8628hM6693j2 = m6693j(i10 - 1);
        }
        interfaceC8628hM6693j.onDelete();
        interfaceC8628hM6693j.release();
        this.f7685b.remove(i10);
        if (this.f7687d == i10 && interfaceC8628hM6693j2 != null) {
            m6699r(this.f7685b.indexOf(interfaceC8628hM6693j2), renderCallback);
        }
        this.f7687d = CollectionsKt.indexOf((List<? extends InterfaceC8628h>) this.f7685b, interfaceC8628hM6693j2);
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    /* renamed from: d */
    public List mo6689d() {
        return this.f7685b;
    }

    /* renamed from: g */
    public boolean m6690g(int i10, Function0 renderCallback) {
        Intrinsics.checkNotNullParameter(renderCallback, "renderCallback");
        int i11 = this.f7687d;
        if (i11 == i10) {
            return false;
        }
        if (i11 >= 0 && i11 < this.f7685b.size()) {
            ((InterfaceC8628h) this.f7685b.get(this.f7687d)).hide();
        }
        if (m6693j(i10) != null) {
            return m6699r(i10, renderCallback);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IBoardControl
    public BoardConfig getConfig() {
        return this.f7686c;
    }

    /* renamed from: h */
    public String m6691h() {
        return this.f7688e;
    }

    /* renamed from: i */
    public final InterfaceC5118a m6692i() {
        return null;
    }

    /* renamed from: j */
    public final InterfaceC8628h m6693j(int i10) {
        if (i10 < 0 || i10 >= this.f7685b.size()) {
            return null;
        }
        return (InterfaceC8628h) this.f7685b.get(i10);
    }

    /* renamed from: k */
    public final ExecutorService m6694k() {
        return (ExecutorService) this.f7689f.getValue();
    }

    /* renamed from: l */
    public final void m6695l(String str) {
        this.f7688e = str;
    }

    /* renamed from: m */
    public final void m6696m(BlackBoardEntity blackBoardEntity) {
        Iterator<TARGET> it = blackBoardEntity.m6318c().iterator();
        while (it.hasNext()) {
            this.f7685b.add(new PageControl(this, this.f7684a, (PageEntity) it.next()));
        }
    }

    /* renamed from: n */
    public void m6697n(final String dirPath, final Function2 callback, final Function1 error) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(error, "error");
        LogUtils.m3237d("页面BoardControl:loadDir的路径 -> dirPath:" + dirPath);
        m6695l(dirPath);
        m6694k().submit(new Runnable() { // from class: n4.d
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m6684o(dirPath, this, callback, error);
            }
        });
    }

    /* renamed from: p */
    public final void m6698p() {
        m6694k().submit(new Runnable() { // from class: n4.e
            @Override // java.lang.Runnable
            public final void run() {
                BoardControl.m6685q(this.f14283a);
            }
        });
    }

    /* renamed from: r */
    public final boolean m6699r(int i10, Function0 function0) {
        InterfaceC8628h interfaceC8628h = (InterfaceC8628h) this.f7685b.get(i10);
        this.f7687d = i10;
        interfaceC8628h.mo6674b(function0);
        return true;
    }
}
