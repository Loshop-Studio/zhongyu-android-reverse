package com.friday.document.viewmodel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.friday.document.viewmodel.FolderViewModel;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.C11157r0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1", m26211f = "FolderViewModel.kt", m26212l = {189}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C6112x8fe95225 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public int f7989c;

    /* renamed from: d */
    public /* synthetic */ Object f7990d;

    /* renamed from: e */
    public /* synthetic */ Object f7991e;

    /* renamed from: f */
    public final /* synthetic */ FolderViewModel f7992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6112x8fe95225(InterfaceC11588c interfaceC11588c, FolderViewModel folderViewModel) {
        super(3, interfaceC11588c);
        this.f7992f = folderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7989c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.f7990d;
            Object obj2 = this.f7991e;
            final InterfaceC11594c interfaceC11594cM25534E = AbstractC11596e.m25534E(new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), null, new FolderViewModel.C6114a((Pair) obj2, this.f7992f), 2, null).getFlow(), C11157r0.m24799b());
            final FolderViewModel folderViewModel = this.f7992f;
            InterfaceC11594c interfaceC11594cCachedIn = CachedPagingDataKt.cachedIn(AbstractC11596e.m25560j(CachedPagingDataKt.cachedIn(new InterfaceC11594c() { // from class: com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1

                /* renamed from: com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements InterfaceC11595d {

                    /* renamed from: c */
                    public final /* synthetic */ InterfaceC11595d f7995c;

                    /* renamed from: d */
                    public final /* synthetic */ FolderViewModel f7996d;

                    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2", m26211f = "FolderViewModel.kt", m26212l = {50}, m26213m = "emit")
                    /* renamed from: com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: c */
                        public /* synthetic */ Object f7997c;

                        /* renamed from: d */
                        public int f7998d;

                        /* renamed from: e */
                        public Object f7999e;

                        /* renamed from: g */
                        public Object f8001g;

                        /* renamed from: h */
                        public Object f8002h;

                        /* renamed from: i */
                        public Object f8003i;

                        /* renamed from: j */
                        public int f8004j;

                        public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                            super(interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f7997c = obj;
                            this.f7998d |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC11595d interfaceC11595d, FolderViewModel folderViewModel) {
                        this.f7995c = interfaceC11595d;
                        this.f7996d = folderViewModel;
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
                            boolean r0 = r9 instanceof com.friday.document.viewmodel.C6113x129290cf.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2$1 r0 = (com.friday.document.viewmodel.C6113x129290cf.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f7998d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f7998d = r1
                            goto L18
                        L13:
                            com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2$1 r0 = new com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.f7997c
                            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                            int r2 = r0.f7998d
                            r3 = 1
                            if (r2 == 0) goto L39
                            if (r2 != r3) goto L31
                            java.lang.Object r8 = r0.f8003i
                            vd.d r8 = (p379vd.InterfaceC11595d) r8
                            java.lang.Object r8 = r0.f8001g
                            com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2$1 r8 = (com.friday.document.viewmodel.C6113x129290cf.AnonymousClass2.AnonymousClass1) r8
                            kotlin.AbstractC9924b.m20071b(r9)
                            goto L71
                        L31:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L39:
                            kotlin.AbstractC9924b.m20071b(r9)
                            vd.d r9 = r7.f7995c
                            r2 = r8
                            androidx.paging.PagingData r2 = (androidx.paging.PagingData) r2
                            com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1 r4 = new com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1
                            com.friday.document.viewmodel.FolderViewModel r5 = r7.f7996d
                            r6 = 0
                            r4.<init>(r5, r6)
                            androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.map(r2, r4)
                            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r8)
                            r0.f7999e = r4
                            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                            r0.f8001g = r4
                            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                            r0.f8002h = r8
                            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r9)
                            r0.f8003i = r8
                            r8 = 0
                            r0.f8004j = r8
                            r0.f7998d = r3
                            java.lang.Object r8 = r9.emit(r2, r0)
                            if (r8 != r1) goto L71
                            return r1
                        L71:
                            qc.q r8 = p309qc.C10786q.f26013a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.C6113x129290cf.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1$2.smali:49
                    }
                }

                @Override // p379vd.InterfaceC11594c
                public Object collect(InterfaceC11595d interfaceC11595d2, InterfaceC11588c interfaceC11588c) {
                    Object objCollect = interfaceC11594cM25534E.collect(new AnonymousClass2(interfaceC11595d2, folderViewModel), interfaceC11588c);
                    return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
                }
            }, ViewModelKt.getViewModelScope(this.f7992f)), FlowLiveDataConversions.asFlow(this.f7992f.m6242Z()), this.f7992f.m6243a0(), FlowLiveDataConversions.asFlow(this.f7992f.m6241Y()), new FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1(null)), ViewModelKt.getViewModelScope(this.f7992f));
            this.f7990d = AbstractC11833h.m26224a(interfaceC11595d);
            this.f7991e = AbstractC11833h.m26224a(obj2);
            this.f7989c = 1;
            if (AbstractC11596e.m25570t(interfaceC11595d, interfaceC11594cCachedIn, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9545q
    public final Object invoke(InterfaceC11595d interfaceC11595d, Object obj, InterfaceC11588c interfaceC11588c) {
        C6112x8fe95225 c6112x8fe95225 = new C6112x8fe95225(interfaceC11588c, this.f7992f);
        c6112x8fe95225.f7990d = interfaceC11595d;
        c6112x8fe95225.f7991e = obj;
        return c6112x8fe95225.invokeSuspend(C10786q.f26013a);
    }
}
