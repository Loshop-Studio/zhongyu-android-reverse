package com.friday.document.viewmodel;

import com.friday.common.property.BaseResponse;
import com.friday.document.model.TchListEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p330s2.InterfaceC11052b;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareByTeacherViewModel$getSharedTchList$1", m26211f = "ShareByTeacherViewModel.kt", m26212l = {31}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareByTeacherViewModel$getSharedTchList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8278c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8279d;

    /* renamed from: e */
    public final /* synthetic */ ShareByTeacherViewModel f8280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareByTeacherViewModel$getSharedTchList$1(boolean z10, ShareByTeacherViewModel shareByTeacherViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8279d = z10;
        this.f8280e = shareByTeacherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareByTeacherViewModel$getSharedTchList$1(this.f8279d, this.f8280e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8278c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f8279d) {
                this.f8280e.f8276e.setValue(AbstractC11826a.m26206a(true));
            }
            InterfaceC11052b interfaceC11052b = this.f8280e.f8273b;
            this.f8278c = 1;
            obj = interfaceC11052b.m24506e(this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.getCode() == 0) {
            this.f8280e.f8274c.setValue(((TchListEntity) baseResponse.getData()).getTeachers());
        } else {
            this.f8280e.f8274c.setValue(AbstractC10978w.m24136n());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareByTeacherViewModel$getSharedTchList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
