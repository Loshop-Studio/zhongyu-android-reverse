package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.document.service.FileManager;
import com.friday.document.viewmodel.RecycleBinViewModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p330s2.InterfaceC11051a;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class RecycleBinViewModel extends BaseFileViewModel {

    /* renamed from: K */
    public final InterfaceC11594c f8112K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinViewModel(final FileDao fileDao, ResourceDao resourceDao, InterfaceC11051a documentService, FileManager fileManager) {
        super(fileDao, resourceDao, documentService, fileManager);
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(documentService, "documentService");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        final InterfaceC11594c interfaceC11594cM25534E = AbstractC11596e.m25534E(new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), null, new InterfaceC9529a() { // from class: z2.q
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return RecycleBinViewModel.m6332I0(fileDao, this);
            }
        }, 2, null).getFlow(), C11157r0.m24799b());
        this.f8112K = CachedPagingDataKt.cachedIn(new InterfaceC11594c() { // from class: com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1

            /* renamed from: com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2 */
            public static final class C61192 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f8115c;

                /* renamed from: d */
                public final /* synthetic */ RecycleBinViewModel f8116d;

                @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2", m26211f = "RecycleBinViewModel.kt", m26212l = {50}, m26213m = "emit")
                /* renamed from: com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f8117c;

                    /* renamed from: d */
                    public int f8118d;

                    /* renamed from: e */
                    public Object f8119e;

                    /* renamed from: g */
                    public Object f8121g;

                    /* renamed from: h */
                    public Object f8122h;

                    /* renamed from: i */
                    public Object f8123i;

                    /* renamed from: j */
                    public int f8124j;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8117c = obj;
                        this.f8118d |= Integer.MIN_VALUE;
                        return C61192.this.emit(null, this);
                    }
                }

                public C61192(InterfaceC11595d interfaceC11595d, RecycleBinViewModel recycleBinViewModel) {
                    this.f8115c = interfaceC11595d;
                    this.f8116d = recycleBinViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1.C61192.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2$1 r0 = (com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1.C61192.AnonymousClass1) r0
                        int r1 = r0.f8118d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8118d = r1
                        goto L18
                    L13:
                        com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2$1 r0 = new com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f8117c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f8118d
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r8 = r0.f8123i
                        vd.d r8 = (p379vd.InterfaceC11595d) r8
                        java.lang.Object r8 = r0.f8121g
                        com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1$2$1 r8 = (com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1.C61192.AnonymousClass1) r8
                        kotlin.AbstractC9924b.m20071b(r9)
                        goto L7a
                    L31:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L39:
                        kotlin.AbstractC9924b.m20071b(r9)
                        vd.d r9 = r7.f8115c
                        r2 = r8
                        androidx.paging.PagingData r2 = (androidx.paging.PagingData) r2
                        com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$1 r4 = new com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$1
                        com.friday.document.viewmodel.RecycleBinViewModel r5 = r7.f8116d
                        r6 = 0
                        r4.<init>(r5, r6)
                        androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.filter(r2, r4)
                        com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$2 r4 = new com.friday.document.viewmodel.RecycleBinViewModel$dataFlow$2$2
                        r4.<init>(r6)
                        androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.map(r2, r4)
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r8)
                        r0.f8119e = r4
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                        r0.f8121g = r4
                        java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                        r0.f8122h = r8
                        java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r9)
                        r0.f8123i = r8
                        r8 = 0
                        r0.f8124j = r8
                        r0.f8118d = r3
                        java.lang.Object r8 = r9.emit(r2, r0)
                        if (r8 != r1) goto L7a
                        return r1
                    L7a:
                        qc.q r8 = p309qc.C10786q.f26013a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.RecycleBinViewModel$special$$inlined$map$1.C61192.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/RecycleBinViewModel$special$$inlined$map$1$2.smali:49
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594cM25534E.collect(new C61192(interfaceC11595d, this), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: I0 */
    public static final PagingSource m6332I0(FileDao fileDao, RecycleBinViewModel recycleBinViewModel) {
        return fileDao.mo4918Q("-1", recycleBinViewModel.m6240X());
    }

    /* renamed from: H0 */
    public final void m6333H0() {
        BaseViewModel.m4802c(this, new RecycleBinViewModel$checkExpiredItems$1(this, null), null, null, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6334J0(com.friday.common.entity.FileEntity r11, java.util.List r12, vc.InterfaceC11588c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.RecycleBinViewModel.m6334J0(com.friday.common.entity.FileEntity, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/RecycleBinViewModel.smali:310
    }

    /* renamed from: K0 */
    public final void m6335K0(List fileIdList) {
        AbstractC9979u.m20294g(fileIdList, "fileIdList");
        BaseViewModel.m4802c(this, new RecycleBinViewModel$deleteDocument$1(this, fileIdList, null), new RecycleBinViewModel$deleteDocument$2(null), null, 4, null);
    }

    /* renamed from: L0 */
    public final InterfaceC11594c m6336L0() {
        return this.f8112K;
    }

    /* renamed from: M0 */
    public final boolean m6337M0(FileEntity fileEntity) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        Date date = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
        if (date != null) {
            return date.before(simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(fileEntity.getExpiredTime() * 1000))));
        }
        return false;
    }

    /* renamed from: N0 */
    public final Object m6338N0(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new RecycleBinViewModel$resDelete$2(this, fileEntity, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }
}
