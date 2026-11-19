package com.friday.main.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$dataFlow$1$2$1", m26211f = "SearchViewModel.kt", m26212l = {62}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$dataFlow$1$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9679c;

    /* renamed from: d */
    public /* synthetic */ Object f9680d;

    /* renamed from: e */
    public final /* synthetic */ SearchViewModel f9681e;

    @InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$dataFlow$1$2$1$1", m26211f = "SearchViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.viewmodel.SearchViewModel$dataFlow$1$2$1$1 */
    public static final class C62281 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9682c;

        /* renamed from: d */
        public final /* synthetic */ SearchViewModel f9683d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f9684e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62281(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9683d = searchViewModel;
            this.f9684e = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62281(this.f9683d, this.f9684e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f9682c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return this.f9683d.m7277s(this.f9684e);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62281) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$dataFlow$1$2$1(SearchViewModel searchViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9681e = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        SearchViewModel$dataFlow$1$2$1 searchViewModel$dataFlow$1$2$1 = new SearchViewModel$dataFlow$1$2$1(this.f9681e, interfaceC11588c);
        searchViewModel$dataFlow$1$2$1.f9680d = obj;
        return searchViewModel$dataFlow$1$2$1;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return ((SearchViewModel$dataFlow$1$2$1) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity fileEntity = (FileEntity) this.f9680d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9679c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
        C62281 c62281 = new C62281(this.f9681e, fileEntity, null);
        this.f9680d = AbstractC11833h.m26224a(fileEntity);
        this.f9679c = 1;
        Object objM24709g = AbstractC11109f.m24709g(abstractC11106e0M24799b, c62281, this);
        return objM24709g == objM25952f ? objM25952f : objM24709g;
    }
}
