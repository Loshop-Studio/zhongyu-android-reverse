package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.ResourceDao;
import com.friday.common.helper.C5962b;
import com.friday.document.model.ShareFile;
import com.friday.document.service.FileManager;
import com.friday.document.viewmodel.StudentShareViewModel;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p110d2.InterfaceC8919i;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
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
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudentShareViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11052b f8325b;

    /* renamed from: c */
    public final InterfaceC8919i f8326c;

    /* renamed from: d */
    public final InterfaceC5250g2 f8327d;

    /* renamed from: e */
    public final ResourceDao f8328e;

    /* renamed from: f */
    public final FileManager f8329f;

    /* renamed from: g */
    public final InterfaceC11602k f8330g;

    /* renamed from: h */
    public final InterfaceC11607p f8331h;

    /* renamed from: i */
    public final MutableLiveData f8332i;

    /* renamed from: j */
    public final LiveData f8333j;

    /* renamed from: k */
    public final InterfaceC11603l f8334k;

    /* renamed from: l */
    public final InterfaceC11612u f8335l;

    /* renamed from: m */
    public final String f8336m;

    /* renamed from: n */
    public final MutableLiveData f8337n;

    /* renamed from: o */
    public int f8338o;

    /* renamed from: p */
    public final LiveData f8339p;

    /* renamed from: q */
    public final MutableLiveData f8340q;

    /* renamed from: r */
    public final MutableLiveData f8341r;

    /* renamed from: s */
    public final MutableLiveData f8342s;

    /* renamed from: t */
    public final MutableLiveData f8343t;

    /* renamed from: u */
    public final HashMap f8344u;

    /* renamed from: v */
    public final MutableLiveData f8345v;

    /* renamed from: w */
    public final MutableLiveData f8346w;

    /* renamed from: x */
    public final InterfaceC11603l f8347x;

    /* renamed from: y */
    public final InterfaceC11612u f8348y;

    /* renamed from: com.friday.document.viewmodel.StudentShareViewModel$a */
    public static final class C6128a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(((ShareFile) obj2).getUpdateTime(), ((ShareFile) obj).getUpdateTime());
        }
    }

    public StudentShareViewModel(InterfaceC11052b shareService, InterfaceC8919i ezyService, InterfaceC5250g2 shareCacheDao, ResourceDao resourceDao, FileManager fileManager) {
        AbstractC9979u.m20294g(shareService, "shareService");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f8325b = shareService;
        this.f8326c = ezyService;
        this.f8327d = shareCacheDao;
        this.f8328e = resourceDao;
        this.f8329f = fileManager;
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f8330g = interfaceC11602kM25592b;
        this.f8331h = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f8332i = mutableLiveData;
        this.f8333j = mutableLiveData;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this.f8334k = interfaceC11603lM25602a;
        this.f8335l = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        this.f8336m = externalAppDataPath + str + "share" + str + m6440G() + str;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f8337n = mutableLiveData2;
        this.f8338o = C5962b.f6082a.m5299a().m5288p();
        this.f8339p = Transformations.map(mutableLiveData2, new InterfaceC9540l() { // from class: z2.n0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return StudentShareViewModel.m6437C(this.f28369c, (List) obj);
            }
        });
        this.f8340q = new MutableLiveData();
        this.f8341r = new MutableLiveData();
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f8342s = mutableLiveData3;
        this.f8343t = mutableLiveData3;
        this.f8344u = new HashMap();
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f8345v = mutableLiveData4;
        this.f8346w = mutableLiveData4;
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8347x = interfaceC11603lM25602a2;
        this.f8348y = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
    }

    /* renamed from: C */
    public static final List m6437C(StudentShareViewModel studentShareViewModel, List list) {
        List listM23914P0;
        if (list == null) {
            return null;
        }
        if (studentShareViewModel.f8338o == 0) {
            listM23914P0 = AbstractC10947g0.m23914P0(list, new C6128a());
        } else {
            final InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: z2.o0
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(StudentShareViewModel.m6438D((ShareFile) obj, (ShareFile) obj2));
                }
            };
            listM23914P0 = AbstractC10947g0.m23914P0(list, new Comparator() { // from class: z2.p0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StudentShareViewModel.m6439E(interfaceC9544p, obj, obj2);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM23914P0) {
            if (AbstractC9979u.m20289b(((ShareFile) obj).getType(), "0")) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return AbstractC10947g0.m23906H0((List) pair.m20048a(), (List) pair.m20049c());
    }

    /* renamed from: D */
    public static final int m6438D(ShareFile shareFile, ShareFile shareFile2) {
        return Collator.getInstance(Locale.CHINESE).compare(shareFile.getFileName(), shareFile2.getFileName());
    }

    /* renamed from: E */
    public static final int m6439E(InterfaceC9544p interfaceC9544p, Object obj, Object obj2) {
        return ((Number) interfaceC9544p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final long m6440G() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: q */
    public static /* synthetic */ Object m6451q(StudentShareViewModel studentShareViewModel, ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return studentShareViewModel.m6457p(shareFile, z10, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final boolean m6452w(String str, String... strArr) {
        for (String str2 : strArr) {
            if (AbstractC10819z.m23228A(str, str2, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final MutableLiveData m6453A() {
        return this.f8341r;
    }

    /* renamed from: B */
    public final MutableLiveData m6454B() {
        return this.f8340q;
    }

    /* renamed from: F */
    public final void m6455F(ShareFile shareFile) {
        this.f8342s.postValue(shareFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r2.emit(r4, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6456o(java.lang.String r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.friday.document.viewmodel.StudentShareViewModel$doSearch$1
            if (r0 == 0) goto L13
            r0 = r9
            com.friday.document.viewmodel.StudentShareViewModel$doSearch$1 r0 = (com.friday.document.viewmodel.StudentShareViewModel$doSearch$1) r0
            int r1 = r0.f8353g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8353g = r1
            goto L18
        L13:
            com.friday.document.viewmodel.StudentShareViewModel$doSearch$1 r0 = new com.friday.document.viewmodel.StudentShareViewModel$doSearch$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f8351e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f8353g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L63
            if (r2 == r6) goto L5b
            if (r2 == r5) goto L52
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f8350d
            java.lang.Exception r8 = (java.lang.Exception) r8
            java.lang.Object r8 = r0.f8349c
            java.lang.String r8 = (java.lang.String) r8
            kotlin.AbstractC9924b.m20071b(r9)
            goto Ld9
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f8350d
            com.friday.common.property.BaseResponse r8 = (com.friday.common.property.BaseResponse) r8
            java.lang.Object r8 = r0.f8349c
            java.lang.String r8 = (java.lang.String) r8
        L4b:
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Exception -> L50
            goto Ld9
        L50:
            r9 = move-exception
            goto Lbb
        L52:
            java.lang.Object r8 = r0.f8350d
            com.friday.common.property.BaseResponse r8 = (com.friday.common.property.BaseResponse) r8
            java.lang.Object r8 = r0.f8349c
            java.lang.String r8 = (java.lang.String) r8
            goto L4b
        L5b:
            java.lang.Object r8 = r0.f8349c
            java.lang.String r8 = (java.lang.String) r8
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Exception -> L50
            goto L77
        L63:
            kotlin.AbstractC9924b.m20071b(r9)
            s2.b r9 = r7.f8325b     // Catch: java.lang.Exception -> L50
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r8)     // Catch: java.lang.Exception -> L50
            r0.f8349c = r2     // Catch: java.lang.Exception -> L50
            r0.f8353g = r6     // Catch: java.lang.Exception -> L50
            java.lang.Object r9 = r9.m24503b(r8, r0)     // Catch: java.lang.Exception -> L50
            if (r9 != r1) goto L77
            goto Ld8
        L77:
            com.friday.common.property.BaseResponse r9 = (com.friday.common.property.BaseResponse) r9     // Catch: java.lang.Exception -> L50
            int r2 = r9.getCode()     // Catch: java.lang.Exception -> L50
            if (r2 != 0) goto La0
            vd.l r2 = r7.f8347x     // Catch: java.lang.Exception -> L50
            java.lang.Object r4 = r9.getData()     // Catch: java.lang.Exception -> L50
            com.friday.document.model.StudentShareEntity r4 = (com.friday.document.model.StudentShareEntity) r4     // Catch: java.lang.Exception -> L50
            java.util.List r4 = r4.getShareFileList()     // Catch: java.lang.Exception -> L50
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r8)     // Catch: java.lang.Exception -> L50
            r0.f8349c = r6     // Catch: java.lang.Exception -> L50
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r9)     // Catch: java.lang.Exception -> L50
            r0.f8350d = r9     // Catch: java.lang.Exception -> L50
            r0.f8353g = r5     // Catch: java.lang.Exception -> L50
            java.lang.Object r8 = r2.emit(r4, r0)     // Catch: java.lang.Exception -> L50
            if (r8 != r1) goto Ld9
            goto Ld8
        La0:
            vd.l r2 = r7.f8347x     // Catch: java.lang.Exception -> L50
            java.util.List r5 = p325rc.AbstractC10978w.m24136n()     // Catch: java.lang.Exception -> L50
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r8)     // Catch: java.lang.Exception -> L50
            r0.f8349c = r6     // Catch: java.lang.Exception -> L50
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r9)     // Catch: java.lang.Exception -> L50
            r0.f8350d = r9     // Catch: java.lang.Exception -> L50
            r0.f8353g = r4     // Catch: java.lang.Exception -> L50
            java.lang.Object r8 = r2.emit(r5, r0)     // Catch: java.lang.Exception -> L50
            if (r8 != r1) goto Ld9
            goto Ld8
        Lbb:
            r9.printStackTrace()
            vd.l r2 = r7.f8347x
            java.util.List r4 = p325rc.AbstractC10978w.m24136n()
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
            r0.f8349c = r8
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r9)
            r0.f8350d = r8
            r0.f8353g = r3
            java.lang.Object r8 = r2.emit(r4, r0)
            if (r8 != r1) goto Ld9
        Ld8:
            return r1
        Ld9:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.StudentShareViewModel.m6456o(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/StudentShareViewModel.smali:1023
    }

    /* renamed from: p */
    public final Object m6457p(ShareFile shareFile, boolean z10, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new StudentShareViewModel$doesFileExits$2(this, shareFile, z10, null), interfaceC11588c);
    }

    /* renamed from: r */
    public final void m6458r(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        BaseViewModel.m4802c(this, new StudentShareViewModel$downloadNoteFile$1(this, shareFile, null), new StudentShareViewModel$downloadNoteFile$2(this, null), null, 4, null);
    }

    /* renamed from: s */
    public final void m6459s(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        this.f8341r.postValue(shareFile);
    }

    /* renamed from: t */
    public final void m6460t(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        BaseViewModel.m4802c(this, new StudentShareViewModel$downloadOthers$1(this, shareFile, null), new StudentShareViewModel$downloadOthers$2(this, null), null, 4, null);
    }

    /* renamed from: u */
    public final void m6461u(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        BaseViewModel.m4802c(this, new StudentShareViewModel$downloadTxt$1(this, shareFile, null), new StudentShareViewModel$downloadTxt$2(this, null), null, 4, null);
    }

    /* renamed from: v */
    public final void m6462v(ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        this.f8340q.postValue(shareFile);
    }

    /* renamed from: x */
    public final MutableLiveData m6463x() {
        return this.f8343t;
    }

    /* renamed from: y */
    public final FileManager m6464y() {
        return this.f8329f;
    }

    /* renamed from: z */
    public final InterfaceC11612u m6465z() {
        return this.f8348y;
    }
}
