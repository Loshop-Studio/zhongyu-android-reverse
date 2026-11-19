package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.CourseStudyEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$courseStudyList$1$1$1$1", m17801f = "StudyViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$courseStudyList$1$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14450a;

    /* renamed from: b */
    public /* synthetic */ Object f14451b;

    /* renamed from: c */
    public final /* synthetic */ CourseStudyEntity f14452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$courseStudyList$1$1$1$1(CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14452c = courseStudyEntity;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
        return ((StudyViewModel$courseStudyList$1$1$1$1) create(courseStudyEntity, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        StudyViewModel$courseStudyList$1$1$1$1 studyViewModel$courseStudyList$1$1$1$1 = new StudyViewModel$courseStudyList$1$1$1$1(this.f14452c, interfaceC9324c);
        studyViewModel$courseStudyList$1$1$1$1.f14451b = obj;
        return studyViewModel$courseStudyList$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) this.f14451b;
        AbstractC9434a.m17291f();
        if (this.f14450a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        CourseStudyEntity courseStudyEntity2 = this.f14452c;
        boolean z10 = false;
        if (courseStudyEntity2 != null && courseStudyEntity.getId() == courseStudyEntity2.getId()) {
            z10 = true;
        }
        return new SelectModel(z10, courseStudyEntity);
    }
}
