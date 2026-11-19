package com.zykj.study.viewmodels;

import com.zykj.study.bean.exercise.AuthorizeLesson;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$deauthorizeMember$1", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {115, 146}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$deauthorizeMember$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13864a;

    /* renamed from: b */
    public final /* synthetic */ AuthorizedLessonViewModel f13865b;

    /* renamed from: c */
    public final /* synthetic */ AuthorizeLesson f13866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$deauthorizeMember$1(AuthorizedLessonViewModel authorizedLessonViewModel, AuthorizeLesson authorizeLesson, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13865b = authorizedLessonViewModel;
        this.f13866c = authorizeLesson;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AuthorizedLessonViewModel$deauthorizeMember$1(this.f13865b, this.f13866c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AuthorizedLessonViewModel$deauthorizeMember$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(3:6|52|53)(2:7|8))(1:9))(3:10|(0)|51)|13|57|14|(10:16|(2:17|(2:19|(2:59|21)(1:60))(2:58|22))|23|(1:25)|26|(1:27)|32|56|33|(5:35|(2:36|(2:38|(2:64|40)(1:65))(1:63))|41|(2:43|(1:44))|49)(2:47|48))(2:30|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        if (r1.emit(r2, r18) == r3) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.AuthorizedLessonViewModel$deauthorizeMember$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/AuthorizedLessonViewModel$deauthorizeMember$1.smali:129
    }
}
