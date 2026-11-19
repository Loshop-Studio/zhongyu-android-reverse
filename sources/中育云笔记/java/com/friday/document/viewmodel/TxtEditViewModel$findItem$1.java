package com.friday.document.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.friday.common.dao.FileDao;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TxtEditViewModel$findItem$1", m26211f = "TxtEditViewModel.kt", m26212l = {63}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TxtEditViewModel$findItem$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8423c;

    /* renamed from: d */
    public int f8424d;

    /* renamed from: e */
    public final /* synthetic */ TxtEditViewModel f8425e;

    /* renamed from: f */
    public final /* synthetic */ String f8426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxtEditViewModel$findItem$1(TxtEditViewModel txtEditViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8425e = txtEditViewModel;
        this.f8426f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TxtEditViewModel$findItem$1(this.f8425e, this.f8426f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8424d;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                MutableLiveData mutableLiveDataM6485l = this.f8425e.m6485l();
                FileDao fileDao = this.f8425e.f8414b;
                String str = this.f8426f;
                this.f8423c = mutableLiveDataM6485l;
                this.f8424d = 1;
                Object objMo4941r = fileDao.mo4941r(str, this);
                if (objMo4941r == objM25952f) {
                    return objM25952f;
                }
                mutableLiveData = mutableLiveDataM6485l;
                obj = objMo4941r;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.f8423c;
                AbstractC9924b.m20071b(obj);
            }
            mutableLiveData.setValue(obj);
        } catch (Exception unused) {
            this.f8425e.m6485l().setValue(null);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TxtEditViewModel$findItem$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
