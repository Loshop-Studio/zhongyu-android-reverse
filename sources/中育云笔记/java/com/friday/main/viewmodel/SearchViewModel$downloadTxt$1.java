package com.friday.main.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.alibaba.fastjson.asm.Opcodes;
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

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadTxt$1", m26211f = "SearchViewModel.kt", m26212l = {Opcodes.IFNE, 155}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$downloadTxt$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9714c;

    /* renamed from: d */
    public int f9715d;

    /* renamed from: e */
    public final /* synthetic */ SearchViewModel f9716e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f9717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$downloadTxt$1(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9716e = searchViewModel;
        this.f9717f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchViewModel$downloadTxt$1(this.f9716e, this.f9717f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9715d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC9664d interfaceC9664d = this.f9716e.f9651c;
            FileEntity fileEntity = this.f9717f;
            this.f9715d = 1;
            if (interfaceC9664d.mo5609b(fileEntity, this) != objM25952f) {
            }
            return objM25952f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f9714c;
            AbstractC9924b.m20071b(obj);
            mutableLiveData.setValue(obj);
            return C10786q.f26013a;
        }
        AbstractC9924b.m20071b(obj);
        MutableLiveData mutableLiveDataM7288u = this.f9716e.m7288u();
        FileDao fileDao = this.f9716e.f9650b;
        String fileId = this.f9717f.getFileId();
        this.f9714c = mutableLiveDataM7288u;
        this.f9715d = 2;
        Object objMo4941r = fileDao.mo4941r(fileId, this);
        if (objMo4941r != objM25952f) {
            mutableLiveData = mutableLiveDataM7288u;
            obj = objMo4941r;
            mutableLiveData.setValue(obj);
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SearchViewModel$downloadTxt$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
