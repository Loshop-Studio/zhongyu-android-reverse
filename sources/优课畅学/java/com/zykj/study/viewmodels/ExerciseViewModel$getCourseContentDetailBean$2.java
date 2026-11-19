package com.zykj.study.viewmodels;

import com.zykj.http.exception.RemoteCodeException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseViewModel$getCourseContentDetailBean$2", m17801f = "ExerciseViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewModel$getCourseContentDetailBean$2 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14151a;

    /* renamed from: b */
    public /* synthetic */ Object f14152b;

    public ExerciseViewModel$getCourseContentDetailBean$2(InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, Throwable th, InterfaceC9324c interfaceC9324c) {
        ExerciseViewModel$getCourseContentDetailBean$2 exerciseViewModel$getCourseContentDetailBean$2 = new ExerciseViewModel$getCourseContentDetailBean$2(interfaceC9324c);
        exerciseViewModel$getCourseContentDetailBean$2.f14152b = th;
        return exerciseViewModel$getCourseContentDetailBean$2.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f14152b;
        AbstractC9434a.m17291f();
        if (this.f14151a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return AbstractC9536a.m17796a(((th instanceof RemoteCodeException) && ((RemoteCodeException) th).getErrorCodeInfo().getCode() == 1022) ? false : true);
    }
}
