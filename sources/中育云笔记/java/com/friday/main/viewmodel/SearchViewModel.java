package com.friday.main.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagingSource;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.main.viewmodel.SearchViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p200j2.InterfaceC9664d;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10968r;
import p356u3.InterfaceC11365b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11603l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SearchViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f9650b;

    /* renamed from: c */
    public final InterfaceC9664d f9651c;

    /* renamed from: d */
    public final InterfaceC11365b f9652d;

    /* renamed from: e */
    public final ResourceDao f9653e;

    /* renamed from: f */
    public final InterfaceC11603l f9654f;

    /* renamed from: g */
    public final InterfaceC11594c f9655g;

    /* renamed from: h */
    public final MutableLiveData f9656h;

    /* renamed from: i */
    public final MutableLiveData f9657i;

    /* renamed from: j */
    public final MutableLiveData f9658j;

    /* renamed from: k */
    public final MutableLiveData f9659k;

    /* renamed from: l */
    public final MutableLiveData f9660l;

    /* renamed from: com.friday.main.viewmodel.SearchViewModel$a */
    public static final class C6227a implements InterfaceC9529a {

        /* renamed from: c */
        public final /* synthetic */ String f9677c;

        /* renamed from: d */
        public final /* synthetic */ SearchViewModel f9678d;

        public C6227a(String str, SearchViewModel searchViewModel) {
            this.f9677c = str;
            this.f9678d = searchViewModel;
        }

        @Override // p181hd.InterfaceC9529a
        public final PagingSource invoke() {
            return AbstractC10793c0.m23132h0(this.f9677c) ? this.f9678d.f9650b.mo4916O() : this.f9678d.f9650b.mo4908F(this.f9677c, C5962b.f6082a.m5299a().m5292t());
        }
    }

    public SearchViewModel(FileDao fileDao, InterfaceC9664d fileManager, InterfaceC11365b homeService, ResourceDao resourceDao) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        AbstractC9979u.m20294g(homeService, "homeService");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        this.f9650b = fileDao;
        this.f9651c = fileManager;
        this.f9652d = homeService;
        this.f9653e = resourceDao;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a("");
        this.f9654f = interfaceC11603lM25602a;
        this.f9655g = AbstractC11596e.m25549T(AbstractC11596e.m25564n(AbstractC11596e.m25544O(interfaceC11603lM25602a, 200L)), new SearchViewModel$special$$inlined$flatMapLatest$1(null, this));
        this.f9656h = new MutableLiveData();
        this.f9657i = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f9658j = mutableLiveData;
        this.f9659k = mutableLiveData;
        this.f9660l = new MutableLiveData();
    }

    /* renamed from: o */
    public static final C10786q m7276o(SearchViewModel searchViewModel, FileEntity fileEntity) {
        searchViewModel.f9660l.setValue(fileEntity);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final FileEntity m7277s(FileEntity fileEntity) {
        if (!AbstractC9979u.m20289b(fileEntity.getFileType(), "0")) {
            int state = fileEntity.getState();
            if (state == 1 || state == 2 || state == 4) {
                fileEntity.setSyncStatus(2);
                return fileEntity;
            }
            if (state == 5 || state == 10 || state == 30) {
                fileEntity.setSyncStatus(1);
                return fileEntity;
            }
            fileEntity.setSyncStatus(0);
            return fileEntity;
        }
        List listMo4921T = this.f9650b.mo4921T(fileEntity.getFileId(), m7278y());
        boolean z10 = listMo4921T instanceof Collection;
        if (!z10 || !listMo4921T.isEmpty()) {
            Iterator it = listMo4921T.iterator();
            while (it.hasNext()) {
                if (AbstractC10968r.m24090m0(new Integer[]{10, 5, 30}, Integer.valueOf(((Number) it.next()).intValue()))) {
                    fileEntity.setSyncStatus(1);
                    return fileEntity;
                }
            }
        }
        if (!z10 || !listMo4921T.isEmpty()) {
            Iterator it2 = listMo4921T.iterator();
            while (it2.hasNext()) {
                if (AbstractC10968r.m24090m0(new Integer[]{4, 1, 2}, Integer.valueOf(((Number) it2.next()).intValue()))) {
                    fileEntity.setSyncStatus(2);
                    return fileEntity;
                }
            }
        }
        fileEntity.setSyncStatus(0);
        return fileEntity;
    }

    /* renamed from: y */
    private final long m7278y() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7279j(com.friday.common.entity.FileEntity r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.friday.main.viewmodel.SearchViewModel$doesFileExits$1
            if (r0 == 0) goto L14
            r0 = r11
            com.friday.main.viewmodel.SearchViewModel$doesFileExits$1 r0 = (com.friday.main.viewmodel.SearchViewModel$doesFileExits$1) r0
            int r1 = r0.f9689g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9689g = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.main.viewmodel.SearchViewModel$doesFileExits$1 r0 = new com.friday.main.viewmodel.SearchViewModel$doesFileExits$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f9687e
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f9689g
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L3e
            if (r1 != r8) goto L36
            java.lang.Object r10 = r5.f9686d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r5.f9685c
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            kotlin.AbstractC9924b.m20071b(r11)
            goto L85
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r5.f9685c
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            kotlin.AbstractC9924b.m20071b(r11)
            goto L5f
        L46:
            kotlin.AbstractC9924b.m20071b(r11)
            com.friday.common.dao.ResourceDao r1 = r9.f9653e
            r11 = r2
            java.lang.String r2 = r10.getFileId()
            r5.f9685c = r10
            r5.f9689g = r11
            r3 = 0
            r6 = 2
            r7 = 0
            java.lang.Object r11 = com.friday.common.dao.ResourceDao.m5077c(r1, r2, r3, r5, r6, r7)
            if (r11 != r0) goto L5f
            goto L84
        L5f:
            java.util.List r11 = (java.util.List) r11
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L90
            com.friday.common.dao.FileDao r1 = r9.f9650b
            java.lang.String r2 = r10.getFileId()
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r10)
            r5.f9685c = r10
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r11)
            r5.f9686d = r10
            r5.f9689g = r8
            java.lang.Object r11 = r1.mo4926Y(r2, r5)
            if (r11 != r0) goto L85
        L84:
            return r0
        L85:
            com.friday.common.entity.FileEntity r11 = (com.friday.common.entity.FileEntity) r11
            if (r11 == 0) goto L8e
            boolean r10 = r11.getCached()
            goto Lae
        L8e:
            r10 = 0
            goto Lae
        L90:
            java.lang.String r10 = r10.getLocalFileUrl()
            java.lang.String r11 = java.io.File.separator
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = "index.json"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            boolean r10 = com.blankj.utilcode.util.FileUtils.isFileExists(r10)
        Lae:
            java.lang.Boolean r10 = p409xc.AbstractC11826a.m26206a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.SearchViewModel.m7279j(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/SearchViewModel.smali:745
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7280k(java.lang.String r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.friday.main.viewmodel.SearchViewModel$doesOfficeAndMicroClassFileExits$1
            if (r0 == 0) goto L13
            r0 = r6
            com.friday.main.viewmodel.SearchViewModel$doesOfficeAndMicroClassFileExits$1 r0 = (com.friday.main.viewmodel.SearchViewModel$doesOfficeAndMicroClassFileExits$1) r0
            int r1 = r0.f9693f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9693f = r1
            goto L18
        L13:
            com.friday.main.viewmodel.SearchViewModel$doesOfficeAndMicroClassFileExits$1 r0 = new com.friday.main.viewmodel.SearchViewModel$doesOfficeAndMicroClassFileExits$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9691d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f9693f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f9690c
            java.lang.String r5 = (java.lang.String) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            com.friday.common.dao.FileDao r6 = r4.f9650b
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f9690c = r2
            r0.f9693f = r3
            java.lang.Object r6 = r6.mo4926Y(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            if (r6 == 0) goto L52
            boolean r5 = r6.getCached()
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.Boolean r5 = p409xc.AbstractC11826a.m26206a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.SearchViewModel.m7280k(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/SearchViewModel.smali:1132
    }

    /* renamed from: l */
    public final void m7281l(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new SearchViewModel$downloadFile$1(this, fileEntity, null), new SearchViewModel$downloadFile$2(this, null), null, 4, null);
    }

    /* renamed from: m */
    public final void m7282m(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new SearchViewModel$downloadMicroClass$1(this, fileEntity, null), new SearchViewModel$downloadMicroClass$2(this, null), null, 4, null);
    }

    /* renamed from: n */
    public final void m7283n(final FileEntity file) {
        AbstractC9979u.m20294g(file, "file");
        m4804b(new SearchViewModel$downloadOffice$1(this, file, null), new SearchViewModel$downloadOffice$2(this, null), new InterfaceC9529a() { // from class: w3.o
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return SearchViewModel.m7276o(this.f27805c, file);
            }
        });
    }

    /* renamed from: p */
    public final void m7284p(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new SearchViewModel$downloadTxt$1(this, fileEntity, null), new SearchViewModel$downloadTxt$2(this, null), null, 4, null);
    }

    /* renamed from: q */
    public final InterfaceC11594c m7285q() {
        return this.f9655g;
    }

    /* renamed from: r */
    public final MutableLiveData m7286r() {
        return this.f9660l;
    }

    /* renamed from: t */
    public final MutableLiveData m7287t() {
        return this.f9659k;
    }

    /* renamed from: u */
    public final MutableLiveData m7288u() {
        return this.f9657i;
    }

    /* renamed from: v */
    public final MutableLiveData m7289v() {
        return this.f9656h;
    }

    /* renamed from: w */
    public final void m7290w(FileEntity fileEntity) {
        this.f9658j.postValue(fileEntity);
    }

    /* renamed from: x */
    public final void m7291x(String keyword) {
        Object value;
        AbstractC9979u.m20294g(keyword, "keyword");
        InterfaceC11603l interfaceC11603l = this.f9654f;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, keyword));
    }
}
