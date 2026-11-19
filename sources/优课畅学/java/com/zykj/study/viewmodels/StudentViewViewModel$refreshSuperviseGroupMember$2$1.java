package com.zykj.study.viewmodels;

import com.zykj.study.repository.TeachCourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentViewViewModel$refreshSuperviseGroupMember$2$1", m17801f = "StudentViewViewModel.kt", m17802l = {92}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewViewModel$refreshSuperviseGroupMember$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14411a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewViewModel f14412b;

    /* renamed from: c */
    public final /* synthetic */ int f14413c;

    /* renamed from: d */
    public final /* synthetic */ int f14414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewViewModel$refreshSuperviseGroupMember$2$1(StudentViewViewModel studentViewViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14412b = studentViewViewModel;
        this.f14413c = i10;
        this.f14414d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewViewModel$refreshSuperviseGroupMember$2$1(this.f14412b, this.f14413c, this.f14414d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewViewModel$refreshSuperviseGroupMember$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14411a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12270e = this.f14412b.m12270e();
            int i11 = this.f14413c;
            int i12 = this.f14414d;
            this.f14411a = 1;
            if (teachCourseRepositoryM12270e.m10416m(i11, i12, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14412b.m12275j();
        return AbstractC9536a.m17796a(true);
    }
}
