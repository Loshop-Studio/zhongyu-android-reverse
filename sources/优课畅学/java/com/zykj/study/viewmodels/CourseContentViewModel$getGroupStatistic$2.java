package com.zykj.study.viewmodels;

import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseContentViewModel$getGroupStatistic$2", m17801f = "CourseContentViewModel.kt", m17802l = {27}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentViewModel$getGroupStatistic$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13910a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentViewModel f13911b;

    /* renamed from: c */
    public final /* synthetic */ int f13912c;

    /* renamed from: d */
    public final /* synthetic */ int f13913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentViewModel$getGroupStatistic$2(CourseContentViewModel courseContentViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13911b = courseContentViewModel;
        this.f13912c = i10;
        this.f13913d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentViewModel$getGroupStatistic$2(this.f13911b, this.f13912c, this.f13913d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentViewModel$getGroupStatistic$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13910a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        ExerciseRepository exerciseRepositoryM12032a = this.f13911b.m12032a();
        int i11 = this.f13912c;
        int i12 = this.f13913d;
        this.f13910a = 1;
        Object objM10370f = exerciseRepositoryM12032a.m10370f(i11, i12, this);
        return objM10370f == objM17291f ? objM17291f : objM10370f;
    }
}
