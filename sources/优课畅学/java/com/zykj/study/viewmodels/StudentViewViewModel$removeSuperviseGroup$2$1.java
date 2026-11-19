package com.zykj.study.viewmodels;

import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentViewViewModel$removeSuperviseGroup$2$1", m17801f = "StudentViewViewModel.kt", m17802l = {73}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewViewModel$removeSuperviseGroup$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14415a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewViewModel f14416b;

    /* renamed from: c */
    public final /* synthetic */ int f14417c;

    /* renamed from: d */
    public final /* synthetic */ int f14418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewViewModel$removeSuperviseGroup$2$1(StudentViewViewModel studentViewViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14416b = studentViewViewModel;
        this.f14417c = i10;
        this.f14418d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewViewModel$removeSuperviseGroup$2$1(this.f14416b, this.f14417c, this.f14418d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewViewModel$removeSuperviseGroup$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14415a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12270e = this.f14416b.m12270e();
            int i11 = this.f14417c;
            int i12 = this.f14418d;
            this.f14415a = 1;
            if (teachCourseRepositoryM12270e.m10418o(i11, i12, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        List list = (List) this.f14416b.m12272g().getValue();
        if (list != null) {
            int i13 = this.f14418d;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((SuperviseGroup) obj2).getId() != i13) {
                    arrayList.add(obj2);
                }
            }
            this.f14416b.m12272g().postValue(arrayList);
        }
        this.f14416b.m12269d().setValue(null);
        this.f14416b.m12274i();
        return AbstractC9536a.m17796a(true);
    }
}
