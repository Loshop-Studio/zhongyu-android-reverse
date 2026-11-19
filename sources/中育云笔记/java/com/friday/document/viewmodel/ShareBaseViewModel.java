package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.friday.document.model.ShareFile;
import com.friday.document.service.FileManager;
import com.friday.document.view.share.SuspendCall;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;
import p330s2.InterfaceC11052b;
import p364uc.AbstractC11382b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareBaseViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11052b f8188b;

    /* renamed from: c */
    public final InterfaceC5250g2 f8189c;

    /* renamed from: d */
    public final ResourceDao f8190d;

    /* renamed from: e */
    public final FileManager f8191e;

    /* renamed from: f */
    public final InterfaceC11603l f8192f;

    /* renamed from: g */
    public final InterfaceC11612u f8193g;

    /* renamed from: h */
    public final InterfaceC11603l f8194h;

    /* renamed from: i */
    public final InterfaceC11612u f8195i;

    /* renamed from: j */
    public final InterfaceC11602k f8196j;

    /* renamed from: k */
    public final InterfaceC11607p f8197k;

    /* renamed from: l */
    public final String f8198l;

    /* renamed from: m */
    public final HashMap f8199m;

    /* renamed from: n */
    public final InterfaceC11603l f8200n;

    /* renamed from: o */
    public final InterfaceC11612u f8201o;

    /* renamed from: com.friday.document.viewmodel.ShareBaseViewModel$a */
    public static final class C6120a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    public ShareBaseViewModel(InterfaceC11052b shareService, InterfaceC5250g2 shareCacheDao, ResourceDao resourceDao, FileManager fileManager) {
        AbstractC9979u.m20294g(shareService, "shareService");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f8188b = shareService;
        this.f8189c = shareCacheDao;
        this.f8190d = resourceDao;
        this.f8191e = fileManager;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this.f8192f = interfaceC11603lM25602a;
        this.f8193g = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8194h = interfaceC11603lM25602a2;
        this.f8195i = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f8196j = interfaceC11602kM25592b;
        this.f8197k = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        this.f8198l = externalAppDataPath + str + "share" + str + m6352J() + str;
        this.f8199m = new HashMap();
        InterfaceC11603l interfaceC11603lM25602a3 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8200n = interfaceC11603lM25602a3;
        this.f8201o = AbstractC11596e.m25552b(interfaceC11603lM25602a3);
    }

    /* renamed from: H */
    public static /* synthetic */ void m6351H(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        shareBaseViewModel.m6370G(shareFile, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final long m6352J() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: o */
    public static /* synthetic */ Object m6362o(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9544p2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p3 = null;
        }
        return shareBaseViewModel.m6372n(shareFile, interfaceC9544p, interfaceC9544p2, interfaceC9544p3, interfaceC11588c);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m6363t(ShareBaseViewModel shareBaseViewModel, ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return shareBaseViewModel.m6376s(shareFile, z10, interfaceC11588c);
    }

    /* renamed from: A */
    public final InterfaceC11607p m6364A() {
        return this.f8197k;
    }

    /* renamed from: B */
    public final FileManager m6365B() {
        return this.f8191e;
    }

    /* renamed from: C */
    public final InterfaceC11612u m6366C() {
        return this.f8195i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6367D(com.friday.document.model.ShareFile r9, vc.InterfaceC11588c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.friday.document.viewmodel.ShareBaseViewModel$getPreviewList$1
            if (r0 == 0) goto L14
            r0 = r10
            com.friday.document.viewmodel.ShareBaseViewModel$getPreviewList$1 r0 = (com.friday.document.viewmodel.ShareBaseViewModel$getPreviewList$1) r0
            int r1 = r0.f8263f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8263f = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.document.viewmodel.ShareBaseViewModel$getPreviewList$1 r0 = new com.friday.document.viewmodel.ShareBaseViewModel$getPreviewList$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f8261d
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f8263f
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r5.f8260c
            com.friday.document.model.ShareFile r9 = (com.friday.document.model.ShareFile) r9
            kotlin.AbstractC9924b.m20071b(r10)
            goto L54
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.AbstractC9924b.m20071b(r10)
            com.friday.common.dao.ResourceDao r1 = r8.f8190d
            r10 = r2
            java.lang.String r2 = r9.getFileId()
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r9)
            r5.f8260c = r9
            r5.f8263f = r10
            r3 = 0
            r6 = 2
            r7 = 0
            java.lang.Object r10 = com.friday.common.dao.ResourceDao.m5077c(r1, r2, r3, r5, r6, r7)
            if (r10 != r0) goto L54
            return r0
        L54:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.friday.document.viewmodel.ShareBaseViewModel$a r9 = new com.friday.document.viewmodel.ShareBaseViewModel$a
            r9.<init>()
            java.util.List r9 = p325rc.AbstractC10947g0.m23914P0(r10, r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = p325rc.AbstractC10980x.m24153x(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L72:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r9.next()
            com.friday.common.entity.ResourceEntity r0 = (com.friday.common.entity.ResourceEntity) r0
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.getId()
            r1.<init>(r0)
            r10.add(r1)
            goto L72
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ShareBaseViewModel.m6367D(com.friday.document.model.ShareFile, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ShareBaseViewModel.smali:593
    }

    /* renamed from: E */
    public final void m6368E(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new ShareBaseViewModel$insertVideoCache$1(this, fileId, null), null, null, 6, null);
    }

    /* renamed from: F */
    public final void m6369F(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new ShareBaseViewModel$sendDismissEvent$1(this, shareFile, null), 3, null);
    }

    /* renamed from: G */
    public final void m6370G(ShareFile shareFile, List imageList) {
        AbstractC9979u.m20294g(imageList, "imageList");
        this.f8192f.setValue(shareFile);
        this.f8194h.setValue(imageList);
    }

    /* renamed from: I */
    public final void m6371I(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new ShareBaseViewModel$updatePreviewTime$1(this, fileId, null), null, null, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (r12.invoke(r13, r4) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (r10.invoke(r13, r4) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6372n(com.friday.document.model.ShareFile r10, p181hd.InterfaceC9544p r11, p181hd.InterfaceC9544p r12, p181hd.InterfaceC9544p r13, vc.InterfaceC11588c r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ShareBaseViewModel.m6372n(com.friday.document.model.ShareFile, hd.p, hd.p, hd.p, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ShareBaseViewModel.smali:1075
    }

    /* renamed from: p */
    public final SuspendCall m6373p(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        return new SuspendCall(new ShareBaseViewModel$clickNoteCall$1(this, shareFile, null));
    }

    /* renamed from: q */
    public final SuspendCall m6374q(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        return new SuspendCall(new ShareBaseViewModel$clickOthersCall$1(this, shareFile, null));
    }

    /* renamed from: r */
    public final SuspendCall m6375r(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        return new SuspendCall(new ShareBaseViewModel$clickTxtCall$1(this, shareFile, null));
    }

    /* renamed from: s */
    public final Object m6376s(ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new ShareBaseViewModel$doesFileExits$2(this, shareFile, z10, null), interfaceC11588c);
    }

    /* renamed from: u */
    public final Object m6377u(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new ShareBaseViewModel$downloadCover$2(this, shareFile, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: v */
    public final Object m6378v(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new ShareBaseViewModel$downloadNoteFile$2(this, shareFile, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: w */
    public final Object m6379w(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new ShareBaseViewModel$downloadOthers$2(this, shareFile, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: x */
    public final Object m6380x(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new ShareBaseViewModel$downloadTxt$2(shareFile, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: y */
    public final boolean m6381y(String str, String... strArr) {
        for (String str2 : strArr) {
            if (AbstractC10819z.m23228A(str, str2, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final InterfaceC11612u m6382z() {
        return this.f8193g;
    }
}
