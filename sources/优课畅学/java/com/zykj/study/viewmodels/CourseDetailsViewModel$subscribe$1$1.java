package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.study.bean.course.CourseDetailsBean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseDetailsViewModel$subscribe$1$1", m17801f = "CourseDetailsViewModel.kt", m17802l = {66, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseDetailsViewModel$subscribe$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13928a;

    /* renamed from: b */
    public int f13929b;

    /* renamed from: c */
    public int f13930c;

    /* renamed from: d */
    public final /* synthetic */ CourseDetailsViewModel f13931d;

    /* renamed from: e */
    public final /* synthetic */ CourseDetailsBean f13932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDetailsViewModel$subscribe$1$1(CourseDetailsViewModel courseDetailsViewModel, CourseDetailsBean courseDetailsBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13931d = courseDetailsViewModel;
        this.f13932e = courseDetailsBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseDetailsViewModel$subscribe$1$1(this.f13931d, this.f13932e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseDetailsViewModel$subscribe$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.f13930c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)
            goto L65
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            int r1 = r6.f13929b
            java.lang.Object r3 = r6.f13928a
            com.zykj.study.repository.CourseRepository r3 = (com.zykj.study.repository.CourseRepository) r3
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4d
        L24:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.study.viewmodels.CourseDetailsViewModel r7 = r6.f13931d
            com.zykj.study.repository.CourseRepository r7 = r7.m12039e()
            com.zykj.study.bean.course.CourseDetailsBean r1 = r6.f13932e
            int r1 = r1.getId()
            com.zykj.study.viewmodels.CourseDetailsViewModel r4 = r6.f13931d
            androidx.datastore.core.DataStore r4 = r4.m12042h()
            l8.c r4 = r4.getData()
            r6.f13928a = r7
            r6.f13929b = r1
            r6.f13930c = r3
            java.lang.Object r3 = p169l8.AbstractC9268e.m17036z(r4, r6)
            if (r3 != r0) goto L4a
            goto L64
        L4a:
            r5 = r3
            r3 = r7
            r7 = r5
        L4d:
            com.zykj.lib.login.proto.UserBean r7 = (com.zykj.lib.login.proto.UserBean) r7
            if (r7 == 0) goto L57
            java.lang.String r7 = r7.getId()
            if (r7 != 0) goto L59
        L57:
            java.lang.String r7 = ""
        L59:
            r4 = 0
            r6.f13928a = r4
            r6.f13930c = r2
            java.lang.Object r7 = r3.m10349w(r1, r7, r6)
            if (r7 != r0) goto L65
        L64:
            return r0
        L65:
            com.zykj.study.viewmodels.CourseDetailsViewModel r0 = r6.f13931d
            com.zykj.study.bean.course.CourseDetailsBean r7 = (com.zykj.study.bean.course.CourseDetailsBean) r7
            androidx.lifecycle.MutableLiveData r0 = r0.m12036b()
            r0.postValue(r7)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseDetailsViewModel$subscribe$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1.smali:134
    }
}
