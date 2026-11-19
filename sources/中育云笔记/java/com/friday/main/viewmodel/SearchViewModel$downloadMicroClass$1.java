package com.friday.main.viewmodel;

import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9664d;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadMicroClass$1", m26211f = "SearchViewModel.kt", m26212l = {170, 171}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$downloadMicroClass$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9700c;

    /* renamed from: d */
    public int f9701d;

    /* renamed from: e */
    public final /* synthetic */ SearchViewModel f9702e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f9703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$downloadMicroClass$1(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9702e = searchViewModel;
        this.f9703f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchViewModel$downloadMicroClass$1(this.f9702e, this.f9703f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SearchViewModel searchViewModel;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9701d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC9664d interfaceC9664d = this.f9702e.f9651c;
            FileEntity fileEntity = this.f9703f;
            this.f9701d = 1;
            if (interfaceC9664d.mo5611d(fileEntity, this) != objM25952f) {
            }
            return objM25952f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            searchViewModel = (SearchViewModel) this.f9700c;
            AbstractC9924b.m20071b(obj);
            searchViewModel.m7290w((FileEntity) obj);
            return C10786q.f26013a;
        }
        AbstractC9924b.m20071b(obj);
        SearchViewModel searchViewModel2 = this.f9702e;
        FileDao fileDao = searchViewModel2.f9650b;
        String fileId = this.f9703f.getFileId();
        this.f9700c = searchViewModel2;
        this.f9701d = 2;
        Object objMo4941r = fileDao.mo4941r(fileId, this);
        if (objMo4941r != objM25952f) {
            searchViewModel = searchViewModel2;
            obj = objMo4941r;
            searchViewModel.m7290w((FileEntity) obj);
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SearchViewModel$downloadMicroClass$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
