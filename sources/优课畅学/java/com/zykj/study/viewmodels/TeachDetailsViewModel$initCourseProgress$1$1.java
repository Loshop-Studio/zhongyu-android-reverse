package com.zykj.study.viewmodels;

import com.zykj.study.bean.teach.CourseProgress;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TeachDetailsViewModel$initCourseProgress$1$1", m17801f = "TeachDetailsViewModel.kt", m17802l = {34}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TeachDetailsViewModel$initCourseProgress$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14478a;

    /* renamed from: b */
    public final /* synthetic */ TeachDetailsViewModel f14479b;

    /* renamed from: c */
    public final /* synthetic */ int f14480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachDetailsViewModel$initCourseProgress$1$1(TeachDetailsViewModel teachDetailsViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14479b = teachDetailsViewModel;
        this.f14480c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeachDetailsViewModel$initCourseProgress$1$1(this.f14479b, this.f14480c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeachDetailsViewModel$initCourseProgress$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14478a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12300d = this.f14479b.m12300d();
            int i11 = this.f14480c;
            this.f14478a = 1;
            obj = teachCourseRepositoryM12300d.m10410g(i11, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        TeachDetailsViewModel teachDetailsViewModel = this.f14479b;
        CourseProgress courseProgress = (CourseProgress) obj;
        teachDetailsViewModel.m12298b().postValue(courseProgress);
        GroupMemberProgress groupMemberProgress = (GroupMemberProgress) AbstractC8778f0.m14568n0(courseProgress.getGroupProgress());
        if (groupMemberProgress != null) {
            teachDetailsViewModel.m12299c().postValue(groupMemberProgress);
        }
        return C8736p.f16368a;
    }
}
