package com.zykj.study.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentViewViewModel$initSuperviseGroup$1$1", m17801f = "StudentViewViewModel.kt", m17802l = {36}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewViewModel$initSuperviseGroup$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14407a;

    /* renamed from: b */
    public int f14408b;

    /* renamed from: c */
    public final /* synthetic */ StudentViewViewModel f14409c;

    /* renamed from: d */
    public final /* synthetic */ int f14410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewViewModel$initSuperviseGroup$1$1(StudentViewViewModel studentViewViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14409c = studentViewViewModel;
        this.f14410d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewViewModel$initSuperviseGroup$1$1(this.f14409c, this.f14410d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewViewModel$initSuperviseGroup$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14408b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM12272g = this.f14409c.m12272g();
            TeachCourseRepository teachCourseRepositoryM12270e = this.f14409c.m12270e();
            int i11 = this.f14410d;
            this.f14407a = mutableLiveDataM12272g;
            this.f14408b = 1;
            Object objM10414k = teachCourseRepositoryM12270e.m10414k(i11, this);
            if (objM10414k == objM17291f) {
                return objM17291f;
            }
            mutableLiveData = mutableLiveDataM12272g;
            obj = objM10414k;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f14407a;
            AbstractC9079b.m15926b(obj);
        }
        mutableLiveData.postValue(obj);
        return C8736p.f16368a;
    }
}
