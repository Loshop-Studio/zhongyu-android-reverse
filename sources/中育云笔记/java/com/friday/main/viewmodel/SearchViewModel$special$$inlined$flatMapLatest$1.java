package com.friday.main.viewmodel;

import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.friday.main.viewmodel.SearchViewModel;
import kotlin.AbstractC9924b;
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
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$special$$inlined$flatMapLatest$1", m26211f = "SearchViewModel.kt", m26212l = {189}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public int f9673c;

    /* renamed from: d */
    public /* synthetic */ Object f9674d;

    /* renamed from: e */
    public /* synthetic */ Object f9675e;

    /* renamed from: f */
    public final /* synthetic */ SearchViewModel f9676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$special$$inlined$flatMapLatest$1(InterfaceC11588c interfaceC11588c, SearchViewModel searchViewModel) {
        super(3, interfaceC11588c);
        this.f9676f = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9673c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.f9674d;
            Object obj2 = this.f9675e;
            final InterfaceC11594c flow = new Pager(new PagingConfig(20, 1, false, 0, 0, 0, 60, null), null, new SearchViewModel.C6227a((String) obj2, this.f9676f), 2, null).getFlow();
            final SearchViewModel searchViewModel = this.f9676f;
            InterfaceC11594c interfaceC11594cCachedIn = CachedPagingDataKt.cachedIn(new InterfaceC11594c() { // from class: com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1

                /* renamed from: com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2 */
                public static final class C62262 implements InterfaceC11595d {

                    /* renamed from: c */
                    public final /* synthetic */ InterfaceC11595d f9663c;

                    /* renamed from: d */
                    public final /* synthetic */ SearchViewModel f9664d;

                    @InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2", m26211f = "SearchViewModel.kt", m26212l = {50}, m26213m = "emit")
                    /* renamed from: com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: c */
                        public /* synthetic */ Object f9665c;

                        /* renamed from: d */
                        public int f9666d;

                        /* renamed from: e */
                        public Object f9667e;

                        /* renamed from: g */
                        public Object f9669g;

                        /* renamed from: h */
                        public Object f9670h;

                        /* renamed from: i */
                        public Object f9671i;

                        /* renamed from: j */
                        public int f9672j;

                        public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                            super(interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9665c = obj;
                            this.f9666d |= Integer.MIN_VALUE;
                            return C62262.this.emit(null, this);
                        }
                    }

                    public C62262(InterfaceC11595d interfaceC11595d, SearchViewModel searchViewModel) {
                        this.f9663c = interfaceC11595d;
                        this.f9664d = searchViewModel;
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
                            boolean r0 = r9 instanceof com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1.C62262.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2$1 r0 = (com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1.C62262.AnonymousClass1) r0
                            int r1 = r0.f9666d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f9666d = r1
                            goto L18
                        L13:
                            com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2$1 r0 = new com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.f9665c
                            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                            int r2 = r0.f9666d
                            r3 = 1
                            if (r2 == 0) goto L39
                            if (r2 != r3) goto L31
                            java.lang.Object r8 = r0.f9671i
                            vd.d r8 = (p379vd.InterfaceC11595d) r8
                            java.lang.Object r8 = r0.f9669g
                            com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2$1 r8 = (com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1.C62262.AnonymousClass1) r8
                            kotlin.AbstractC9924b.m20071b(r9)
                            goto L71
                        L31:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L39:
                            kotlin.AbstractC9924b.m20071b(r9)
                            vd.d r9 = r7.f9663c
                            r2 = r8
                            androidx.paging.PagingData r2 = (androidx.paging.PagingData) r2
                            com.friday.main.viewmodel.SearchViewModel$dataFlow$1$2$1 r4 = new com.friday.main.viewmodel.SearchViewModel$dataFlow$1$2$1
                            com.friday.main.viewmodel.SearchViewModel r5 = r7.f9664d
                            r6 = 0
                            r4.<init>(r5, r6)
                            androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.map(r2, r4)
                            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r8)
                            r0.f9667e = r4
                            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
                            r0.f9669g = r4
                            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r8)
                            r0.f9670h = r8
                            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r9)
                            r0.f9671i = r8
                            r8 = 0
                            r0.f9672j = r8
                            r0.f9666d = r3
                            java.lang.Object r8 = r9.emit(r2, r0)
                            if (r8 != r1) goto L71
                            return r1
                        L71:
                            qc.q r8 = p309qc.C10786q.f26013a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.SearchViewModel$dataFlow$lambda$1$$inlined$map$1.C62262.emit(java.lang.Object, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/SearchViewModel$dataFlow$lambda$1$$inlined$map$1$2.smali:49
                    }
                }

                @Override // p379vd.InterfaceC11594c
                public Object collect(InterfaceC11595d interfaceC11595d2, InterfaceC11588c interfaceC11588c) {
                    Object objCollect = flow.collect(new C62262(interfaceC11595d2, searchViewModel), interfaceC11588c);
                    return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
                }
            }, ViewModelKt.getViewModelScope(this.f9676f));
            this.f9674d = AbstractC11833h.m26224a(interfaceC11595d);
            this.f9675e = AbstractC11833h.m26224a(obj2);
            this.f9673c = 1;
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
        SearchViewModel$special$$inlined$flatMapLatest$1 searchViewModel$special$$inlined$flatMapLatest$1 = new SearchViewModel$special$$inlined$flatMapLatest$1(interfaceC11588c, this.f9676f);
        searchViewModel$special$$inlined$flatMapLatest$1.f9674d = interfaceC11595d;
        searchViewModel$special$$inlined$flatMapLatest$1.f9675e = obj;
        return searchViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(C10786q.f26013a);
    }
}
