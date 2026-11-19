package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.helper.C5962b;
import com.friday.document.service.FileManager;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ManualSyncViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f8041b;

    /* renamed from: c */
    public final FileManager f8042c;

    /* renamed from: d */
    public final MutableLiveData f8043d;

    /* renamed from: e */
    public final InterfaceC11603l f8044e;

    /* renamed from: f */
    public final InterfaceC11612u f8045f;

    public ManualSyncViewModel(FileDao fileDao, FileManager fileManager) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f8041b = fileDao;
        this.f8042c = fileManager;
        this.f8043d = new MutableLiveData();
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this.f8044e = interfaceC11603lM25602a;
        this.f8045f = AbstractC11596e.m25552b(interfaceC11603lM25602a);
    }

    /* renamed from: h */
    public final void m6304h() {
        BaseViewModel.m4802c(this, new ManualSyncViewModel$findSyncFailedList$1(this, null), new ManualSyncViewModel$findSyncFailedList$2(this, null), null, 4, null);
    }

    /* renamed from: i */
    public final MutableLiveData m6305i() {
        return this.f8043d;
    }

    /* renamed from: j */
    public final FileDao m6306j() {
        return this.f8041b;
    }

    /* renamed from: k */
    public final FileManager m6307k() {
        return this.f8042c;
    }

    /* renamed from: l */
    public final InterfaceC11612u m6308l() {
        return this.f8045f;
    }

    /* renamed from: m */
    public final boolean m6309m() {
        return C5962b.f6082a.m5299a().m5295w();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6310n(vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$1
            if (r0 == 0) goto L13
            r0 = r12
            com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$1 r0 = (com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$1) r0
            int r1 = r0.f8059k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8059k = r1
            goto L18
        L13:
            com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$1 r0 = new com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f8057i
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f8059k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            int r2 = r0.f8055g
            java.lang.Object r5 = r0.f8054f
            com.friday.document.model.ManualSyncEntity r5 = (com.friday.document.model.ManualSyncEntity) r5
            java.lang.Object r5 = r0.f8052d
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f8051c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.AbstractC9924b.m20071b(r12)
            goto L5b
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            kotlin.AbstractC9924b.m20071b(r12)
            com.friday.document.service.FileManager r12 = r11.f8042c
            r12.m5615t()
            androidx.lifecycle.MutableLiveData r12 = r11.f8043d
            java.lang.Object r12 = r12.getValue()
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto Lb5
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r2 = r12.iterator()
            r6 = r12
            r5 = r2
            r2 = r3
        L5b:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto Lb5
            java.lang.Object r12 = r5.next()
            r7 = r12
            com.friday.document.model.ManualSyncEntity r7 = (com.friday.document.model.ManualSyncEntity) r7
            f2.c r8 = p141f2.C9166c.f21406a
            boolean r8 = r8.m18061e()
            if (r8 != 0) goto L76
            java.lang.String r12 = "网络连接失败"
            p429z1.AbstractC11958b.m26588i(r12)
            goto L5b
        L76:
            r7.setSyncState(r4)
            vd.l r8 = r11.f8044e
        L7b:
            java.lang.Object r9 = r8.getValue()
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            boolean r9 = r8.mo20870e(r9, r10)
            if (r9 == 0) goto L7b
            sd.e0 r8 = sd.C11157r0.m24799b()
            com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$2$2 r9 = new com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$2$2
            r10 = 0
            r9.<init>(r11, r7, r10)
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f8051c = r10
            r0.f8052d = r5
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r12)
            r0.f8053e = r12
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f8054f = r12
            r0.f8055g = r2
            r0.f8056h = r3
            r0.f8059k = r4
            java.lang.Object r12 = sd.AbstractC11109f.m24709g(r8, r9, r0)
            if (r12 != r1) goto L5b
            return r1
        Lb5:
            com.friday.document.service.FileManager r12 = r11.f8042c
            r12.m5600E()
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ManualSyncViewModel.m6310n(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ManualSyncViewModel.smali:268
    }

    /* renamed from: o */
    public final long m6311o() {
        return C5962b.f6082a.m5299a().m5292t();
    }
}
