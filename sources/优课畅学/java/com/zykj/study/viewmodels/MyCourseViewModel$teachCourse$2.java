package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseViewModel$teachCourse$2", m17801f = "MyCourseViewModel.kt", m17802l = {C3721BR.viewModel}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseViewModel$teachCourse$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14302a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseViewModel f14303b;

    /* renamed from: c */
    public final /* synthetic */ MyCourseEntity f14304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseViewModel$teachCourse$2(MyCourseViewModel myCourseViewModel, MyCourseEntity myCourseEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14303b = myCourseViewModel;
        this.f14304c = myCourseEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseViewModel$teachCourse$2(this.f14303b, this.f14304c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseViewModel$teachCourse$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14302a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        CourseRepository courseRepositoryM12225b = this.f14303b.m12225b();
        int id = this.f14304c.getId();
        this.f14302a = 1;
        Object objM10350x = courseRepositoryM12225b.m10350x(id, this);
        return objM10350x == objM17291f ? objM17291f : objM10350x;
    }
}
