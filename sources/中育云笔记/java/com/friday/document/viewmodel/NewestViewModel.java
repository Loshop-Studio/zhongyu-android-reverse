package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.document.repositroy.FileRepository;
import com.friday.document.service.FileManager;
import com.friday.document.viewmodel.NewestViewModel;
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
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NewestViewModel extends BaseFileViewModel {

    /* renamed from: K */
    public final FileRepository f8063K;

    /* renamed from: L */
    public final InterfaceC11594c f8064L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestViewModel(final FileDao fileDao, ResourceDao resourceDao, InterfaceC11051a documentService, FileManager fileManager, FileRepository fileRepository) {
        super(fileDao, resourceDao, documentService, fileManager);
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(documentService, "documentService");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        AbstractC9979u.m20294g(fileRepository, "fileRepository");
        this.f8063K = fileRepository;
        final InterfaceC11594c flow = new Pager(new PagingConfig(20, 1, false, 0, 0, 0, 60, null), null, new InterfaceC9529a() { // from class: z2.i
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NewestViewModel.m6315F0(fileDao, this);
            }
        }, 2, null).getFlow();
        this.f8064L = CachedPagingDataKt.cachedIn(AbstractC11596e.m25560j(CachedPagingDataKt.cachedIn(new InterfaceC11594c() { // from class: com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1

            /* renamed from: com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2 */
            public static final class C61162 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f8067c;

                /* renamed from: d */
                public final /* synthetic */ NewestViewModel f8068d;

                @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2", m26211f = "NewestViewModel.kt", m26212l = {50}, m26213m = "emit")
                /* renamed from: com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f8069c;

                    /* renamed from: d */
                    public int f8070d;

                    /* renamed from: e */
                    public Object f8071e;

                    /* renamed from: g */
                    public Object f8073g;

                    /* renamed from: h */
                    public Object f8074h;

                    /* renamed from: i */
                    public Object f8075i;

                    /* renamed from: j */
                    public int f8076j;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8069c = obj;
                        this.f8070d |= Integer.MIN_VALUE;
                        return C61162.this.emit(null, this);
                    }
                }

                public C61162(InterfaceC11595d interfaceC11595d, NewestViewModel newestViewModel) {
                    this.f8067c = interfaceC11595d;
                    this.f8068d = newestViewModel;
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
                        boolean r0 = r9 instanceof com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1.C61162.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2$1 r0 = (com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1.C61162.AnonymousClass1) r0
                        int r1 = r0.f8070d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8070d = r1
                        goto L18
                    L13:
                        com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2$1 r0 = new com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.f8069c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f8070d
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r8 = r0.f8075i
                        vd.d r8 = (p379vd.InterfaceC11595d) r8
                        java.lang.Object r8 = r0.f8073g
                        com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1$2$1 r8 = (com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1.C61162.AnonymousClass1) r8
                        kotlin.AbstractC9924b.m20071b(r9)
                        goto L71
                    L31:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L39:
                        kotlin.AbstractC9924b.m20071b(r9)
                        vd.d r9 = r7.f8067c
                        r2 = r8
                        androidx.paging.PagingData r2 = (androidx.paging.PagingData) r2
                        com.friday.document.viewmodel.NewestViewModel$allFiles$2$1 r4 = new com.friday.document.viewmodel.NewestViewModel$allFiles$2$1
                        com.friday.document.viewmodel.NewestViewModel r5 = r7.f8068d
                        r6 = 0
                        r4.<init>(r5, r6)
                        androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.map(r2, r4)
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r8)
                        r0.f8071e = r4
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                        r0.f8073g = r4
                        java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                        r0.f8074h = r8
                        java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r9)
                        r0.f8075i = r8
                        r8 = 0
                        r0.f8076j = r8
                        r0.f8070d = r3
                        java.lang.Object r8 = r9.emit(r2, r0)
                        if (r8 != r1) goto L71
                        return r1
                    L71:
                        qc.q r8 = p309qc.C10786q.f26013a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.NewestViewModel$special$$inlined$map$1.C61162.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/NewestViewModel$special$$inlined$map$1$2.smali:49
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow.collect(new C61162(interfaceC11595d, this), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, ViewModelKt.getViewModelScope(this)), FlowLiveDataConversions.asFlow(m6242Z()), m6243a0(), FlowLiveDataConversions.asFlow(m6241Y()), new NewestViewModel$allFiles$3$1(null)), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: F0 */
    public static final PagingSource m6315F0(FileDao fileDao, NewestViewModel newestViewModel) {
        return fileDao.mo4938o(newestViewModel.m6240X());
    }

    /* renamed from: G0 */
    public final void m6316G0() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new NewestViewModel$cancelSyncJob$1(this, null), 3, null);
    }

    /* renamed from: H0 */
    public final void m6317H0(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new NewestViewModel$clearSingleNoteCache$1(this, fileEntity, null), new NewestViewModel$clearSingleNoteCache$2(null), null, 4, null);
    }

    /* renamed from: I0 */
    public final InterfaceC11594c m6318I0() {
        return this.f8064L;
    }

    /* renamed from: J0 */
    public final void m6319J0(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), C11157r0.m24799b(), null, new NewestViewModel$retrySyncSingleFile$1(this, fileEntity, null), 2, null);
    }
}
