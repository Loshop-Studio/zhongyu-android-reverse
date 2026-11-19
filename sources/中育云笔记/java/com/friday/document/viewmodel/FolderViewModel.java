package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingSource;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.document.repositroy.FileRepository;
import com.friday.document.service.FileManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p330s2.InterfaceC11051a;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FolderViewModel extends BaseFileViewModel {

    /* renamed from: K */
    public final FileRepository f7982K;

    /* renamed from: L */
    public final InterfaceC11603l f7983L;

    /* renamed from: M */
    public final InterfaceC11594c f7984M;

    /* renamed from: N */
    public final List f7985N;

    /* renamed from: O */
    public final List f7986O;

    /* renamed from: P */
    public final InterfaceC11602k f7987P;

    /* renamed from: Q */
    public final InterfaceC11607p f7988Q;

    /* renamed from: com.friday.document.viewmodel.FolderViewModel$a */
    public static final class C6114a implements InterfaceC9529a {

        /* renamed from: c */
        public final /* synthetic */ Pair f8005c;

        /* renamed from: d */
        public final /* synthetic */ FolderViewModel f8006d;

        public C6114a(Pair pair, FolderViewModel folderViewModel) {
            this.f8005c = pair;
            this.f8006d = folderViewModel;
        }

        @Override // p181hd.InterfaceC9529a
        public final PagingSource invoke() {
            String str = (String) this.f8005c.m20051f();
            if (str == null) {
                str = "0";
            }
            return ((Number) this.f8005c.m20052g()).intValue() == 0 ? this.f8006d.m6229M().mo4946w(str, this.f8006d.m6240X()) : this.f8006d.m6229M().mo4905C(str, this.f8006d.m6240X());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel(FileDao fileDao, ResourceDao resourceDao, InterfaceC11051a documentService, FileManager fileManager, FileRepository fileRepository) {
        super(fileDao, resourceDao, documentService, fileManager);
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(documentService, "documentService");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        AbstractC9979u.m20294g(fileRepository, "fileRepository");
        this.f7982K = fileRepository;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new Pair("0", Integer.valueOf(C5962b.f6082a.m5299a().m5282j())));
        this.f7983L = interfaceC11603lM25602a;
        this.f7984M = m6289I0(interfaceC11603lM25602a);
        this.f7985N = new ArrayList();
        this.f7986O = new ArrayList();
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f7987P = interfaceC11602kM25592b;
        this.f7988Q = AbstractC11596e.m25551a(interfaceC11602kM25592b);
    }

    /* renamed from: H0 */
    public final void m6288H0(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new FolderViewModel$clearSingleNoteCache$1(this, fileEntity, null), new FolderViewModel$clearSingleNoteCache$2(null), null, 4, null);
    }

    /* renamed from: I0 */
    public final InterfaceC11594c m6289I0(InterfaceC11612u interfaceC11612u) {
        return AbstractC11596e.m25549T(interfaceC11612u, new C6112x8fe95225(null, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6290J0(vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.friday.document.viewmodel.FolderViewModel$getCurrentFolderId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.friday.document.viewmodel.FolderViewModel$getCurrentFolderId$1 r0 = (com.friday.document.viewmodel.FolderViewModel$getCurrentFolderId$1) r0
            int r1 = r0.f8031f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8031f = r1
            goto L18
        L13:
            com.friday.document.viewmodel.FolderViewModel$getCurrentFolderId$1 r0 = new com.friday.document.viewmodel.FolderViewModel$getCurrentFolderId$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8029d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f8031f
            java.lang.String r3 = "0"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f8028c
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto L5f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.AbstractC9924b.m20071b(r7)
            vd.l r7 = r6.m6294N0()
            java.lang.Object r7 = r7.getValue()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r7 = r7.m20051f()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4d
            return r3
        L4d:
            com.friday.common.dao.FileDao r2 = r6.m6229M()
            r0.f8028c = r7
            r0.f8031f = r4
            java.lang.Object r0 = r2.mo4941r(r7, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            if (r7 == 0) goto L74
            int r1 = r7.getState()
            r2 = 30
            if (r1 == r2) goto L74
            int r7 = r7.getState()
            r1 = 3
            if (r7 != r1) goto L73
            goto L74
        L73:
            return r0
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.FolderViewModel.m6290J0(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/FolderViewModel.smali:347
    }

    /* renamed from: K0 */
    public final InterfaceC11594c m6291K0(String str) {
        if (str == null) {
            return this.f7984M;
        }
        Iterator it = this.f7985N.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC9979u.m20289b(((Pair) ((InterfaceC11603l) it.next()).getValue()).m20051f(), str)) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? this.f7984M : (InterfaceC11594c) this.f7986O.get(i10);
    }

    /* renamed from: L0 */
    public final Object m6292L0(String str, InterfaceC11588c interfaceC11588c) {
        return m6229M().mo4941r(str, interfaceC11588c);
    }

    /* renamed from: M0 */
    public final InterfaceC11607p m6293M0() {
        return this.f7988Q;
    }

    /* renamed from: N0 */
    public final InterfaceC11603l m6294N0() {
        InterfaceC11603l interfaceC11603l = (InterfaceC11603l) AbstractC10947g0.m23957z0(this.f7985N);
        return interfaceC11603l == null ? this.f7983L : interfaceC11603l;
    }

    /* renamed from: O0 */
    public final void m6295O0(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), C11157r0.m24799b(), null, new FolderViewModel$retrySyncSingleFile$1(this, fileEntity, null), 2, null);
    }

    /* renamed from: P0 */
    public final void m6296P0() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderViewModel$updateSortType$1(this, null), 3, null);
    }

    @Override // com.friday.document.viewmodel.BaseFileViewModel
    /* renamed from: k0 */
    public void mo6253k0(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new Pair(fileId, Integer.valueOf(C5962b.f6082a.m5299a().m5282j())));
        this.f7985N.add(interfaceC11603lM25602a);
        this.f7986O.add(m6289I0(interfaceC11603lM25602a));
    }

    @Override // com.friday.document.viewmodel.BaseFileViewModel
    /* renamed from: l0 */
    public void mo6254l0() {
        this.f7985N.clear();
        this.f7986O.clear();
    }

    @Override // com.friday.document.viewmodel.BaseFileViewModel
    /* renamed from: m0 */
    public void mo6255m0() {
        AbstractC10937b0.m23871P(this.f7985N);
        AbstractC10937b0.m23871P(this.f7986O);
    }
}
