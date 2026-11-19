package com.zykj.study.viewmodels;

import com.zykj.study.bean.UiState;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$fetchAuthorizedList$2", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$fetchAuthorizedList$2 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f13881a;

    /* renamed from: b */
    public /* synthetic */ Object f13882b;

    /* renamed from: c */
    public final /* synthetic */ AuthorizedLessonViewModel f13883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$fetchAuthorizedList$2(AuthorizedLessonViewModel authorizedLessonViewModel, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f13883c = authorizedLessonViewModel;
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, Throwable th, InterfaceC9324c interfaceC9324c) {
        AuthorizedLessonViewModel$fetchAuthorizedList$2 authorizedLessonViewModel$fetchAuthorizedList$2 = new AuthorizedLessonViewModel$fetchAuthorizedList$2(this.f13883c, interfaceC9324c);
        authorizedLessonViewModel$fetchAuthorizedList$2.f13882b = th;
        return authorizedLessonViewModel$fetchAuthorizedList$2.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Throwable th = (Throwable) this.f13882b;
        AbstractC9434a.m17291f();
        if (this.f13881a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f13883c.f13848f;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, new UiState.Error(th)));
        InterfaceC9271h interfaceC9271hM11995p = this.f13883c.m11995p();
        do {
            value2 = interfaceC9271hM11995p.getValue();
            ((Boolean) value2).getClass();
        } while (!interfaceC9271hM11995p.mo16686e(value2, AbstractC9536a.m17796a(false)));
        return C8736p.f16368a;
    }
}
