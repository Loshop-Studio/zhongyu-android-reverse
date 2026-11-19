package com.zykj.study.viewmodels;

import com.zykj.study.bean.UiState;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$deauthorizeMember$2", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {148}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$deauthorizeMember$2 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f13867a;

    /* renamed from: b */
    public /* synthetic */ Object f13868b;

    /* renamed from: c */
    public final /* synthetic */ AuthorizedLessonViewModel f13869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$deauthorizeMember$2(AuthorizedLessonViewModel authorizedLessonViewModel, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f13869c = authorizedLessonViewModel;
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, Throwable th, InterfaceC9324c interfaceC9324c) {
        AuthorizedLessonViewModel$deauthorizeMember$2 authorizedLessonViewModel$deauthorizeMember$2 = new AuthorizedLessonViewModel$deauthorizeMember$2(this.f13869c, interfaceC9324c);
        authorizedLessonViewModel$deauthorizeMember$2.f13868b = th;
        return authorizedLessonViewModel$deauthorizeMember$2.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f13868b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13867a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g interfaceC9270g = this.f13869c.f13855m;
            UiState.Error error = new UiState.Error(th);
            this.f13868b = AbstractC9543h.m17814a(th);
            this.f13867a = 1;
            if (interfaceC9270g.emit(error, this) == objM17291f) {
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
