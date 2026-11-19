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

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseViewViewModel$updateCatalogProgress$1$1", m17801f = "CourseViewViewModel.kt", m17802l = {37}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseViewViewModel$updateCatalogProgress$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13980a;

    /* renamed from: b */
    public int f13981b;

    /* renamed from: c */
    public final /* synthetic */ CourseViewViewModel f13982c;

    /* renamed from: d */
    public final /* synthetic */ int f13983d;

    /* renamed from: e */
    public final /* synthetic */ int f13984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewViewModel$updateCatalogProgress$1$1(CourseViewViewModel courseViewViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13982c = courseViewViewModel;
        this.f13983d = i10;
        this.f13984e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseViewViewModel$updateCatalogProgress$1$1(this.f13982c, this.f13983d, this.f13984e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseViewViewModel$updateCatalogProgress$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13981b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM12061a = this.f13982c.m12061a();
            TeachCourseRepository teachCourseRepositoryM12065e = this.f13982c.m12065e();
            int i11 = this.f13983d;
            int i12 = this.f13984e;
            this.f13980a = mutableLiveDataM12061a;
            this.f13981b = 1;
            Object objM10407c = teachCourseRepositoryM12065e.m10407c(i11, i12, this);
            if (objM10407c == objM17291f) {
                return objM17291f;
            }
            mutableLiveData = mutableLiveDataM12061a;
            obj = objM10407c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f13980a;
            AbstractC9079b.m15926b(obj);
        }
        mutableLiveData.postValue(obj);
        return C8736p.f16368a;
    }
}
