package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$deleteChapter$1", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {97, 98}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$deleteChapter$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14254a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsViewModel f14255b;

    /* renamed from: c */
    public final /* synthetic */ int f14256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$deleteChapter$1(MyCourseDetailsViewModel myCourseDetailsViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14255b = myCourseDetailsViewModel;
        this.f14256c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsViewModel$deleteChapter$1(this.f14255b, this.f14256c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsViewModel$deleteChapter$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r5.m12221s(r4) == r0) goto L15;
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
            int r1 = r4.f14254a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.AbstractC9079b.m15926b(r5)
            goto L32
        L1e:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r5 = r4.f14255b
            com.zykj.study.repository.CourseRepository r5 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12203a(r5)
            int r1 = r4.f14256c
            r4.f14254a = r3
            java.lang.Object r5 = r5.m10336f(r1, r4)
            if (r5 != r0) goto L32
            goto L3c
        L32:
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r5 = r4.f14255b
            r4.f14254a = r2
            java.lang.Object r5 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12204b(r5, r4)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.MyCourseDetailsViewModel$deleteChapter$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/MyCourseDetailsViewModel$deleteChapter$1.smali:129
    }
}
