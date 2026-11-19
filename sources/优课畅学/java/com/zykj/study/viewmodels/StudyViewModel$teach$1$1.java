package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.data.CourseStudyEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$teach$1$1", m17801f = "StudyViewModel.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 128}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$teach$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14462a;

    /* renamed from: b */
    public final /* synthetic */ StudyViewModel f14463b;

    /* renamed from: c */
    public final /* synthetic */ CourseStudyEntity f14464c;

    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$teach$1$1$1", m17801f = "StudyViewModel.kt", m17802l = {129}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.viewmodels.StudyViewModel$teach$1$1$1 */
    public static final class C81521 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14465a;

        /* renamed from: b */
        public final /* synthetic */ StudyViewModel f14466b;

        /* renamed from: c */
        public final /* synthetic */ CourseStudyEntity f14467c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C81521(StudyViewModel studyViewModel, CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f14466b = studyViewModel;
            this.f14467c = courseStudyEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C81521(this.f14466b, this.f14467c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81521) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f14465a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                StudyViewModel studyViewModel = this.f14466b;
                int id = this.f14467c.getId();
                this.f14465a = 1;
                if (studyViewModel.m12282d(id, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$teach$1$1(StudyViewModel studyViewModel, CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14463b = studyViewModel;
        this.f14464c = courseStudyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudyViewModel$teach$1$1(this.f14463b, this.f14464c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudyViewModel$teach$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r7, r1, r6) == r0) goto L15;
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
            int r1 = r6.f14462a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L36
        L1e:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.study.viewmodels.StudyViewModel r7 = r6.f14463b
            com.zykj.study.repository.CourseRepository r7 = r7.m12287j()
            com.zykj.study.data.CourseStudyEntity r1 = r6.f14464c
            int r1 = r1.getId()
            r6.f14462a = r3
            java.lang.Object r7 = r7.m10350x(r1, r6)
            if (r7 != r0) goto L36
            goto L4c
        L36:
            i8.h1 r7 = p135i8.C8843i0.m14868c()
            com.zykj.study.viewmodels.StudyViewModel$teach$1$1$1 r1 = new com.zykj.study.viewmodels.StudyViewModel$teach$1$1$1
            com.zykj.study.viewmodels.StudyViewModel r3 = r6.f14463b
            com.zykj.study.data.CourseStudyEntity r4 = r6.f14464c
            r5 = 0
            r1.<init>(r3, r4, r5)
            r6.f14462a = r2
            java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r1, r6)
            if (r7 != r0) goto L4d
        L4c:
            return r0
        L4d:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.StudyViewModel$teach$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/StudyViewModel$teach$1$1.smali:129
    }
}
