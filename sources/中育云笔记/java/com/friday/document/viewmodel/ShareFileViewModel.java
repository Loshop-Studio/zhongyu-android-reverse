package com.friday.document.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.helper.C5962b;
import com.friday.common.property.BaseResponse;
import com.friday.document.model.ShareFile;
import com.friday.document.model.StudentShareEntity;
import com.friday.document.viewmodel.ShareFileViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.flow.InterfaceC10040a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p330s2.InterfaceC11052b;
import p364uc.AbstractC11382b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareFileViewModel extends ShareBase {

    /* renamed from: d */
    public final Context f8283d;

    /* renamed from: e */
    public final InterfaceC11052b f8284e;

    /* renamed from: f */
    public final InterfaceC11603l f8285f;

    /* renamed from: g */
    public final InterfaceC11612u f8286g;

    /* renamed from: h */
    public final LinkedList f8287h;

    /* renamed from: i */
    public final InterfaceC11603l f8288i;

    /* renamed from: j */
    public final InterfaceC11612u f8289j;

    /* renamed from: k */
    public final InterfaceC11603l f8290k;

    /* renamed from: l */
    public final InterfaceC11603l f8291l;

    /* renamed from: m */
    public final InterfaceC11612u f8292m;

    /* renamed from: n */
    public final InterfaceC11612u f8293n;

    /* renamed from: com.friday.document.viewmodel.ShareFileViewModel$a */
    public static final class C6126a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Long.valueOf(((ShareFile) obj2).getLatestTimestamp()), Long.valueOf(((ShareFile) obj).getLatestTimestamp()));
        }
    }

    public ShareFileViewModel(Context context, InterfaceC11052b shareService) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(shareService, "shareService");
        this.f8283d = context;
        this.f8284e = shareService;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this.f8285f = interfaceC11603lM25602a;
        this.f8286g = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        this.f8287h = new LinkedList();
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(null);
        this.f8288i = interfaceC11603lM25602a2;
        this.f8289j = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11603l interfaceC11603lM25602a3 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8290k = interfaceC11603lM25602a3;
        InterfaceC11603l interfaceC11603lM25602a4 = AbstractC11613v.m25602a(0);
        this.f8291l = interfaceC11603lM25602a4;
        InterfaceC11594c interfaceC11594cM25560j = AbstractC11596e.m25560j(interfaceC11603lM25602a, interfaceC11603lM25602a2, interfaceC11603lM25602a3, interfaceC11603lM25602a4, new ShareFileViewModel$pageData$1(this, null));
        InterfaceC11122i0 viewModelScope = ViewModelKt.getViewModelScope(this);
        InterfaceC10040a.a aVar = InterfaceC10040a.f23896a;
        final InterfaceC11612u interfaceC11612uM25546Q = AbstractC11596e.m25546Q(interfaceC11594cM25560j, viewModelScope, aVar.m20878d(), AbstractC10978w.m24136n());
        this.f8292m = interfaceC11612uM25546Q;
        this.f8293n = AbstractC11596e.m25546Q(new InterfaceC11594c() { // from class: com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1

            /* renamed from: com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2 */
            public static final class C61252 implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ InterfaceC11595d f8295c;

                @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2", m26211f = "ShareFileViewModel.kt", m26212l = {50}, m26213m = "emit")
                /* renamed from: com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: c */
                    public /* synthetic */ Object f8296c;

                    /* renamed from: d */
                    public int f8297d;

                    /* renamed from: e */
                    public Object f8298e;

                    /* renamed from: g */
                    public Object f8300g;

                    /* renamed from: h */
                    public Object f8301h;

                    /* renamed from: i */
                    public Object f8302i;

                    /* renamed from: j */
                    public int f8303j;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8296c = obj;
                        this.f8297d |= Integer.MIN_VALUE;
                        return C61252.this.emit(null, this);
                    }
                }

                public C61252(InterfaceC11595d interfaceC11595d) {
                    this.f8295c = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, vc.InterfaceC11588c r13) throws java.lang.Throwable {
                    /*
                        r11 = this;
                        boolean r0 = r13 instanceof com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1.C61252.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r13
                        com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2$1 r0 = (com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1.C61252.AnonymousClass1) r0
                        int r1 = r0.f8297d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8297d = r1
                        goto L18
                    L13:
                        com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2$1 r0 = new com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r13)
                    L18:
                        java.lang.Object r13 = r0.f8296c
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.f8297d
                        r3 = 1
                        if (r2 == 0) goto L3a
                        if (r2 != r3) goto L32
                        java.lang.Object r12 = r0.f8302i
                        vd.d r12 = (p379vd.InterfaceC11595d) r12
                        java.lang.Object r12 = r0.f8300g
                        com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2$1 r12 = (com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1.C61252.AnonymousClass1) r12
                        kotlin.AbstractC9924b.m20071b(r13)
                        goto Lb0
                    L32:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L3a:
                        kotlin.AbstractC9924b.m20071b(r13)
                        vd.d r13 = r11.f8295c
                        r2 = r12
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = p325rc.AbstractC10980x.m24153x(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L53:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L67
                        java.lang.Object r5 = r2.next()
                        com.friday.document.model.ShareListEntity r5 = (com.friday.document.model.ShareListEntity) r5
                        com.friday.document.model.ShareFile r5 = r5.getShareFile()
                        r4.add(r5)
                        goto L53
                    L67:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        int r5 = r4.size()
                        r6 = 0
                        r7 = r6
                    L72:
                        if (r7 >= r5) goto L8d
                        java.lang.Object r8 = r4.get(r7)
                        int r7 = r7 + 1
                        r9 = r8
                        com.friday.document.model.ShareFile r9 = (com.friday.document.model.ShareFile) r9
                        java.lang.String r9 = r9.getType()
                        java.lang.String r10 = "7"
                        boolean r9 = kotlin.jvm.internal.AbstractC9979u.m20289b(r9, r10)
                        if (r9 == 0) goto L72
                        r2.add(r8)
                        goto L72
                    L8d:
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r12)
                        r0.f8298e = r4
                        java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                        r0.f8300g = r4
                        java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r12)
                        r0.f8301h = r12
                        java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r13)
                        r0.f8302i = r12
                        r0.f8303j = r6
                        r0.f8297d = r3
                        java.lang.Object r12 = r13.emit(r2, r0)
                        if (r12 != r1) goto Lb0
                        return r1
                    Lb0:
                        qc.q r12 = p309qc.C10786q.f26013a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1.C61252.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2.smali:43
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11612uM25546Q.collect(new C61252(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, ViewModelKt.getViewModelScope(this), aVar.m20877c(), AbstractC10978w.m24136n());
    }

    /* renamed from: D */
    public static /* synthetic */ void m6397D(ShareFileViewModel shareFileViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        shareFileViewModel.m6418C(z10);
    }

    /* renamed from: E */
    public static final C10786q m6398E(ShareFileViewModel shareFileViewModel, BaseResponse result) {
        AbstractC9979u.m20294g(result, "result");
        shareFileViewModel.f8290k.setValue(result.getCode() == 0 ? ((StudentShareEntity) result.getData()).getShareFileList() : AbstractC10978w.m24136n());
        return C10786q.f26013a;
    }

    /* renamed from: F */
    public static final C10786q m6399F(ShareFileViewModel shareFileViewModel, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        shareFileViewModel.f8290k.setValue(new ArrayList());
        return C10786q.f26013a;
    }

    /* renamed from: H */
    public static /* synthetic */ void m6400H(ShareFileViewModel shareFileViewModel, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        shareFileViewModel.m6419G(j10, z10);
    }

    /* renamed from: I */
    public static final C10786q m6401I(ShareFileViewModel shareFileViewModel, BaseResponse result) {
        AbstractC9979u.m20294g(result, "result");
        shareFileViewModel.f8290k.setValue(result.getCode() == 0 ? ((StudentShareEntity) result.getData()).getShareFileList() : AbstractC10978w.m24136n());
        return C10786q.f26013a;
    }

    /* renamed from: J */
    public static final C10786q m6402J(ShareFileViewModel shareFileViewModel, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        shareFileViewModel.f8290k.setValue(new ArrayList());
        return C10786q.f26013a;
    }

    /* renamed from: M */
    public static final C10786q m6403M(ShareFileViewModel shareFileViewModel, ShareFile shareFile) {
        shareFileViewModel.f8285f.setValue(shareFile);
        return C10786q.f26013a;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m6404Q(ShareFileViewModel shareFileViewModel, String str, long j10, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        shareFileViewModel.m6424P(str, j10, str2, str3, z10);
    }

    /* renamed from: R */
    public static final C10786q m6405R(ShareFileViewModel shareFileViewModel, List list) {
        AbstractC9979u.m20294g(list, "list");
        shareFileViewModel.f8290k.setValue(list);
        return C10786q.f26013a;
    }

    /* renamed from: S */
    public static final C10786q m6406S(ShareFileViewModel shareFileViewModel, Throwable it) {
        AbstractC9979u.m20294g(it, "it");
        shareFileViewModel.f8290k.setValue(new ArrayList());
        return C10786q.f26013a;
    }

    /* renamed from: A */
    public final List m6416A() {
        return (List) this.f8293n.getValue();
    }

    /* renamed from: B */
    public final InterfaceC11612u m6417B() {
        return this.f8292m;
    }

    /* renamed from: C */
    public final void m6418C(boolean z10) {
        ShareBase.m6344j(this, z10, new ShareFileViewModel$getShareList$1(this, null), new InterfaceC9540l() { // from class: z2.d0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6398E(this.f28351c, (BaseResponse) obj);
            }
        }, null, new InterfaceC9540l() { // from class: z2.e0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6399F(this.f28353c, (Throwable) obj);
            }
        }, 8, null);
    }

    /* renamed from: G */
    public final void m6419G(long j10, boolean z10) {
        ShareBase.m6344j(this, z10, new ShareFileViewModel$getTchFileSharedFile$1(this, j10, null), new InterfaceC9540l() { // from class: z2.f0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6401I(this.f28354c, (BaseResponse) obj);
            }
        }, null, new InterfaceC9540l() { // from class: z2.g0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6402J(this.f28356c, (Throwable) obj);
            }
        }, 8, null);
    }

    /* renamed from: K */
    public final void m6420K(InterfaceC9529a onRootRefresh) {
        AbstractC9979u.m20294g(onRootRefresh, "onRootRefresh");
        ShareFile shareFile = (ShareFile) this.f8285f.getValue();
        if (shareFile == null) {
            onRootRefresh.invoke();
        } else {
            m6424P(shareFile.getFileId(), shareFile.getOwnerId(), shareFile.getShareTime(), shareFile.getOwnerName(), true);
        }
    }

    /* renamed from: L */
    public final void m6421L(String id2, long j10) {
        AbstractC9979u.m20294g(id2, "id");
        ShareBase.m6344j(this, false, new ShareFileViewModel$setFolderLevelById$1(id2, this, j10, null), new InterfaceC9540l() { // from class: z2.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6403M(this.f28362c, (ShareFile) obj);
            }
        }, null, null, 25, null);
    }

    /* renamed from: N */
    public final void m6422N(ShareFile shareFile) {
        this.f8288i.setValue(shareFile);
        if (shareFile == null || !AbstractC9979u.m20289b(shareFile.getType(), "0")) {
            return;
        }
        m6429x();
        this.f8285f.setValue(shareFile);
    }

    /* renamed from: O */
    public final void m6423O() {
        this.f8285f.setValue(null);
    }

    /* renamed from: P */
    public final void m6424P(String parentId, long j10, String shareTime, String ownerName, boolean z10) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(ownerName, "ownerName");
        ShareBase.m6344j(this, z10, new ShareFileViewModel$showSubLevelFile$1(this, parentId, j10, shareTime, ownerName, null), new InterfaceC9540l() { // from class: z2.h0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6405R(this.f28358c, (List) obj);
            }
        }, null, new InterfaceC9540l() { // from class: z2.i0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareFileViewModel.m6406S(this.f28361c, (Throwable) obj);
            }
        }, 8, null);
    }

    /* renamed from: T */
    public final List m6425T(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        return AbstractC10947g0.m23914P0(list, new C6126a());
    }

    /* renamed from: U */
    public final void m6426U() {
        this.f8291l.setValue(Integer.valueOf(C5962b.f6082a.m5299a().m5288p()));
    }

    /* renamed from: v */
    public final void m6427v() {
        ShareFile shareFile = (ShareFile) this.f8285f.getValue();
        if (shareFile == null) {
            return;
        }
        ShareFile shareFile2 = (ShareFile) this.f8287h.peek();
        if (AbstractC9979u.m20289b(shareFile2 != null ? shareFile2.getFileId() : null, shareFile.getFileId())) {
            return;
        }
        this.f8287h.push(shareFile);
    }

    /* renamed from: w */
    public final void m6428w() {
        Object objM20054c;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c((ShareFile) this.f8287h.pop());
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20058g(objM20054c)) {
            objM20054c = null;
        }
        this.f8285f.setValue((ShareFile) objM20054c);
    }

    /* renamed from: x */
    public final void m6429x() {
        this.f8290k.setValue(AbstractC10978w.m24136n());
    }

    /* renamed from: y */
    public final InterfaceC11612u m6430y() {
        return this.f8286g;
    }

    /* renamed from: z */
    public final InterfaceC11612u m6431z() {
        return this.f8289j;
    }
}
