package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.exercise.AuthorizeLesson;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$authorizeMember$1", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {92, TbsListener.ErrorCode.UNKNOWN_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$authorizeMember$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13857a;

    /* renamed from: b */
    public final /* synthetic */ AuthorizedLessonViewModel f13858b;

    /* renamed from: c */
    public final /* synthetic */ AuthorizeLesson f13859c;

    /* renamed from: d */
    public final /* synthetic */ int f13860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$authorizeMember$1(AuthorizedLessonViewModel authorizedLessonViewModel, AuthorizeLesson authorizeLesson, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13858b = authorizedLessonViewModel;
        this.f13859c = authorizeLesson;
        this.f13860d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AuthorizedLessonViewModel$authorizeMember$1(this.f13858b, this.f13859c, this.f13860d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AuthorizedLessonViewModel$authorizeMember$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(3:6|25|26)(2:7|8))(1:9))(3:10|(0)|24)|13|28|14|(3:16|(1:17)|22)(2:20|21)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r15.emit(r1, r14) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r14.f13857a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.AbstractC9079b.m15926b(r15)
            goto Lbb
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            kotlin.AbstractC9079b.m15926b(r15)
            goto L3e
        L1f:
            kotlin.AbstractC9079b.m15926b(r15)
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r15 = r14.f13858b
            t4.a r15 = com.zykj.study.viewmodels.AuthorizedLessonViewModel.m11980a(r15)
            com.zykj.study.bean.exercise.AuthorizeLesson r1 = r14.f13859c
            int r1 = r1.getUserId()
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r4 = r14.f13858b
            int r4 = r4.m11991l()
            r14.f13857a = r3
            java.lang.Object r15 = r15.m18846a(r1, r4, r14)
            if (r15 != r0) goto L3e
            goto Lba
        L3e:
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r15 = r14.f13858b
            r15.m11988i()
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r15 = r14.f13858b
            l8.h r15 = com.zykj.study.viewmodels.AuthorizedLessonViewModel.m11984e(r15)
            java.lang.Object r15 = r15.getValue()
            com.zykj.study.bean.UiState r15 = (com.zykj.study.bean.UiState) r15
            com.zykj.study.bean.exercise.AuthorizeLesson r4 = r14.f13859c
            int r1 = r14.f13860d
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r12 = r14.f13858b
            java.lang.String r5 = "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r15, r5)     // Catch: java.lang.ClassCastException -> La3
            r5 = r15
            com.zykj.study.bean.UiState$Success r5 = (com.zykj.study.bean.UiState.Success) r5     // Catch: java.lang.ClassCastException -> La3
            com.zykj.study.bean.UiState$Success r15 = (com.zykj.study.bean.UiState.Success) r15     // Catch: java.lang.ClassCastException -> La3
            java.lang.Object r15 = r15.getT()     // Catch: java.lang.ClassCastException -> La3
            if (r15 == 0) goto L9b
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.ClassCastException -> La3
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> La3
            r13.<init>(r15)     // Catch: java.lang.ClassCastException -> La3
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ClassCastException -> La3
            java.lang.String r6 = r4.getUserName()     // Catch: java.lang.ClassCastException -> La3
            java.lang.String r7 = r4.getCreateTime()     // Catch: java.lang.ClassCastException -> La3
            r10 = 16
            r11 = 0
            r8 = 1
            r9 = 0
            com.zykj.study.bean.exercise.AuthorizeLesson r15 = com.zykj.study.bean.exercise.AuthorizeLesson.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.ClassCastException -> La3
            r13.set(r1, r15)     // Catch: java.lang.ClassCastException -> La3
            l8.h r15 = com.zykj.study.viewmodels.AuthorizedLessonViewModel.m11984e(r12)     // Catch: java.lang.ClassCastException -> La3
        L88:
            java.lang.Object r1 = r15.getValue()     // Catch: java.lang.ClassCastException -> La3
            r4 = r1
            com.zykj.study.bean.UiState r4 = (com.zykj.study.bean.UiState) r4     // Catch: java.lang.ClassCastException -> La3
            com.zykj.study.bean.UiState$Success r4 = new com.zykj.study.bean.UiState$Success     // Catch: java.lang.ClassCastException -> La3
            r4.<init>(r13)     // Catch: java.lang.ClassCastException -> La3
            boolean r1 = r15.mo16686e(r1, r4)     // Catch: java.lang.ClassCastException -> La3
            if (r1 == 0) goto L88
            goto La3
        L9b:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> La3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>"
            r15.<init>(r1)     // Catch: java.lang.ClassCastException -> La3
            throw r15     // Catch: java.lang.ClassCastException -> La3
        La3:
            com.zykj.study.viewmodels.AuthorizedLessonViewModel r15 = r14.f13858b
            l8.g r15 = com.zykj.study.viewmodels.AuthorizedLessonViewModel.m11982c(r15)
            com.zykj.study.bean.UiState$Success r1 = new com.zykj.study.bean.UiState$Success
            java.lang.Boolean r3 = p201o7.AbstractC9536a.m17796a(r3)
            r1.<init>(r3)
            r14.f13857a = r2
            java.lang.Object r15 = r15.emit(r1, r14)
            if (r15 != r0) goto Lbb
        Lba:
            return r0
        Lbb:
            h7.p r15 = p123h7.C8736p.f16368a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.AuthorizedLessonViewModel$authorizeMember$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1.smali:139
    }
}
