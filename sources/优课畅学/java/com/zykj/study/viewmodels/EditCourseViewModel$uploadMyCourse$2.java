package com.zykj.study.viewmodels;

import com.zykj.study.data.MyCourseEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.EditCourseViewModel$uploadMyCourse$2", m17801f = "EditCourseViewModel.kt", m17802l = {82, 84}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class EditCourseViewModel$uploadMyCourse$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14013a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseEntity f14014b;

    /* renamed from: c */
    public final /* synthetic */ EditCourseViewModel f14015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCourseViewModel$uploadMyCourse$2(MyCourseEntity myCourseEntity, EditCourseViewModel editCourseViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14014b = myCourseEntity;
        this.f14015c = editCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new EditCourseViewModel$uploadMyCourse$2(this.f14014b, this.f14015c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((EditCourseViewModel$uploadMyCourse$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r5 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.f14013a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r5)
            goto L52
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3a
        L1e:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.study.data.MyCourseEntity r5 = r4.f14014b
            int r5 = r5.getId()
            if (r5 != 0) goto L41
            com.zykj.study.viewmodels.EditCourseViewModel r5 = r4.f14015c
            com.zykj.study.repository.CourseRepository r5 = r5.m12089g()
            com.zykj.study.data.MyCourseEntity r1 = r4.f14014b
            r4.f14013a = r3
            java.lang.Object r5 = r5.m10335e(r1, r4)
            if (r5 != r0) goto L3a
            goto L51
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L58
        L41:
            com.zykj.study.viewmodels.EditCourseViewModel r5 = r4.f14015c
            com.zykj.study.repository.CourseRepository r5 = r5.m12089g()
            com.zykj.study.data.MyCourseEntity r1 = r4.f14014b
            r4.f14013a = r2
            java.lang.Object r5 = r5.m10333A(r1, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        L58:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.EditCourseViewModel$uploadMyCourse$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2.smali:129
    }
}
