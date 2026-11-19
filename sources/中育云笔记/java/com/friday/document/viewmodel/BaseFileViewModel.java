package com.friday.document.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.NoteBean;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.friday.document.model.FolderLevelEntity;
import com.friday.document.service.FileManager;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p330s2.InterfaceC11051a;
import p364uc.AbstractC11382b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseFileViewModel extends BaseViewModel {

    /* renamed from: A */
    public final MutableLiveData f7799A;

    /* renamed from: B */
    public final MutableLiveData f7800B;

    /* renamed from: C */
    public final MutableLiveData f7801C;

    /* renamed from: D */
    public final MutableLiveData f7802D;

    /* renamed from: E */
    public final MutableLiveData f7803E;

    /* renamed from: F */
    public final MutableLiveData f7804F;

    /* renamed from: G */
    public final LiveData f7805G;

    /* renamed from: H */
    public final InterfaceC11603l f7806H;

    /* renamed from: I */
    public final InterfaceC11612u f7807I;

    /* renamed from: J */
    public final LiveData f7808J;

    /* renamed from: b */
    public final FileDao f7809b;

    /* renamed from: c */
    public final ResourceDao f7810c;

    /* renamed from: d */
    public final InterfaceC11051a f7811d;

    /* renamed from: e */
    public final FileManager f7812e;

    /* renamed from: f */
    public final String f7813f;

    /* renamed from: g */
    public final InterfaceC10773d f7814g;

    /* renamed from: h */
    public final MutableLiveData f7815h;

    /* renamed from: i */
    public final LiveData f7816i;

    /* renamed from: j */
    public final InterfaceC11602k f7817j;

    /* renamed from: k */
    public final InterfaceC11607p f7818k;

    /* renamed from: l */
    public final InterfaceC11602k f7819l;

    /* renamed from: m */
    public final InterfaceC11607p f7820m;

    /* renamed from: n */
    public final LinkedList f7821n;

    /* renamed from: o */
    public final InterfaceC11602k f7822o;

    /* renamed from: p */
    public final InterfaceC11607p f7823p;

    /* renamed from: q */
    public final MutableLiveData f7824q;

    /* renamed from: r */
    public final LiveData f7825r;

    /* renamed from: s */
    public final MutableLiveData f7826s;

    /* renamed from: t */
    public final MutableLiveData f7827t;

    /* renamed from: u */
    public final InterfaceC11603l f7828u;

    /* renamed from: v */
    public final InterfaceC11612u f7829v;

    /* renamed from: w */
    public final InterfaceC11602k f7830w;

    /* renamed from: x */
    public final InterfaceC11607p f7831x;

    /* renamed from: y */
    public final MutableLiveData f7832y;

    /* renamed from: z */
    public final MutableLiveData f7833z;

    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$a */
    public static final class C6105a extends TypeToken<ArrayList<String>> {
    }

    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$b */
    public static final class C6106b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((ResourceEntity) obj).getPageIndex()), Integer.valueOf(((ResourceEntity) obj2).getPageIndex()));
        }
    }

    /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$c */
    public static final class C6107c extends TypeToken<ArrayList<String>> {
    }

    public BaseFileViewModel(FileDao fileDao, ResourceDao resourceDao, InterfaceC11051a documentService, FileManager fileManager) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(documentService, "documentService");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f7809b = fileDao;
        this.f7810c = resourceDao;
        this.f7811d = documentService;
        this.f7812e = fileManager;
        this.f7813f = C5962b.f6082a.m5299a().m5284l();
        this.f7814g = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: z2.b
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Long.valueOf(BaseFileViewModel.m6200C0());
            }
        });
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f7815h = mutableLiveData;
        this.f7816i = mutableLiveData;
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f7817j = interfaceC11602kM25592b;
        this.f7818k = interfaceC11602kM25592b;
        InterfaceC11602k interfaceC11602kM25592b2 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f7819l = interfaceC11602kM25592b2;
        this.f7820m = interfaceC11602kM25592b2;
        this.f7821n = new LinkedList();
        InterfaceC11602k interfaceC11602kM25592b3 = AbstractC11608q.m25592b(0, 0, null, 6, null);
        this.f7822o = interfaceC11602kM25592b3;
        this.f7823p = AbstractC11596e.m25551a(interfaceC11602kM25592b3);
        MutableLiveData mutableLiveData2 = new MutableLiveData(null);
        this.f7824q = mutableLiveData2;
        this.f7825r = mutableLiveData2;
        this.f7826s = new MutableLiveData();
        this.f7827t = new MutableLiveData();
        Boolean bool = Boolean.FALSE;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(bool);
        this.f7828u = interfaceC11603lM25602a;
        this.f7829v = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11602k interfaceC11602kM25592b4 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f7830w = interfaceC11602kM25592b4;
        this.f7831x = AbstractC11596e.m25551a(interfaceC11602kM25592b4);
        this.f7832y = new MutableLiveData();
        this.f7833z = new MutableLiveData();
        this.f7799A = new MutableLiveData();
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f7800B = mutableLiveData3;
        this.f7801C = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f7802D = mutableLiveData4;
        this.f7803E = mutableLiveData4;
        MutableLiveData mutableLiveData5 = new MutableLiveData(bool);
        this.f7804F = mutableLiveData5;
        this.f7805G = mutableLiveData5;
        final InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f7806H = interfaceC11603lM25602a2;
        this.f7807I = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        this.f7808J = FlowLiveDataConversions.asLiveData$default(new InterfaceC11594c() { // from class: com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1

            /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2 */
            public static final class C61042 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f7835c;

                @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2", m26211f = "BaseFileViewModel.kt", m26212l = {50}, m26213m = "emit")
                /* renamed from: com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f7836c;

                    /* renamed from: d */
                    public int f7837d;

                    /* renamed from: e */
                    public Object f7838e;

                    /* renamed from: g */
                    public Object f7840g;

                    /* renamed from: h */
                    public Object f7841h;

                    /* renamed from: i */
                    public Object f7842i;

                    /* renamed from: j */
                    public int f7843j;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7836c = obj;
                        this.f7837d |= Integer.MIN_VALUE;
                        return C61042.this.emit(null, this);
                    }
                }

                public C61042(InterfaceC11595d interfaceC11595d) {
                    this.f7835c = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1.C61042.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1.C61042.AnonymousClass1) r0
                        int r1 = r0.f7837d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7837d = r1
                        goto L18
                    L13:
                        com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f7836c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f7837d
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.f7842i
                        vd.d r6 = (p379vd.InterfaceC11595d) r6
                        java.lang.Object r6 = r0.f7840g
                        com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1$2$1 r6 = (com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1.C61042.AnonymousClass1) r6
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L70
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.AbstractC9924b.m20071b(r7)
                        vd.d r7 = r5.f7835c
                        r2 = r6
                        java.util.List r2 = (java.util.List) r2
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        java.lang.Boolean r2 = p409xc.AbstractC11826a.m26206a(r2)
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r6)
                        r0.f7838e = r4
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                        r0.f7840g = r4
                        java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
                        r0.f7841h = r6
                        java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
                        r0.f7842i = r6
                        r6 = 0
                        r0.f7843j = r6
                        r0.f7837d = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L70
                        return r1
                    L70:
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel$special$$inlined$map$1.C61042.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel$special$$inlined$map$1$2.smali:43
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11603lM25602a2.collect(new C61042(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, (InterfaceC9945d) null, 0L, 3, (Object) null);
    }

    /* renamed from: B0 */
    public static final C10786q m6199B0(BaseFileViewModel baseFileViewModel) {
        baseFileViewModel.f7826s.setValue(Boolean.TRUE);
        return C10786q.f26013a;
    }

    /* renamed from: C0 */
    public static final long m6200C0() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m6215x0(BaseFileViewModel baseFileViewModel, boolean z10, FileEntity fileEntity, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMultiSelectModeEnable");
        }
        if ((i10 & 2) != 0) {
            fileEntity = null;
        }
        baseFileViewModel.m6270w0(z10, fileEntity);
    }

    /* renamed from: A */
    public final void m6216A(FileEntity file) {
        AbstractC9979u.m20294g(file, "file");
        BaseViewModel.m4802c(this, new BaseFileViewModel$downloadOffice$1(this, file, null), new BaseFileViewModel$downloadOffice$2(this, null), null, 4, null);
    }

    /* renamed from: A0 */
    public final void m6217A0() {
        m4804b(new BaseFileViewModel$syncFileList$1(this, null), new BaseFileViewModel$syncFileList$2(this, null), new InterfaceC9529a() { // from class: z2.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return BaseFileViewModel.m6199B0(this.f28342c);
            }
        });
    }

    /* renamed from: B */
    public final void m6218B(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new BaseFileViewModel$downloadTxt$1(this, fileEntity, null), new BaseFileViewModel$downloadTxt$2(this, null), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6219C(vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.friday.document.viewmodel.BaseFileViewModel$findSyncFailedSize$1
            if (r0 == 0) goto L13
            r0 = r7
            com.friday.document.viewmodel.BaseFileViewModel$findSyncFailedSize$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$findSyncFailedSize$1) r0
            int r1 = r0.f7904e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7904e = r1
            goto L18
        L13:
            com.friday.document.viewmodel.BaseFileViewModel$findSyncFailedSize$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$findSyncFailedSize$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7902c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7904e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.AbstractC9924b.m20071b(r7)
            com.friday.common.dao.FileDao r7 = r6.f7809b
            long r4 = r6.m6240X()
            r0.f7904e = r3
            java.lang.Object r7 = r7.mo4920S(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            java.lang.Integer r7 = p409xc.AbstractC11826a.m26208c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6219C(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:968
    }

    /* renamed from: D */
    public final InterfaceC11607p m6220D() {
        return this.f7823p;
    }

    /* renamed from: E */
    public final LiveData m6221E() {
        return this.f7816i;
    }

    /* renamed from: F */
    public final LiveData m6222F() {
        return this.f7825r;
    }

    /* renamed from: G */
    public final InterfaceC11051a m6223G() {
        return this.f7811d;
    }

    /* renamed from: H */
    public final MutableLiveData m6224H() {
        return this.f7803E;
    }

    /* renamed from: I */
    public final MutableLiveData m6225I() {
        return this.f7801C;
    }

    /* renamed from: J */
    public final MutableLiveData m6226J() {
        return this.f7799A;
    }

    /* renamed from: K */
    public final InterfaceC11607p m6227K() {
        return this.f7818k;
    }

    /* renamed from: L */
    public final InterfaceC11607p m6228L() {
        return this.f7820m;
    }

    /* renamed from: M */
    public final FileDao m6229M() {
        return this.f7809b;
    }

    /* renamed from: N */
    public final FileManager m6230N() {
        return this.f7812e;
    }

    /* renamed from: O */
    public final InterfaceC11612u m6231O() {
        return this.f7829v;
    }

    /* renamed from: P */
    public final InterfaceC11607p m6232P() {
        return this.f7831x;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6233Q(com.friday.common.entity.FileEntity r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6233Q(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:1282
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6234R(com.friday.common.entity.FileEntity r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.friday.document.viewmodel.BaseFileViewModel$getPreviewNewNoteList$1
            if (r0 == 0) goto L14
            r0 = r11
            com.friday.document.viewmodel.BaseFileViewModel$getPreviewNewNoteList$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$getPreviewNewNoteList$1) r0
            int r1 = r0.f7913g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7913g = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.friday.document.viewmodel.BaseFileViewModel$getPreviewNewNoteList$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$getPreviewNewNoteList$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f7911e
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f7913g
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r10 = r5.f7910d
            com.friday.common.helper.NotePageOrder r10 = (com.friday.common.helper.NotePageOrder) r10
            java.lang.Object r0 = r5.f7909c
            com.friday.common.entity.FileEntity r0 = (com.friday.common.entity.FileEntity) r0
            kotlin.AbstractC9924b.m20071b(r11)
            goto L5f
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            kotlin.AbstractC9924b.m20071b(r11)
            com.friday.common.helper.NotePageOrder r11 = com.friday.common.helper.NotePageOrder.f6040a
            com.friday.common.dao.ResourceDao r1 = r9.f7810c
            r3 = r2
            java.lang.String r2 = r10.getFileId()
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r10)
            r5.f7909c = r10
            r5.f7910d = r11
            r5.f7913g = r3
            r3 = 0
            r6 = 2
            r7 = 0
            java.lang.Object r10 = com.friday.common.dao.ResourceDao.m5077c(r1, r2, r3, r5, r6, r7)
            if (r10 != r0) goto L5c
            return r0
        L5c:
            r8 = r11
            r11 = r10
            r10 = r8
        L5f:
            java.util.List r11 = (java.util.List) r11
            java.util.List r10 = r10.m5246d(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6234R(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:1883
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6235S(vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.friday.document.viewmodel.BaseFileViewModel$getRealLevel$1
            if (r0 == 0) goto L13
            r0 = r7
            com.friday.document.viewmodel.BaseFileViewModel$getRealLevel$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$getRealLevel$1) r0
            int r1 = r0.f7918g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7918g = r1
            goto L18
        L13:
            com.friday.document.viewmodel.BaseFileViewModel$getRealLevel$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$getRealLevel$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7916e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7918g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f7915d
            com.friday.common.entity.FileEntity r1 = (com.friday.common.entity.FileEntity) r1
            java.lang.Object r0 = r0.f7914c
            com.friday.document.model.FolderLevelEntity r0 = (com.friday.document.model.FolderLevelEntity) r0
            kotlin.AbstractC9924b.m20071b(r7)
            return r7
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            java.lang.Object r2 = r0.f7914c
            com.friday.document.model.FolderLevelEntity r2 = (com.friday.document.model.FolderLevelEntity) r2
            kotlin.AbstractC9924b.m20071b(r7)
            goto L6d
        L44:
            kotlin.AbstractC9924b.m20071b(r7)
            java.util.LinkedList r7 = r6.f7821n
            r7.pollFirst()
            r6.mo6255m0()
            java.util.LinkedList r7 = r6.f7821n
            java.lang.Object r7 = r7.peekFirst()
            r2 = r7
            com.friday.document.model.FolderLevelEntity r2 = (com.friday.document.model.FolderLevelEntity) r2
            if (r2 != 0) goto L5c
            r7 = 0
            return r7
        L5c:
            com.friday.common.dao.FileDao r7 = r6.f7809b
            java.lang.String r5 = r2.getFileId()
            r0.f7914c = r2
            r0.f7918g = r4
            java.lang.Object r7 = r7.mo4941r(r5, r0)
            if (r7 != r1) goto L6d
            goto L96
        L6d:
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            if (r7 == 0) goto L82
            int r4 = r7.getState()
            r5 = 3
            if (r4 == r5) goto L82
            int r4 = r7.getState()
            r5 = 30
            if (r4 != r5) goto L81
            goto L82
        L81:
            return r2
        L82:
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r2)
            r0.f7914c = r2
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f7915d = r7
            r0.f7918g = r3
            java.lang.Object r7 = r6.m6235S(r0)
            if (r7 != r1) goto L97
        L96:
            return r1
        L97:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6235S(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:2110
    }

    /* renamed from: T */
    public final MutableLiveData m6236T() {
        return this.f7827t;
    }

    /* renamed from: U */
    public final ResourceDao m6237U() {
        return this.f7810c;
    }

    /* renamed from: V */
    public final InterfaceC11612u m6238V() {
        return this.f7807I;
    }

    /* renamed from: W */
    public final FileEntity m6239W() {
        return (FileEntity) this.f7825r.getValue();
    }

    /* renamed from: X */
    public final long m6240X() {
        return ((Number) this.f7814g.getValue()).longValue();
    }

    /* renamed from: Y */
    public final MutableLiveData m6241Y() {
        return this.f7824q;
    }

    /* renamed from: Z */
    public final MutableLiveData m6242Z() {
        return this.f7804F;
    }

    /* renamed from: a0 */
    public final InterfaceC11603l m6243a0() {
        return this.f7806H;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101 A[ADDED_TO_REGION] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.friday.common.entity.FileEntity m6244b0(com.friday.common.entity.FileEntity r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6244b0(com.friday.common.entity.FileEntity):com.friday.common.entity.FileEntity"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:2561
    }

    /* renamed from: c0 */
    public final Object m6245c0(NoteBean noteBean, InterfaceC11588c interfaceC11588c) {
        Object objMo4910I = this.f7809b.mo4910I(new FileEntity(noteBean.getFileId(), m6240X(), noteBean.getFileName(), noteBean.getFileUrl(), this.f7813f + noteBean.getFileId() + File.separator, noteBean.getType(), noteBean.getParentId(), noteBean.getCreateTime(), noteBean.getUpdateTime(), 0, true, noteBean.getVersion(), noteBean.getShared(), null, 0, null, false, noteBean.getExpirationTimeStamp(), noteBean.isRecycleBin(), 122880, null), interfaceC11588c);
        return objMo4910I == AbstractC11725a.m25952f() ? objMo4910I : C10786q.f26013a;
    }

    /* renamed from: d0 */
    public final Object m6246d0(List list, InterfaceC11588c interfaceC11588c) {
        List<NoteBean> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        for (NoteBean noteBean : list2) {
            arrayList.add(new FileEntity(noteBean.getFileId(), m6240X(), noteBean.getFileName(), noteBean.getFileUrl(), this.f7813f + noteBean.getFileId() + File.separator, noteBean.getType(), noteBean.getParentId(), noteBean.getCreateTime(), noteBean.getUpdateTime(), 0, true, noteBean.getVersion(), noteBean.getShared(), null, 0, null, false, noteBean.getExpirationTimeStamp(), noteBean.isRecycleBin(), 122880, null));
        }
        Object objMo4915N = this.f7809b.mo4915N(arrayList, interfaceC11588c);
        return objMo4915N == AbstractC11725a.m25952f() ? objMo4915N : C10786q.f26013a;
    }

    /* renamed from: e0 */
    public final MutableLiveData m6247e0() {
        return this.f7832y;
    }

    /* renamed from: f0 */
    public final MutableLiveData m6248f0() {
        return this.f7833z;
    }

    /* renamed from: g0 */
    public final boolean m6249g0() {
        return this.f7821n.isEmpty();
    }

    /* renamed from: h0 */
    public final LiveData m6250h0() {
        return this.f7805G;
    }

    /* renamed from: i0 */
    public final LiveData m6251i0() {
        return this.f7808J;
    }

    /* renamed from: j0 */
    public final MutableLiveData m6252j0() {
        return this.f7826s;
    }

    /* renamed from: k0 */
    public void mo6253k0(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
    }

    /* renamed from: l0 */
    public void mo6254l0() {
    }

    /* renamed from: m0 */
    public void mo6255m0() {
    }

    /* renamed from: n0 */
    public final void m6256n0(List fileIdList) {
        AbstractC9979u.m20294g(fileIdList, "fileIdList");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$moveToRecycleBin$1(this, fileIdList, null), 3, null);
    }

    /* renamed from: o0 */
    public final void m6257o0() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$notifyCacheCleared$1(this, null), 3, null);
    }

    /* renamed from: p0 */
    public final FolderLevelEntity m6258p0() {
        return (FolderLevelEntity) this.f7821n.peekFirst();
    }

    /* renamed from: q0 */
    public final void m6259q0() {
        BaseViewModel.m4802c(this, new BaseFileViewModel$pollFolderLevel$1(this, null), new BaseFileViewModel$pollFolderLevel$2(this, null), null, 4, null);
    }

    /* renamed from: r0 */
    public final void m6260r0(String id2, String name) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(name, "name");
        BaseViewModel.m4802c(this, new BaseFileViewModel$renameDocument$1(this, id2, name, null), new BaseFileViewModel$renameDocument$2(this, null), null, 4, null);
    }

    /* renamed from: s */
    public final void m6261s(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        FolderLevelEntity folderLevelEntity = (FolderLevelEntity) this.f7821n.peekFirst();
        if (!AbstractC9979u.m20289b(folderLevelEntity != null ? folderLevelEntity.getFileId() : null, fileEntity.getFileId())) {
            this.f7821n.addFirst(FolderLevelEntity.Companion.map2Me(fileEntity));
            mo6253k0(fileEntity.getFileId());
        }
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$addFolderLevel$1(this, null), 3, null);
    }

    /* renamed from: s0 */
    public final void m6262s0(String fileId) {
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new BaseFileViewModel$selectSpecifiedItem$1(this, fileId, null), null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6263t(java.lang.String r6, java.lang.String r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.friday.document.viewmodel.BaseFileViewModel$deleteCacheFile$1
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.document.viewmodel.BaseFileViewModel$deleteCacheFile$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$deleteCacheFile$1) r0
            int r1 = r0.f7851g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7851g = r1
            goto L18
        L13:
            com.friday.document.viewmodel.BaseFileViewModel$deleteCacheFile$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$deleteCacheFile$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f7849e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7851g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.f7848d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f7847c
            java.lang.String r6 = (java.lang.String) r6
            kotlin.AbstractC9924b.m20071b(r8)
            goto L50
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.AbstractC9924b.m20071b(r8)
            com.friday.common.dao.FileDao r8 = r5.f7809b
            r0.f7847c = r6
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f7848d = r2
            r0.f7851g = r4
            java.lang.Object r7 = r8.mo4931b0(r7, r3, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            boolean r7 = com.blankj.utilcode.util.FileUtils.isFileExists(r6)
            if (r7 != 0) goto L59
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L59:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r8 = "index.json"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r8 = com.blankj.utilcode.util.FileUtils.isFileExists(r7)
            if (r8 != 0) goto L7c
            boolean r7 = com.blankj.utilcode.util.FileUtils.isFileExists(r6)
            if (r7 == 0) goto L79
            com.blankj.utilcode.util.FileUtils.deleteAllInDir(r6)
        L79:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L7c:
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            r7 = 0
            java.lang.String r7 = cd.AbstractC5428g.m2921e(r8, r7, r4, r7)
            com.friday.document.viewmodel.BaseFileViewModel$a r8 = new com.friday.document.viewmodel.BaseFileViewModel$a
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.Object r7 = r0.fromJson(r7, r8)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto Lb9
            int r8 = r7.size()
        La0:
            if (r3 >= r8) goto Lb9
            java.lang.Object r0 = r7.get(r3)
            int r3 = r3 + 1
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = com.blankj.utilcode.util.FileUtils.isFileExists(r1)
            if (r0 == 0) goto La0
            com.blankj.utilcode.util.FileUtils.delete(r1)
            goto La0
        Lb9:
            com.blankj.utilcode.util.FileUtils.delete(r6)
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6263t(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:4232
    }

    /* renamed from: t0 */
    public final void m6264t0(FileEntity fileEntity) {
        this.f7824q.postValue(fileEntity);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6265u(com.friday.common.entity.FileEntity r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.friday.document.viewmodel.BaseFileViewModel$doesFileExits$1
            if (r0 == 0) goto L13
            r0 = r6
            com.friday.document.viewmodel.BaseFileViewModel$doesFileExits$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$doesFileExits$1) r0
            int r1 = r0.f7855f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7855f = r1
            goto L18
        L13:
            com.friday.document.viewmodel.BaseFileViewModel$doesFileExits$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$doesFileExits$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7853d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7855f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f7852c
            com.friday.common.entity.FileEntity r5 = (com.friday.common.entity.FileEntity) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            java.lang.String r6 = r5.getFileType()
            java.lang.String r2 = "6"
            boolean r6 = kotlin.jvm.internal.AbstractC9979u.m20289b(r6, r2)
            if (r6 == 0) goto L4d
            java.lang.String r5 = r5.getTxtFilePath()
            boolean r5 = com.blankj.utilcode.util.FileUtils.isFileExists(r5)
            goto L6c
        L4d:
            com.friday.common.dao.FileDao r6 = r4.f7809b
            java.lang.String r2 = r5.getFileId()
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f7852c = r5
            r0.f7855f = r3
            java.lang.Object r6 = r6.mo4926Y(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            if (r6 == 0) goto L6b
            boolean r5 = r6.getCached()
            goto L6c
        L6b:
            r5 = 0
        L6c:
            java.lang.Boolean r5 = p409xc.AbstractC11826a.m26206a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6265u(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:4645
    }

    /* renamed from: u0 */
    public final void m6266u0(FileEntity fileEntity) {
        this.f7802D.postValue(fileEntity);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6267v(vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.friday.document.viewmodel.BaseFileViewModel$doesFolderExitsInDb$1
            if (r0 == 0) goto L13
            r0 = r6
            com.friday.document.viewmodel.BaseFileViewModel$doesFolderExitsInDb$1 r0 = (com.friday.document.viewmodel.BaseFileViewModel$doesFolderExitsInDb$1) r0
            int r1 = r0.f7860g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7860g = r1
            goto L18
        L13:
            com.friday.document.viewmodel.BaseFileViewModel$doesFolderExitsInDb$1 r0 = new com.friday.document.viewmodel.BaseFileViewModel$doesFolderExitsInDb$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7858e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f7860g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f7857d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f7856c
            com.friday.document.model.FolderLevelEntity r0 = (com.friday.document.model.FolderLevelEntity) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L5e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.AbstractC9924b.m20071b(r6)
            com.friday.document.model.FolderLevelEntity r6 = r5.m6258p0()
            if (r6 != 0) goto L43
            goto L74
        L43:
            java.lang.String r2 = r6.getFileId()
            com.friday.common.dao.FileDao r4 = r5.f7809b
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f7856c = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r2)
            r0.f7857d = r6
            r0.f7860g = r3
            java.lang.Object r6 = r4.mo4941r(r2, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            r0 = 0
            if (r6 != 0) goto L65
        L63:
            r3 = r0
            goto L74
        L65:
            int r1 = r6.getState()
            r2 = 30
            if (r1 == r2) goto L63
            int r6 = r6.getState()
            r1 = 3
            if (r6 == r1) goto L63
        L74:
            java.lang.Boolean r6 = p409xc.AbstractC11826a.m26206a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6267v(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:4907
    }

    /* renamed from: v0 */
    public final void m6268v0(FileEntity fileEntity) {
        this.f7800B.postValue(fileEntity);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6269w(com.friday.common.entity.FileEntity r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel.m6269w(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel.smali:5188
    }

    /* renamed from: w0 */
    public final void m6270w0(boolean z10, FileEntity fileEntity) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$setMultiSelectModeEnable$1(this, z10, fileEntity, null), 3, null);
    }

    /* renamed from: x */
    public final void m6271x(FileEntity file) {
        AbstractC9979u.m20294g(file, "file");
        BaseViewModel.m4802c(this, new BaseFileViewModel$downloadCover$1(this, file, null), new BaseFileViewModel$downloadCover$2(this, null), null, 4, null);
    }

    /* renamed from: y */
    public final void m6272y(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        BaseViewModel.m4802c(this, new BaseFileViewModel$downloadFile$1(this, fileEntity, null), new BaseFileViewModel$downloadFile$2(this, null), null, 4, null);
    }

    /* renamed from: y0 */
    public final void m6273y0() {
        this.f7821n.clear();
        mo6254l0();
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$showRootLevel$1(this, null), 3, null);
    }

    /* renamed from: z */
    public final void m6274z(FileEntity file) {
        AbstractC9979u.m20294g(file, "file");
        BaseViewModel.m4802c(this, new BaseFileViewModel$downloadMicroClass$1(this, file, null), new BaseFileViewModel$downloadMicroClass$2(this, null), null, 4, null);
    }

    /* renamed from: z0 */
    public final void m6275z0(FileEntity file) {
        AbstractC9979u.m20294g(file, "file");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseFileViewModel$switchSelectData$1(this, file, null), 3, null);
    }
}
